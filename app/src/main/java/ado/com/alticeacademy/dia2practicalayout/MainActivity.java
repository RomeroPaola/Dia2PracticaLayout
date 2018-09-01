package ado.com.alticeacademy.dia2practicalayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_linear_layout_vertical).setOnClickListener(this);
        findViewById(R.id.btn_linear_layout_horizontal).setOnClickListener(this);
        findViewById(R.id.btn_relative_layout).setOnClickListener(this);
        findViewById(R.id.btn_table_layout).setOnClickListener(this);
        findViewById(R.id.btn_frame_layout).setOnClickListener(this);
        findViewById(R.id.btn_constraint_layout).setOnClickListener(this);
        findViewById(R.id.btn_list_view).setOnClickListener(this);
        findViewById(R.id.btn_grid_view).setOnClickListener(this);
        findViewById(R.id.btn_list_user).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Class klassActivity = null;
        switch (v.getId()){
            case R.id.btn_linear_layout_vertical:
                klassActivity = LinearLayoutVerticalActivity.class;
                break;
            case R.id.btn_linear_layout_horizontal:
                klassActivity = LinearLayoutHorizontalActivity.class;
                break;
            case R.id.btn_relative_layout:
                klassActivity = RelativeLayoutActivity.class;
                break;
            case R.id.btn_table_layout:
                klassActivity = TableLayoutActivity.class;
                break;
            case R.id.btn_frame_layout:
                klassActivity = FrameLayoutActivity.class;
                break;
            case R.id.btn_constraint_layout:
                klassActivity = ConstraintLayoutActivity.class;
                break;
            case R.id.btn_list_view:
                klassActivity = ListViewActivity.class;
                break;
            case R.id.btn_grid_view:
                klassActivity = GridViewActivity.class;
                break;
            case R.id.btn_list_user:
                klassActivity = UserAdapterActivity.class;
                break;
        }
        goActivity(klassActivity);
    }
    private void goActivity(Class activityClass){
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }
}
