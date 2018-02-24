package com.example.jay.recyclerviewcheckbox5727.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jay.recyclerviewcheckbox5727.R;
import com.example.jay.recyclerviewcheckbox5727.model.StudentModel;

import java.util.List;

/**
 * Created by Jay on 24-02-2018.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {


    public List<StudentModel> studentList;
    private Context context;

    public StudentAdapter(Context context, List<StudentModel> lstStudent) {
        this.context = context;
        this.studentList = lstStudent;
    }

    public void toggleSelection(boolean isChecked) {
        if (studentList != null && studentList.size() > 0) {
            for (int i = 0; i < studentList.size(); i++) {
                studentList.get(i).setSelected(isChecked);
            }
        }
        //don't forget to notify
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView recycler_text_view;
        public CheckBox recycler_checkbox;

        public ViewHolder(View view) {
            super(view);
            //this.setIsRecyclable(false);
            //type cast not required for level 26 and above but still...!
            recycler_text_view = (TextView) view.findViewById(R.id.recycler_text_view);
            recycler_checkbox = (CheckBox) view.findViewById(R.id.recycler_checkbox);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        if (studentList != null) {
            //in some cases, it will prevent unwanted situations
            holder.recycler_checkbox.setOnCheckedChangeListener(null);

            holder.recycler_text_view.setText(studentList.get(position).getUserName());

            holder.recycler_checkbox.setChecked(studentList.get(position).isSelected());

            holder.recycler_checkbox.setTag(studentList.get(position));

           /*
           //this also works...!
            holder.recycler_checkbox.setOnClickListener(new View.OnClickListener()
            {
                @Override

                public void onClick(View view) {
                    CheckBox cb = (CheckBox) view;
                    StudentModel stakeHolder = (StudentModel) cb.getTag();
                    stakeHolder.setSelected(cb.isChecked());
                    studentList.get(position).setSelected(cb.isChecked());

                    Toast.makeText(view.getContext(),
                            "Clicked on Checkbox: " + studentList.get(position).getUserName() + " is "
                                    + cb.isChecked(), Toast.LENGTH_LONG).show();

                }
            });
            */

            holder.recycler_checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        studentList.get(position).setSelected(true);
                        Toast.makeText(context,
                                "Checked : " + studentList.get(position).getUserName()
                                , Toast.LENGTH_LONG).show();
                    } else {
                        studentList.get(position).setSelected(false);
                        Toast.makeText(context,
                                "Unchecked : " + studentList.get(position).getUserName()
                                , Toast.LENGTH_LONG).show();

                    }
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return (studentList == null) ? 0 : studentList.size();
    }
}