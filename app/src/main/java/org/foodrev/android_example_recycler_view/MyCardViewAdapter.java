package org.foodrev.android_example_recycler_view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by magulo on 8/25/16.
 */
public class MyCardViewAdapter extends RecyclerView.Adapter<MyCardViewAdapter.ViewHolder> {
    private String[] mDataset;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;

        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.my_text_view2);
        }
    }

    //provide suitable constructor, must change with dataset
    public MyCardViewAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    //create new views (used by layout manager)
    @Override
    public MyCardViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //create new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_card_view, parent, false);
        //set view's size margins padding and layout parameters

        //... TODO Above

        ViewHolder vh = new ViewHolder(v);
        return vh;

    }


    //replace contents of a view (this is invoked by layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // get element from your dataset here
        // replace contents of the view with that element
        holder.mTextView.setText(mDataset[position]);
    }

    //returns size of dataset (invoked by layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
