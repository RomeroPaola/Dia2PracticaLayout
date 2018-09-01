package ado.com.alticeacademy.dia2practicalayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //Generate data
        List<String> values = new ArrayList<>();
        for(int i = 1; i <= 100; i++){
            values.add(String.format("Item #%s", i));
        }
        //Find my list view element
        ListView listView = findViewById(R.id.list_view);

        //Set data
        listView.setAdapter(new ArrayAdapter<>(this, R.layout.item, values));
    }
}
