package com.android.luttos.exercicioactivityintent;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Luttos on 15/04/18.
 */

public class StudentAdapter extends BaseAdapter {
    List<Student> studentList;
    Context ctx;

    public StudentAdapter(Context ctx){
        this.ctx = ctx;
    }

    public StudentAdapter(Context ctx, List<Student> studentList){
        this.ctx = ctx;
        this.studentList = studentList;
    }

    @Override
    public int getCount() {
        return studentList.size();
    }

    @Override
    public Object getItem(int position) {
        return studentList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Student student = studentList.get(position);

        ViewHolder holder = null;
        if (convertView == null){
            Log.d("NGVL","View Nova => position: "+position);
            convertView = LayoutInflater.from(ctx).inflate(R.layout.item_student, null);
            holder = new ViewHolder();
            holder.txtMatricula = convertView.findViewById(R.id.txtMatricula);
            holder.txtNome = convertView.findViewById(R.id.txtNome);
            convertView.setTag(holder);
        } else {
            Log.d("NGVL","View existente => position: "+position);
            holder = (ViewHolder) convertView.getTag();
        }
        holder.txtMatricula.setText(String.valueOf(student.getMatricula()));
        holder.txtNome.setText(student.getNome());
        return convertView;
    }


    static class ViewHolder{
        TextView txtMatricula;
        TextView txtNome;
    }
}
