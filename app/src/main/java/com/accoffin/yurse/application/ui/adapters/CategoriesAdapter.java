package com.accoffin.yurse.application.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.accoffin.yurse.application.R;

import java.util.List;

/**
 * Created by Yurtov on 11.05.2017.
 */

public class CategoriesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;

    private List<String> ListCategories;
    private OnCategoriesClickListener onCategoriesClickListener;

    public CategoriesAdapter(Context context, List<String> listCategories) {
        this.context = context;
        ListCategories = listCategories;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_categories, parent, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCategoriesClickListener != null) {
                    onCategoriesClickListener.onClick((String) v.getTag());

                }
            }
        });
        return new VievHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        VievHolder vievHolder = (VievHolder) holder;
        String text = ListCategories.get(position);
        vievHolder.text.setText(text);
        vievHolder.itemView.setTag(text);
    }

    @Override
    public int getItemCount() {
        return ListCategories.size();
    }

    public void setOnCategoriesClickListener(OnCategoriesClickListener onCategoriesClickListener) {
        this.onCategoriesClickListener = onCategoriesClickListener;
    }

    private class VievHolder extends RecyclerView.ViewHolder {
        private final TextView text;

        public VievHolder(View itemView) {
            super(itemView);
            text = ((TextView) itemView.findViewById(R.id.item_categories_text));
        }
    }

    public interface OnCategoriesClickListener {

        void onClick(String text);

    }
}
