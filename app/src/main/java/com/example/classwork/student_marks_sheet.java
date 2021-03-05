package com.example.classwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class student_marks_sheet {

    public int admission;
    public String name;
    public int english;
    public int maths;
    public int kiswahili;
    public int chemistry;
    public int physics;
    public int biology;
    public int history;
    public int geo;
    public int CRE;
    public int business;
    public int agri;
    public int computer;
    public int total;
    public int position;

    public student_marks_sheet() {

    }

    public student_marks_sheet(int admission, String name, int english, int maths, int kiswahili, int chemistry, int physics, int biology, int history, int geo, int CRE, int business, int agri, int computer, int total,int position) {
        this.admission = admission;
        this.name = name;
        this.english = english;
        this.maths = maths;
        this.kiswahili = kiswahili;
        this.chemistry = chemistry;
        this.physics = physics;
        this.biology = biology;
        this.history = history;
        this.geo = geo;
        this.CRE = CRE;
        this.business = business;
        this.agri = agri;
        this.computer = computer;
        this.total = total;
       this.position = position;
    }

    public int getAdmission() {
        return admission;
    }

    public void setAdmission(int admission) {
        this.admission = admission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getKiswahili() {
        return kiswahili;
    }

    public void setKiswahili(int kiswahili) {
        this.kiswahili = kiswahili;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getBiology() {
        return biology;
    }

    public void setBiology(int biology) {
        this.biology = biology;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getGeo() {
        return geo;
    }

    public void setGeo(int geo) {
        this.geo = geo;
    }

    public int getCRE() {
        return CRE;
    }

    public void setCRE(int CRE) {
        this.CRE = CRE;
    }

    public int getBusiness() {
        return business;
    }

    public void setBusiness(int business) {
        this.business = business;
    }

    public int getAgri() {
        return agri;
    }

    public void setAgri(int agri) {
        this.agri = agri;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }


    public void setPosition(int position) {
        this.position = position;
    }
    public int getTotal() {
        total=total + sum();
        return total;
    }
    public int sum(){
        int tot=english + maths + kiswahili + chemistry + physics + biology + history + geo + CRE + business + agri + computer;
        return  tot;
    }

    public int getPosition() {
      /*  position=pos();*/
        return position;
    }

    public void setTotal(int total) {
        this.total = total;
    }

  /*  public int pos()
    {
        return Collections.sort(total,Collections.reverseOrder());

    }*/


    public List<student_marks_sheet> Getstudent_marks_sheet() {

        List<student_marks_sheet> students_list = new ArrayList<student_marks_sheet>();

        students_list.add(new student_marks_sheet(1, "John", 30, 45, 63, 45, 54, 34, 36, 37, 46, 63, 56, 36,0,0));
        students_list.add(new student_marks_sheet(2, "Kimani", 20, 55, 43, 65, 44, 74, 56, 67, 79, 74, 53, 72,0,0));
        students_list.add(new student_marks_sheet(3, "Kirwa", 74, 84, 73, 63, 35, 53, 23, 45, 54, 45, 67, 94,0,0));
        students_list.add(new student_marks_sheet(4, "Sammy", 56, 86, 45, 86, 56, 58, 56, 97, 46, 56, 87, 36,0,0));
        students_list.add(new student_marks_sheet(5, "Raphael", 76, 56, 34, 56, 86, 34, 34, 45, 34, 69, 67, 78,0,0));
        students_list.add(new student_marks_sheet(6, "Omondi", 30, 45, 46, 76, 48, 76, 56, 76, 46, 44, 45, 67,0,0));
        students_list.add(new student_marks_sheet(7, "Maina", 50, 74, 94, 74, 84, 58, 74, 73, 63, 73, 73, 73,0,0));
        students_list.add(new student_marks_sheet(8, "James", 60, 74, 74, 63, 73, 73, 63, 72, 37, 37, 38, 38,0,0));
        students_list.add(new student_marks_sheet(9, "Mercy", 63, 84, 63, 36, 75, 37, 72, 45, 93, 48, 69, 73,0,0));
        students_list.add(new student_marks_sheet(10, "Eric", 67, 68, 52, 36, 36, 36, 67, 84, 48, 46, 37, 74,0,0));

        return students_list;

    }

}
