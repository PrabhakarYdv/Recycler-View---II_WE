package com.prabhakar.recyclerview_ii_we;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ClickListener {
    private int id_count = 1;
    private RecyclerView recyclerView;
    ArrayList<StudentModel> studentsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildList();
        setRecycleView();
    }

    private void setRecycleView() {
        StudentAdapter studentAdapter = new StudentAdapter(studentsList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }

    private void buildList() {
        studentsList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            studentsList.add(new StudentModel(R.drawable.prabhakar, "Prabhakar", "00" + id_count + "", "20/11/1999", "Hasanganj, Safiyabad, Munger"));
            id_count++;
            studentsList.add(new StudentModel(R.drawable.diwakar, "Diwakar", "00" + id_count + "", "16/03/1991", "Hasanganj, Safiyabad, Munger"));
            id_count++;
            studentsList.add(new StudentModel(R.drawable.ashish, "Ashish", "00" + id_count + "", "12/05/1996", "Konark Road, Munger"));
            id_count++;
            studentsList.add(new StudentModel(R.drawable.shekhar, "Sudhanshu", "00" + id_count + "", "05/05/1994", "Jamui"));
            id_count++;
            studentsList.add(new StudentModel(R.drawable.saurav, "Saurav", "00" + id_count + "", "05/06/1997", "Hasanganj, Safiyabad, Munger"));
            id_count++;
            studentsList.add(new StudentModel(R.drawable.anurag, "Anurag", "00" + id_count + "", "17/03/2001", "Konark Road, Munger"));
            id_count++;
        }


    }

    public void initView() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    @Override
    public void onItemClicked(StudentModel studentModel, int position) {
        new AlertDialog.Builder(this).setTitle("Student Details").setMessage(
                "Name :" + studentModel.getName() + "\n" +
                        "ID :" + studentModel.getId() + "\n" +
                        "DOB :" + studentModel.getDob() + "\n" +
                        "Address :" + studentModel.getAddress() + "\n"
        ).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).show();

    }
}