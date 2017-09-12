package com.example.aadi.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aadi on 11/8/17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {

    private Context mContext;
    private List<ItemData> data;
    private final ListItemLongClickListener mOnLongClick;
    public static final String TAG = Adapter.class.getSimpleName();

    public Adapter(Context context, List<ItemData> dataset, ListItemLongClickListener onLongClick){
        this.mContext = context;
        this.data = dataset;
        this.mOnLongClick = onLongClick;
    }

    public interface ListItemLongClickListener {
        void onItemLongCLick(int clickedPos);
    }


    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        ItemData itemData = data.get(position);
        Log.e(TAG, itemData.getTitle());
        holder.textView.setText(itemData.getTitle());
    }



    @Override
    public int getItemCount() {
        return data.size();
    }

      class Holder extends RecyclerView.ViewHolder implements View.OnLongClickListener{

        TextView textView;
        public Holder(View itemView) {
            super(itemView);
            textView = (TextView)itemView.findViewById(R.id.rv_textView);
            itemView.setOnLongClickListener(this);
        }

        @Override
        public boolean onLongClick(View view) {
            int clickedPos = getAdapterPosition();
            mOnLongClick.onItemLongCLick(clickedPos);
            return  true;

        }
    }
}
