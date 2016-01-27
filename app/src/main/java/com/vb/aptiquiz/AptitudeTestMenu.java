package com.vb.aptiquiz;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;

public class AptitudeTestMenu extends AppCompatActivity implements View.OnClickListener {
    BootstrapButton b1;
    TextView tv;
    String t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude_test_menu);
        b1 = (BootstrapButton) findViewById(R.id.button1);
        tv = (TextView) findViewById(R.id.textView3);

        b1.setOnClickListener(this);
        tv.setMovementMethod(new ScrollingMovementMethod());
        t = "Test Instructions : \n\n";
        t += "1.  Pass percentage is 75.\n\n2.  There are no negative marks.\n\n3.  Number of Questions = 30." +
                "\n\n4.  Time allotted = 40 minutes.\n\n5.  Scroll to view the full question if required.\n\n6.  Click on Summary in the Test section to view Test Summary and jump to a question directly.\n\n                               All the Best!";
        tv.setText(t);

        SQLiteDatabase db;
        db = openOrCreateDatabase("project", SQLiteDatabase.CREATE_IF_NECESSARY, null);

        db.execSQL("create table if not exists sufficiency(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists logic(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists relation(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists series(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists misc(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists puzzle(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
        db.execSQL("create table if not exists paragraph(Pid integer primary key,Paragraph text)");

        Cursor c1, c2, c3, c4, c5, c6, c7;

        c1 = db.query("sufficiency", null, null, null, null, null, null);//cv1 to cv50
        c2 = db.query("logic", null, null, null, null, null, null);//cv51 to cv100
        c3 = db.query("series", null, null, null, null, null, null);//cv101 to cv150
        c4 = db.query("relation", null, null, null, null, null, null);//cv201 to cv250
        c5 = db.query("misc", null, null, null, null, null, null);//cv451 to cv475 and cv526 to cv550
        c6 = db.query("puzzle", null, null, null, null, null, null);//cv476 to cv525
        c7 = db.query("paragraph", null, null, null, null, null, null);//cv551 to cv560

        if (c1.getCount() != 50 || c2.getCount() != 50 || c3.getCount() != 50 || c4.getCount() != 50 || c5.getCount() != 50 || c6.getCount() != 50 || c7.getCount() != 10) {
            c1.close();
            c2.close();
            c3.close();
            c4.close();
            c5.close();
            c6.close();
            c7.close();
            db.close();

            loadQuestions();
        }
    }

    void loadQuestions()

    {

        SQLiteDatabase db;
        db = openOrCreateDatabase("project", SQLiteDatabase.CREATE_IF_NECESSARY, null);

        ContentValues cv1 = new ContentValues();
        ContentValues cv2 = new ContentValues();
        ContentValues cv3 = new ContentValues();
        ContentValues cv4 = new ContentValues();
        ContentValues cv5 = new ContentValues();
        ContentValues cv6 = new ContentValues();
        ContentValues cv7 = new ContentValues();
        ContentValues cv8 = new ContentValues();
        ContentValues cv9 = new ContentValues();
        ContentValues cv10 = new ContentValues();
        ContentValues cv11 = new ContentValues();
        ContentValues cv12 = new ContentValues();
        ContentValues cv13 = new ContentValues();
        ContentValues cv14 = new ContentValues();
        ContentValues cv15 = new ContentValues();
        ContentValues cv16 = new ContentValues();
        ContentValues cv17 = new ContentValues();
        ContentValues cv18 = new ContentValues();
        ContentValues cv19 = new ContentValues();
        ContentValues cv20 = new ContentValues();
        ContentValues cv21 = new ContentValues();
        ContentValues cv22 = new ContentValues();
        ContentValues cv23 = new ContentValues();
        ContentValues cv24 = new ContentValues();
        ContentValues cv25 = new ContentValues();
        ContentValues cv26 = new ContentValues();
        ContentValues cv27 = new ContentValues();
        ContentValues cv28 = new ContentValues();
        ContentValues cv29 = new ContentValues();
        ContentValues cv30 = new ContentValues();
        ContentValues cv31 = new ContentValues();
        ContentValues cv32 = new ContentValues();
        ContentValues cv33 = new ContentValues();
        ContentValues cv34 = new ContentValues();
        ContentValues cv35 = new ContentValues();
        ContentValues cv36 = new ContentValues();
        ContentValues cv37 = new ContentValues();
        ContentValues cv38 = new ContentValues();
        ContentValues cv39 = new ContentValues();
        ContentValues cv40 = new ContentValues();
        ContentValues cv41 = new ContentValues();
        ContentValues cv42 = new ContentValues();
        ContentValues cv43 = new ContentValues();
        ContentValues cv44 = new ContentValues();
        ContentValues cv45 = new ContentValues();
        ContentValues cv46 = new ContentValues();
        ContentValues cv47 = new ContentValues();
        ContentValues cv48 = new ContentValues();
        ContentValues cv49 = new ContentValues();
        ContentValues cv50 = new ContentValues();
        ContentValues cv51 = new ContentValues();
        ContentValues cv52 = new ContentValues();
        ContentValues cv53 = new ContentValues();
        ContentValues cv54 = new ContentValues();
        ContentValues cv55 = new ContentValues();
        ContentValues cv56 = new ContentValues();
        ContentValues cv57 = new ContentValues();
        ContentValues cv58 = new ContentValues();
        ContentValues cv59 = new ContentValues();
        ContentValues cv60 = new ContentValues();
        ContentValues cv61 = new ContentValues();
        ContentValues cv62 = new ContentValues();
        ContentValues cv63 = new ContentValues();
        ContentValues cv64 = new ContentValues();
        ContentValues cv65 = new ContentValues();
        ContentValues cv66 = new ContentValues();
        ContentValues cv67 = new ContentValues();
        ContentValues cv68 = new ContentValues();
        ContentValues cv69 = new ContentValues();
        ContentValues cv70 = new ContentValues();
        ContentValues cv71 = new ContentValues();
        ContentValues cv72 = new ContentValues();
        ContentValues cv73 = new ContentValues();
        ContentValues cv74 = new ContentValues();
        ContentValues cv75 = new ContentValues();
        ContentValues cv76 = new ContentValues();
        ContentValues cv77 = new ContentValues();
        ContentValues cv78 = new ContentValues();
        ContentValues cv79 = new ContentValues();
        ContentValues cv80 = new ContentValues();
        ContentValues cv81 = new ContentValues();
        ContentValues cv82 = new ContentValues();
        ContentValues cv83 = new ContentValues();
        ContentValues cv84 = new ContentValues();
        ContentValues cv85 = new ContentValues();
        ContentValues cv86 = new ContentValues();
        ContentValues cv87 = new ContentValues();
        ContentValues cv88 = new ContentValues();
        ContentValues cv89 = new ContentValues();
        ContentValues cv90 = new ContentValues();
        ContentValues cv91 = new ContentValues();
        ContentValues cv92 = new ContentValues();
        ContentValues cv93 = new ContentValues();
        ContentValues cv94 = new ContentValues();
        ContentValues cv95 = new ContentValues();
        ContentValues cv96 = new ContentValues();
        ContentValues cv97 = new ContentValues();
        ContentValues cv98 = new ContentValues();
        ContentValues cv99 = new ContentValues();
        ContentValues cv100 = new ContentValues();
        ContentValues cv101 = new ContentValues();
        ContentValues cv102 = new ContentValues();
        ContentValues cv103 = new ContentValues();
        ContentValues cv104 = new ContentValues();
        ContentValues cv105 = new ContentValues();
        ContentValues cv106 = new ContentValues();
        ContentValues cv107 = new ContentValues();
        ContentValues cv108 = new ContentValues();
        ContentValues cv109 = new ContentValues();
        ContentValues cv110 = new ContentValues();
        ContentValues cv111 = new ContentValues();
        ContentValues cv112 = new ContentValues();
        ContentValues cv113 = new ContentValues();
        ContentValues cv114 = new ContentValues();
        ContentValues cv115 = new ContentValues();
        ContentValues cv116 = new ContentValues();
        ContentValues cv117 = new ContentValues();
        ContentValues cv118 = new ContentValues();
        ContentValues cv119 = new ContentValues();
        ContentValues cv120 = new ContentValues();
        ContentValues cv121 = new ContentValues();
        ContentValues cv122 = new ContentValues();
        ContentValues cv123 = new ContentValues();
        ContentValues cv124 = new ContentValues();
        ContentValues cv125 = new ContentValues();
        ContentValues cv126 = new ContentValues();
        ContentValues cv127 = new ContentValues();
        ContentValues cv128 = new ContentValues();
        ContentValues cv129 = new ContentValues();
        ContentValues cv130 = new ContentValues();
        ContentValues cv131 = new ContentValues();
        ContentValues cv132 = new ContentValues();
        ContentValues cv133 = new ContentValues();
        ContentValues cv134 = new ContentValues();
        ContentValues cv135 = new ContentValues();
        ContentValues cv136 = new ContentValues();
        ContentValues cv137 = new ContentValues();
        ContentValues cv138 = new ContentValues();
        ContentValues cv139 = new ContentValues();
        ContentValues cv140 = new ContentValues();
        ContentValues cv141 = new ContentValues();
        ContentValues cv142 = new ContentValues();
        ContentValues cv143 = new ContentValues();
        ContentValues cv144 = new ContentValues();
        ContentValues cv145 = new ContentValues();
        ContentValues cv146 = new ContentValues();
        ContentValues cv147 = new ContentValues();
        ContentValues cv148 = new ContentValues();
        ContentValues cv149 = new ContentValues();
        ContentValues cv150 = new ContentValues();
        ContentValues cv201 = new ContentValues();
        ContentValues cv202 = new ContentValues();
        ContentValues cv203 = new ContentValues();
        ContentValues cv204 = new ContentValues();
        ContentValues cv205 = new ContentValues();
        ContentValues cv206 = new ContentValues();
        ContentValues cv207 = new ContentValues();
        ContentValues cv208 = new ContentValues();
        ContentValues cv209 = new ContentValues();
        ContentValues cv210 = new ContentValues();
        ContentValues cv211 = new ContentValues();
        ContentValues cv212 = new ContentValues();
        ContentValues cv213 = new ContentValues();
        ContentValues cv214 = new ContentValues();
        ContentValues cv215 = new ContentValues();
        ContentValues cv216 = new ContentValues();
        ContentValues cv217 = new ContentValues();
        ContentValues cv218 = new ContentValues();
        ContentValues cv219 = new ContentValues();
        ContentValues cv220 = new ContentValues();
        ContentValues cv221 = new ContentValues();
        ContentValues cv222 = new ContentValues();
        ContentValues cv223 = new ContentValues();
        ContentValues cv224 = new ContentValues();
        ContentValues cv225 = new ContentValues();
        ContentValues cv226 = new ContentValues();
        ContentValues cv227 = new ContentValues();
        ContentValues cv228 = new ContentValues();
        ContentValues cv229 = new ContentValues();
        ContentValues cv230 = new ContentValues();
        ContentValues cv231 = new ContentValues();
        ContentValues cv232 = new ContentValues();
        ContentValues cv233 = new ContentValues();
        ContentValues cv234 = new ContentValues();
        ContentValues cv235 = new ContentValues();
        ContentValues cv236 = new ContentValues();
        ContentValues cv237 = new ContentValues();
        ContentValues cv238 = new ContentValues();
        ContentValues cv239 = new ContentValues();
        ContentValues cv240 = new ContentValues();
        ContentValues cv241 = new ContentValues();
        ContentValues cv242 = new ContentValues();
        ContentValues cv243 = new ContentValues();
        ContentValues cv244 = new ContentValues();
        ContentValues cv245 = new ContentValues();
        ContentValues cv246 = new ContentValues();
        ContentValues cv247 = new ContentValues();
        ContentValues cv248 = new ContentValues();
        ContentValues cv249 = new ContentValues();
        ContentValues cv250 = new ContentValues();
        ContentValues cv451 = new ContentValues();
        ContentValues cv452 = new ContentValues();
        ContentValues cv453 = new ContentValues();
        ContentValues cv454 = new ContentValues();
        ContentValues cv455 = new ContentValues();
        ContentValues cv456 = new ContentValues();
        ContentValues cv457 = new ContentValues();
        ContentValues cv458 = new ContentValues();
        ContentValues cv459 = new ContentValues();
        ContentValues cv460 = new ContentValues();
        ContentValues cv461 = new ContentValues();
        ContentValues cv462 = new ContentValues();
        ContentValues cv463 = new ContentValues();
        ContentValues cv464 = new ContentValues();
        ContentValues cv465 = new ContentValues();
        ContentValues cv466 = new ContentValues();
        ContentValues cv467 = new ContentValues();
        ContentValues cv468 = new ContentValues();
        ContentValues cv469 = new ContentValues();
        ContentValues cv470 = new ContentValues();
        ContentValues cv471 = new ContentValues();
        ContentValues cv472 = new ContentValues();
        ContentValues cv473 = new ContentValues();
        ContentValues cv474 = new ContentValues();
        ContentValues cv475 = new ContentValues();
        ContentValues cv476 = new ContentValues();
        ContentValues cv477 = new ContentValues();
        ContentValues cv478 = new ContentValues();
        ContentValues cv479 = new ContentValues();
        ContentValues cv480 = new ContentValues();
        ContentValues cv481 = new ContentValues();
        ContentValues cv482 = new ContentValues();
        ContentValues cv483 = new ContentValues();
        ContentValues cv484 = new ContentValues();
        ContentValues cv485 = new ContentValues();
        ContentValues cv486 = new ContentValues();
        ContentValues cv487 = new ContentValues();
        ContentValues cv488 = new ContentValues();
        ContentValues cv489 = new ContentValues();
        ContentValues cv490 = new ContentValues();
        ContentValues cv491 = new ContentValues();
        ContentValues cv492 = new ContentValues();
        ContentValues cv493 = new ContentValues();
        ContentValues cv494 = new ContentValues();
        ContentValues cv495 = new ContentValues();
        ContentValues cv496 = new ContentValues();
        ContentValues cv497 = new ContentValues();
        ContentValues cv498 = new ContentValues();
        ContentValues cv499 = new ContentValues();
        ContentValues cv500 = new ContentValues();
        ContentValues cv501 = new ContentValues();
        ContentValues cv502 = new ContentValues();
        ContentValues cv503 = new ContentValues();
        ContentValues cv504 = new ContentValues();
        ContentValues cv505 = new ContentValues();
        ContentValues cv506 = new ContentValues();
        ContentValues cv507 = new ContentValues();
        ContentValues cv508 = new ContentValues();
        ContentValues cv509 = new ContentValues();
        ContentValues cv510 = new ContentValues();
        ContentValues cv511 = new ContentValues();
        ContentValues cv512 = new ContentValues();
        ContentValues cv513 = new ContentValues();
        ContentValues cv514 = new ContentValues();
        ContentValues cv515 = new ContentValues();
        ContentValues cv516 = new ContentValues();
        ContentValues cv517 = new ContentValues();
        ContentValues cv518 = new ContentValues();
        ContentValues cv519 = new ContentValues();
        ContentValues cv520 = new ContentValues();
        ContentValues cv521 = new ContentValues();
        ContentValues cv522 = new ContentValues();
        ContentValues cv523 = new ContentValues();
        ContentValues cv524 = new ContentValues();
        ContentValues cv525 = new ContentValues();
        ContentValues cv526 = new ContentValues();
        ContentValues cv527 = new ContentValues();
        ContentValues cv528 = new ContentValues();
        ContentValues cv529 = new ContentValues();
        ContentValues cv530 = new ContentValues();
        ContentValues cv531 = new ContentValues();
        ContentValues cv532 = new ContentValues();
        ContentValues cv533 = new ContentValues();
        ContentValues cv534 = new ContentValues();
        ContentValues cv535 = new ContentValues();
        ContentValues cv536 = new ContentValues();
        ContentValues cv537 = new ContentValues();
        ContentValues cv538 = new ContentValues();
        ContentValues cv539 = new ContentValues();
        ContentValues cv540 = new ContentValues();
        ContentValues cv541 = new ContentValues();
        ContentValues cv542 = new ContentValues();
        ContentValues cv543 = new ContentValues();
        ContentValues cv544 = new ContentValues();
        ContentValues cv545 = new ContentValues();
        ContentValues cv546 = new ContentValues();
        ContentValues cv547 = new ContentValues();
        ContentValues cv548 = new ContentValues();
        ContentValues cv549 = new ContentValues();
        ContentValues cv550 = new ContentValues();
        ContentValues cv551 = new ContentValues();
        ContentValues cv552 = new ContentValues();
        ContentValues cv553 = new ContentValues();
        ContentValues cv554 = new ContentValues();
        ContentValues cv555 = new ContentValues();
        ContentValues cv556 = new ContentValues();
        ContentValues cv557 = new ContentValues();
        ContentValues cv558 = new ContentValues();
        ContentValues cv559 = new ContentValues();
        ContentValues cv560 = new ContentValues();


        cv1.put("Id", 1);
        cv1.put("Question", "In which year was Rahul born ?\nStatements:\nI. Rahul at present is 25 years younger to his mother.\nII. Rahul's brother, who was born in 1964, is 35 years younger to his mother.");
        cv1.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv1.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv1.put("optionc", "Either I or II alone sufficient to answer");
        cv1.put("optiond", "Both I and II are not sufficient to answer");
        cv1.put("optione", "Both I and II are necessary to answer");
        cv1.put("correct", "5");

        cv2.put("Id", 2);
        cv2.put("Question", " What will be the total weight of 10 poles, each of the same weight ?\nStatements:\nI. One-fourth of the weight of each pole is 5 kg.\nI. The total weight of three poles is 20 kilograms more than the total weight of two poles.");
        cv2.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv2.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv2.put("optionc", "Either I or II alone sufficient to answer");
        cv2.put("optiond", "Both I and II are not sufficient to answer");
        cv2.put("optione", "Both I and II are necessary to answer");
        cv2.put("correct", "3");

        cv3.put("Id", 3);
        cv3.put("Question", "How many children does M have ?\nStatements:\nI. H is the only daughter of X who is wife of M.\nII. K and J are brothers of M.");
        cv3.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv3.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv3.put("optionc", "Either I or II alone sufficient to answer");
        cv3.put("optiond", "Both I and II are not sufficient to answer");
        cv3.put("optione", "Both I and II are necessary to answer");
        cv3.put("correct", "4");

        cv4.put("Id", 4);
        cv4.put("Question", "How much was the total sale of the company ?\nStatements:\n I. The company sold 8000 units of product A each costing Rs. 25.\nThis company has no other product line.");
        cv4.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv4.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv4.put("optionc", "Either I or II alone sufficient to answer");
        cv4.put("optiond", "Both I and II are not sufficient to answer");
        cv4.put("optione", "Both I and II are necessary to answer");
        cv4.put("correct", "5");

        cv5.put("Id", 5);
        cv5.put("Question", "The last Sunday of March, 2006 fell on which date ?\nStatements:\nI. The first Sunday of that month fell on 5th.\nII. The last day of that month was Friday.");
        cv5.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv5.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv5.put("optionc", "Either I or II alone sufficient to answer");
        cv5.put("optiond", "Both I and II are not sufficient to answer");
        cv5.put("optione", "Both I and II are necessary to answer");
        cv5.put("correct", "3");

        cv6.put("Id", 6);
        cv6.put("Question", "What is the code for 'sky' in the code language ?\nStatements:\nI. In the code language, 'sky is clear' is written as 'de ra fa'.\nII. In the same code language, 'make it clear' is written as 'de ga jo'.");
        cv6.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv6.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv6.put("optionc", "Either I or II alone sufficient to answer");
        cv6.put("optiond", "Both I and II are not sufficient to answer");
        cv6.put("optione", "Both I and II are necessary to answer");
        cv6.put("correct", "4");

        cv7.put("Id", 7);
        cv7.put("Question", "How many children are there between P and Q in a row of children ?\nStatements:\nI. P is fifteenth from the left in the row.\nII. Q is exactly in the middle and there are ten children towards his right.");
        cv7.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv7.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv7.put("optionc", "Either I or II alone sufficient to answer");
        cv7.put("optiond", "Both I and II are not sufficient to answer");
        cv7.put("optione", "Both I and II are necessary to answer");
        cv7.put("correct", "5");

        cv8.put("Id", 8);
        cv8.put("Question", " How is T related to K?\nStatements:\nI. R's sister J has married Ts brother L, who is the only son of his parents.\nII. K is the only daughter of L and J.");
        cv8.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv8.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv8.put("optionc", "Either I or II alone sufficient to answer");
        cv8.put("optiond", "Both I and II are not sufficient to answer");
        cv8.put("optione", "Both I and II are necessary to answer");
        cv8.put("correct", "5");

        cv9.put("Id", 9);
        cv9.put("Question", "How is J related to P ?\nStatements:\nI. M is brother of P and T is sister of P.\nII. P's mother is married to J's husband who has one son and two daughters.");
        cv9.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv9.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv9.put("optionc", "Either I or II alone sufficient to answer");
        cv9.put("optiond", "Both I and II are not sufficient to answer");
        cv9.put("optione", "Both I and II are necessary to answer");
        cv9.put("correct", "2");

        cv10.put("Id", 10);
        cv10.put("Question", "How is X related to Y ?\nStatements:\nI. Y and Z are children of D who is wife of X.\nII. R's sister X is married to Ys father.");
        cv10.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv10.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv10.put("optionc", "Either I or II alone sufficient to answer");
        cv10.put("optiond", "Both I and II are not sufficient to answer");
        cv10.put("optione", "Both I and II are necessary to answer");
        cv10.put("correct", "3");

        cv11.put("Id", 11);
        cv11.put("Question", "Who is to the immediate right of P among five persons P, Q, R, S and T facing North ?\nStatements:\nI. R is third to the left of Q and P is second to the right of R.\nII. Q is to the immediate left of T who is second to the right of P.");
        cv11.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv11.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv11.put("optionc", "Either I or II alone sufficient to answer");
        cv11.put("optiond", "Both I and II are not sufficient to answer");
        cv11.put("optione", "Both I and II are necessary to answer");
        cv11.put("correct", "3");

        cv12.put("Id", 12);
        cv12.put("Question", "On which date of the month was Anjali born in February 2004 ?\nStatements:\nI. Anjali was born on an even date of the month.\nII. Anjali's birth date was a prime number.");
        cv12.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv12.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv12.put("optionc", "Either I or II alone sufficient to answer");
        cv12.put("optiond", "Both I and II are not sufficient to answer");
        cv12.put("optione", "Both I and II are necessary to answer");
        cv12.put("correct", "5");

        cv13.put("Id", 13);
        cv13.put("Question", " How is X related to Y?\nStatements:\nI. Y says, 'I have only one brother'.\nII. X says, 'I have only one sister.'");
        cv13.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv13.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv13.put("optionc", "Either I or II alone sufficient to answer");
        cv13.put("optiond", "Both I and II are not sufficient to answer");
        cv13.put("optione", "Both I and II are necessary to answer");
        cv13.put("correct", "4");

        cv14.put("Id", 14);
        cv14.put("Question", "How is F related to P?\nStatements:\nI. P has two sisters M and N.\nII. F's mother is sister of M's father.");
        cv14.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv14.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv14.put("optionc", "Either I or II alone sufficient to answer");
        cv14.put("optiond", "Both I and II are not sufficient to answer");
        cv14.put("optione", "Both I and II are necessary to answer");
        cv14.put("correct", "5");

        cv15.put("Id", 15);
        cv15.put("Question", " B is the brother of A. How is A related to B ?\nStatements:\nI. A is the sister of C.\nII. E is the husband of A.");
        cv15.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv15.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv15.put("optionc", "Either I or II alone sufficient to answer");
        cv15.put("optiond", "Both I and II are not sufficient to answer");
        cv15.put("optione", "Both I and II are necessary to answer");
        cv15.put("correct", "3");

        cv16.put("Id", 16);
        cv16.put("Question", "How many children are there in the row of children facing North ?\n Statements:\nI.  Vishakha who is fifth from the left end is eighth to the left of Ashish who is twelfth from the right end.\nII.  Rohit is fifth to the left of Nisha who is seventh from the right end and eighteenth from the left end.");
        cv16.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv16.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv16.put("optionc", "Either I or II alone sufficient to answer");
        cv16.put("optiond", "Both I and II are not sufficient to answer");
        cv16.put("optione", "Both I and II are necessary to answer");
        cv16.put("correct", "3");

        cv17.put("Id", 17);
        cv17.put("Question", "How many doctors are practising in this town ?\n Statements:\nI. There is one doctor per seven hundred residents.\nII. There are 16 wards with each ward having as many doctors as the number of wards.");
        cv17.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv17.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv17.put("optionc", "Either I or II alone sufficient to answer");
        cv17.put("optiond", "Both I and II are not sufficient to answer");
        cv17.put("optione", "Both I and II are necessary to answer");
        cv17.put("correct", "2");

        cv18.put("Id", 18);
        cv18.put("Question", "On which day of the week was birthday of Sahil ?\n Statements:\nI. Sahil celebrated his birthday the very next day on which Arun celebrated his birthday.\nII. The sister of Sahil was born on the third day of the week and two days after Sahil was born.");
        cv18.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv18.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv18.put("optionc", "Either I or II alone sufficient to answer");
        cv18.put("optiond", "Both I and II are not sufficient to answer");
        cv18.put("optione", "Both I and II are necessary to answer");
        cv18.put("correct", "2");

        cv19.put("Id", 19);
        cv19.put("Question", "How many pages of book X did Robert read on Sunday ?\n Statements:\nI. The book has 300 pages out of which two-thirds were read by him before Sunday.\nII. Robert read the last 40 pages of the book on the morning of Monday.");
        cv19.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv19.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv19.put("optionc", "Either I or II alone sufficient to answer");
        cv19.put("optiond", "Both I and II are not sufficient to answer");
        cv19.put("optione", "Both I and II are necessary to answer");
        cv19.put("correct", "5");

        cv20.put("Id", 20);
        cv20.put("Question", "How is Tanya related to the man in the photograph ?\n Statements:\nI. Man in the photograph is the only son of Tanya's grandfather.\nII. The man in the photograph has no brothers or sisters and his father is Tanya's grandfather.");
        cv20.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv20.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv20.put("optionc", "Either I or II alone sufficient to answer");
        cv20.put("optiond", "Both I and II are not sufficient to answer");
        cv20.put("optione", "Both I and II are necessary to answer");
        cv20.put("correct", "2");

        cv21.put("Id", 21);
        cv21.put("Question", "Among T, V, B, E and C, who is the third from the top when arranged in the descending order of their weights ?\n Statements:\nI. B is heavier than T and C and is less heavier than V who is not the heaviest.\nII. C is heavier than only T.");
        cv21.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv21.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv21.put("optionc", "Either I or II alone sufficient to answer");
        cv21.put("optiond", "Both I and II are not sufficient to answer");
        cv21.put("optione", "Both I and II are necessary to answer");
        cv21.put("correct", "1");

        cv22.put("Id", 22);
        cv22.put("Question", "Which word in the code language means 'flower' ?\n Statements:\nI. 'de fu la pane' means 'rose flower is beautiful' and 'la quiz' means 'beautiful tree'.\nII. 'de la chin' means 'red rose flower' and 'pa chin' means 'red tea'.");
        cv22.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv22.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv22.put("optionc", "Either I or II alone sufficient to answer");
        cv22.put("optiond", "Both I and II are not sufficient to answer");
        cv22.put("optione", "Both I and II are necessary to answer");
        cv22.put("correct", "4");

        cv23.put("Id", 23);
        cv23.put("Question", "How many students in a class play football ?\n Statements:\nI. Only boys play football.\nII. There are forty boys and thirty girls in the class.");
        cv23.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv23.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv23.put("optionc", "Either I or II alone sufficient to answer");
        cv23.put("optiond", "Both I and II are not sufficient to answer");
        cv23.put("optione", "Both I and II are necessary to answer");
        cv23.put("correct", "4");

        cv24.put("Id", 24);
        cv24.put("Question", "Who is C's partner in a game of cards involving four players A, B, C and D ?\n Statements:\nI. D is sitting opposite to A.\nII. B is sitting right of A and left of D.");
        cv24.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv24.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv24.put("optionc", "Either I or II alone sufficient to answer");
        cv24.put("optiond", "Both I and II are not sufficient to answer");
        cv24.put("optione", "Both I and II are necessary to answer");
        cv24.put("correct", "3");

        cv25.put("Id", 25);
        cv25.put("Question", "On a T.V. channel, four serials A, B, C and D were screened, one on eacn day, on four consecutive days but not necessarily in that order. On which day was the serial C screened ?\n Statements:\nI. The first serial was screened on 23rd, Tuesday and was followed by serial D.\nII. Serial A was not screened on 25th and one serial was screened between serials A and B.");
        cv25.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv25.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv25.put("optionc", "Either I or II alone sufficient to answer");
        cv25.put("optiond", "Both I and II are not sufficient to answer");
        cv25.put("optione", "Both I and II are necessary to answer");
        cv25.put("correct", "5");

        cv26.put("Id", 26);
        cv26.put("Question", "How is Sulekha related to Nandini ?\n Statements:\nI. Sulekha's husband is the only son of Nandini's mother.\nII. Sulekha's brother and Nandini's husband are cousins.");
        cv26.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv26.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv26.put("optionc", "Either I or II alone sufficient to answer");
        cv26.put("optiond", "Both I and II are not sufficient to answer");
        cv26.put("optione", "Both I and II are necessary to answer");
        cv26.put("correct", "3");

        cv27.put("Id", 27);
        cv27.put("Question", "Can Ritesh retire from office X in January 2006, with full pension benefits ?\n Statements:\nI. Ritesh will complete 30 years of service in office X in April 2000 and desires to retire.\nII. As per office X rules, an employee has to complete minimum 30 years of service and attain age of 60. Ritesh has 3 years to complete age of 60.");
        cv27.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv27.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv27.put("optionc", "Either I or II alone sufficient to answer");
        cv27.put("optiond", "Both I and II are not sufficient to answer");
        cv27.put("optione", "Both I and II are necessary to answer");
        cv27.put("correct", "5");

        cv28.put("Id", 28);
        cv28.put("Question", "What is the code for 'or' in the code language?\n Statements: 'nik sa te' means 'right or wrong', 'ro da nik' means 'he is right' and 'fe te ro' means 'that is wrong'.\nII. 'pa nik la' means 'that right man', 'sa ne pa' means 'this or that' and 'ne ka re' means 'tell this there'.");
        cv28.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv28.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv28.put("optionc", "Either I or II alone sufficient to answer");
        cv28.put("optiond", "Both I and II are not sufficient to answer");
        cv28.put("optione", "Both I and II are necessary to answer");
        cv28.put("correct", "3");

        cv29.put("Id", 29);
        cv29.put("Question", "Madan is elder than Kamal and Sharad is younger than Arvind. Who among them is the youngest ?\n Statements:\nI. Sharad is younger than Madan.\nII. Arvind is younger than Kamal.");
        cv29.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv29.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv29.put("optionc", "Either I or II alone sufficient to answer");
        cv29.put("optiond", "Both I and II are not sufficient to answer");
        cv29.put("optione", "Both I and II are necessary to answer");
        cv29.put("correct", "2");

        cv30.put("Id", 30);
        cv30.put("Question", "On which date in August was Kapil born ?\n Statements:\nI. Kapil's mother remembers that Kapil was born before nineteenth but after fifteenth.\nII. Kapil's brother remembers that Kapil was born before seventeenth but after twelfth.");
        cv30.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv30.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv30.put("optionc", "Either I or II alone sufficient to answer");
        cv30.put("optiond", "Both I and II are not sufficient to answer");
        cv30.put("optione", "Both I and II are necessary to answer");
        cv30.put("correct", "5");

        cv31.put("Id", 31);
        cv31.put("Question", "What is Gagan's age ?\n Statements:\nI. Gagan, Vimal and Kunal are all of the same age.\nII. Total age of Vimal, Kunal and Anil is 32 years and Anil is as old as Vimal and Kunal together.");
        cv31.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv31.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv31.put("optionc", "Either I or II alone sufficient to answer");
        cv31.put("optiond", "Both I and II are not sufficient to answer");
        cv31.put("optione", "Both I and II are necessary to answer");
        cv31.put("correct", "5");

        cv32.put("Id", 32);
        cv32.put("Question", "In a certain code, '13' means 'stop smoking' and '59' means 'injurious habit'. What do '9' and '5' mean respectively in that code ?\n Statements:\nI. '157' means 'stop bad habit'.II. '839' means 'smoking is injurious'.");
        cv32.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv32.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv32.put("optionc", "Either I or II alone sufficient to answer");
        cv32.put("optiond", "Both I and II are not sufficient to answer");
        cv32.put("optione", "Both I and II are necessary to answer");
        cv32.put("correct", "3");

        cv33.put("Id", 33);
        cv33.put("Question", "How much money do Vivek and Suman have together ?\n Statements:\nI. Suman has 20 rupees less than what Tarun has.\nII. Vivek has 30 rupees more than what Tarun has.");
        cv33.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv33.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv33.put("optionc", "Either I or II alone sufficient to answer");
        cv33.put("optiond", "Both I and II are not sufficient to answer");
        cv33.put("optione", "Both I and II are necessary to answer");
        cv33.put("correct", "4");

        cv34.put("Id", 34);
        cv34.put("Question", "Among Monika, Anita, Sonal, Ratna and Tanvy, who came last for the programme ?\n Statements:\nI. Monika came after Anita but not after Tanvy.\nII. Ratna came after Tanvy but not after Sonal.");
        cv34.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv34.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv34.put("optionc", "Either I or II alone sufficient to answer");
        cv34.put("optiond", "Both I and II are not sufficient to answer");
        cv34.put("optione", "Both I and II are necessary to answer");
        cv34.put("correct", "5");

        cv35.put("Id", 35);
        cv35.put("Question", "Who among P, Q, R, S and T is the lightest?\n Statements:\nI. R is heavier than Q and T but lighter than S.\nII. S is not the heaviest.");
        cv35.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv35.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv35.put("optionc", "Either I or II alone sufficient to answer");
        cv35.put("optiond", "Both I and II are not sufficient to answer");
        cv35.put("optione", "Both I and II are necessary to answer");
        cv35.put("correct", "4");

        cv36.put("Id", 36);
        cv36.put("Question", "How is T related to K?\n Statements:\nI. K has two sons; one of the sons is A.\nII. The mother of T has only two sons - Aand B.");
        cv36.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv36.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv36.put("optionc", "Either I or II alone sufficient to answer");
        cv36.put("optiond", "Both I and II are not sufficient to answer");
        cv36.put("optione", "Both I and II are necessary to answer");
        cv36.put("correct", "5");

        cv37.put("Id", 37);
        cv37.put("Question", "What is the shortest distance between Devipur and Durgapur ?\n Statements:\nI. Durgapur is 20 kms away from Rampur.\nII. Devipur is 15 kms away from Rampur.");
        cv37.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv37.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv37.put("optionc", "Either I or II alone sufficient to answer");
        cv37.put("optiond", "Both I and II are not sufficient to answer");
        cv37.put("optione", "Both I and II are necessary to answer");
        cv37.put("correct", "4");

        cv38.put("Id", 38);
        cv38.put("Question", "How is A related to D ?\n Statements:\nI. B is the brother of A.\nII. B is D's son.");
        cv38.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv38.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv38.put("optionc", "Either I or II alone sufficient to answer");
        cv38.put("optiond", "Both I and II are not sufficient to answer");
        cv38.put("optione", "Both I and II are necessary to answer");
        cv38.put("correct", "4");

        cv39.put("Id", 39);
        cv39.put("Question", "Manoj, Prabhakar, Akash and Kamal are four friends. Who among them is the heaviest ?\n Statements:\nI. Prabhakar is heavier than Manoj and Kamal but lighter than Akash.\nII. Manoj is lighter than Prabhakar and Akash but heavier than Kamal.");
        cv39.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv39.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv39.put("optionc", "Either I or II alone sufficient to answer");
        cv39.put("optiond", "Both I and II are not sufficient to answer");
        cv39.put("optione", "Both I and II are necessary to answer");
        cv39.put("correct", "1");

        cv40.put("Id", 40);
        cv40.put("Question", "Vinod's and Javed's salaries are in the proportion of 4 : 3 respectively. What is Vinod's salary ?\n Statements:\nI. Javed's salary is 75% that of Vinod's salary.\nII. Javed's salary is Rs 4500.");
        cv40.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv40.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv40.put("optionc", "Either I or II alone sufficient to answer");
        cv40.put("optiond", "Both I and II are not sufficient to answer");
        cv40.put("optione", "Both I and II are necessary to answer");
        cv40.put("correct", "2");

        cv41.put("Id", 41);
        cv41.put("Question", "What is Nitin's rank from the top in a class of forty students ?\n Statements:\nI. There are ten students between Nitin and Deepak.\nII. Deepak is twentieth from the top.");
        cv41.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv41.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv41.put("optionc", "Either I or II alone sufficient to answer");
        cv41.put("optiond", "Both I and II are not sufficient to answer");
        cv41.put("optione", "Both I and II are necessary to answer");
        cv41.put("correct", "4");

        cv42.put("Id", 42);
        cv42.put("Question", "Which direction is Sunny facing now ?\n Statements:\nI. If Sunny turns to his right and again turns to his right, he will be facing North.\nII. If Sunny walks some distance and turns left and again walks some distance, then his face will be towards left of Dinesh who is facing South.");
        cv42.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv42.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv42.put("optionc", "Either I or II alone sufficient to answer");
        cv42.put("optiond", "Both I and II are not sufficient to answer");
        cv42.put("optione", "Both I and II are necessary to answer");
        cv42.put("correct", "3");

        cv43.put("Id", 43);
        cv43.put("Question", "T studies in which of the schools B, C, D, E and F ?\n Statements:\nI. T does not study in the same school as either R or J.\nII. R and J study in schools D and F respectively.");
        cv43.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv43.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv43.put("optionc", "Either I or II alone sufficient to answer");
        cv43.put("optiond", "Both I and II are not sufficient to answer");
        cv43.put("optione", "Both I and II are necessary to answer");
        cv43.put("correct", "4");

        cv44.put("Id", 44);
        cv44.put("Question", "How is Divya related to Shaloo ?\n Statements:\nI. Divya's mother is sister of Shaloo's father.\nII. Shaloo is the daughter of Divya's grandfather's only child.");
        cv44.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv44.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv44.put("optionc", "Either I or II alone sufficient to answer");
        cv44.put("optiond", "Both I and II are not sufficient to answer");
        cv44.put("optione", "Both I and II are necessary to answer");
        cv44.put("correct", "3");

        cv45.put("Id", 45);
        cv45.put("Question", "How many New Year's greeting cards were sold this year in your shop ?\n Statements:\nI. Last year 2935 cards were sold.\nII. The number of cards sold this year was 1.2 times that of last year.");
        cv45.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv45.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv45.put("optionc", "Either I or II alone sufficient to answer");
        cv45.put("optiond", "Both I and II are not sufficient to answer");
        cv45.put("optione", "Both I and II are necessary to answer");
        cv45.put("correct", "5");

        cv46.put("Id", 46);
        cv46.put("Question", "On which day in April is Gautam's birthday?\n Statements:\nI. Gautam was born exactly 28 years after his mother was born.\nII. His mother will be 55 years 4 months and 5 days on August 18 this year.");
        cv46.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv46.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv46.put("optionc", "Either I or II alone sufficient to answer");
        cv46.put("optiond", "Both I and II are not sufficient to answer");
        cv46.put("optione", "Both I and II are necessary to answer");
        cv46.put("correct", 5);

        cv47.put("Id", 47);
        cv47.put("Question", "What is the code for 'is' in the code language ?\n Statements:\nI. In the code language, 'shi tu ke' means 'pen is blue'.\nII. In the same code language, 'ke si re' means 'this is wonderful'.");
        cv47.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv47.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv47.put("optionc", "Either I or II alone sufficient to answer");
        cv47.put("optiond", "Both I and II are not sufficient to answer");
        cv47.put("optione", "Both I and II are necessary to answer");
        cv47.put("correct", 5);

        cv48.put("Id", 48);
        cv48.put("Question", "Among A, B, C, D and E, who is in the middle while standing in a row ?\n Statements:\nI. C, who is third to the left of D, is to the immediate right of A and second to the left of E.\nII. C is second to the left of E, who is not at any of the ends and who is third to the right of A. D is at one of the ends.");
        cv48.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv48.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv48.put("optionc", "Either I or II alone sufficient to answer");
        cv48.put("optiond", "Both I and II are not sufficient to answer");
        cv48.put("optione", "Both I and II are necessary to answer");
        cv48.put("correct", "3");

        cv49.put("Id", 49);
        cv49.put("Question", "Among A, B, C, D, E and F, who is the heaviest ?\n Statements:\nI. A and D are heavier than B, E and F but none of them is the heaviest.\nII. A is heavier than D but lighter than C.");
        cv49.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv49.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv49.put("optionc", "Either I or II alone sufficient to answer");
        cv49.put("optiond", "Both I and II are not sufficient to answer");
        cv49.put("optione", "Both I and II are necessary to answer");
        cv49.put("correct", "1");

        cv50.put("Id", 50);
        cv50.put("Question", "Who among P, Q, T, V and M is exactly in the middle when they are arranged in ascending order of their heights ?\n Statements:\nI. V is taller than Q but shorter than M.");
        cv50.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv50.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv50.put("optionc", "Either I or II alone sufficient to answer");
        cv50.put("optiond", "Both I and II are not sufficient to answer");
        cv50.put("optione", "Both I and II are necessary to answer");
        cv50.put("correct", "5");

        cv51.put("Id", 1);
        cv51.put("Question", "Statement: Some actors are singers. All the singers are dancers.\n Conclusions:\nI. Some actors are dancers.\nII. No singer is actor.");
        cv51.put("optiona", "If only I conclusion follows");
        cv51.put("optionb", "If only II conclusion follows");
        cv51.put("optionc", "If either I or II  follows");
        cv51.put("optiond", "If neither I nor II  follows");
        cv51.put("optione", "If both I and II  follows");
        cv51.put("correct", "1");

        cv52.put("Id", 2);
        cv52.put("Question", "Statement: All the harmoniums are instruments. All the instruments are flutes.\n Conclusions:\nI. All the flutes are instruments.\nII. All the harmoniums are flutes.");
        cv52.put("optiona", "If only I conclusion follows");
        cv52.put("optionb", "If only II conclusion follows");
        cv52.put("optionc", "If either I or II  follows");
        cv52.put("optiond", "If neither I nor II  follows");
        cv52.put("optione", "If both I and II  follows");
        cv52.put("correct", "2");

        cv53.put("Id", 3);
        cv53.put("Question", "Statement: Some mangoes are yellow. Some tixo are mangoes.\n Conclusions:\nI. Some mangoes are green.\nII. Tixo is a yellow.");
        cv53.put("optiona", "If only I conclusion follows");
        cv53.put("optionb", "If only II conclusion follows");
        cv53.put("optionc", "If either I or II  follows");
        cv53.put("optiond", "If neither I nor II  follows");
        cv53.put("optione", "If both I and II  follows");
        cv53.put("correct", "4");

        cv54.put("Id", 4);
        cv54.put("Question", "Statement: Some ants are parrots. All the parrots are apples.\n Conclusions:\nI. All the apples are parrots.\nII. Some ants are apples.");
        cv54.put("optiona", "If only I conclusion follows");
        cv54.put("optionb", "If only II conclusion follows");
        cv54.put("optionc", "If either I or II  follows");
        cv54.put("optiond", "If neither I nor II  follows");
        cv54.put("optione", "If both I and II  follows");
        cv54.put("correct", "2");

        cv55.put("Id", 5);
        cv55.put("Question", "Statement: Some papers are pens. All the pencils are pens.\n Conclusions:\nI. Some pens are pencils.\nII. Some pens are papers.");
        cv55.put("optiona", "If only I conclusion follows");
        cv55.put("optionb", "If only II conclusion follows");
        cv55.put("optionc", "If either I or II  follows");
        cv55.put("optiond", "If neither I nor II  follows");
        cv55.put("optione", "If both I and II  follows");
        cv55.put("correct", "5");

        cv56.put("Id", 6);
        cv56.put("Question", "Statement: All the actors are girls. All the girls are beautiful.\n Conclusions:\nI. All the actors are beautiful.\nII. Some girls are actors.");
        cv56.put("optiona", "If only I conclusion follows");
        cv56.put("optionb", "If only II conclusion follows");
        cv56.put("optionc", "If either I or II  follows");
        cv56.put("optiond", "If neither I nor II  follows");
        cv56.put("optione", "If both I and II  follows");
        cv56.put("correct", "5");

        cv57.put("Id", 7);
        cv57.put("Question", "Statement: All the windows are doors. No door is a wall..\n Conclusions:\nI Some windows are walls.\nII. No wall is a door.");
        cv57.put("optiona", "If only I conclusion follows");
        cv57.put("optionb", "If only II conclusion follows");
        cv57.put("optionc", "If either I or II  follows");
        cv57.put("optiond", "If neither I nor II  follows");
        cv57.put("optione", "If both I and II  follows");
        cv57.put("correct", "2");

        cv58.put("Id", 8);
        cv58.put("Question", "Statement: All cups are books. All books are shirts.\n Conclusions:\nI. Some cups are not shirts.\nII. Some shirts are cups.");
        cv58.put("optiona", "If only I conclusion follows");
        cv58.put("optionb", "If only II conclusion follows");
        cv58.put("optionc", "If either I or II  follows");
        cv58.put("optiond", "If neither I nor II  follows");
        cv58.put("optione", "If both I and II  follows");
        cv58.put("correct", "2");

        cv59.put("Id", 9);
        cv59.put("Question", "Statement: Some cows are crows. Some crows are elephants.\n Conclusions:\nI. Some cows are elephants.\nII. All crows are elephants.");
        cv59.put("optiona", "If only I conclusion follows");
        cv59.put("optionb", "If only II conclusion follows");
        cv59.put("optionc", "If either I or II  follows");
        cv59.put("optiond", "If neither I nor II  follows");
        cv59.put("optione", "If both I and II  follows");
        cv59.put("correct", "4");

        cv60.put("Id", 10);
        cv60.put("Question", "Statement: All the pencils are pens. All the pens are inks.\n Conclusions:\nI. All the pencils are inks.\nII. Some inks are pencils.");
        cv60.put("optiona", "If only I conclusion follows");
        cv60.put("optionb", "If only II conclusion follows");
        cv60.put("optionc", "If either I or II  follows");
        cv60.put("optiond", "If neither I nor II  follows");
        cv60.put("optione", "If both I and II  follows");
        cv60.put("correct", "5");

        cv61.put("Id", 11);
        cv61.put("Question", "Statement: Some dogs are bats. Some bats are cats.\n Conclusions:\nI. Some dogs are cats.\nII. Some cats are dogs.");
        cv61.put("optiona", "If only I conclusion follows");
        cv61.put("optionb", "If only II conclusion follows");
        cv61.put("optionc", "If either I or II  follows");
        cv61.put("optiond", "If neither I nor II  follows");
        cv61.put("optione", "If both I and II  follows");
        cv61.put("correct", "4");

        cv62.put("Id", 12);
        cv62.put("Question", "Statement: All the trucks are flies. Some scooters are flies.\n Conclusions:\nI. All the trucks are scooters.\nII. Some scooters are trucks.");
        cv62.put("optiona", "If only I conclusion follows");
        cv62.put("optionb", "If only II conclusion follows");
        cv62.put("optionc", "If either I or II  follows");
        cv62.put("optiond", "If neither I nor II  follows");
        cv62.put("optione", "If both I and II  follows");
        cv62.put("correct", "4");

        cv63.put("Id", 13);
        cv63.put("Question", "Statement: All buildings are chalks. No chalk is toffee.\n Conclusions:\nI. No building is toffee All chalks are buildings.");
        cv63.put("optiona", "If only I conclusion follows");
        cv63.put("optionb", "If only II conclusion follows");
        cv63.put("optionc", "If either I or II  follows");
        cv63.put("optiond", "If neither I nor II  follows");
        cv63.put("optione", "If both I and II  follows");
        cv63.put("correct", "1");

        cv64.put("Id", 14);
        cv64.put("Question", "Statement: All cars are cats. All fans are cats.\n Conclusions:\nI. All cars are fans.\nII. Some fans are cars.");
        cv64.put("optiona", "If only I conclusion follows");
        cv64.put("optionb", "If only II conclusion follows");
        cv64.put("optionc", "If either I or II  follows");
        cv64.put("optiond", "If neither I nor II  follows");
        cv64.put("optione", "If both I and II  follows");
        cv64.put("correct", "4");

        cv65.put("Id", 15);
        cv65.put("Question", " Statement: No door is dog. All the dogs are cats.\nConclusions:\nI.No door is cat.\nII.No cat is door.\nIII.Some cats are dogs.\nIV.All the cats are dogs.");
        cv65.put("optiona", "Only II or IV");
        cv65.put("optionb", "Only I or III");
        cv65.put("optionc", "Only III or IV");
        cv65.put("optiond", "Only III");
        cv65.put("optione", "All the four");
        cv65.put("correct", "4");

        cv66.put("Id", 16);
        cv66.put("Question", "Statement:  All green are blue. All blue are white.\nConclusions:\nI.Some blue are green.\nII.Some white are green.\nIII.Some green are not white.\nIV.All white are blue.");
        cv66.put("optiona", "Only I or II");
        cv66.put("optionb", "Only I or III");
        cv66.put("optionc", "Only I or IV");
        cv66.put("optiond", "Only II or IV");
        cv66.put("optione", "All the four");
        cv66.put("correct", "1");

        cv67.put("Id", 17);
        cv67.put("Question", "Statement: All men are vertebrates. Some mammals are vertebrates. Conclusions: All men are mammals. All mammals are men. Some vertebrates are mammals. All vertebrates are men.");
        cv67.put("optiona", "Only IV");
        cv67.put("optionb", "Only II");
        cv67.put("optionc", "Only III");
        cv67.put("optiond", "Only I ");
        cv67.put("optione", "Only I and III");
        cv67.put("correct", "3");

        cv68.put("Id", 18);
        cv68.put("Question", "Statement: All the phones are scales. All the scales are calculators.\nConclusions:\nI.All the calculators are scales.\nII.All the phones are calculators.\nIII.All the scales are phones.\nIV.Some calculators are phones.");
        cv68.put("optiona", "Only I and IV");
        cv68.put("optionb", "Only III and IV");
        cv68.put("optionc", "Only II and IV");
        cv68.put("optiond", "Only I and II");
        cv68.put("optione", "Only I and III");
        cv68.put("correct", "3");

        cv69.put("Id", 19);
        cv69.put("Question", "Statement: Some tables are T.V. Some T.V. are radios.\n Conclusions:\nI. Some tables are radios.\nII. Some radios are tables.\nIII. All the radios are T.V.\nIV. All the T.V. are tables.");
        cv69.put("optiona", "Only II and IV");
        cv69.put("optionb", "Only I and III");
        cv69.put("optionc", "Only IV");
        cv69.put("optiond", "Only I and IV");
        cv69.put("optione", "None of the four");
        cv69.put("correct", "5");

        cv70.put("Id", 20);
        cv70.put("Question", "Statement: Some pens are books. Some books are pencils.\n Conclusions:\nI. Some pens are pencils.\nII. Some pencils are pens.\nIII. All pencils are pens.\nIV. All books are pens.");
        cv70.put("optiona", "Only I and III");
        cv70.put("optionb", "Only II and IV");
        cv70.put("optionc", "All the four");
        cv70.put("optiond", "None of the four");
        cv70.put("optione", "Only I");
        cv70.put("correct", "4");

        cv71.put("Id", 21);
        cv71.put("Question", ":Statement: All the goats are tigers. All the tigers are lions.\n Conclusions:\nI. All the goats are lions.\nII. All the lions are goats.\nIII. Some lions are goats.\nIV. Some tigers are goats.");
        cv71.put("optiona", "All the four");
        cv71.put("optionb", "Only I,II and III");
        cv71.put("optionc", "Only I,III and IV");
        cv71.put("optiond", "Only II,IIIand IV");
        cv71.put("optione", "None of the four");
        cv71.put("correct", "3");

        cv72.put("Id", 22);
        cv72.put("Question", "Statement: All the books are pencils. No pencil is eraser.\n Conclusions:\nI. All the pencils are books.\nII. Some erasers are books.\nIII. No book is eraser.\nIV. Some books are erasers.");
        cv72.put("optiona", "Only III");
        cv72.put("optionb", "Only I and III");
        cv72.put("optionc", "Only I and II");
        cv72.put("optiond", "Only II and III");
        cv72.put("optione", "Only III and IV");
        cv72.put("correct", "1");

        cv73.put("Id", 23);
        cv73.put("Question", "Statement: All the locks are keys. All the keys are bats. Some watches are bats.\n Conclusions:\nI. Some bats are locks.\nII. Some watches are keys.\nIII. All the keys are locks.");
        cv73.put("optiona", "Only I and II");
        cv73.put("optionb", "Only I ");
        cv73.put("optionc", "Only II");
        cv73.put("optiond", "Only I and III");
        cv73.put("optione", "All the four ");
        cv73.put("correct", "2");

        cv74.put("Id", 24);
        cv74.put("Question", "Statement: Some keys are staplers. Some staplers are stickers. All the stickers are pens.\nConclusions:\nI. Some pens are staplers.\nII. Some stickers are keys.\nIII. No sticker is key.\nIV. Some staplers are keys.");
        cv74.put("optiona", "Only I and II");
        cv74.put("optionb", "Only II and IV");
        cv74.put("optionc", "Only II and III");
        cv74.put("optiond", "Only I and IV and either II or III");
        cv74.put("optione", "All the four ");
        cv74.put("correct", "4");

        cv75.put("Id", 25);
        cv75.put("Question", "Statements: Some questions are answers. Some answers are writers. All the writers are poets.\n Conclusions:\nI. Some writers are answers.\nII. Some poets are questions.\nIII. All the questions are poets.\nIV. Some poets are answers.");
        cv75.put("optiona", "Only I and II");
        cv75.put("optionb", "Only I and IV");
        cv75.put("optionc", "Only I and III");
        cv75.put("optiond", "Only II and IV");
        cv75.put("optione", "All the four");
        cv75.put("correct", "2");

        cv76.put("Id", 26);
        cv76.put("Question", "Statements: Some envelops are gums. Some gums are seals. Some seals are adhesives.\n Conclusions:\nI. Some envelopes are seals.\nII. Some gums are adhesives.\nIII. Some adhesives are seals.\nIV. Some adhesives are gums.");
        cv76.put("optiona", "Only III");
        cv76.put("optionb", "Only I");
        cv76.put("optionc", "Only II");
        cv76.put("optiond", "Only IV");
        cv76.put("optione", "All the four");
        cv76.put("correct", "1");

        cv77.put("Id", 27);
        cv77.put("Question", "Statements: All the papers are books. All the bags are books. Some purses are bags.\n Conclusions:\nI. Some papers are bags.\nII. Some books are papers. \nIII. Some books are purses.");
        cv77.put("optiona", " only I ");
        cv77.put("optionb", "Only II and III");
        cv77.put("optionc", "Only I and II");
        cv77.put("optiond", "Only I and III");
        cv77.put("optione", "All the four");
        cv77.put("correct", "2");

        cv78.put("Id", 28);
        cv78.put("Question", "Statements: Some rats are cats. Some cats are dogs. No dog is cow.\nConclusions:\nI. No cow is cat.\nII. No dog is rat.\nIII. Some cats are rats.");
        cv78.put("optiona", "Only I");
        cv78.put("optionb", "Only I and II");
        cv78.put("optionc", "Only I and III");
        cv78.put("optiond", "Only II and III");
        cv78.put("optione", "Only III");
        cv78.put("correct", "5");

        cv79.put("Id", 29);
        cv79.put("Question", "Statements: All the books are papers. Some papers are journals. Some journals are calendars.\n Conclusions:\nI. Some journals are books.\nII. Some calendars are papers.\nIII. Some books are journals.\nIV. Some books are calendars.");
        cv79.put("optiona", "Only I");
        cv79.put("optionb", "Only II");
        cv79.put("optionc", "Only III");
        cv79.put("optiond", "Only IV");
        cv79.put("optione", "None of the four");
        cv79.put("correct", "5");

        cv80.put("Id", 30);
        cv80.put("Question", "Statements: All the bottles are boxes. All the boxes are bags. Some bags are trays.\n Conclusions:\nI. Some bottles are trays.\nII. Some trays are boxes.\nIII. All the bottles are bags.\nIV. Some trays are bags.");
        cv80.put("optiona", "Only III and IV");
        cv80.put("optionb", "Only I and II");
        cv80.put("optionc", "Only II and III");
        cv80.put("optiond", "Only I and IV");
        cv80.put("optione", "All the four");
        cv80.put("correct", "1");

        cv81.put("Id", 31);
        cv81.put("Question", "Statements: Some cars are jeeps. All the boxes are jeeps. All the pens are cars.\n Conclusions:\nI. Some cars are boxes.\nII. No pen is jeep.\nIII. Some boxes are cars.");
        cv81.put("optiona", "None of three");
        cv81.put("optionb", "Only I and II");
        cv81.put("optionc", "Only I and III");
        cv81.put("optiond", "Only II and III");
        cv81.put("optione", "All the four");
        cv81.put("correct", "1");

        cv82.put("Id", 32);
        cv82.put("Question", "Statements: All benches are cots.No cot is lamp.Some lamps are candles.\nConclusions:\nI. some cots are candles.\nII. Some candles are cots");
        cv82.put("optiona", "If only I conclusion follows");
        cv82.put("optionb", "If only II conclusion follows");
        cv82.put("optionc", "If either I or II  follows");
        cv82.put("optiond", "If neither I nor II  follows");
        cv82.put("optione", "If both I and II  follows");
        cv82.put("correct", "4");

        cv83.put("Id", 33);
        cv83.put("Question", "Statements: All pens are books.Some pencils are pens.\nConclusions:\n1. some books are pencils.\n2. Some pencils are books.\n3. All pens are pencils.\n4. None");
        cv83.put("optiona", " 1 ");
        cv83.put("optionb", " 2");
        cv83.put("optionc", " 3");
        cv83.put("optiond", " 4");
        cv83.put("optione", "1,2 and 3");
        cv83.put("correct", "2");

        cv84.put("Id", 34);
        cv84.put("Question", "Statements: All pens are books.No pencils are books.\nConclusion:\n1. All books are pencils.\n2. All pencils are books.\n3. Some pencils are books.\n4. None");
        cv84.put("optiona", "1");
        cv84.put("optionb", "2");
        cv84.put("optionc", "3");
        cv84.put("optiond", "4s");
        cv84.put("optione", "1,2 and 3");
        cv84.put("correct", "3");

        cv85.put("Id", 35);
        cv85.put("Question", "Statements: No mat is pot.All pots are bats.\nConclusion:\n1. No mats are bats.\n2. No bats are mats.\n3. Some bats are mats.\n4. Some bats are not mats");
        cv85.put("optiona", "1");
        cv85.put("optionb", "2");
        cv85.put("optionc", "3");
        cv85.put("optiond", "4");
        cv85.put("optione", "1,2 and 3");
        cv85.put("correct", "4");

        cv86.put("Id", 36);
        cv86.put("Question", " Statements: Some cats are dogs.All dogs are goats.All goats are walls.\nConclusion:\nI. Some walls are dogs.\nII.Some walls are cats");
        cv86.put("optiona", "If only I conclusion follows");
        cv86.put("optionb", "If only II conclusion follows");
        cv86.put("optionc", "If either I or II  follows");
        cv86.put("optiond", "If neither I nor II  follows");
        cv86.put("optione", "If both I and II  follows");
        cv86.put("correct", "5");

        cv87.put("Id", 37);
        cv87.put("Question", " Statements: Some roads are ponds.All ponds are stores.Some stores are bags.\nConclusion:\nI. Some bags are ponds.\nII. Some stores are roads.");
        cv87.put("optiona", "If only I conclusion follows");
        cv87.put("optionb", "If only II conclusion follows");
        cv87.put("optionc", "If either I or II  follows");
        cv87.put("optiond", "If neither I nor II  follows");
        cv87.put("optione", "If both I and II  follows");
        cv87.put("correct", "5");

        cv88.put("Id", 38);
        cv88.put("Question", " Statements: Some roses are flowers.Some flowers are buds.All buds are leaves.All leaves are plants.\nConclusion:\n1. Some plants are flowers.\n2. Some roses are buds.\n3. No leaves are roses.\n4. No roses are buds");
        cv88.put("optiona", "Only 1 follows");
        cv88.put("optionb", "Only 1 and 2 follows");
        cv88.put("optionc", "Only 1 and 2 or 4 follows");
        cv88.put("optiond", "Only 2 or 4 follows");
        cv88.put("optione", "None of the four");
        cv88.put("correct", "3");

        cv89.put("Id", 39);
        cv89.put("Question", " Statements: All rods are bricks.Some bricks are ropes.All ropes are doors.\nConcussion: 1. Some rods are doors.\n2. Some doors are bricks.\n3. Some rods are not doors.\n4. All doors are ropes");
        cv89.put("optiona", "Only 1 and 2 follows");
        cv89.put("optionb", "Only 1,2 and 3 follows");
        cv89.put("optionc", "Only 1 or 3 and 2 follows");
        cv89.put("optiond", "Only 1 or 3 and 4 follows");
        cv89.put("optione", "None of the four");
        cv89.put("correct", "3");

        cv90.put("Id", 40);
        cv90.put("Question", " Statements: No rats are cats.All cats are tigers.\nConcussion: 1. No rats are tigers.\n2. No tigers are rats.\n3. Some tigers are rats.\n4. Some tigers are not rats");
        cv90.put("optiona", "Only 1 and 2 follows");
        cv90.put("optionb", "Only 1,2 and 3 follows");
        cv90.put("optionc", "Only either 1 or 3 and 2 follows");
        cv90.put("optiond", "Only either 1 or 3 and 4 follows");
        cv90.put("optione", "Only 4 follows");
        cv90.put("correct", "5");

        cv91.put("Id", 41);
        cv91.put("Question", "Statements : No magazine is cap. All caps are cameras.\n Conclusions: \n I. No camera is magazine.\n II. some cameras are magazines.");
        cv91.put("optiona", "If only I conclusion follows");
        cv91.put("optionb", "If only II conclusion follows");
        cv91.put("optionc", "If either I or II  follows");
        cv91.put("optiond", "If neither I nor II  follows");
        cv91.put("optione", "If both I and II  follows");
        cv91.put("correct", "3");

        cv92.put("Id", 42);
        cv92.put("Question", "Statements : Some desks are caps.No cap is red.\nConclusions: \n I. Some caps are desks.\n II.No desk is red.");
        cv92.put("optiona", "If only I conclusion follows");
        cv92.put("optionb", "If only II conclusion follows");
        cv92.put("optionc", "If either I or II  follows");
        cv92.put("optiond", "If neither I nor II  follows");
        cv92.put("optione", "If both I and II  follows");
        cv92.put("correct", "1");

        cv93.put("Id", 43);
        cv93.put("Question", "Statements :Some books are pens.No pen is pencil .\nConclusions: \n I. Some books are pencils.\n II.No book is pencil.");
        cv93.put("optiona", "If only I conclusion follows");
        cv93.put("optionb", "If only II conclusion follows");
        cv93.put("optionc", "If either I or II  follows");
        cv93.put("optiond", "If neither I nor II  follows");
        cv93.put("optione", "If both I and II  follows");
        cv93.put("correct", "3");

        cv94.put("Id", 44);
        cv94.put("Question", "Statements : No women teacher can play.Some women teachers are atheletes .\nConclusions: \n I. Male teachers can play .\n II. Some atheletes can play.");
        cv94.put("optiona", "If only I conclusion follows");
        cv94.put("optionb", "If only II conclusion follows");
        cv94.put("optionc", "If either I or II  follows");
        cv94.put("optiond", "If neither I nor II  follows");
        cv94.put("optione", "If both I and II  follows");
        cv94.put("correct", "4");

        cv95.put("Id", 45);
        cv95.put("Question", "Statements :No bat is ball.No ball is wicket .\nConclusions: \n I. No bat is wicket .\n II. All wickets are bats.");
        cv95.put("optiona", "If only I conclusion follows");
        cv95.put("optionb", "If only II conclusion follows");
        cv95.put("optionc", "If either I or II  follows");
        cv95.put("optiond", "If neither I nor II  follows");
        cv95.put("optione", "If both I and II  follows");
        cv95.put("correct", "4");

        cv96.put("Id", 46);
        cv96.put("Question", "Statements : Many scooters are trucks.All trucks are trains .\nConclusions: \n I. Some scooters are train .\n II. No truck is scooter.");
        cv96.put("optiona", "If only I conclusion follows");
        cv96.put("optionb", "If only II conclusion follows");
        cv96.put("optionc", "If either I or II  follows");
        cv96.put("optiond", "If neither I nor II  follows");
        cv96.put("optione", "If both I and II  follows");
        cv96.put("correct", "1");

        cv97.put("Id", 47);
        cv97.put("Question", "Statements : Most teachers are boys.Some boys are students .\nConclusions: \n I. Some students are boys .\n II.Some teachers are students.");
        cv97.put("optiona", "If only I conclusion follows");
        cv97.put("optionb", "If only II conclusion follows");
        cv97.put("optionc", "If either I or II  follows");
        cv97.put("optiond", "If neither I nor II  follows");
        cv97.put("optione", "If both I and II  follows");
        cv97.put("correct", "1");

        cv98.put("Id", 48);
        cv98.put("Question", "A: All cushions are pillows.\nB: Some pillows are sheets.\nC: Some sheets are cushions.\nD: Some pillows are not cushions.\nE: All pillows are sheets.\nF: No pillows are sheets");
        cv98.put("optiona", "ABC");
        cv98.put("optionb", "BCD");
        cv98.put("optionc", "EAC");
        cv98.put("optiond", "EDC");
        cv98.put("optione", "None of the above");
        cv98.put("correct", "3");

        cv99.put("Id", 49);
        cv99.put("Question", "A: All synopses are poets.\nB: Some synopses are mentors.\nC: Some x are not mentors.\nD: All x are poets.\nE: All synopses are mentors.\nF: All synopses are x.");
        cv99.put("optiona", "ACB");
        cv99.put("optionb", "AEC");
        cv99.put("optionc", "FEC");
        cv99.put("optiond", "DFA");
        cv99.put("optione", "None of the above");
        cv99.put("correct", "4");

        cv100.put("Id", 50);
        cv100.put("Question", "A: All balls are locks.\nB: All keys are locks.\nC: All keys are balls.\nD: Some keys are locks.\nE: Some locks are balls.\nF: No ball is lock.");
        cv100.put("optiona", "ACD");
        cv100.put("optionb", "BEF");
        cv100.put("optionc", "CDE");
        cv100.put("optiond", "CEF");
        cv100.put("optione", "None of the above");
        cv100.put("correct", "3");

        cv101.put("Id", 1);
        cv101.put("Question", "Look at this series: 2, 1, (1/2), (1/4), ... What number should come next?");
        cv101.put("optiona", "1/3");
        cv101.put("optionb", "1/8");
        cv101.put("optionc", "1/4");
        cv101.put("optiond", "1/16");
        cv101.put("optione", "3/4");
        cv101.put("correct", "2");

        cv102.put("Id", 2);
        cv102.put("Question", "Look at this series: 7, 10, 8, 11, 9, 12, ... What number should come next?");
        cv102.put("optiona", "7");
        cv102.put("optionb", "10");
        cv102.put("optionc", "12");
        cv102.put("optiond", "13");
        cv102.put("optione", "8");
        cv102.put("correct", "2");

        cv103.put("Id", 3);
        cv103.put("Question", "Look at this series: 21, 9, 21, 11, 21, 13, 21, ... What number should come next?");
        cv103.put("optiona", "14");
        cv103.put("optionb", "15");
        cv103.put("optionc", "21");
        cv103.put("optiond", "23");
        cv103.put("optione", "25");
        cv103.put("correct", "2");

        cv104.put("Id", 4);
        cv104.put("Question", "Look at this series: 58, 52, 46, 40, 34, ... What number should come next?");
        cv104.put("optiona", "26");
        cv104.put("optionb", "30");
        cv104.put("optionc", "28");
        cv104.put("optiond", "32");
        cv104.put("optione", "24");
        cv104.put("correct", "3");

        cv105.put("Id", 5);
        cv105.put("Question", "Look at this series: 3, 4, 7, 8, 11, 12, ... What number should come next?");
        cv105.put("optiona", "7");
        cv105.put("optionb", "10");
        cv105.put("optionc", "14");
        cv105.put("optiond", "15");
        cv105.put("optione", "16");
        cv105.put("correct", "4");

        cv106.put("Id", 6);
        cv106.put("Question", "Look at this series: 31, 29, 24, 22, 17, ... What number should come next?");
        cv106.put("optiona", "15");
        cv106.put("optionb", "14");
        cv106.put("optionc", "13");
        cv106.put("optiond", "12");
        cv106.put("optione", "11");
        cv106.put("correct", "1");

        cv107.put("Id", 7);
        cv107.put("Question", "Look at this series: 1.5, 2.3, 3.1, 3.9, ... What number should come next?");
        cv107.put("optiona", "4.2");
        cv107.put("optionb", "4.4");
        cv107.put("optionc", "4.7");
        cv107.put("optiond", "4.9");
        cv107.put("optione", "5.1");
        cv107.put("correct", "3");

        cv108.put("Id", 8);
        cv108.put("Question", "Look at this series: 201, 202, 204, 207, ... What number should come next?");
        cv108.put("optiona", "205");
        cv108.put("optionb", "208");
        cv108.put("optionc", "210");
        cv108.put("optiond", "211");
        cv108.put("optione", "212");
        cv108.put("correct", "4");

        cv109.put("Id", 9);
        cv109.put("Question", "Look at this series: 544, 509, 474, 439, ... What number should come next?");
        cv109.put("optiona", "404");
        cv109.put("optionb", "414");
        cv109.put("optionc", "420");
        cv109.put("optiond", "445");
        cv109.put("optione", "456");
        cv109.put("correct", "3");

        cv110.put("Id", 10);
        cv110.put("Question", "Look at this series: 5.2, 4.8, 4.4, 4, ... What number should come next?");
        cv110.put("optiona", "3.6");
        cv110.put("optionb", "3.7");
        cv110.put("optionc", "3.8");
        cv110.put("optiond", "3.2");
        cv110.put("optione", "3.5");
        cv110.put("correct", "1");

        cv111.put("Id", 11);
        cv111.put("Question", "Look at this series: 80, 10, 70, 15, 60, ... What number should come next?");
        cv111.put("optiona", "20");
        cv111.put("optionb", "25");
        cv111.put("optionc", "30");
        cv111.put("optiond", "40");
        cv111.put("optione", "50");
        cv111.put("correct", "1");

        cv112.put("Id", 12);
        cv112.put("Question", "Look at this series: 8, 6, 9, 23, 87 , ... What number should come next?");
        cv112.put("optiona", "128");
        cv112.put("optionb", "224");
        cv112.put("optionc", "300");
        cv112.put("optiond", "429");
        cv112.put("optione", "None of these");
        cv112.put("correct", "4");

        cv113.put("Id", 13);
        cv113.put("Question", "28 25 5 21 18 5 14 next 2 ?");
        cv113.put("optiona", "11 5");
        cv113.put("optionb", "11 7");
        cv113.put("optionc", "10 8");
        cv113.put("optiond", "5 10");
        cv113.put("optione", "10 5");
        cv113.put("correct", "1");

        cv114.put("Id", 14);
        cv114.put("Question", "8 11 21 15 18 21 22 next 2?");
        cv114.put("optiona", "25 18");
        cv114.put("optionb", "25 21");
        cv114.put("optionc", "25 19");
        cv114.put("optiond", "24 21");
        cv114.put("optione", "22 21");
        cv114.put("correct", "2");

        cv115.put("Id", 15);
        cv115.put("Question", "2 8 14 20 26 32 38 next 2?");
        cv115.put("optiona", "2 46");
        cv115.put("optionb", "44 50");
        cv115.put("optionc", "42 58");
        cv115.put("optiond", "40 42");
        cv115.put("optione", "32 26");
        cv115.put("correct", "2");

        cv116.put("Id", 16);
        cv116.put("Question", "9 11 33 13 15 33 17 next 2?");
        cv116.put("optiona", "33 35");
        cv116.put("optionb", "33 19");
        cv116.put("optionc", "15 33");
        cv116.put("optiond", "19 21");
        cv116.put("optione", "19 33");
        cv116.put("correct", "5");

        cv117.put("Id", 17);
        cv117.put("Question", "2 3 4 5 6 4 8 next 2?");
        cv117.put("optiona", "9 10");
        cv117.put("optionb", "4 8");
        cv117.put("optionc", "10 4");
        cv117.put("optiond", "9 4");
        cv117.put("optione", "8 9");
        cv117.put("correct", "4");

        cv118.put("Id", 18);
        cv118.put("Question", "17 17 34 20 20 31 23 next 2?");
        cv118.put("optiona", "26 23");
        cv118.put("optionb", "34 20");
        cv118.put("optionc", "23 33");
        cv118.put("optiond", "27 28");
        cv118.put("optione", "23 28");
        cv118.put("correct", "5");

        cv119.put("Id", 19);
        cv119.put("Question", "21 25 18 29 33 18 next 2?");
        cv119.put("optiona", "43 18");
        cv119.put("optionb", "41 44");
        cv119.put("optionc", "37 18");
        cv119.put("optiond", "37 41");
        cv119.put("optione", "38 41");
        cv119.put("correct", "4");

        cv120.put("Id", 20);
        cv120.put("Question", "11 16 21 26 31 36 41 next 2?");
        cv120.put("optiona", "47 52");
        cv120.put("optionb", "46 52");
        cv120.put("optionc", "45 49");
        cv120.put("optiond", "46 51");
        cv120.put("optione", "19 33");
        cv120.put("correct", "4");

        cv121.put("Id", 21);
        cv121.put("Question", "84 78 72 66 60 54 48 next 2?");
        cv121.put("optiona", "44 34");
        cv121.put("optionb", "42 36");
        cv121.put("optionc", "42 32");
        cv121.put("optiond", "40 34");
        cv121.put("optione", "38 32");
        cv121.put("correct", "2");

        cv122.put("Id", 22);
        cv122.put("Question", "61 57 50 61 43 36 61 next 2?");
        cv122.put("optiona", "29 61");
        cv122.put("optionb", "31 61");
        cv122.put("optionc", "27 20");
        cv122.put("optiond", "22 15");
        cv122.put("optione", "29 22");
        cv122.put("correct", "5");

        cv123.put("Id", 23);
        cv123.put("Question", "9 12 11 14 13 16 15 next 2?");
        cv123.put("optiona", "14 13");
        cv123.put("optionb", "18 21");
        cv123.put("optionc", "14 17");
        cv123.put("optiond", "12 21");
        cv123.put("optione", "18 17");
        cv123.put("correct", "5");


        cv124.put("Id", 24);
        cv124.put("Question", "40 40 31 31 22 22 13 next 2?");
        cv124.put("optiona", "13 4");
        cv124.put("optionb", "13 5");
        cv124.put("optionc", "4 13");
        cv124.put("optiond", "4 4");
        cv124.put("optione", "9 4");
        cv124.put("correct", "1");

        cv125.put("Id", 25);
        cv125.put("Question", "10 20 25 35 40 50 55 next 2?");
        cv125.put("optiona", "70 65");
        cv125.put("optionb", "60 70");
        cv125.put("optionc", "60 75");
        cv125.put("optiond", "60 65");
        cv125.put("optione", "65 70");
        cv125.put("correct", "5");

        cv126.put("Id", 26);
        cv126.put("Question", "42 40 38 35 33 31 28 next 2?");
        cv126.put("optiona", "25 22");
        cv126.put("optionb", "26 23");
        cv126.put("optionc", "26 24");
        cv126.put("optiond", "25 23");
        cv126.put("optione", "26 22");
        cv126.put("correct", "3");

        cv127.put("Id", 27);
        cv127.put("Question", "6 10 14 18 22 26 30 next 2?");
        cv127.put("optiona", "36 40");
        cv127.put("optionb", "33 37");
        cv127.put("optionc", "32 36");
        cv127.put("optiond", "34 37");
        cv127.put("optione", "34 38");
        cv127.put("correct", "5");

        cv128.put("Id", 28);
        cv128.put("Question", "3 5 35 10 12 35 17 next 2?");
        cv128.put("optiona", "22 35");
        cv128.put("optionb", "35 19");
        cv128.put("optionc", "19 35");
        cv128.put("optiond", "19 24");
        cv128.put("optione", "22 24");
        cv128.put("correct", "3");

        cv129.put("Id", 29);
        cv129.put("Question", "36 31 29 24 22 17 15 next 2?");
        cv129.put("optiona", "13 11");
        cv129.put("optionb", "10 5");
        cv129.put("optionc", "13 5");
        cv129.put("optiond", "11 10");
        cv129.put("optione", "10 8");
        cv129.put("correct", "5");

        cv130.put("Id", 30);
        cv130.put("Question", "13 29 15 26 17 23 19 next 2?");
        cv130.put("optiona", "21 23");
        cv130.put("optionb", "20 21");
        cv130.put("optionc", "20 17");
        cv130.put("optiond", "21 23");
        cv130.put("optione", "23 17");
        cv130.put("correct", "2");

        cv131.put("Id", 31);
        cv131.put("Question", "34 30 26 22 18 14 10 next 2?");
        cv131.put("optiona", "8 6");
        cv131.put("optionb", "6 4");
        cv131.put("optionc", "14 18");
        cv131.put("optiond", "6 2");
        cv131.put("optione", "4 0");
        cv131.put("correct", "4");

        cv132.put("Id", 32);
        cv132.put("Question", "32 31 32 29 32 27 32 next 2?");
        cv132.put("optiona", "25 32");
        cv132.put("optionb", "31 32");
        cv132.put("optionc", "29 30");
        cv132.put("optiond", "30 32");
        cv132.put("optione", "25 28");
        cv132.put("correct", "1");

        cv133.put("Id", 33);
        cv133.put("Question", "44 41 38 35 32 29 26 next 2?");
        cv133.put("optiona", "24 21");
        cv133.put("optionb", "22 19");
        cv133.put("optionc", "23 19");
        cv133.put("optiond", "29 32");
        cv133.put("optione", "23 20");
        cv133.put("correct", "5");

        cv134.put("Id", 34);
        cv134.put("Question", "7 9 66 12 14 66 17 next 2?");
        cv134.put("optiona", "19 66");
        cv134.put("optionb", "66 19");
        cv134.put("optionc", "19 22");
        cv134.put("optiond", "20 26");
        cv134.put("optione", "66 20");
        cv134.put("correct", "1");

        cv135.put("Id", 35);
        cv135.put("Question", "3 8 10 15 17 22 24 next 2?");
        cv135.put("optiona", "26 28");
        cv135.put("optionb", "29 34");
        cv135.put("optionc", "29 31");
        cv135.put("optiond", "26 32");
        cv135.put("optione", "26 31");
        cv135.put("correct", "3");

        cv136.put("Id", 36);
        cv136.put("Question", "32 29 26 23 20 17 14 next 2?");
        cv136.put("optiona", "11 8");
        cv136.put("optionb", "11 7");
        cv136.put("optionc", "10 9");
        cv136.put("optiond", "12 8");
        cv136.put("optione", "9 11");
        cv136.put("correct", "1");

        cv137.put("Id", 37);
        cv137.put("Question", "16 26 56 36 46 68 56 next 2?");
        cv137.put("optiona", "80 66");
        cv137.put("optionb", "64 82");
        cv137.put("optionc", "66 80");
        cv137.put("optiond", "66 82");
        cv137.put("optione", "80 82");
        cv137.put("correct", "3");

        cv138.put("Id", 38);
        cv138.put("Question", "2 44 4 41 6 38 8 next 2?");
        cv138.put("optiona", "10 12");
        cv138.put("optionb", "35 32");
        cv138.put("optionc", "34 9");
        cv138.put("optiond", "35 10");
        cv138.put("optione", "10 34");
        cv138.put("correct", "4");

        cv139.put("Id", 39);
        cv139.put("Question", "17 14 14 11 11 8 8 next 2?");
        cv139.put("optiona", "8 5");
        cv139.put("optionb", "5 2");
        cv139.put("optionc", "5 5");
        cv139.put("optiond", "8 2");
        cv139.put("optione", "5 8");
        cv139.put("correct", "3");

        cv140.put("Id", 40);
        cv140.put("Question", "11 14 14 17 17 20 20 next 2?");
        cv140.put("optiona", "23 23");
        cv140.put("optionb", "23 26");
        cv140.put("optionc", "21 24");
        cv140.put("optiond", "24 24");
        cv140.put("optione", "24 27");
        cv140.put("correct", "1");

        cv141.put("Id", 41);
        cv141.put("Question", "Look at this series: F2, __, D8, C16, B32, ... What number should fill the blank?");
        cv141.put("optiona", "A16");
        cv141.put("optionb", "G4");
        cv141.put("optionc", "E4");
        cv141.put("optiond", "E3");
        cv141.put("optione", "E2");
        cv141.put("correct", "3");

        cv142.put("Id", 42);
        cv142.put("Question", "Look at this series: V, VIII, XI, XIV, __, XX, ... What number should fill the blank?");
        cv142.put("optiona", "IX");
        cv142.put("optionb", "XXIII");
        cv142.put("optionc", "XV");
        cv142.put("optiond", "XVIII");
        cv142.put("optione", "XX");
        cv142.put("correct", "4");


        cv143.put("Id", 43);
        cv143.put("Question", "Look at this series: 70, 71, 76, __, 81, 86, 70, 91, ... What number should fill the blank?");
        cv143.put("optiona", "8");
        cv143.put("optionb", "14");
        cv143.put("optionc", "43");
        cv143.put("optiond", "44");
        cv143.put("optione", "46");
        cv143.put("correct", "2");


        cv144.put("Id", 44);
        cv144.put("Question", "Look at this series: VI, 10, V, 11, __, 12, III, ... What number should fill the blank?");
        cv144.put("optiona", "II");
        cv144.put("optionb", "IV");
        cv144.put("optionc", "IX");
        cv144.put("optiond", "11");
        cv144.put("optione", "14");
        cv144.put("correct", "2");


        cv145.put("Id", 45);
        cv145.put("Question", "Look at this series: 83, 73, 93, 63, __, 93, 43, ... What number should fill the blank?");
        cv145.put("optiona", "13");
        cv145.put("optionb", "33");
        cv145.put("optionc", "53");
        cv145.put("optiond", "73");
        cv145.put("optione", "93");
        cv145.put("correct", "4");


        cv146.put("Id", 46);
        cv146.put("Question", "Look at this series: V, VIII, XI, XIV, __, XX, ... What number should fill the blank?");
        cv146.put("optiona", "IX");
        cv146.put("optionb", "XXIII");
        cv146.put("optionc", "XV");
        cv146.put("optiond", "XVIII");
        cv146.put("optione", "XX");
        cv146.put("correct", "4");


        cv147.put("Id", 47);
        cv147.put("Question", "Look at this series: V, VIII, XI, XIV, __, XX, ... What number should fill the blank?");
        cv147.put("optiona", "IX");
        cv147.put("optionb", "XXIII");
        cv147.put("optionc", "XV");
        cv147.put("optiond", "XVIII");
        cv147.put("optione", "XX");
        cv147.put("correct", "3");


        cv148.put("Id", 48);
        cv148.put("Question", "Look at this series: 72, 76, 73, 77, 74, __, 75, ... What number should fill the blank?");
        cv148.put("optiona", "70");
        cv148.put("optionb", "71");
        cv148.put("optionc", "75");
        cv148.put("optiond", "78");
        cv148.put("optione", "80");
        cv148.put("correct", "4");


        cv149.put("Id", 49);
        cv149.put("Question", "Look at this series: J14, L16, __, P20, R22, ... What number should fill the blank?");
        cv149.put("optiona", "S24");
        cv149.put("optionb", "N18");
        cv149.put("optionc", "M18");
        cv149.put("optiond", "T18");
        cv149.put("optione", "T24");
        cv149.put("correct", "2");


        cv150.put("Id", 50);
        cv150.put("Question", "Look at this series: XXIV, XX, __, XII, VIII, ... What number should fill the blank?");
        cv150.put("optiona", "XXII");
        cv150.put("optionb", "XIII");
        cv150.put("optionc", "XVI");
        cv150.put("optiond", "IV");
        cv150.put("optione", "XX");
        cv150.put("correct", "3");


        cv201.put("Id", 1);
        cv201.put("Question", "Pointing to a photograph of a boy Suresh said, 'He is the son of the only son of my mother.' How is Suresh related to that boy?");
        cv201.put("optiona", "brother");
        cv201.put("optionb", "uncle");
        cv201.put("optionc", "cousin");
        cv201.put("optiond", "father");
        cv201.put("optione", "father-in-law");
        cv201.put("correct", "4");

        cv202.put("Id", 2);
        cv202.put("Question", "If A + B means A is the mother of B; A - B means A is the brother B; A % B means A is the father of B and A x B means A is the sister of B, which of the following shows that P is the maternal uncle of Q?");
        cv202.put("optiona", "Q - N + M x P");
        cv202.put("optionb", "P + S x N - Q");
        cv202.put("optionc", "P - M + N x Q");
        cv202.put("optiond", "Q - S % P");
        cv202.put("optione", "none of these");
        cv202.put("correct", "3");

        cv203.put("Id", 3);
        cv203.put("Question", "If A is the brother of B; B is the sister of C; and C is the father of D, how D is related to A?");
        cv203.put("optiona", "brother");
        cv203.put("optionb", "sister");
        cv203.put("optionc", "nephew");
        cv203.put("optiond", "mother");
        cv203.put("optione", "cannot be determined");
        cv203.put("correct", "5");

        cv204.put("Id", 4);
        cv204.put("Question", "If A + B means A is the brother of B; A - B means A is the sister of B and A x B means A is the father of B. Which of the following means that C is the son of M?");
        cv204.put("optiona", "M - N x C + F");
        cv204.put("optionb", "F - C + N x M");
        cv204.put("optionc", "N + M - F x C");
        cv204.put("optiond", "M x N - C + F");
        cv204.put("optione", "cannot be determined");
        cv204.put("correct", "4");

        cv205.put("Id", 5);
        cv205.put("Question", "Introducing a boy, a girl said, 'He is the son of the daughter of the father of my uncle.' How is the boy related to the girl?");
        cv205.put("optiona", "brother");
        cv205.put("optionb", "nephew");
        cv205.put("optionc", "uncle");
        cv205.put("optiond", "son-in-law");
        cv205.put("optione", "cannot be determined");
        cv205.put("correct", "1");

        cv206.put("Id", 6);
        cv206.put("Question", "Pointing to a photograph Lata says, 'He is the son of the only son of my grandfather.' How is the man in the photograph related to Lata?");
        cv206.put("optiona", "brother");
        cv206.put("optionb", "cousin");
        cv206.put("optionc", "uncle");
        cv206.put("optiond", "son-in-law");
        cv206.put("optione", "cannot be determined");
        cv206.put("correct", "1");

        cv207.put("Id", 7);
        cv207.put("Question", "If A + B means A is the brother of B; A x B means A is the son of B; and A % B means B is the daughter of A then which of the following means M is the maternal uncle of N?");
        cv207.put("optiona", "M + O x N");
        cv207.put("optionb", "M % O x N + P");
        cv207.put("optionc", "M + O % N");
        cv207.put("optiond", "none of these");
        cv207.put("optione", "cannot be determined");
        cv207.put("correct", "4");

        cv208.put("Id", 8);
        cv208.put("Question", "If D is the brother of B, how B is related to C? To answer this question which of the statements is/are necessary?\n1. The son of D is the grandson of C.\n2. B is the sister of D.");
        cv208.put("optiona", "only 1");
        cv208.put("optionb", "only 2");
        cv208.put("optionc", "either 1 or 2");
        cv208.put("optiond", "both 1 and 2");
        cv208.put("optione", "cannot be determined");
        cv208.put("correct", "4");

        cv209.put("Id", 9);
        cv209.put("Question", "If A + B means A is the father of B; A - B means A is the brother B; A % B means A is the wife of B and A x B means A is the mother of B, which of the following shows that M is the maternal grandmother of T?");
        cv209.put("optiona", "M x N % S + T");
        cv209.put("optionb", "M x N - S % T");
        cv209.put("optionc", "M x S - N % T");
        cv209.put("optiond", "M x N x S % T");
        cv209.put("optione", "cannot be determined");
        cv209.put("correct", "1");

        cv210.put("Id", 10);
        cv210.put("Question", "Pointing to a photograph. Bajpai said, 'He is the son of the only daughter of the father of my brother.' How Bajpai is related to the man in the photograph?");
        cv210.put("optiona", "nephew");
        cv210.put("optionb", "brother");
        cv210.put("optionc", "father");
        cv210.put("optiond", "maternal uncle");
        cv210.put("optione", "cannot be determined");
        cv210.put("correct", "4");

        cv211.put("Id", 11);
        cv211.put("Question", "Deepak said to Nitin, 'That boy playing with the football is the younger of the two brothers of the daughter of my father's wife.' How is the boy playing football related to Deepak?");
        cv211.put("optiona", "son");
        cv211.put("optionb", "brother");
        cv211.put("optionc", "cousin");
        cv211.put("optiond", "bother-in-law");
        cv211.put("optione", "cannot be determined");
        cv211.put("correct", "2");

        cv212.put("Id", 12);
        cv212.put("Question", "Pointing a photograph X said to his friend Y, 'She is the only daughter of the father of my mother.' How X is related to the person of photograph?");
        cv212.put("optiona", "son");
        cv212.put("optionb", "brother");
        cv212.put("optionc", "daughter");
        cv212.put("optiond", "nephew");
        cv212.put("optione", "cannot be determined");
        cv212.put("correct", "1");

        cv213.put("Id", 13);
        cv213.put("Question", "Veena who is the sister-in-law of Ashok, is the daughter-in-law of Kalyani. Dheeraj is the father of Sudeep who is the only brother of Ashok. How Kalyani is related to Ashok?");
        cv213.put("optiona", "mother-in-law");
        cv213.put("optionb", "aunt");
        cv213.put("optionc", "wife");
        cv213.put("optiond", "none of these");
        cv213.put("optione", "cannot be determined");
        cv213.put("correct", "4");

        cv214.put("Id", 14);
        cv214.put("Question", "Pointing to a woman, Abhijit said, 'Her granddaughter is the only daughter of my brother.' How is the woman related to Abhijit?");
        cv214.put("optiona", "mother-in-law");
        cv214.put("optionb", "aunt");
        cv214.put("optionc", "mother");
        cv214.put("optiond", "none of these");
        cv214.put("optione", "cannot be determined");
        cv214.put("correct", "3");

        cv215.put("Id", 15);
        cv215.put("Question", "If A + B means A is the sister of B; A x B means A is the wife of B, A % B means A is the father of B and A - B means A is the brother of B. Which of the following means T is the daughter of P?");
        cv215.put("optiona", "P x Q % R + S - T");
        cv215.put("optionb", "P x Q % R - T + S");
        cv215.put("optionc", "P x Q % R + T - S");
        cv215.put("optiond", "P x Q % R + S + T");
        cv215.put("optione", "cannot be determined");
        cv215.put("correct", "2");

        cv216.put("Id", 16);
        cv216.put("Question", "Amit said - 'This girl is the wife of the grandson of my mother.' How is Amit related to the girl?");
        cv216.put("optiona", "brother");
        cv216.put("optionb", "grandfather");
        cv216.put("optionc", "husband");
        cv216.put("optiond", "father in law");
        cv216.put("optione", "cannot be determined");
        cv216.put("correct", "4");

        cv217.put("Id", 17);
        cv217.put("Question", "A and B are children of D. Who is the father of A? To answer this question which of the statements (1) and (2) is necessary?\n1. C is the brother of A and the son of E.\n2. F is the mother B.");
        cv217.put("optiona", "only 1");
        cv217.put("optionb", "only 2");
        cv217.put("optionc", "either 1 or 2");
        cv217.put("optiond", "Both 1 and 2");
        cv217.put("optione", "none of these");
        cv217.put("correct", "2");

        cv218.put("Id", 18);
        cv218.put("Question", "Pointing towards a man, a woman said, 'His mother is the only daughter of my mother.' How is the woman related to the man?");
        cv218.put("optiona", "mother");
        cv218.put("optionb", "grandmother");
        cv218.put("optionc", "sister");
        cv218.put("optiond", "daughter");
        cv218.put("optione", "None of these");
        cv218.put("correct", "1");

        cv219.put("Id", 19);
        cv219.put("Question", "If P $ Q means P is the brother of Q; P # Q means P is the mother of Q; P * Q means P is the daughter of Q in A # B $ C * D, who is the father?");
        cv219.put("optiona", "D");
        cv219.put("optionb", "B");
        cv219.put("optionc", "C");
        cv219.put("optiond", "data inadequate");
        cv219.put("optione", "none of these");
        cv219.put("correct", "1");

        cv220.put("Id", 20);
        cv220.put("Question", "Introducing Sonia, Aamir says, 'She is the wife of only nephew of only brother of my mother.' How Sonia is related to Aamir?");
        cv220.put("optiona", "wife");
        cv220.put("optionb", "sister");
        cv220.put("optionc", "sister-in-law");
        cv220.put("optiond", "data inadequate");
        cv220.put("optione", "none of these");
        cv220.put("correct", "1");

        cv221.put("Id", 21);
        cv221.put("Question", "If A + B means A is the brother of B; A % B means A is the father of B and A x B means A is the sister of B. Which of the following means M is the uncle of P?");
        cv221.put("optiona", "M % N x P");
        cv221.put("optionb", "N x P % M");
        cv221.put("optionc", "M + S % R % P");
        cv221.put("optiond", "M + K % T x P");
        cv221.put("optione", "none of these");
        cv221.put("correct", "4");

        cv222.put("Id", 22);
        cv222.put("Question", "Pointing to Varman, Madhav said, 'I am the only son of one of the sons of his father.' How is Varman related to Madhav?");
        cv222.put("optiona", "nephew");
        cv222.put("optionb", "uncle");
        cv222.put("optionc", "father or uncle");
        cv222.put("optiond", "father");
        cv222.put("optione", "none of these");
        cv222.put("correct", "3");

        cv223.put("Id", 23);
        cv223.put("Question", "Introducing a woman, Shashank said, 'She is the mother of the only daughter of my son.' How that woman is related to Shashank?");
        cv223.put("optiona", "daughter");
        cv223.put("optionb", "sister");
        cv223.put("optionc", "wife");
        cv223.put("optiond", "daughter-in-law");
        cv223.put("optione", "none of these");
        cv223.put("correct", "4");

        cv224.put("Id", 24);
        cv224.put("Question", "if A + B means B is the brother of A; A x B means B is the husband of A; A - B means A is the mother of B and A % B means A is the father of B, which of the following relations shows that Q is the grandmother of T?");
        cv224.put("optiona", "Q - P + R % T");
        cv224.put("optionb", "P x Q % R - T");
        cv224.put("optionc", "P x Q % R + T");
        cv224.put("optiond", "P + Q % R - T");
        cv224.put("optione", "none of these");
        cv224.put("correct", "1");

        cv225.put("Id", 25);
        cv225.put("Question", "1. A3P means A is the mother of P\n2. A4P means A is the brother of P\n3. A9P means A is the husband of P\n4. A5P means A is the daughter of P\nWhich of the following means that K is the mother-in-law of M?");
        cv225.put("optiona", "M9N3K4J");
        cv225.put("optionb", "M9N5K3J");
        cv225.put("optionc", "K5J9M3N");
        cv225.put("optiond", "K3J9N4M");
        cv225.put("optione", "none of these");
        cv225.put("correct", "2");

        cv226.put("Id", 26);
        cv226.put("Question", "Pointing to a photograph Anjali said, 'He is the son of the only son of my grandfather.' How is the man in the photograph related to Anjali?");
        cv226.put("optiona", "brother");
        cv226.put("optionb", "uncle");
        cv226.put("optionc", "son");
        cv226.put("optiond", "daughter-in-law");
        cv226.put("optione", "none of these");
        cv226.put("correct", "1");

        cv227.put("Id", 27);
        cv227.put("Question", "Pointing to a person, Deepak said, 'His only brother is the father of my daughter's father.' How is the person related to Deepak?");
        cv227.put("optiona", "brother");
        cv227.put("optionb", "uncle");
        cv227.put("optionc", "son");
        cv227.put("optiond", "daughter-in-law");
        cv227.put("optione", "none of these");
        cv227.put("correct", "2");

        cv228.put("Id", 28);
        cv228.put("Question", "P is the mother of K; K is the sister of D; D is the father of J. How is P related to J?");
        cv228.put("optiona", "mother");
        cv228.put("optionb", "grandmother");
        cv228.put("optionc", "aunt");
        cv228.put("optiond", "daughter-in-law");
        cv228.put("optione", "none of these");
        cv228.put("correct", "2");

        cv229.put("Id", 29);
        cv229.put("Question", "If P $ Q means P is the father of Q; P # Q means P is the mother of Q and P * Q means P is the sister of Q, then N # L $ P * Q shows which of the relation of Q to N?");
        cv229.put("optiona", "grandson");
        cv229.put("optionb", "granddaughter");
        cv229.put("optionc", "nephew");
        cv229.put("optiond", "data inadequate");
        cv229.put("optione", "none of these");
        cv229.put("correct", "4");

        cv230.put("Id", 30);
        cv230.put("Question", "If A $ B means A is the brother of B; A @ B means A is the wife of B; A # B means A is the daughter of B and A * B means A is the father of B, which of the following indicates that U is the father-in-law of P?");
        cv230.put("optiona", "P @ Q $ T # U * W");
        cv230.put("optionb", "P @ W $ Q * T # U");
        cv230.put("optionc", "P @ Q $ W * T # U");
        cv230.put("optiond", "P @ Q $ T # W * U");
        cv230.put("optione", "none of these");
        cv230.put("correct", "1");

        cv231.put("Id", 31);
        cv231.put("Question", "Introducing a man, a woman said, 'He is the only son of the mother of my mother.' How is the woman related to the man?");
        cv231.put("optiona", "mother");
        cv231.put("optionb", "sister");
        cv231.put("optionc", "maternal aunt");
        cv231.put("optiond", "niece");
        cv231.put("optione", "none of these");
        cv231.put("correct", "4");

        cv232.put("Id", 32);
        cv232.put("Question", "Pointing to Gopi, Nalni says, 'I am the daughter of the only son of his grandfather.' How Nalni is related to Gopi?");
        cv232.put("optiona", "mother");
        cv232.put("optionb", "sister");
        cv232.put("optionc", "maternal aunt");
        cv232.put("optiond", "niece");
        cv232.put("optione", "none of these");
        cv232.put("correct", "2");

        cv233.put("Id", 33);
        cv233.put("Question", "A's son B is married with C whose sister D is married to E the brother of B. How D is related to A?");
        cv233.put("optiona", "mother");
        cv233.put("optionb", "sister");
        cv233.put("optionc", "daughter-in-law");
        cv233.put("optiond", "niece");
        cv233.put("optione", "none of these");
        cv233.put("correct", "3");

        cv234.put("Id", 34);
        cv234.put("Question", "Pointing to a lady a person said, 'The son of her only brother is the brother of my wife.' How is the lady related to the person?");
        cv234.put("optiona", "mother");
        cv234.put("optionb", "sister");
        cv234.put("optionc", "sister of father-in-law");
        cv234.put("optiond", "niece");
        cv234.put("optione", "none of these");
        cv234.put("correct", "3");

        cv235.put("Id", 35);
        cv235.put("Question", "1. B5D means B is the father of D.\n2. B9D means B is the sister of D.\n3. B4D means B is the brother of D.\n4. B3D means B is the wife of D.\nWhich of the following means F is the mother of K?");
        cv235.put("optiona", "F3M5K");
        cv235.put("optionb", "F5M3K");
        cv235.put("optionc", "F9M4N3K");
        cv235.put("optiond", "F3M5N3K");
        cv235.put("optione", "none of these");
        cv235.put("correct", "1");

        cv236.put("Id", 36);
        cv236.put("Question", "A $ B means A is the father of B; A # B means A is the sister of B; A * B means A is the daughter of B and A @ B means A is the brother of B. Which of the following indicates that M is the wife of Q?");
        cv236.put("optiona", "Q $ R # T @ M");
        cv236.put("optionb", "Q $ R @ T # M");
        cv236.put("optionc", "Q $ R * T # M");
        cv236.put("optiond", "Q $ R @ T * M");
        cv236.put("optione", "none of these");
        cv236.put("correct", "4");

        cv237.put("Id", 37);
        cv237.put("Question", "If A $ B means A is the brother of B; B * C means B is the son of C; C @ D means C is the wife of D and A # D means A is the son of D, how C is related to A?");
        cv237.put("optiona", "grandmother");
        cv237.put("optionb", "sister");
        cv237.put("optionc", "daughter");
        cv237.put("optiond", "mother");
        cv237.put("optione", "none of these");
        cv237.put("correct", "4");

        cv238.put("Id", 38);
        cv238.put("Question", "Pointing to a girl Sandeep said, 'She is the daughter of the only sister of my father.' How is sandeep related to the girl?");
        cv238.put("optiona", "uncle");
        cv238.put("optionb", "cousin");
        cv238.put("optionc", "father");
        cv238.put("optiond", "grandfather");
        cv238.put("optione", "none of these");
        cv238.put("correct", "2");

        cv239.put("Id", 39);
        cv239.put("Question", "Pointing to a boy in the photograph Reena said, 'He is the only son of the only child of my grandfather.' How Reena is related to that boy?");
        cv239.put("optiona", "mother");
        cv239.put("optionb", "sister");
        cv239.put("optionc", "father");
        cv239.put("optiond", "grandfather");
        cv239.put("optione", "none of these");
        cv239.put("correct", "2");

        cv240.put("Id", 40);
        cv240.put("Question", "1. A * B means A is the sister of B\n2. A $ B means B is the mother of A\n3. A + B means A is the brother of B\n4. A = B means B is the father of A.\nWhich of the following means M is the maternal uncle of N?");
        cv240.put("optiona", "M = P + Q * N");
        cv240.put("optionb", "N + P = Q * M");
        cv240.put("optionc", "N * P $ Q * M");
        cv240.put("optiond", "data inadequate");
        cv240.put("optione", "none of these");
        cv240.put("correct", "4");

        cv241.put("Id", 41);
        cv241.put("Question", "If P + Q means P is the brother of Q; P x Q means P is the father of Q and P - Q means P is the sister of Q, which of the following relations shows that I is the niece of K?");
        cv241.put("optiona", "K + Y + Z - I");
        cv241.put("optionb", "K + Y x I - Z");
        cv241.put("optionc", "Z - I x Y + K");
        cv241.put("optiond", "K x Y + I - Z");
        cv241.put("optione", "none of these");
        cv241.put("correct", "2");

        cv242.put("Id", 42);
        cv242.put("Question", "If M x N means M is the daughter of N; M + N means M is the father of N; M % N means M is the mother of N and M - N means M is the brother of N then P % Q + R - T x K indicates which relation of P to K?");
        cv242.put("optiona", "mother");
        cv242.put("optionb", "sister");
        cv242.put("optionc", "daughter-in-law");
        cv242.put("optiond", "data inadequate");
        cv242.put("optione", "none of these");
        cv242.put("correct", "5");

        cv243.put("Id", 43);
        cv243.put("Question", "Pointing towards a girl, Abhisek says, 'This girl is the daughter of only a child of my father.' What is the relation of Abhisek's wife to that girl?");
        cv243.put("optiona", "mother");
        cv243.put("optionb", "sister");
        cv243.put("optionc", "daughter-in-law");
        cv243.put("optiond", "data inadequate");
        cv243.put("optione", "none of these");
        cv243.put("correct", "1");

        cv244.put("Id", 44);
        cv244.put("Question", "If A $ B means B is the father of A; A # B means B is the mother of A; A * B means B is the sister of A and A @ B means B is the husband of A, which of the following indicates that N is the grandmother of P?");
        cv244.put("optiona", "P * Q # M $ N");
        cv244.put("optionb", "P @ Q $ M # N");
        cv244.put("optionc", "P # Q $ N * M");
        cv244.put("optiond", "data inadequate");
        cv244.put("optione", "none of these");
        cv244.put("correct", "5");

        cv245.put("Id", 45);
        cv245.put("Question", "Anupam said to a lady sitting in a car, 'The only daughter of the brother of my wife is the sister-in-law of the brother of your sister.' How the husband of the lady is related to Anupam?");
        cv245.put("optiona", "maternal uncle");
        cv245.put("optionb", "uncle");
        cv245.put("optionc", "son-in-law");
        cv245.put("optiond", "data inadequate");
        cv245.put("optione", "none of these");
        cv245.put("correct", "3");

        cv246.put("Id", 46);
        cv246.put("Question", "If P + Q means P is the brother of Q; P x Q means P is the wife of Q and P % Q means P is the daughter of Q then which of the following means D is the uncle of A?");
        cv246.put("optiona", "A % B x C + D");
        cv246.put("optionb", "A x B + C % D");
        cv246.put("optionc", "A + C % B x D");
        cv246.put("optiond", "data inadequate");
        cv246.put("optione", "none of these");
        cv246.put("correct", "5");

        cv247.put("Id", 47);
        cv247.put("Question", "A is the son of C; C and Q are sisters; Z is the mother of Q and P is the son of Z. Which of the following statements is true?");
        cv247.put("optiona", "P and A are cousins");
        cv247.put("optionb", "P is the maternal uncle of A");
        cv247.put("optionc", "Q is the maternal grandfather of A");
        cv247.put("optiond", "C and P are sisters");
        cv247.put("optione", "none of these");
        cv247.put("correct", "2");

        cv248.put("Id", 48);
        cv248.put("Question", "M is the father of N who is the son of V. In order to know the relation of M to P, which of the statement/statements is/are necessary?\n1. P is the brother of V.\n2. The daughter of N is the granddaughter of V.");
        cv248.put("optiona", "only 1");
        cv248.put("optionb", "only 2");
        cv248.put("optionc", "either 1 or 2");
        cv248.put("optiond", "both 1 and 2");
        cv248.put("optione", "none of these");
        cv248.put("correct", "1");

        cv249.put("Id", 49);
        cv249.put("Question", "If X + Y means X is the daughter of Y; X - Y means X is the brother of Y; X % Y means X is the father of Y and X x Y means X is the sister of Y. Which of the following means I is the niece of J?");
        cv249.put("optiona", "J - N % C x I");
        cv249.put("optionb", "I x C - N % J");
        cv249.put("optionc", "J + M x C % I");
        cv249.put("optiond", "I x C + N - J");
        cv249.put("optione", "none of these");
        cv249.put("correct", "4");

        cv250.put("Id", 50);
        cv250.put("Question", "Pointing to a girl Sandeep said, 'She is the daughter of the only sister of my father.' How is sandeep related to the girl?");
        cv250.put("optiona", "uncle");
        cv250.put("optionb", "cousin");
        cv250.put("optionc", "father");
        cv250.put("optiond", "aunt");
        cv250.put("optione", "none of these");
        cv250.put("correct", "2");


        cv451.put("Id", 1);
        cv451.put("Question", "Father is aged three times more than his son Ronit. After 8 years, he would be two and a half times of Ronit's age. After further 8 years, how many times would he be of Ronit's age?");
        cv451.put("optiona", "2 times");
        cv451.put("optionb", "2.5 times");
        cv451.put("optionc", "2.75 times");
        cv451.put("optiond", "3 times");
        cv451.put("optione", "None of these");
        cv451.put("correct", "1");

        cv452.put("Id", 2);
        cv452.put("Question", "The sum of ages of 5 children born at the intervals of 3 years each is 50 years. What is the age of the youngest child?");
        cv452.put("optiona", "4 years");
        cv452.put("optionb", "8 years");
        cv452.put("optionc", "10 years");
        cv452.put("optiond", "12 years");
        cv452.put("optione", "None of these");
        cv452.put("correct", "1");

        cv453.put("Id", 3);
        cv453.put("Question", "A father said to his son, 'I was as old as you are at the present at the time of your birth'. If the father's age is 38 years now, the son's age five years back was:");
        cv453.put("optiona", "14 years");
        cv453.put("optionb", "19 years");
        cv453.put("optionc", "33 years");
        cv453.put("optiond", "38 years");
        cv453.put("optione", "None of these");
        cv453.put("correct", "1");

        cv454.put("Id", 4);
        cv454.put("Question", "A is two years older than B who is twice as old as C. If the total of the ages of A, B and C be 27, the how old is B?");
        cv454.put("optiona", "7");
        cv454.put("optionb", "8");
        cv454.put("optionc", "9");
        cv454.put("optiond", "10");
        cv454.put("optione", "11");
        cv454.put("correct", "4");

        cv455.put("Id", 5);
        cv455.put("Question", "Present ages of Sameer and Anand are in the ratio of 5 : 4 respectively. Three years hence, the ratio of their ages will become 11 : 9 respectively. What is Anand's present age in years?");
        cv455.put("optiona", "24");
        cv455.put("optionb", "27");
        cv455.put("optionc", "40");
        cv455.put("optiond", "33");
        cv455.put("optione", "None of these");
        cv455.put("correct", "1");

        cv456.put("Id", 6);
        cv456.put("Question", "A man is 24 years older than his son. In two years, his age will be twice the age of his son. The present age of his son is:");
        cv456.put("optiona", "14 years");
        cv456.put("optionb", "18 years");
        cv456.put("optionc", "20 years");
        cv456.put("optiond", "22 years");
        cv456.put("optione", "None of these");
        cv456.put("correct", "4");

        cv457.put("Id", 7);
        cv457.put("Question", "Six years ago, the ratio of the ages of Kunal and Sagar was 6 : 5. Four years hence, the ratio of their ages will be 11 : 10. What is Sagar's age at present?");
        cv457.put("optiona", "16 years");
        cv457.put("optionb", "18 years");
        cv457.put("optionc", "20 years");
        cv457.put("optiond", "cannot be determined");
        cv457.put("optione", "None of these");
        cv457.put("correct", "1");

        cv458.put("Id", 8);
        cv458.put("Question", "The sum of the present ages of a father and his son is 60 years. Six years ago, father's age was five times the age of the son. After 6 years, son's age will be:");
        cv458.put("optiona", "12 years");
        cv458.put("optionb", "14 years");
        cv458.put("optionc", "18 years");
        cv458.put("optiond", "20 years");
        cv458.put("optione", "None of these");
        cv458.put("correct", "4");

        cv459.put("Id", 9);
        cv459.put("Question", "At present, the ratio between the ages of Arun and Deepak is 4 : 3. After 6 years, Arun's age will be 26 years. What is the age of Deepak at present ?");
        cv459.put("optiona", "12 years");
        cv459.put("optionb", "19.5 years");
        cv459.put("optionc", "21 years");
        cv459.put("optiond", "15");
        cv459.put("optione", "None of these");
        cv459.put("correct", "4");

        cv460.put("Id", 10);
        cv460.put("Question", "Sachin is younger than Rahul by 7 years. If their ages are in the respective ratio of 7 : 9, how old is Sachin?");
        cv460.put("optiona", "16 years");
        cv460.put("optionb", "18 years");
        cv460.put("optionc", "28 years");
        cv460.put("optiond", "24.5 years");
        cv460.put("optione", "None of these");
        cv460.put("correct", "4");

        cv461.put("Id", 11);
        cv461.put("Question", "The present ages of three persons in proportions 4 : 7 : 9. Eight years ago, the sum of their ages was 56. Find their present ages (in years).");
        cv461.put("optiona", "8,20,28");
        cv461.put("optionb", "16,28,36");
        cv461.put("optionc", "20,35,45");
        cv461.put("optiond", "cannot be determined");
        cv461.put("optione", "None of these");
        cv461.put("correct", "2");

        cv462.put("Id", 12);
        cv462.put("Question", "Ayesha's father was 38 years of age when she was born while her mother was 36 years old when her brother four years younger to her was born. What is the difference between the ages of her parents?");
        cv462.put("optiona", "2 years");
        cv462.put("optionb", "4 years");
        cv462.put("optionc", "6 years");
        cv462.put("optiond", "8 years");
        cv462.put("optione", "None of these");
        cv462.put("correct", "3");

        cv463.put("Id", 13);
        cv463.put("Question", "A person's present age is two-fifth of the age of his mother. After 8 years, he will be one-half of the age of his mother. How old is the mother at present?");
        cv463.put("optiona", "32 years");
        cv463.put("optionb", "36 years");
        cv463.put("optionc", "40 years");
        cv463.put("optiond", "48 years");
        cv463.put("optione", "None of these");
        cv463.put("correct", "3");

        cv464.put("Id", 14);
        cv464.put("Question", "Q is as much younger than R as he is older than T. If the sum of the ages of R and T is 50 years, what is definitely the difference between R and Q's age?");
        cv464.put("optiona", "1 year");
        cv464.put("optionb", "2 years");
        cv464.put("optionc", "25 years");
        cv464.put("optiond", "Data inadequate");
        cv464.put("optione", "None of these");
        cv464.put("correct", "4");

        cv465.put("Id", 15);
        cv465.put("Question", "The age of father 10 years ago was thrice the age of his son. Ten years hence, father's age will be twice that of his son. The ratio of their present ages is:");
        cv465.put("optiona", "5:2");
        cv465.put("optionb", "7:3");
        cv465.put("optionc", "9:2");
        cv465.put("optiond", "13:4");
        cv465.put("optione", "None of these");
        cv465.put("correct", "2");

        cv466.put("Id", 16);
        cv466.put("Question", "What is Sonia's present age?\nI. Sonia's present age is five times Deepak's present age.\nII. Five years ago her age was twenty-five times Deepak's age at that time.");
        cv466.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv466.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv466.put("optionc", "Either I or II alone sufficient to answer");
        cv466.put("optiond", "Both I and II are not sufficient to answer");
        cv466.put("optione", "Both I and II are necessary to answer");
        cv466.put("correct", "5");

        cv467.put("Id", 17);
        cv467.put("Question", "Average age of employees working in a department is 30 years. In the next year, ten workers will retire. What will be the average age in the next year?\nI. Retirement age is 60 years\nII. There are 50 employees in the department.");
        cv467.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv467.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv467.put("optionc", "Either I or II alone sufficient to answer");
        cv467.put("optiond", "Both I and II are not sufficient to answer");
        cv467.put("optione", "Both I and II are necessary to answer");
        cv467.put("correct", "5");

        cv468.put("Id", 18);
        cv468.put("Question", "Divya is twice as old as Shruti. What is the difference in their ages?\nI. Five years hence, the ratio of their ages would be 9 : 5.\nII. Ten years back, the ratio of their ages was 3 : 1.");
        cv468.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv468.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv468.put("optionc", "Either I or II alone sufficient to answer");
        cv468.put("optiond", "Both I and II are not sufficient to answer");
        cv468.put("optione", "Both I and II are necessary to answer");
        cv468.put("correct", "3");

        cv469.put("Id", 19);
        cv469.put("Question", "What is Arun's present age?\nI. Five years ago, Arun's age was double that of his son's age at that time.\nII. Present ages of Arun and his son are in the ratio of 11 : 6 respectively.\nIII. Five years hence, the respective ratio of Arun's age and his son's age will become 12 : 7.");
        cv469.put("optiona", "Only I and II are sufficient to answer");
        cv469.put("optionb", "Only II and III are sufficient to answer");
        cv469.put("optionc", "Only I and III are sufficient to answer");
        cv469.put("optiond", "Any two of three are sufficient to answer");
        cv469.put("optione", "None of these");
        cv469.put("correct", "4");

        cv470.put("Id", 20);
        cv470.put("Question", "What is Ravi's present age?\nI. The present age of Ravi is half of that of his father.\nII. After 5 years, the ratio of Ravi's age to that of his father's age will be 6 : 11.\nIII. Ravi is 5 years younger than his brother.");
        cv470.put("optiona", "Only I and II are sufficient to answer");
        cv470.put("optionb", "Only II and III are sufficient to answer");
        cv470.put("optionc", "Only I and III are sufficient to answer");
        cv470.put("optiond", "All are required to get the answer");
        cv470.put("optione", "Even with all the three statements answer cannot be determined");
        cv470.put("correct", "1");

        cv471.put("Id", 21);
        cv471.put("Question", "What is the present age of Tanya?\nI. The ratio between the present ages of Tanya and her brother Rahul is 3 : 4 respectively.\nII. After 5 years the ratio between the ages of Tanya and Rahul will be 4 : 5.\nIII. Rahul is 5 years older than Tanya.");
        cv471.put("optiona", "Only I and II are sufficient to answer");
        cv471.put("optionb", "Only II and III are sufficient to answer");
        cv471.put("optionc", "Only I and III are sufficient to answer");
        cv471.put("optiond", "All are required to get the answer");
        cv471.put("optione", "Any two of three are sufficient to answer");
        cv471.put("correct", "5");

        cv472.put("Id", 22);
        cv472.put("Question", "What will be the ratio between ages of Sam and Albert after 5 years?\nI. Sam's present age is more than Albert's present age by 4 years.\nII. Albert's present age is 20 years.\nIII. The ratio of Albert's present age to Sam's present age is 5 : 6.");
        cv472.put("optiona", "Any two of three are sufficient to answer");
        cv472.put("optionb", "II alone is sufficient to answer");
        cv472.put("optionc", "III alone is sufficient to answer");
        cv472.put("optiond", "I or III are sufficient to answer");
        cv472.put("optione", "II or III are sufficient to answer");
        cv472.put("correct", "1");

        cv473.put("Id", 23);
        cv473.put("Question", "What is the difference between the present ages of Ayush and Deepak?\nI. The ratio between Ayush's present age and his age after 8 years 4 : 5.\nII. The ratio between the present ages of Ayush and Deepak is 4 : 3.\nIII. The ratio between Deepak's present age and his age four years ago is 6 : 5.");
        cv473.put("optiona", "Any two of three are sufficient to answer");
        cv473.put("optionb", "I or III are sufficient to answer");
        cv473.put("optionc", "Any one of three is sufficient to answer");
        cv473.put("optiond", "All are required to answer");
        cv473.put("optione", "Even with all answer cannot be determined");
        cv473.put("correct", "1");

        cv474.put("Id", 24);
        cv474.put("Question", "How old is C now?\nI. Three years ago, the average of A and B was 18 years.\nII. With C joining them now, the average becomes 22.");
        cv474.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv474.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv474.put("optionc", "Either I or II alone sufficient to answer");
        cv474.put("optiond", "Both I and II are not sufficient to answer");
        cv474.put("optione", "Both I and II are necessary to answer");
        cv474.put("correct", "5");

        cv475.put("Id", 25);
        cv475.put("Question", "What is the ratio between the ages of the father and the son?\nI. The sum of their ages is 50 years.\nII. 3 times the sum of their ages equal to 5 times the father's age.");
        cv475.put("optiona", "I alone sufficient while II alone not sufficient to answer");
        cv475.put("optionb", "II alone sufficient while I alone not sufficient to answer");
        cv475.put("optionc", "Either I or II alone sufficient to answer");
        cv475.put("optiond", "Both I and II are not sufficient to answer");
        cv475.put("optione", "Both I and II are necessary to answer");
        cv475.put("correct", "2");

        cv476.put("Id", 1);
        cv476.put("Question", "Who among the teachers was teaching maximum number of subjects ? ");
        cv476.put("optiona", "A ");
        cv476.put("optionb", "B");
        cv476.put("optionc", "C");
        cv476.put("optiond", "D");
        cv476.put("optione", "E");
        cv476.put("correct", "2");

        cv477.put("Id", 2);
        cv477.put("Question", "Which of the following pairs was teaching both Geography and Hindi ? ");
        cv477.put("optiona", "A and B ");
        cv477.put("optionb", "B and C");
        cv477.put("optionc", "C and A ");
        cv477.put("optiond", "D and B");
        cv477.put("optione", "None of these");
        cv477.put("correct", "5");

        cv478.put("Id", 3);
        cv478.put("Question", "More than two teachers were teaching which subject ?");
        cv478.put("optiona", "History");
        cv478.put("optionb", "Hindi");
        cv478.put("optionc", " French ");
        cv478.put("optiond", "Geography");
        cv478.put("optione", "Methematics");
        cv478.put("correct", "2");

        cv479.put("Id", 4);
        cv479.put("Question", "D, B and A were teaching which of the following subjects ?");
        cv479.put("optiona", " English only");
        cv479.put("optionb", "Hindi and English ");
        cv479.put("optionc", " Hindi only ");
        cv479.put("optiond", "English and Geography  ");
        cv479.put("optione", " Mathematics and Hindi ");
        cv479.put("correct", "3");

        cv480.put("Id", 5);
        cv480.put("Question", "Who among the teachers was teaching less than two subjects ? ");
        cv480.put("optiona", "A");
        cv480.put("optionb", "B");
        cv480.put("optionc", "D");
        cv480.put("optiond", "Data inadequate ");
        cv480.put("optione", "There is no such teachers");
        cv480.put("correct", "5");

        cv481.put("Id", 6);
        cv481.put("Question", "Who is good in Computer Science, History and Dramatics ? ");
        cv481.put("optiona", "Anjali");
        cv481.put("optionb", "Madhu");
        cv481.put("optionc", "Shobha");
        cv481.put("optiond", "Nisha");
        cv481.put("optione", "None of these ");
        cv481.put("correct", "3");

        cv482.put("Id", 7);
        cv482.put("Question", "Who is good in Physics, Dramatics and Computer Science ?");
        cv482.put("optiona", "Shobha");
        cv482.put("optionb", "Poonam");
        cv482.put("optionc", "Madhu");
        cv482.put("optiond", "Anjali");
        cv482.put("optione", "Data inadequate ");
        cv482.put("correct", "3");

        cv483.put("Id", 8);
        cv483.put("Question", "Who is the good in Physics, History and Dramatics ? ");
        cv483.put("optiona", "Poonam");
        cv483.put("optionb", " Shobha ");
        cv483.put("optionc", " Madhu ");
        cv483.put("optiond", " Anjali ");
        cv483.put("optione", " None of these");
        cv483.put("correct", "1");

        cv484.put("Id", 9);
        cv484.put("Question", "Who is good in History, Physics, Computer Science and Mathematics ?");
        cv484.put("optiona", "Poonam ");
        cv484.put("optionb", "Nisha ");
        cv484.put("optionc", "Madhu");
        cv484.put("optiond", "Anjali");
        cv484.put("optione", "None of these");
        cv484.put("correct", "4");

        cv485.put("Id", 10);
        cv485.put("Question", " Who is good in Physics, History and Mathematics but not in Computer Science ?");
        cv485.put("optiona", "Madhu");
        cv485.put("optionb", "Poonam");
        cv485.put("optionc", "Nisha ");
        cv485.put("optiond", " Anjali");
        cv485.put("optione", "None of these");
        cv485.put("correct", "3");

        cv486.put("Id", 11);
        cv486.put("Question", "With whom is Sushma friendly ?");
        cv486.put("optiona", "Raj");
        cv486.put("optionb", "prem");
        cv486.put("optionc", "ved");
        cv486.put("optiond", "ashok");
        cv486.put("optione", "none of these ");
        cv486.put("correct", "4");

        cv487.put("Id", 12);
        cv487.put("Question", "Who is Poonam's boy friend ?");
        cv487.put("optiona", " ashok");
        cv487.put("optionb", "ved");
        cv487.put("optionc", "prem");
        cv487.put("optiond", "Raj");
        cv487.put("optione", "none of these ");
        cv487.put("correct", "2");

        cv488.put("Id", 13);
        cv488.put("Question", "Who is Raj's girl friend ?");
        cv488.put("optiona", "Sushma");
        cv488.put("optionb", "Kusum");
        cv488.put("optionc", "Vimla");
        cv488.put("optiond", "Poonam ");
        cv488.put("optione", "none of these");
        cv488.put("correct", "2");

        cv489.put("Id", 14);
        cv489.put("Question", "Who does not like Sushma and Vimla ?");
        cv489.put("optiona", "Poonam");
        cv489.put("optionb", "Raj");
        cv489.put("optionc", "Ashok");
        cv489.put("optiond", "Ved ");
        cv489.put("optione", "none of these");
        cv489.put("correct", "1");

        cv490.put("Id", 15);
        cv490.put("Question", "Who is friend of Sushma ?");
        cv490.put("optiona", "Poonam ");
        cv490.put("optionb", "Raj");
        cv490.put("optionc", "Vimla");
        cv490.put("optiond", "Ved ");
        cv490.put("optione", " Ashok ");
        cv490.put("correct", "3");

        cv491.put("Id", 16);
        cv491.put("Question", "Name the boy interested in sports");
        cv491.put("optiona", "A");
        cv491.put("optionb", "B");
        cv491.put("optionc", "C");
        cv491.put("optiond", "D");
        cv491.put("optione", "NONE OF THESE ");
        cv491.put("correct", "3");

        cv492.put("Id", 17);
        cv492.put("Question", "Name the boy interested in music.");
        cv492.put("optiona", "A");
        cv492.put("optionb", "B");
        cv492.put("optionc", "C");
        cv492.put("optiond", "D");
        cv492.put("optione", "E");
        cv492.put("correct", "2");

        cv493.put("Id", 18);
        cv493.put("Question", "Name the middle-class family boy interested in acting.");
        cv493.put("optiona", "A");
        cv493.put("optionb", "B");
        cv493.put("optionc", "C");
        cv493.put("optiond", "D");
        cv493.put("optione", "E");
        cv493.put("correct", "4");

        cv494.put("Id", 19);
        cv494.put("Question", "Name the boys studying in post-graduate classes.");
        cv494.put("optiona", "A, D");
        cv494.put("optionb", "A, E");
        cv494.put("optionc", "B, C");
        cv494.put("optiond", "D, E");
        cv494.put("optione", "A, C");
        cv494.put("correct", "2");

        cv495.put("Id", 20);
        cv495.put("Question", "Name the boy who is not industrious and is average in studies ");
        cv495.put("optiona", "A");
        cv495.put("optionb", "B");
        cv495.put("optionc", "C");
        cv495.put("optiond", "D");
        cv495.put("optione", "E");
        cv495.put("correct", "4");

        cv496.put("Id", 21);
        cv496.put("Question", "Which of the following two towns are those whose population is less than 5 lacs ?");
        cv496.put("optiona", "D and A");
        cv496.put("optionb", "B and C");
        cv496.put("optionc", "A and B");
        cv496.put("optiond", "A and C ");
        cv496.put("optione", "None of these");
        cv496.put("correct", "3");

        cv497.put("Id", 22);
        cv497.put("Question", "Which of the following towns is not a capital ?");
        cv497.put("optiona", "A");
        cv497.put("optionb", "C");
        cv497.put("optionc", "D");
        cv497.put("optiond", "E");
        cv497.put("optione", "B");
        cv497.put("correct", "5");

        cv498.put("Id", 23);
        cv498.put("Question", "Which of the following is harbour, capital and industrial town ?");
        cv498.put("optiona", "A");
        cv498.put("optionb", "B");
        cv498.put("optionc", "C");
        cv498.put("optiond", "E");
        cv498.put("optione", "D");
        cv498.put("correct", "4");

        cv499.put("Id", 24);
        cv499.put("Question", "Which of the following towns have population more than 50 lacs ?");
        cv499.put("optiona", "A and D");
        cv499.put("optionb", "B and E");
        cv499.put("optionc", "C and E");
        cv499.put("optiond", "C and D");
        cv499.put("optione", "A and C");
        cv499.put("correct", "3");

        cv500.put("Id", 25);
        cv500.put("Question", "Which one of the following towns is hill station as well as capital ?");
        cv500.put("optiona", "B");
        cv500.put("optionb", "C");
        cv500.put("optionc", "E");
        cv500.put("optiond", "D");
        cv500.put("optione", "A");
        cv500.put("correct", "5");

        cv501.put("Id", 26);
        cv501.put("Question", "Who is an Engineer ?");
        cv501.put("optiona", "Nanu ");
        cv501.put("optionb", "Mohini ");
        cv501.put("optionc", "Sunita");
        cv501.put("optiond", "Cannot be determined ");
        cv501.put("optione", "None of these");
        cv501.put("correct", "5");

        cv502.put("Id", 27);
        cv502.put("Question", "What is the profession of Sunita ?");
        cv502.put("optiona", "Engineer ");
        cv502.put("optionb", "Doctor ");
        cv502.put("optionc", "Teacher  ");
        cv502.put("optiond", "Cannot be determined");
        cv502.put("optione", "None of these");
        cv502.put("correct", "4");

        cv503.put("Id", 28);
        cv503.put("Question", "Which of the following is the correct pair of two couples ?");
        cv503.put("optiona", "Mohini-Vinod and Rohan-Sunita");
        cv503.put("optionb", "Vinod-Mohini and Rohan-Nanu");
        cv503.put("optionc", "Rohan-Sunita and Tanmay-Nanu");
        cv503.put("optiond", "Cannot be determined");
        cv503.put("optione", "None of these");
        cv503.put("correct", "1");

        cv504.put("Id", 29);
        cv504.put("Question", "How many ladies are there in the family ?");
        cv504.put("optiona", "Two ");
        cv504.put("optionb", "Three ");
        cv504.put("optionc", "Four ");
        cv504.put("optiond", "Cannot be determined ");
        cv504.put("optione", "None of these");
        cv504.put("correct", "2");

        cv505.put("Id", 30);
        cv505.put("Question", "Which colour is liked by CA ?");
        cv505.put("optiona", "Green");
        cv505.put("optionb", "White ");
        cv505.put("optionc", "Either White or Green");
        cv505.put("optiond", "Cannot be determined");
        cv505.put("optione", "None of these");
        cv505.put("correct", "1");

        cv506.put("Id", 31);
        cv506.put("Question", "How is C related to D ?");
        cv506.put("optiona", "Grandmother ");
        cv506.put("optionb", "Cousin");
        cv506.put("optionc", "Sister");
        cv506.put("optiond", "Mother");
        cv506.put("optione", "None of these");
        cv506.put("correct", "1");

        cv507.put("Id", 32);
        cv507.put("Question", "How is E related to F ?");
        cv507.put("optiona", "Grandmother ");
        cv507.put("optionb", "Brother");
        cv507.put("optionc", "Father");
        cv507.put("optiond", "Data inadequate ");
        cv507.put("optione", "None of these");
        cv507.put("correct", "3");

        cv508.put("Id", 33);
        cv508.put("Question", "Which of the following is a pair of married couples ?");
        cv508.put("optiona", "AB");
        cv508.put("optionb", "BC");
        cv508.put("optionc", "AD");
        cv508.put("optiond", "BE");
        cv508.put("optione", "None of these");
        cv508.put("correct", "4");

        cv509.put("Id", 34);
        cv509.put("Question", "How many male members are there in the family ?");
        cv509.put("optiona", "Two");
        cv509.put("optionb", "Three ");
        cv509.put("optionc", "Four");
        cv509.put("optiond", "Data inadequate ");
        cv509.put("optione", "None of these");
        cv509.put("correct", "4");

        cv510.put("Id", 35);
        cv510.put("Question", "Who among the following will be in the second place if all the members in the family are arranged in the descending order of their weights ?");
        cv510.put("optiona", "A");
        cv510.put("optionb", "C");
        cv510.put("optionc", "D");
        cv510.put("optiond", "Data inadequate ");
        cv510.put("optione", "None of these");
        cv510.put("correct", "2");

        cv511.put("Id", 36);
        cv511.put("Question", "If the program sets operated on a day is P, Q, W, T, U, each of the following could be the next day's progam set except :");
        cv511.put("optiona", "W, T, U, V, S");
        cv511.put("optionb", "W, T, S, P, U");
        cv511.put("optionc", "W, R, V, T, U");
        cv511.put("optiond", "Q, T, V, W, S");
        cv511.put("optione", "Q, R, V, T, U");
        cv511.put("correct", "2");

        cv512.put("Id", 37);
        cv512.put("Question", "Which of the following could be the set of programs to be operated on the first day of a month ?Which of the following could be the set of programs to be operated on the first day of a month ?");
        cv512.put("optiona", " V, Q, R, T, S");
        cv512.put("optionb", "U, Q, S, T, W");
        cv512.put("optionc", "T, U,R, V, S");
        cv512.put("optiond", "Q, S, R, V, U");
        cv512.put("optione", "P, R, V, S, U");
        cv512.put("correct", "3");

        cv513.put("Id", 38);
        cv513.put("Question", "Which of the following is true of any day's valid program set operation ?");
        cv513.put("optiona", "P cannot be operated at third place.");
        cv513.put("optionb", " Q cannot be operated at third place.");
        cv513.put("optionc", " R cannot be operated at fourth place.");
        cv513.put("optiond", "T cannot be operated at third place");
        cv513.put("optione", " U cannot be operated at fourth place.");
        cv513.put("correct", "3");

        cv514.put("Id", 39);
        cv514.put("Question", "If R is operated at third place in a sequence, which of the following cannot be the second program in that sequence ?");
        cv514.put("optiona", "Q");
        cv514.put("optionb", "S");
        cv514.put("optionc", "T");
        cv514.put("optiond", "U");
        cv514.put("optione", "W");
        cv514.put("correct", "1");

        cv515.put("Id", 40);
        cv515.put("Question", "If the program sets R and W are to be operated on the first day, which of the following could be the other programs on that day ?");
        cv515.put("optiona", "P, T, V ");
        cv515.put("optionb", "Q, S, V");
        cv515.put("optionc", "Q, T, V");
        cv515.put("optiond", "T, S, V ");
        cv515.put("optione", "T, S, V");
        cv515.put("correct", "5");

        cv516.put("Id", 41);
        cv516.put("Question", "If the team consists of two doctors, three females teachers and two engineers, the members of the team are :");
        cv516.put("optiona", "A B O P Q G H");
        cv516.put("optionb", "C D K L O P Q");
        cv516.put("optionc", "C D O P Q G H ");
        cv516.put("optiond", "D E G H O P Q");
        cv516.put("optione", "D K L O P Q C");
        cv516.put("correct", "1");

        cv517.put("Id", 42);
        cv517.put("Question", "If the team consists of two doctors, one engineer and four teachers, all the following teams are possible except :");
        cv517.put("optiona", "A B G M N O P ");
        cv517.put("optionb", "A B H M O P Q");
        cv517.put("optionc", " A B H M R P Q ");
        cv517.put("optiond", "A B K N R P Q  ");
        cv517.put("optione", "A B M O P H Q");
        cv517.put("correct", "3");

        cv518.put("Id", 43);
        cv518.put("Question", "If the team consists of two doctors, female teachers and two engineers, all the following teams are possible except :");
        cv518.put("optiona", "A B G H O Q ");
        cv518.put("optionb", "A B G H P Q ");
        cv518.put("optionc", "A B K L P Q");
        cv518.put("optiond", "O P G H A B ");
        cv518.put("optione", "O P G H B A");
        cv518.put("correct", "3");

        cv519.put("Id", 44);
        cv519.put("Question", "If the team consists of three doctors, two male engineers and two teachers, the members of the team could be :");
        cv519.put("optiona", "A B C K L M R");
        cv519.put("optionb", "B C D K L N R ");
        cv519.put("optionc", "C D E K L M N ");
        cv519.put("optiond", "C D E K L P R");
        cv519.put("optione", "None of these");
        cv519.put("correct", "3");

        cv520.put("Id", 45);
        cv520.put("Question", "If the team consists of two doctors, two engineers and two teachers, all the following teams are possible except :");
        cv520.put("optiona", "A B G H O P");
        cv520.put("optionb", "A B G H M N ");
        cv520.put("optionc", "C E K L N R");
        cv520.put("optiond", " C D K L O P ");
        cv520.put("optione", "None of these");
        cv520.put("correct", "4");

        cv521.put("Id", 46);
        cv521.put("Question", "The sales representative could visit any of the following companies immediately after P except :");
        cv521.put("optiona", "S");
        cv521.put("optionb", "R");
        cv521.put("optionc", "Q");
        cv521.put("optiond", "N");
        cv521.put("optione", "M");
        cv521.put("correct", "5");

        cv522.put("Id", 47);
        cv522.put("Question", "If the sales representative visits Q immediately before R and immediately after S, she must visit Q :");
        cv522.put("optiona", "first");
        cv522.put("optionb", "second");
        cv522.put("optionc", "fourth");
        cv522.put("optiond", "fifth");
        cv522.put("optione", "sixth");
        cv522.put("correct", "4");

        cv523.put("Id", 48);
        cv523.put("Question", "Which of the following could be the order in which the sales representative visits the six companies ?");
        cv523.put("optiona", "M, S, P, N, R, Q");
        cv523.put("optionb", "Q, N, P, R, S, M");
        cv523.put("optionc", "M, R, N, Q, P, S");
        cv523.put("optiond", "P, S, M, R, Q, N");
        cv523.put("optione", "P, R, M, N, Q, S");
        cv523.put("correct", "1");

        cv524.put("Id", 49);
        cv524.put("Question", "Which of the following must be true of the sales representative's schedule ?");
        cv524.put("optiona", "She visits M before Q.");
        cv524.put("optionb", "She visits N before R.");
        cv524.put("optionc", " She visits P before M.");
        cv524.put("optiond", " She visits P before S.");
        cv524.put("optione", " She visits Q before R.");
        cv524.put("correct", "1");

        cv525.put("Id", 50);
        cv525.put("Question", "If the sales representative visits S first, which company must she visit second ?");
        cv525.put("optiona", "M");
        cv525.put("optionb", "N");
        cv525.put("optionc", "P");
        cv525.put("optiond", "Q");
        cv525.put("optione", "R");
        cv525.put("correct", "1");

        cv526.put("Id", 26);
        cv526.put("Question", "The total of the ages of Amar, Akbar and Anthony is 80 years. What was the total of their ages three years ago ?");
        cv526.put("optiona", "71 years");
        cv526.put("optionb", "72 years");
        cv526.put("optionc", "74 years");
        cv526.put("optiond", "77 years");
        cv526.put("optione", " None of the above");
        cv526.put("correct", "1");

        cv527.put("Id", 27);
        cv527.put("Question", "Two bus tickets from city A to B and three tickets from city A to C cost Rs. 77 but three tickets from city A to B and two tickets from city A to C cost Rs. 73. What are the fares for cities B and C from A ?");
        cv527.put("optiona", "Rs. 4,Rs. 23");
        cv527.put("optionb", "Rs. 13,Rs. 17");
        cv527.put("optionc", "Rs. 15,Rs. 14");
        cv527.put("optiond", "Rs. 17,Rs. 13");
        cv527.put("optione", "None of the above");
        cv527.put("correct", "2");

        cv528.put("Id", 28);
        cv528.put("Question", "An institute organised a fete and 1/5 of the girls and 1/8 of the boys participated in the same. What fraction of the total number of students took part in the fete ?");
        cv528.put("optiona", "2/13");
        cv528.put("optionb", "13/40");
        cv528.put("optionc", "Data Inadequate");
        cv528.put("optiond", "11/40");
        cv528.put("optione", "None of the aboveNone of the above");
        cv528.put("correct", "3");

        cv529.put("Id", 29);
        cv529.put("Question", "A number of friends decided to go on a picnic and planned to spend Rs. 96 on eatables. Four of them, however, did not turn up. As a consequence, the remaining ones had to contribute Rs. 4 each extra. The number of those who attended the picnic was");
        cv529.put("optiona", "8");
        cv529.put("optionb", "12");
        cv529.put("optionc", "16");
        cv529.put("optiond", "24");
        cv529.put("optione", "None of the above");
        cv529.put("correct", "1");

        cv530.put("Id", 30);
        cv530.put("Question", "A, B, C, D and E play a game of cards. A says to B, 'If you give me three cards, you will have as many as E has and if I give you three cards, you will have as many as D has.' A and B together have 10 cards more than what D and E together have. If B has two cards more than what C has and the total number of cards be 133, how many cards does B have ?");
        cv530.put("optiona", "22");
        cv530.put("optionb", "23");
        cv530.put("optionc", "25");
        cv530.put("optiond", "35");
        cv530.put("optione", "None of the above");
        cv530.put("correct", "3");

        cv531.put("Id", 31);
        cv531.put("Question", "A pineapple costs Rs. 7 each. A watermelon costs Rs. 5 each. X spends Rs. 38 on these fruits. The number of pineapples purchased is");
        cv531.put("optiona", "2");
        cv531.put("optionb", "3");
        cv531.put("optionc", "4");
        cv531.put("optiond", "Data Inadequate");
        cv531.put("optione", "None of the above");
        cv531.put("correct", "3");

        cv532.put("Id", 32);
        cv532.put("Question", "A woman says, 'If you reverse my own age, the figures represent my husband's age. He is, of course, senior to me and the difference between our ages is one-eleventh of their sum.' The woman's age is");
        cv532.put("optiona", "23 ");
        cv532.put("optionb", "34");
        cv532.put("optionc", "45");
        cv532.put("optiond", "Data Inadequate");
        cv532.put("optione", "None of the above");
        cv532.put("correct", "3");

        cv533.put("Id", 33);
        cv533.put("Question", "A girl counted in the following way on the fingers of her left hand : She started by calling the thumb 1, the index finger 2, middle finger 3, ring finger 4, little finger 5 and then reversed direction calling the ring finger 6, middle finger 7 and so on. She counted upto 1994. She ended counting on which finger ?");
        cv533.put("optiona", "Thumb");
        cv533.put("optionb", "Index finger");
        cv533.put("optionc", "Middle finger");
        cv533.put("optiond", "Ring finger ");
        cv533.put("optione", "None of the above");
        cv533.put("correct", "2");

        cv534.put("Id", 34);
        cv534.put("Question", "A man has Rs. 480 in the denominations of one-rupee notes, five-rupee notes and ten-rupee notes. The number of notes of each denomination is equal. What is the total number of notes that he has ?");
        cv534.put("optiona", "45");
        cv534.put("optionb", "60");
        cv534.put("optionc", "75");
        cv534.put("optiond", "90");
        cv534.put("optione", "None of the above");
        cv534.put("correct", "4");

        cv535.put("Id", 35);
        cv535.put("Question", "What is the product of all the numbers in the dial of a telephone ?");
        cv535.put("optiona", "158480");
        cv535.put("optionb", "158450");
        cv535.put("optionc", "159480");
        cv535.put("optiond", "Data Inadequate");
        cv535.put("optione", "None of the above");
        cv535.put("correct", "5");

        cv536.put("Id", 36);
        cv536.put("Question", "A is 3 years older to B and 3 years younger to C, while B and D are twins. How many years older is C to D?");
        cv536.put("optiona", "2");
        cv536.put("optionb", "3");
        cv536.put("optionc", "6");
        cv536.put("optiond", "12");
        cv536.put("optione", "None of the above");
        cv536.put("correct", "3");

        cv537.put("Id", 37);
        cv537.put("Question", "The 30 members of a club decided to play a badminton singles tournament. Every time a member loses a game he is out of the tournament. There are no ties. What is the minimum number of matches that must be played to determine the winner ?");
        cv537.put("optiona", "15");
        cv537.put("optionb", "29");
        cv537.put("optionc", "61");
        cv537.put("optiond", "45");
        cv537.put("optione", "None of the above");
        cv537.put("correct", "2");

        cv538.put("Id", 38);
        cv538.put("Question", "In a garden, there are 10 rows and 12 columns of mango trees. The distance between the two trees is 2 metres and a distance of one metre is left from all sides of the boundary of the garden. The length of the garden is");
        cv538.put("optiona", "20 m");
        cv538.put("optionb", "22 m");
        cv538.put("optionc", "24 m");
        cv538.put("optiond", "26 m");
        cv538.put("optione", "None of the above");
        cv538.put("correct", "3");

        cv539.put("Id", 39);
        cv539.put("Question", "12 year old Manick is three times as old as his brother Rahul. How old will Manick be when he is twice as old as Rahul ?");
        cv539.put("optiona", "14");
        cv539.put("optionb", "16");
        cv539.put("optionc", "18");
        cv539.put("optiond", "20");
        cv539.put("optione", "None of the above");
        cv539.put("correct", "2");

        cv540.put("Id", 40);
        cv540.put("Question", "A tailor had a number of shirt pieces to cut from a roll of fabric. He cut each roll of equal length into 10 pieces. He cut at the rate of 45 cuts a minute. How many rolls would be cut in 24 minutes ?");
        cv540.put("optiona", "32 rolls");
        cv540.put("optionb", "54 rolls");
        cv540.put("optionc", "108 rolls");
        cv540.put("optiond", "120 rolls");
        cv540.put("optione", "None of the above");
        cv540.put("correct", "4");

        cv541.put("Id", 41);
        cv541.put("Question", "In a class of 60 students, the number of boys and girls participating in the annual sports is in the ratio 3 : 2 respectively. The number of girls not participating in the sports is 5 more than the number of boys not participating in the sports. If the number of boys participating in the sports is 15, then how many girls are there in the class ?");
        cv541.put("optiona", "20");
        cv541.put("optionb", "25");
        cv541.put("optionc", "30");
        cv541.put("optiond", "Data inadequate");
        cv541.put("optione", "None of the above");
        cv541.put("correct", "3");

        cv542.put("Id", 42);
        cv542.put("Question", "There are deer and peacocks in a zoo. By counting heads they are 80. The number of their legs is 200. How many peacocks are there ?");
        cv542.put("optiona", "20");
        cv542.put("optionb", "30");
        cv542.put("optionc", "50");
        cv542.put("optiond", "60");
        cv542.put("optione", "None of the above");
        cv542.put("correct", "4");

        cv543.put("Id", 43);
        cv543.put("Question", "A man wears socks of two colours - Black and brown. He has altogether 20 black socks and 20 brown socks in a drawer. Supposing he has to take out the socks in the dark, how many must he take out to be sure that he has a matching pair ?");
        cv543.put("optiona", "3");
        cv543.put("optionb", "20");
        cv543.put("optionc", "39");
        cv543.put("optiond", "Data inadequate");
        cv543.put("optione", "None of the above");
        cv543.put("correct", "1");

        cv544.put("Id", 44);
        cv544.put("Question", "A motorist knows four different routes from Bristol to Birmingham. From Birmingham to Sheffield he knows three different routes and from Sheffield to Carlisle he knows two different routes. How many routes does he know from Bristol to Carlisle ?");
        cv544.put("optiona", "4");
        cv544.put("optionb", "8");
        cv544.put("optionc", "12");
        cv544.put("optiond", "24");
        cv544.put("optione", "None of the above");
        cv544.put("correct", "4");

        cv545.put("Id", 45);
        cv545.put("Question", "Mac has $ 3 more than Ken, but then Ken wins on the horses and trebles his money, so that he now has $ 2 more than the original amount of money that the two boys had between them. How much money did Mac and Ken have between them before Ken's win ?");
        cv545.put("optiona", "$9");
        cv545.put("optionb", "$11");
        cv545.put("optionc", "$13");
        cv545.put("optiond", "$15");
        cv545.put("optione", "None of the above");
        cv545.put("correct", "3");

        cv546.put("Id", 46);
        cv546.put("Question", "In a class, there are 18 boys who are over 160 cm tall. If these constitute three-fourths of the boys and the total number of boys is two-thirds of the total number of students in the class, what is the number of girls in the class ?");
        cv546.put("optiona", "6");
        cv546.put("optionb", "12");
        cv546.put("optionc", "18");
        cv546.put("optiond", "24");
        cv546.put("optione", "None of the above");
        cv546.put("correct", "2");

        cv547.put("Id", 47);
        cv547.put("Question", "A waiter's salary consists of his salary and tips. During one week his tips were 5/4 of his salary. What fraction of his income came from tips ?");
        cv547.put("optiona", "4/9");
        cv547.put("optionb", "5/4");
        cv547.put("optionc", "5/8");
        cv547.put("optiond", "5/9");
        cv547.put("optione", "None of the above");
        cv547.put("correct", "4");

        cv548.put("Id", 48);
        cv548.put("Question", "If you write down all the numbers from 1 to 100, then how many times do you write 3 ?");
        cv548.put("optiona", "11");
        cv548.put("optionb", "18");
        cv548.put("optionc", "20");
        cv548.put("optiond", "21");
        cv548.put("optione", "None of the above");
        cv548.put("correct", "3");

        cv549.put("Id", 49);
        cv549.put("Question", "If 100 cats kill 100 mice in 100 days, then 4 cats would kill 4 mice in how many days ?");
        cv549.put("optiona", "1");
        cv549.put("optionb", "4");
        cv549.put("optionc", "40");
        cv549.put("optiond", "100");
        cv549.put("optione", "None of the above");
        cv549.put("correct", "4");

        cv550.put("Id", 50);
        cv550.put("Question", "A bus starts from city X. The number of women in the bus is half of the number of men. In city Y, 10 men leave the bus and five women enter. Now, number of men and women is equal. In the beginning, how many passengers entered the bus ?");
        cv550.put("optiona", "15");
        cv550.put("optionb", "30");
        cv550.put("optionc", "36");
        cv550.put("optiond", "45");
        cv550.put("optione", "None of the above");
        cv550.put("correct", "4");

        cv551.put("Pid", 1);
        cv551.put("Paragraph", " In a school, there were five teachers.\nA and B were teaching Hindi and English.\nC and D were teaching English and Geography.\nD and A were teaching Mathematics and Hindi.\nE and B were teaching History and French.");

        cv552.put("Pid", 2);
        cv552.put("Paragraph", "Madhu and Shobha are good in Dramatics and Computer Science.\nAnjali and Madhu are good in Computer Science and Physics.\nAnjali, Poonam and Nisha are good in Physics and Mathematics.\nPoonam and Shobha are good in History and Dramatics.");

        cv553.put("Pid", 3);
        cv553.put("Paragraph", "Four youngmen Raj, Prem, Ved and Ashok are friendly with four girls Sushma, Kushum, Vimla and Poonam.\nSushma and Vimla are friends.\nVed's girl friend does not like Sushma and Vimla.\nKusum does not care for Ved.\nPrem's girl friend is friendly with Sushma. Sushma does not like Raj. ");

        cv554.put("Pid", 4);
        cv554.put("Paragraph", "Of the five boys A, B, C, D and E two are good, one is poor and two are average is studies.Two of them study in post-graduate classes and there in under-graduate classes. One comes from a rich family, two from middle-class families and two from poor families. One of them is interested in music, two in acting and one in sports. Of those studying in under-graduate classes, two are average and one is poor in studies. Of the two boys interested in acting, one is a post-graduate student. The one interested in music comes from a middle-class family. Both the boys interested in acting are not industrious. The two boys coming from middle-class families are average in studies and one of them is interested in acting. The boy interested in sports comes from a poor family, while the one interested in music is industrious. E is industrious, good in studies, comes from a poor family and is not interested in acting, music or sports. C is poor in studies inspite of being industrious. A comes from a ri		ch family and is not industrious but good in studies. B is industrious and comes from a middle-class family.");

        cv555.put("Pid", 5);
        cv555.put("Paragraph", "A, B, C, D and E are five towns out of which two are hill stations and the rest are in plain. Two towns, which are in plain, are harbours. Four towns out of five are capitals and two are industrial towns. Population of two towns is less than 5 lacs. It is 20 lacs of one town and more than 50lacs of two towns. Two towns are on the same latitudes and other two are on the same longitudes. Latitudes and longitudes of both harbours are different and out of these one is an industrial town. The population of both industrial towns is more than 50 lacs. The longitudes of one hill station and one of the industrial towns are same. The latitudes and longitudes of the other hill station and other harbour are different. One industrial town is neither a hill station nor a harbour. None of the hill stations is an industrial town. The hill station of which longitudes of A and E are same. E is a harbour. The latitudes of D and C are same and the population of D is 20 lacs. Both the harbours are capitals 	and one of them is an industrial town.");

        cv556.put("Pid", 6);
        cv556.put("Paragraph", "(i) In a family of six persons, there are people from three generations. Each person has separate profession and also they like different colours. There are two couples in the family.\n(ii) Rohan is a CA and his wife neither is a doctor nor likes green colour.\n(iii) Engineer likes red colour and his wife is a teacher.\n(iv) Mohini is mother-in-law of Sunita and she likes orange colour.\n(v) Vinod is grandfather of Tanmay and Tanmay, who is a principal, likes black colour.\n(vi) Nanu is grand-daughter of Mohini and she likes blue colour. Nanu’s mother likes white colour. ");

        cv557.put("Pid", 7);
        cv557.put("Paragraph", "(i) A, B, C, D, E and F are six members in a family in which there are two married couples.\n(ii) D is brother of F. Both D and F are lighter than B.\n(iii) B is mother of D and lighter than E.\n(iv) C, a lady, is neither heaviest nor the lightest in the family.\n(v) E is lighter than C.\n(vi) The grandfather in the family is the heaviest.");

        cv558.put("Pid", 8);
        cv558.put("Paragraph", "At an Electronic Data Processing Unit, five out of the eight program sets P, Q, R, S, T, U, V and W are  to be operated daily. On any one day, except for the first day of a month, only three of the program sets must be the ones that were operated on the previous day. The program operating must also satisfy the following conditions :\n(i). If program P is to be operated on a day, V cannot be operated on that day.\n(ii). If Q is to be operated on a day, T must be one of the programs to be operated after Q.\n(iii). If R is to be operated on a day, V must be one of the programs to be operated after R.\n(iv). The last program to be operated on any day must be either S or U.");

        cv559.put("Pid", 9);
        cv559.put("Paragraph", "From amongst five doctors A, B, C, D and E, four engineers G, H, K and L and six teachers M, N, O, P, Q and R, some teams are to be selected. Of these, A, B, G, H, O, P and Q are females and the rest are males.\nThe formation of teams is subject to the following conditions :\nWherever there is a male doctor, there will be no female teacher.\nWherever there is a male engineer, there will be no female doctor.\nThere shall not be more than two male teachers in any team.");

        cv560.put("Pid", 10);
        cv560.put("Paragraph", "A sales representative plans to visit each of six companies M, N, P, Q, R and S exactly once during the course of one day. She is setting up her schedule for the day according to the following conditions :\n(i). She must visit M before N and R.\n(ii). She must visit N before Q.\n(iii). The third company she visits must be P.");

        db.insert("sufficiency", null, cv1);
        db.insert("sufficiency", null, cv2);
        db.insert("sufficiency", null, cv3);
        db.insert("sufficiency", null, cv4);
        db.insert("sufficiency", null, cv5);
        db.insert("sufficiency", null, cv6);
        db.insert("sufficiency", null, cv7);
        db.insert("sufficiency", null, cv8);
        db.insert("sufficiency", null, cv9);
        db.insert("sufficiency", null, cv10);
        db.insert("sufficiency", null, cv11);
        db.insert("sufficiency", null, cv12);
        db.insert("sufficiency", null, cv13);
        db.insert("sufficiency", null, cv14);
        db.insert("sufficiency", null, cv15);
        db.insert("sufficiency", null, cv16);
        db.insert("sufficiency", null, cv17);
        db.insert("sufficiency", null, cv18);
        db.insert("sufficiency", null, cv19);
        db.insert("sufficiency", null, cv20);
        db.insert("sufficiency", null, cv21);
        db.insert("sufficiency", null, cv22);
        db.insert("sufficiency", null, cv23);
        db.insert("sufficiency", null, cv24);
        db.insert("sufficiency", null, cv25);
        db.insert("sufficiency", null, cv26);
        db.insert("sufficiency", null, cv27);
        db.insert("sufficiency", null, cv28);
        db.insert("sufficiency", null, cv29);
        db.insert("sufficiency", null, cv30);
        db.insert("sufficiency", null, cv31);
        db.insert("sufficiency", null, cv32);
        db.insert("sufficiency", null, cv33);
        db.insert("sufficiency", null, cv34);
        db.insert("sufficiency", null, cv35);
        db.insert("sufficiency", null, cv36);
        db.insert("sufficiency", null, cv37);
        db.insert("sufficiency", null, cv38);
        db.insert("sufficiency", null, cv39);
        db.insert("sufficiency", null, cv40);
        db.insert("sufficiency", null, cv41);
        db.insert("sufficiency", null, cv42);
        db.insert("sufficiency", null, cv43);
        db.insert("sufficiency", null, cv44);
        db.insert("sufficiency", null, cv45);
        db.insert("sufficiency", null, cv46);
        db.insert("sufficiency", null, cv47);
        db.insert("sufficiency", null, cv48);
        db.insert("sufficiency", null, cv49);
        db.insert("sufficiency", null, cv50);
        db.insert("logic", null, cv51);
        db.insert("logic", null, cv52);
        db.insert("logic", null, cv53);
        db.insert("logic", null, cv54);
        db.insert("logic", null, cv55);
        db.insert("logic", null, cv56);
        db.insert("logic", null, cv57);
        db.insert("logic", null, cv58);
        db.insert("logic", null, cv59);
        db.insert("logic", null, cv60);
        db.insert("logic", null, cv61);
        db.insert("logic", null, cv62);
        db.insert("logic", null, cv63);
        db.insert("logic", null, cv64);
        db.insert("logic", null, cv65);
        db.insert("logic", null, cv66);
        db.insert("logic", null, cv67);
        db.insert("logic", null, cv68);
        db.insert("logic", null, cv69);
        db.insert("logic", null, cv70);
        db.insert("logic", null, cv71);
        db.insert("logic", null, cv72);
        db.insert("logic", null, cv73);
        db.insert("logic", null, cv74);
        db.insert("logic", null, cv75);
        db.insert("logic", null, cv76);
        db.insert("logic", null, cv77);
        db.insert("logic", null, cv78);
        db.insert("logic", null, cv79);
        db.insert("logic", null, cv80);
        db.insert("logic", null, cv81);
        db.insert("logic", null, cv82);
        db.insert("logic", null, cv83);
        db.insert("logic", null, cv84);
        db.insert("logic", null, cv85);
        db.insert("logic", null, cv86);
        db.insert("logic", null, cv87);
        db.insert("logic", null, cv88);
        db.insert("logic", null, cv89);
        db.insert("logic", null, cv90);
        db.insert("logic", null, cv91);
        db.insert("logic", null, cv92);
        db.insert("logic", null, cv93);
        db.insert("logic", null, cv94);
        db.insert("logic", null, cv95);
        db.insert("logic", null, cv96);
        db.insert("logic", null, cv97);
        db.insert("logic", null, cv98);
        db.insert("logic", null, cv99);
        db.insert("logic", null, cv100);
        db.insert("series", null, cv101);
        db.insert("series", null, cv102);
        db.insert("series", null, cv103);
        db.insert("series", null, cv104);
        db.insert("series", null, cv105);
        db.insert("series", null, cv106);
        db.insert("series", null, cv107);
        db.insert("series", null, cv108);
        db.insert("series", null, cv109);
        db.insert("series", null, cv110);
        db.insert("series", null, cv111);
        db.insert("series", null, cv112);
        db.insert("series", null, cv113);
        db.insert("series", null, cv114);
        db.insert("series", null, cv115);
        db.insert("series", null, cv116);
        db.insert("series", null, cv117);
        db.insert("series", null, cv118);
        db.insert("series", null, cv119);
        db.insert("series", null, cv120);
        db.insert("series", null, cv121);
        db.insert("series", null, cv122);
        db.insert("series", null, cv123);
        db.insert("series", null, cv124);
        db.insert("series", null, cv125);
        db.insert("series", null, cv126);
        db.insert("series", null, cv127);
        db.insert("series", null, cv128);
        db.insert("series", null, cv129);
        db.insert("series", null, cv130);
        db.insert("series", null, cv131);
        db.insert("series", null, cv132);
        db.insert("series", null, cv133);
        db.insert("series", null, cv134);
        db.insert("series", null, cv135);
        db.insert("series", null, cv136);
        db.insert("series", null, cv137);
        db.insert("series", null, cv138);
        db.insert("series", null, cv139);
        db.insert("series", null, cv140);
        db.insert("series", null, cv141);
        db.insert("series", null, cv142);
        db.insert("series", null, cv143);
        db.insert("series", null, cv144);
        db.insert("series", null, cv145);
        db.insert("series", null, cv146);
        db.insert("series", null, cv147);
        db.insert("series", null, cv148);
        db.insert("series", null, cv149);
        db.insert("series", null, cv150);
        db.insert("relation", null, cv201);
        db.insert("relation", null, cv202);
        db.insert("relation", null, cv203);
        db.insert("relation", null, cv204);
        db.insert("relation", null, cv205);
        db.insert("relation", null, cv206);
        db.insert("relation", null, cv207);
        db.insert("relation", null, cv208);
        db.insert("relation", null, cv209);
        db.insert("relation", null, cv210);
        db.insert("relation", null, cv211);
        db.insert("relation", null, cv212);
        db.insert("relation", null, cv213);
        db.insert("relation", null, cv214);
        db.insert("relation", null, cv215);
        db.insert("relation", null, cv216);
        db.insert("relation", null, cv217);
        db.insert("relation", null, cv218);
        db.insert("relation", null, cv219);
        db.insert("relation", null, cv220);
        db.insert("relation", null, cv221);
        db.insert("relation", null, cv222);
        db.insert("relation", null, cv223);
        db.insert("relation", null, cv224);
        db.insert("relation", null, cv225);
        db.insert("relation", null, cv226);
        db.insert("relation", null, cv227);
        db.insert("relation", null, cv228);
        db.insert("relation", null, cv229);
        db.insert("relation", null, cv230);
        db.insert("relation", null, cv231);
        db.insert("relation", null, cv232);
        db.insert("relation", null, cv233);
        db.insert("relation", null, cv234);
        db.insert("relation", null, cv235);
        db.insert("relation", null, cv236);
        db.insert("relation", null, cv237);
        db.insert("relation", null, cv238);
        db.insert("relation", null, cv239);
        db.insert("relation", null, cv240);
        db.insert("relation", null, cv241);
        db.insert("relation", null, cv242);
        db.insert("relation", null, cv243);
        db.insert("relation", null, cv244);
        db.insert("relation", null, cv245);
        db.insert("relation", null, cv246);
        db.insert("relation", null, cv247);
        db.insert("relation", null, cv248);
        db.insert("relation", null, cv249);
        db.insert("relation", null, cv250);
        db.insert("misc", null, cv451);
        db.insert("misc", null, cv452);
        db.insert("misc", null, cv453);
        db.insert("misc", null, cv454);
        db.insert("misc", null, cv455);
        db.insert("misc", null, cv456);
        db.insert("misc", null, cv457);
        db.insert("misc", null, cv458);
        db.insert("misc", null, cv459);
        db.insert("misc", null, cv460);
        db.insert("misc", null, cv461);
        db.insert("misc", null, cv462);
        db.insert("misc", null, cv463);
        db.insert("misc", null, cv464);
        db.insert("misc", null, cv465);
        db.insert("misc", null, cv466);
        db.insert("misc", null, cv467);
        db.insert("misc", null, cv468);
        db.insert("misc", null, cv469);
        db.insert("misc", null, cv470);
        db.insert("misc", null, cv471);
        db.insert("misc", null, cv472);
        db.insert("misc", null, cv473);
        db.insert("misc", null, cv474);
        db.insert("misc", null, cv475);
        db.insert("puzzle", null, cv476);
        db.insert("puzzle", null, cv477);
        db.insert("puzzle", null, cv478);
        db.insert("puzzle", null, cv479);
        db.insert("puzzle", null, cv480);
        db.insert("puzzle", null, cv481);
        db.insert("puzzle", null, cv482);
        db.insert("puzzle", null, cv483);
        db.insert("puzzle", null, cv484);
        db.insert("puzzle", null, cv485);
        db.insert("puzzle", null, cv486);
        db.insert("puzzle", null, cv487);
        db.insert("puzzle", null, cv488);
        db.insert("puzzle", null, cv489);
        db.insert("puzzle", null, cv490);
        db.insert("puzzle", null, cv491);
        db.insert("puzzle", null, cv492);
        db.insert("puzzle", null, cv493);
        db.insert("puzzle", null, cv494);
        db.insert("puzzle", null, cv495);
        db.insert("puzzle", null, cv496);
        db.insert("puzzle", null, cv497);
        db.insert("puzzle", null, cv498);
        db.insert("puzzle", null, cv499);
        db.insert("puzzle", null, cv500);
        db.insert("puzzle", null, cv501);
        db.insert("puzzle", null, cv502);
        db.insert("puzzle", null, cv503);
        db.insert("puzzle", null, cv504);
        db.insert("puzzle", null, cv505);
        db.insert("puzzle", null, cv506);
        db.insert("puzzle", null, cv507);
        db.insert("puzzle", null, cv508);
        db.insert("puzzle", null, cv509);
        db.insert("puzzle", null, cv510);
        db.insert("puzzle", null, cv511);
        db.insert("puzzle", null, cv512);
        db.insert("puzzle", null, cv513);
        db.insert("puzzle", null, cv514);
        db.insert("puzzle", null, cv515);
        db.insert("puzzle", null, cv516);
        db.insert("puzzle", null, cv517);
        db.insert("puzzle", null, cv518);
        db.insert("puzzle", null, cv519);
        db.insert("puzzle", null, cv520);
        db.insert("puzzle", null, cv521);
        db.insert("puzzle", null, cv522);
        db.insert("puzzle", null, cv523);
        db.insert("puzzle", null, cv524);
        db.insert("puzzle", null, cv525);
        db.insert("misc", null, cv526);
        db.insert("misc", null, cv527);
        db.insert("misc", null, cv528);
        db.insert("misc", null, cv529);
        db.insert("misc", null, cv530);
        db.insert("misc", null, cv531);
        db.insert("misc", null, cv532);
        db.insert("misc", null, cv533);
        db.insert("misc", null, cv534);
        db.insert("misc", null, cv535);
        db.insert("misc", null, cv536);
        db.insert("misc", null, cv537);
        db.insert("misc", null, cv538);
        db.insert("misc", null, cv539);
        db.insert("misc", null, cv540);
        db.insert("misc", null, cv541);
        db.insert("misc", null, cv542);
        db.insert("misc", null, cv543);
        db.insert("misc", null, cv544);
        db.insert("misc", null, cv545);
        db.insert("misc", null, cv546);
        db.insert("misc", null, cv547);
        db.insert("misc", null, cv548);
        db.insert("misc", null, cv549);
        db.insert("misc", null, cv550);
        db.insert("paragraph", null, cv551);
        db.insert("paragraph", null, cv552);
        db.insert("paragraph", null, cv553);
        db.insert("paragraph", null, cv554);
        db.insert("paragraph", null, cv555);
        db.insert("paragraph", null, cv556);
        db.insert("paragraph", null, cv557);
        db.insert("paragraph", null, cv558);
        db.insert("paragraph", null, cv559);
        db.insert("paragraph", null, cv560);
        db.close();
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        if (v == b1) {
            Intent in = new Intent(this, Aptitude.class);
            startActivity(in);
        }


    }

}
