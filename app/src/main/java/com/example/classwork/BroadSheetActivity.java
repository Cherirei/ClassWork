package com.example.classwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.classwork.R.id.student_mark_list;

public class BroadSheetActivity extends AppCompatActivity {

    ListView student_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_sheet);
        student_list=findViewById(student_mark_list);
        FillList();

    }

    private void FillList() {
        try {
            student_marks_sheet sheet = new student_marks_sheet();
            List<Map<String, String>> sheetlist = new ArrayList<Map<String, String>>();
            String[] from = {"Admission", "Name", "English", "Maths", "Kiswahili", "Chemistry", "Physics", "Biology", "History", "Geo", "CRE", "Business", "Agri",
                    "Computer", "Total", "Position"};

            int[] views = {R.id.admission, R.id.name, R.id.english, R.id.maths, R.id.kiswahili, R.id.chemistry, R.id.physics, R.id.biology, R.id.history,
                    R.id.geo, R.id.CRE, R.id.business, R.id.agri, R.id.computer, R.id.total, R.id.position};

            List<student_marks_sheet> stud = sheet.Getstudent_marks_sheet();

            for (int i = 0; i < stud.size(); i++) {
                Map<String, String> mylist = new HashMap<String, String>();
                mylist.put("Admission", ""+stud.get(i).admission);
                mylist.put("Name", ""+stud.get(i).name);
                mylist.put("English", ""+stud.get(i).english);
                mylist.put("Maths", ""+stud.get(i).maths);
                mylist.put("Kiswahili", ""+stud.get(i).kiswahili);
                mylist.put("Chemistry", ""+stud.get(i).chemistry);
                mylist.put("Physics", ""+stud.get(i).physics);
                mylist.put("Biology", ""+stud.get(i).biology);
                mylist.put("History", ""+stud.get(i).history);
                mylist.put("Geo", ""+stud.get(i).geo);
                mylist.put("CRE", ""+stud.get(i).CRE);
                mylist.put("Business", ""+stud.get(i).business);
                mylist.put("Agri", ""+stud.get(i).agri);
                mylist.put("Computer", ""+stud.get(i).computer);
                mylist.put("Total", ""+stud.get(i).sum());
                mylist.put("Position", ""+stud.get(i).position);
                sheetlist.add(mylist);
            }
            final SimpleAdapter simpleAdapter = new SimpleAdapter(BroadSheetActivity.this, sheetlist, R.layout.listitems, from, views);
            student_list.setAdapter(simpleAdapter);
        }
        catch (Exception e)
        {
            Toast.makeText(BroadSheetActivity.this,e.getMessage().toString(),Toast.LENGTH_LONG).show();
        }
    }
}
