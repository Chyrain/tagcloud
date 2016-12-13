package com.fyales.tagcloud.library;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import java.util.List;

/**
 * @author fyales
 * @since 8/26/15.
 */
public class TagBaseAdapter extends BaseAdapter {

    private Context mContext;
    private List<TagBean> mList;

    public TagBaseAdapter(Context context, List<TagBean> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public TagBean getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.tagview, null);
            holder = new ViewHolder();
            holder.tagBtn = (Button) convertView.findViewById(R.id.tag_btn);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }
        final TagBean tagBean = getItem(position);
        final String text = tagBean.getName();
        holder.tagBtn.setText(text);
        if (tagBean.isActive()) {
        	holder.tagBtn.setBackgroundResource(R.drawable.tag_active);
        	holder.tagBtn.setTextColor(Color.parseColor("#58cc5b"));
        } else {
        	holder.tagBtn.setBackgroundResource(R.drawable.tag_normal);
        	holder.tagBtn.setTextColor(Color.parseColor("#B6B6B6"));
        }
        return convertView;
    }

    static class ViewHolder {
        Button tagBtn;
    }
}
