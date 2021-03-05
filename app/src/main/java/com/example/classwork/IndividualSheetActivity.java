package com.example.classwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndividualSheetActivity extends AppCompatActivity {

    ListView list_View;
    LinearLayout main;
    TextView admision,name,english,maths,kiswahili,
            chemistry,physics,biology,history,geo,business,agri,computer,total,position;
    Button btnSend;
    private student_marks_sheet sheet;
    private ArrayList<Map<String, String>> sheetlist;
    private String[] from;
    private int[] views;
    private List<student_marks_sheet> stud;
    private int ind=0;
    private String results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_sheet);
        list_View = findViewById(R.id.individual_mark_sheet);
        main = findViewById(R.id.Main);

        admision=findViewById(R.id.admission);
        name=findViewById(R.id.name);
        english=findViewById(R.id.english);
        maths=findViewById(R.id.maths);
        kiswahili=findViewById(R.id.kiswahili);
        chemistry=findViewById(R.id.chemistry);
        physics=findViewById(R.id.physics);
        biology=findViewById(R.id.biology);
        history=findViewById(R.id.history);
        geo=findViewById(R.id.geo);
        business=findViewById(R.id.business);
        agri=findViewById(R.id.agri);
        computer=findViewById(R.id.computer);
        total=findViewById(R.id.total);
        position=findViewById(R.id.position);

        btnSend=findViewById(R.id.button);

        AddList(ind);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp(ind);
                message();
            }
        });
    }



    private void AddList(int index) {
        try {
          ind=index;
            sheet = new student_marks_sheet();
            sheetlist = new ArrayList<Map<String, String>>();
            from =new String[] {"Admission", "Name", "English", "Maths", "Kiswahili", "Chemistry", "Physics", "Biology", "History", "Geo", "CRE", "Business", "Agri",
                    "Computer", "Total", "Position"};

          views =new int[] {R.id.admission, R.id.name, R.id.english, R.id.maths, R.id.kiswahili, R.id.chemistry, R.id.physics, R.id.biology, R.id.history,
                    R.id.geo, R.id.CRE, R.id.business, R.id.agri, R.id.computer, R.id.total, R.id.position};

          stud = sheet.Getstudent_marks_sheet();

            // for (int i = 0; i =1; i++) {
            Map<String, String> mylist = new HashMap<String, String>();
            mylist.put("Admission", "" + stud.get(index).admission);
            mylist.put("Name", "" + stud.get(index).name);
            mylist.put("English", "" + stud.get(index).english);
            mylist.put("Maths", "" + stud.get(index).maths);
            mylist.put("Kiswahili", "" + stud.get(index).kiswahili);
            mylist.put("Chemistry", "" + stud.get(index).chemistry);
            mylist.put("Physics", "" + stud.get(index).physics);
            mylist.put("Biology", "" + stud.get(index).biology);
            mylist.put("History", "" + stud.get(index).history);
            mylist.put("Geo", "" + stud.get(index).geo);
            mylist.put("CRE", "" + stud.get(index).CRE);
            mylist.put("Business", "" + stud.get(index).business);
            mylist.put("Agri", "" + stud.get(index).agri);
            mylist.put("Computer", "" + stud.get(index).computer);
            mylist.put("Total", "" + stud.get(index).sum());
            mylist.put("Position", "" + stud.get(index).position);
            sheetlist.add(mylist);
            // }
            final SimpleAdapter simpleAdapter = new SimpleAdapter(IndividualSheetActivity.this, sheetlist, R.layout.listitems, from, views);
            list_View.setAdapter(simpleAdapter);
        } catch (Exception e) {
            Toast.makeText(IndividualSheetActivity.this, e.getMessage().toString(), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuitems, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.one:
                AddList(0);
                list_View.setVisibility(View.VISIBLE);
                return true;
            case R.id.two:
                AddList(1);
                list_View.setVisibility(View.VISIBLE);
                return true;

            case R.id.three:
                AddList(2);
                list_View.setVisibility(View.VISIBLE);
                return true;
            case R.id.four:
                AddList(3);
                list_View.setVisibility(View.VISIBLE);
                return true;
            case R.id.five:
                AddList(4);
                list_View.setVisibility(View.VISIBLE);
                return true;
            case R.id.six:
                AddList(5);
                list_View.setVisibility(View.VISIBLE);
                return true;
            case R.id.seven:
                AddList(6);
                list_View.setVisibility(View.VISIBLE);
                return true;
            case R.id.eight:
                AddList(7);
                list_View.setVisibility(View.VISIBLE);
                return true;
            case R.id.nine:
                AddList(8);
                list_View.setVisibility(View.VISIBLE);
                return true;
            case R.id.ten:
                AddList(9);
                list_View.setVisibility(View.VISIBLE);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
    public void disp(int i)
    {
        student_marks_sheet std=stud.get(i);
        results="STUDENT RESULT\n "+"\nName: "+std.getName()+"\nEnglish: "+std.getEnglish()+"\nMaths: "+std.getMaths()+"\nKiswahili: "+std.getKiswahili()+"\nChemistry: "+std.getChemistry()+
                "\nPhysics: "+std.getPhysics()+"\nBiology: "+std.getBiology()+"\nHistory: "+std.getHistory()+"\nGeography: "+std.getGeo()+"\nC.R.E: "+std.getCRE()+"\nBusiness: "+
                std.getBusiness()+"\nAgriculture: "+std.getAgri()+ "\nComputer: "+std.getComputer()+"\nTotal: "+std.getTotal()+"\nPosition: "+std.getPosition();

    }
    public void message(){
        String[] number={"0729105112"};
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_PHONE_NUMBER,number);
        intent.putExtra(Intent.EXTRA_SUBJECT,"Student Results Sheet.");
        intent.putExtra(Intent.EXTRA_TEXT,results);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        else {
            Toast.makeText(this,"No application to be used was found",Toast.LENGTH_SHORT).show();
        }
    }
}
