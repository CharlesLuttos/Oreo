package com.android.luttos.exercicio_1.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.luttos.exercicio_1.R;
import com.android.luttos.exercicio_1.modelo.Contato;

import java.util.List;

/**
 * Created by Luttos on 16/04/18.
 */

public class AgendaTelefoneAdapter extends BaseAdapter {
    List<Contato> contatoes;
    Context context;

    public AgendaTelefoneAdapter(Context context){
        this.context = context;
    }

    public AgendaTelefoneAdapter(Context context, List<Contato> contatoes){
        this.context = context;
        this.contatoes = contatoes;
    }

    @Override
    public int getCount() {
        return contatoes.size();
    }

    @Override
    public Object getItem(int position) {
        return contatoes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Contato contato = contatoes.get(position);

        ViewHolder holder = null;
        if (convertView == null){
            Log.d("NGVL","View Nova => position: "+position);
            convertView = LayoutInflater.from(context).inflate(R.layout.item_agenda_telefone, null);
            holder = new ViewHolder();
            holder.txtTelefone = convertView.findViewById(R.id.txtTelefone);
            holder.txtNome = convertView.findViewById(R.id.txtNome);
            convertView.setTag(holder);
        } else {
            Log.d("NGVL","View existente => position: "+position);
            holder = (ViewHolder) convertView.getTag();
        }
        holder.txtTelefone.setText(String.valueOf(contato.getTelefone()));
        holder.txtNome.setText(contato.getNome());
        return convertView;
    }

    static class ViewHolder{
        TextView txtTelefone;
        TextView txtNome;
    }
}
