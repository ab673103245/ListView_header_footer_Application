package qianfeng.listview_header_footer_application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private List<String> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = ((ListView) findViewById(R.id.lv));
        initInfo();

        LayoutInflater inflater = LayoutInflater.from(this);

        View headerView = inflater.inflate(R.layout.header_layout,null);
        lv.addHeaderView(headerView);

        View footerView =inflater.inflate(R.layout.footer_layout, null);
        lv.addFooterView(footerView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);

        lv.setAdapter(adapter);

    }

    private void initInfo()
    {
        list = new ArrayList<>();
        for (int i = 0; i < 50; i++)   {
            list.add("lisi:" + i);
        }
    }

}
