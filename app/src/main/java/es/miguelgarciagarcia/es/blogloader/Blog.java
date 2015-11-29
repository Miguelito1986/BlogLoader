package es.miguelgarciagarcia.es.blogloader;

import android.app.ListActivity;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Blog extends ListActivity {
    protected String[] mAndroidNames;
    private TextView textview;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        textview=(TextView) findViewById(R.id.textView);
        Resources resources = getResources();
        mAndroidNames = resources.getStringArray(R.array.android_names);
        if (mAndroidNames != null) {


            textview.setVisibility(View.INVISIBLE);

        }

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,mAndroidNames);
        setListAdapter(adapter);
     }
    }

