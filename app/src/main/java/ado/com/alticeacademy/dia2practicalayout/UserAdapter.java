package ado.com.alticeacademy.dia2practicalayout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(@NonNull Context context,
                       @NonNull List<User> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        User user = getItem(position);

        convertView = convertView != null ? convertView: LayoutInflater
                .from(getContext())
                .inflate(R.layout.item_user, parent, false);

        TextView textViewName = convertView.findViewById(R.id.txt_name);
        TextView textViewAddress = convertView.findViewById(R.id.txt_address);

        textViewName.setText(user.getName());
        textViewAddress.setText(user.getAddress());

        return convertView;
    }
}
