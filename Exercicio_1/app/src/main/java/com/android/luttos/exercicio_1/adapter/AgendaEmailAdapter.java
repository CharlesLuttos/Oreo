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

public class AgendaEmailAdapter extends BaseAdapter {
    List<Contato> contatos;
    Context context;

    public AgendaEmailAdapter(Context context){
        this.context = context;
    }

    public AgendaEmailAdapter(Context context, List<Contato> contatos){
        this.context = context;
        this.contatos = contatos;
    }

    @Override
    public int getCount() {
        return contatos.size();
    }

    @Override
    public Object getItem(int position) {
        return contatos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Contato contato = contatos.get(position);

        ViewHolder holder = null;
        if (convertView == null){
            Log.d("NGVL","View Nova => position: "+position);
            convertView = LayoutInflater.from(context).inflate(R.layout.item_agenda_email, null);
            holder = new ViewHolder();
            holder.txtEmail = convertView.findViewById(R.id.txtEmail);
            holder.txtNome = convertView.findViewById(R.id.txtNome);
            convertView.setTag(holder);
        } else {
            Log.d("NGVL","View existente => position: "+position);
            holder = (ViewHolder) convertView.getTag();
        }
        holder.txtEmail.setText(String.valueOf(contato.getEmail()));
        holder.txtNome.setText(contato.getNome());
        return convertView;
    }

    static class ViewHolder{
        TextView txtEmail;
        TextView txtNome;
    }
}
