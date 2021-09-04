package fernando.example.ejercicioadapters_listview.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import fernando.example.ejercicioadapters_listview.R;
import fernando.example.ejercicioadapters_listview.modelo.Alarma;

public class AlarmaAdapter extends ArrayAdapter<Alarma> {

    public AlarmaAdapter(@NonNull Context context, List<Alarma>objetos) {
        super(context, R.layout.list_temple , objetos);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = convertView;
        if(convertView==null){
            view = inflater.inflate(R.layout.list_temple,null);
        }

    }
}
