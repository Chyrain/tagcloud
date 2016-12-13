package com.fyales.tagcloud;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.fyales.tagcloud.library.TagBaseAdapter;
import com.fyales.tagcloud.library.TagCloudLayout;
import com.fyales.tagcloud.library.TagBean;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private TagCloudLayout mContainer;
    private TagBaseAdapter mAdapter;
    private List<TagBean> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContainer = (TagCloudLayout) findViewById(R.id.container);

        mList = new ArrayList<>();
        mList.add(new TagBean("中华人名共和国"));
        mList.add(new TagBean("朝鲜"));
        mList.add(new TagBean("台湾"));
        mList.add(new TagBean("香港特别行政区"));
        mList.add(new TagBean("澳门特别行政区"));
        mList.add(new TagBean("柬埔寨"));
        mList.add(new TagBean("泰国"));
        mList.add(new TagBean("缅甸"));
        mList.add(new TagBean("马来西亚"));
        mList.add(new TagBean("新加坡"));
        mList.add(new TagBean("印度尼西亚"));
        mList.add(new TagBean("文莱"));
        mList.add(new TagBean("菲律宾"));
        mAdapter = new TagBaseAdapter(this,mList);
        mContainer.setAdapter(mAdapter);

        findViewById(R.id.add_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mList.add(new TagBean("东帝汶"));
                mAdapter.notifyDataSetChanged();
            }
        });

        mContainer.setItemClickListener(new TagCloudLayout.TagItemClickListener() {
            @Override
            public void itemClick(int position) {
                Toast.makeText(MainActivity.this,mList.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
