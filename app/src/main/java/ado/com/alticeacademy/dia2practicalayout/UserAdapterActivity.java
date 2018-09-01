package ado.com.alticeacademy.dia2practicalayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class UserAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_adapter);
        List<User> users = new ArrayList<>();
        users.add(new User("Dante Fana","Adress..."));
        users.add(new User("Maria Gomez","Adress..."));
        users.add(new User("Manuel Peralta","Adress..."));
        users.add(new User("Juan Perez","Adress..."));
        users.add(new User("Maria Perez","Adress..."));

        ListView listView = findViewById(R.id.user_list_view);
        listView.setAdapter(new UserAdapter(this, users));
    }
}
