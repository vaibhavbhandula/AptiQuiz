package com.vb.aptiquiz;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;

public class AptitudeTestMenu extends AppCompatActivity implements View.OnClickListener {
    BootstrapButton b1;
    TextView tv;
    String t;
    final static String KEY_ID = "Id";
    final static String KEY_QUESTION = "Question";
    final static String KEY_OPA = "optiona";
    final static String KEY_OPB = "optionb";
    final static String KEY_OPC = "optionc";
    final static String KEY_OPD = "optiond";
    final static String KEY_OPE = "optione";
    final static String KEY_DB = "project";
    final static String KEY_MISC = "misc";
    final static String KEY_RELATION = "relation";
    final static String KEY_LOGIC = "logic";
    final static String KEY_SUFFICIENCY = "sufficiency";
    final static String KEY_SERIES = "series";
    final static String KEY_PUZZLE = "puzzle";
    final static String KEY_PARA = "paragraph";
    final static String KEY_CORRECT = "correct";
    final static String KEY_PID = "Pid";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude_test_menu);
        b1 = (BootstrapButton) findViewById(R.id.button1);
        tv = (TextView) findViewById(R.id.textView3);

        b1.setOnClickListener(this);
        tv.setMovementMethod(new ScrollingMovementMethod());
        t = "Test Instructions : \n\n";
        t += "1.  Pass percentage is 75.\n\n" +
                "2.  There are no negative marks.\n\n" +
                "3.  Number of Questions = 30.\n\n" +
                "4.  Time allotted = 40 minutes.\n\n" +
                "5.  Scroll to view the full question if required.\n\n" +
                "6.  Click on Summary in the Test section to view Test Summary and jump to a question directly.\n\n" +
                "All the Best!";
        tv.setText(t);

        SQLiteDatabase db;
        db = openOrCreateDatabase(KEY_DB, SQLiteDatabase.CREATE_IF_NECESSARY, null);


        Cursor c1, c2, c3, c4, c5, c6, c7;

        c1 = db.query(KEY_SUFFICIENCY, null, null, null, null, null, null);//cv1 to cv50
        c2 = db.query(KEY_LOGIC, null, null, null, null, null, null);//cv51 to cv100
        c3 = db.query(KEY_SERIES, null, null, null, null, null, null);//cv101 to cv150
        c4 = db.query(KEY_RELATION, null, null, null, null, null, null);//cv201 to cv250
        c5 = db.query(KEY_MISC, null, null, null, null, null, null);//cv451 to cv475 and cv526 to cv550
        c6 = db.query(KEY_PUZZLE, null, null, null, null, null, null);//cv476 to cv525
        c7 = db.query(KEY_PARA, null, null, null, null, null, null);//cv551 to cv560

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
        db = openOrCreateDatabase(KEY_DB, SQLiteDatabase.CREATE_IF_NECESSARY, null);

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


        cv1.put(KEY_ID, 1);
        cv1.put(KEY_QUESTION, "In which year was Rahul born ?\nStatements:\nI. Rahul at present is 25 years younger to his mother.\nII. Rahul's brother, who was born in 1964, is 35 years younger to his mother.");
        cv1.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv1.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv1.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv1.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv1.put(KEY_OPE, "Both I and II are necessary to answer");
        cv1.put(KEY_CORRECT, "5");

        cv2.put(KEY_ID, 2);
        cv2.put(KEY_QUESTION, " What will be the total weight of 10 poles, each of the same weight ?\nStatements:\nI. One-fourth of the weight of each pole is 5 kg.\nI. The total weight of three poles is 20 kilograms more than the total weight of two poles.");
        cv2.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv2.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv2.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv2.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv2.put(KEY_OPE, "Both I and II are necessary to answer");
        cv2.put(KEY_CORRECT, "3");

        cv3.put(KEY_ID, 3);
        cv3.put(KEY_QUESTION, "How many children does M have ?\nStatements:\nI. H is the only daughter of X who is wife of M.\nII. K and J are brothers of M.");
        cv3.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv3.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv3.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv3.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv3.put(KEY_OPE, "Both I and II are necessary to answer");
        cv3.put(KEY_CORRECT, "4");

        cv4.put(KEY_ID, 4);
        cv4.put(KEY_QUESTION, "How much was the total sale of the company ?\nStatements:\n I. The company sold 8000 units of product A each costing Rs. 25.\nThis company has no other product line.");
        cv4.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv4.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv4.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv4.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv4.put(KEY_OPE, "Both I and II are necessary to answer");
        cv4.put(KEY_CORRECT, "5");

        cv5.put(KEY_ID, 5);
        cv5.put(KEY_QUESTION, "The last Sunday of March, 2006 fell on which date ?\nStatements:\nI. The first Sunday of that month fell on 5th.\nII. The last day of that month was Friday.");
        cv5.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv5.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv5.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv5.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv5.put(KEY_OPE, "Both I and II are necessary to answer");
        cv5.put(KEY_CORRECT, "3");

        cv6.put(KEY_ID, 6);
        cv6.put(KEY_QUESTION, "What is the code for 'sky' in the code language ?\nStatements:\nI. In the code language, 'sky is clear' is written as 'de ra fa'.\nII. In the same code language, 'make it clear' is written as 'de ga jo'.");
        cv6.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv6.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv6.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv6.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv6.put(KEY_OPE, "Both I and II are necessary to answer");
        cv6.put(KEY_CORRECT, "4");

        cv7.put(KEY_ID, 7);
        cv7.put(KEY_QUESTION, "How many children are there between P and Q in a row of children ?\nStatements:\nI. P is fifteenth from the left in the row.\nII. Q is exactly in the middle and there are ten children towards his right.");
        cv7.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv7.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv7.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv7.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv7.put(KEY_OPE, "Both I and II are necessary to answer");
        cv7.put(KEY_CORRECT, "5");

        cv8.put(KEY_ID, 8);
        cv8.put(KEY_QUESTION, " How is T related to K?\nStatements:\nI. R's sister J has married Ts brother L, who is the only son of his parents.\nII. K is the only daughter of L and J.");
        cv8.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv8.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv8.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv8.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv8.put(KEY_OPE, "Both I and II are necessary to answer");
        cv8.put(KEY_CORRECT, "5");

        cv9.put(KEY_ID, 9);
        cv9.put(KEY_QUESTION, "How is J related to P ?\nStatements:\nI. M is brother of P and T is sister of P.\nII. P's mother is married to J's husband who has one son and two daughters.");
        cv9.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv9.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv9.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv9.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv9.put(KEY_OPE, "Both I and II are necessary to answer");
        cv9.put(KEY_CORRECT, "2");

        cv10.put(KEY_ID, 10);
        cv10.put(KEY_QUESTION, "How is X related to Y ?\nStatements:\nI. Y and Z are children of D who is wife of X.\nII. R's sister X is married to Ys father.");
        cv10.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv10.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv10.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv10.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv10.put(KEY_OPE, "Both I and II are necessary to answer");
        cv10.put(KEY_CORRECT, "3");

        cv11.put(KEY_ID, 11);
        cv11.put(KEY_QUESTION, "Who is to the immediate right of P among five persons P, Q, R, S and T facing North ?\nStatements:\nI. R is third to the left of Q and P is second to the right of R.\nII. Q is to the immediate left of T who is second to the right of P.");
        cv11.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv11.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv11.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv11.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv11.put(KEY_OPE, "Both I and II are necessary to answer");
        cv11.put(KEY_CORRECT, "3");

        cv12.put(KEY_ID, 12);
        cv12.put(KEY_QUESTION, "On which date of the month was Anjali born in February 2004 ?\nStatements:\nI. Anjali was born on an even date of the month.\nII. Anjali's birth date was a prime number.");
        cv12.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv12.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv12.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv12.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv12.put(KEY_OPE, "Both I and II are necessary to answer");
        cv12.put(KEY_CORRECT, "5");

        cv13.put(KEY_ID, 13);
        cv13.put(KEY_QUESTION, " How is X related to Y?\nStatements:\nI. Y says, 'I have only one brother'.\nII. X says, 'I have only one sister.'");
        cv13.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv13.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv13.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv13.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv13.put(KEY_OPE, "Both I and II are necessary to answer");
        cv13.put(KEY_CORRECT, "4");

        cv14.put(KEY_ID, 14);
        cv14.put(KEY_QUESTION, "How is F related to P?\nStatements:\nI. P has two sisters M and N.\nII. F's mother is sister of M's father.");
        cv14.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv14.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv14.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv14.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv14.put(KEY_OPE, "Both I and II are necessary to answer");
        cv14.put(KEY_CORRECT, "5");

        cv15.put(KEY_ID, 15);
        cv15.put(KEY_QUESTION, " B is the brother of A. How is A related to B ?\nStatements:\nI. A is the sister of C.\nII. E is the husband of A.");
        cv15.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv15.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv15.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv15.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv15.put(KEY_OPE, "Both I and II are necessary to answer");
        cv15.put(KEY_CORRECT, "3");

        cv16.put(KEY_ID, 16);
        cv16.put(KEY_QUESTION, "How many children are there in the row of children facing North ?\n Statements:\nI.  Vishakha who is fifth from the left end is eighth to the left of Ashish who is twelfth from the right end.\nII.  Rohit is fifth to the left of Nisha who is seventh from the right end and eighteenth from the left end.");
        cv16.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv16.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv16.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv16.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv16.put(KEY_OPE, "Both I and II are necessary to answer");
        cv16.put(KEY_CORRECT, "3");

        cv17.put(KEY_ID, 17);
        cv17.put(KEY_QUESTION, "How many doctors are practising in this town ?\n Statements:\nI. There is one doctor per seven hundred residents.\nII. There are 16 wards with each ward having as many doctors as the number of wards.");
        cv17.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv17.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv17.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv17.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv17.put(KEY_OPE, "Both I and II are necessary to answer");
        cv17.put(KEY_CORRECT, "2");

        cv18.put(KEY_ID, 18);
        cv18.put(KEY_QUESTION, "On which day of the week was birthday of Sahil ?\n Statements:\nI. Sahil celebrated his birthday the very next day on which Arun celebrated his birthday.\nII. The sister of Sahil was born on the third day of the week and two days after Sahil was born.");
        cv18.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv18.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv18.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv18.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv18.put(KEY_OPE, "Both I and II are necessary to answer");
        cv18.put(KEY_CORRECT, "2");

        cv19.put(KEY_ID, 19);
        cv19.put(KEY_QUESTION, "How many pages of book X did Robert read on Sunday ?\n Statements:\nI. The book has 300 pages out of which two-thirds were read by him before Sunday.\nII. Robert read the last 40 pages of the book on the morning of Monday.");
        cv19.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv19.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv19.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv19.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv19.put(KEY_OPE, "Both I and II are necessary to answer");
        cv19.put(KEY_CORRECT, "5");

        cv20.put(KEY_ID, 20);
        cv20.put(KEY_QUESTION, "How is Tanya related to the man in the photograph ?\n Statements:\nI. Man in the photograph is the only son of Tanya's grandfather.\nII. The man in the photograph has no brothers or sisters and his father is Tanya's grandfather.");
        cv20.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv20.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv20.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv20.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv20.put(KEY_OPE, "Both I and II are necessary to answer");
        cv20.put(KEY_CORRECT, "2");

        cv21.put(KEY_ID, 21);
        cv21.put(KEY_QUESTION, "Among T, V, B, E and C, who is the third from the top when arranged in the descending order of their weights ?\n Statements:\nI. B is heavier than T and C and is less heavier than V who is not the heaviest.\nII. C is heavier than only T.");
        cv21.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv21.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv21.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv21.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv21.put(KEY_OPE, "Both I and II are necessary to answer");
        cv21.put(KEY_CORRECT, "1");

        cv22.put(KEY_ID, 22);
        cv22.put(KEY_QUESTION, "Which word in the code language means 'flower' ?\n Statements:\nI. 'de fu la pane' means 'rose flower is beautiful' and 'la quiz' means 'beautiful tree'.\nII. 'de la chin' means 'red rose flower' and 'pa chin' means 'red tea'.");
        cv22.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv22.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv22.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv22.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv22.put(KEY_OPE, "Both I and II are necessary to answer");
        cv22.put(KEY_CORRECT, "4");

        cv23.put(KEY_ID, 23);
        cv23.put(KEY_QUESTION, "How many students in a class play football ?\n Statements:\nI. Only boys play football.\nII. There are forty boys and thirty girls in the class.");
        cv23.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv23.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv23.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv23.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv23.put(KEY_OPE, "Both I and II are necessary to answer");
        cv23.put(KEY_CORRECT, "4");

        cv24.put(KEY_ID, 24);
        cv24.put(KEY_QUESTION, "Who is C's partner in a game of cards involving four players A, B, C and D ?\n Statements:\nI. D is sitting opposite to A.\nII. B is sitting right of A and left of D.");
        cv24.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv24.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv24.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv24.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv24.put(KEY_OPE, "Both I and II are necessary to answer");
        cv24.put(KEY_CORRECT, "3");

        cv25.put(KEY_ID, 25);
        cv25.put(KEY_QUESTION, "On a T.V. channel, four serials A, B, C and D were screened, one on eacn day, on four consecutive days but not necessarily in that order. On which day was the serial C screened ?\n Statements:\nI. The first serial was screened on 23rd, Tuesday and was followed by serial D.\nII. Serial A was not screened on 25th and one serial was screened between serials A and B.");
        cv25.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv25.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv25.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv25.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv25.put(KEY_OPE, "Both I and II are necessary to answer");
        cv25.put(KEY_CORRECT, "5");

        cv26.put(KEY_ID, 26);
        cv26.put(KEY_QUESTION, "How is Sulekha related to Nandini ?\n Statements:\nI. Sulekha's husband is the only son of Nandini's mother.\nII. Sulekha's brother and Nandini's husband are cousins.");
        cv26.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv26.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv26.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv26.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv26.put(KEY_OPE, "Both I and II are necessary to answer");
        cv26.put(KEY_CORRECT, "3");

        cv27.put(KEY_ID, 27);
        cv27.put(KEY_QUESTION, "Can Ritesh retire from office X in January 2006, with full pension benefits ?\n Statements:\nI. Ritesh will complete 30 years of service in office X in April 2000 and desires to retire.\nII. As per office X rules, an employee has to complete minimum 30 years of service and attain age of 60. Ritesh has 3 years to complete age of 60.");
        cv27.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv27.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv27.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv27.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv27.put(KEY_OPE, "Both I and II are necessary to answer");
        cv27.put(KEY_CORRECT, "5");

        cv28.put(KEY_ID, 28);
        cv28.put(KEY_QUESTION, "What is the code for 'or' in the code language?\n Statements: 'nik sa te' means 'right or wrong', 'ro da nik' means 'he is right' and 'fe te ro' means 'that is wrong'.\nII. 'pa nik la' means 'that right man', 'sa ne pa' means 'this or that' and 'ne ka re' means 'tell this there'.");
        cv28.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv28.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv28.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv28.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv28.put(KEY_OPE, "Both I and II are necessary to answer");
        cv28.put(KEY_CORRECT, "3");

        cv29.put(KEY_ID, 29);
        cv29.put(KEY_QUESTION, "Madan is elder than Kamal and Sharad is younger than Arvind. Who among them is the youngest ?\n Statements:\nI. Sharad is younger than Madan.\nII. Arvind is younger than Kamal.");
        cv29.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv29.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv29.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv29.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv29.put(KEY_OPE, "Both I and II are necessary to answer");
        cv29.put(KEY_CORRECT, "2");

        cv30.put(KEY_ID, 30);
        cv30.put(KEY_QUESTION, "On which date in August was Kapil born ?\n Statements:\nI. Kapil's mother remembers that Kapil was born before nineteenth but after fifteenth.\nII. Kapil's brother remembers that Kapil was born before seventeenth but after twelfth.");
        cv30.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv30.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv30.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv30.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv30.put(KEY_OPE, "Both I and II are necessary to answer");
        cv30.put(KEY_CORRECT, "5");

        cv31.put(KEY_ID, 31);
        cv31.put(KEY_QUESTION, "What is Gagan's age ?\n Statements:\nI. Gagan, Vimal and Kunal are all of the same age.\nII. Total age of Vimal, Kunal and Anil is 32 years and Anil is as old as Vimal and Kunal together.");
        cv31.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv31.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv31.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv31.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv31.put(KEY_OPE, "Both I and II are necessary to answer");
        cv31.put(KEY_CORRECT, "5");

        cv32.put(KEY_ID, 32);
        cv32.put(KEY_QUESTION, "In a certain code, '13' means 'stop smoking' and '59' means 'injurious habit'. What do '9' and '5' mean respectively in that code ?\n Statements:\nI. '157' means 'stop bad habit'.II. '839' means 'smoking is injurious'.");
        cv32.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv32.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv32.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv32.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv32.put(KEY_OPE, "Both I and II are necessary to answer");
        cv32.put(KEY_CORRECT, "3");

        cv33.put(KEY_ID, 33);
        cv33.put(KEY_QUESTION, "How much money do Vivek and Suman have together ?\n Statements:\nI. Suman has 20 rupees less than what Tarun has.\nII. Vivek has 30 rupees more than what Tarun has.");
        cv33.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv33.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv33.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv33.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv33.put(KEY_OPE, "Both I and II are necessary to answer");
        cv33.put(KEY_CORRECT, "4");

        cv34.put(KEY_ID, 34);
        cv34.put(KEY_QUESTION, "Among Monika, Anita, Sonal, Ratna and Tanvy, who came last for the programme ?\n Statements:\nI. Monika came after Anita but not after Tanvy.\nII. Ratna came after Tanvy but not after Sonal.");
        cv34.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv34.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv34.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv34.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv34.put(KEY_OPE, "Both I and II are necessary to answer");
        cv34.put(KEY_CORRECT, "5");

        cv35.put(KEY_ID, 35);
        cv35.put(KEY_QUESTION, "Who among P, Q, R, S and T is the lightest?\n Statements:\nI. R is heavier than Q and T but lighter than S.\nII. S is not the heaviest.");
        cv35.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv35.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv35.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv35.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv35.put(KEY_OPE, "Both I and II are necessary to answer");
        cv35.put(KEY_CORRECT, "4");

        cv36.put(KEY_ID, 36);
        cv36.put(KEY_QUESTION, "How is T related to K?\n Statements:\nI. K has two sons; one of the sons is A.\nII. The mother of T has only two sons - Aand B.");
        cv36.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv36.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv36.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv36.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv36.put(KEY_OPE, "Both I and II are necessary to answer");
        cv36.put(KEY_CORRECT, "5");

        cv37.put(KEY_ID, 37);
        cv37.put(KEY_QUESTION, "What is the shortest distance between Devipur and Durgapur ?\n Statements:\nI. Durgapur is 20 kms away from Rampur.\nII. Devipur is 15 kms away from Rampur.");
        cv37.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv37.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv37.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv37.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv37.put(KEY_OPE, "Both I and II are necessary to answer");
        cv37.put(KEY_CORRECT, "4");

        cv38.put(KEY_ID, 38);
        cv38.put(KEY_QUESTION, "How is A related to D ?\n Statements:\nI. B is the brother of A.\nII. B is D's son.");
        cv38.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv38.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv38.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv38.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv38.put(KEY_OPE, "Both I and II are necessary to answer");
        cv38.put(KEY_CORRECT, "4");

        cv39.put(KEY_ID, 39);
        cv39.put(KEY_QUESTION, "Manoj, Prabhakar, Akash and Kamal are four friends. Who among them is the heaviest ?\n Statements:\nI. Prabhakar is heavier than Manoj and Kamal but lighter than Akash.\nII. Manoj is lighter than Prabhakar and Akash but heavier than Kamal.");
        cv39.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv39.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv39.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv39.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv39.put(KEY_OPE, "Both I and II are necessary to answer");
        cv39.put(KEY_CORRECT, "1");

        cv40.put(KEY_ID, 40);
        cv40.put(KEY_QUESTION, "Vinod's and Javed's salaries are in the proportion of 4 : 3 respectively. What is Vinod's salary ?\n Statements:\nI. Javed's salary is 75% that of Vinod's salary.\nII. Javed's salary is Rs 4500.");
        cv40.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv40.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv40.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv40.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv40.put(KEY_OPE, "Both I and II are necessary to answer");
        cv40.put(KEY_CORRECT, "2");

        cv41.put(KEY_ID, 41);
        cv41.put(KEY_QUESTION, "What is Nitin's rank from the top in a class of forty students ?\n Statements:\nI. There are ten students between Nitin and Deepak.\nII. Deepak is twentieth from the top.");
        cv41.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv41.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv41.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv41.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv41.put(KEY_OPE, "Both I and II are necessary to answer");
        cv41.put(KEY_CORRECT, "4");

        cv42.put(KEY_ID, 42);
        cv42.put(KEY_QUESTION, "Which direction is Sunny facing now ?\n Statements:\nI. If Sunny turns to his right and again turns to his right, he will be facing North.\nII. If Sunny walks some distance and turns left and again walks some distance, then his face will be towards left of Dinesh who is facing South.");
        cv42.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv42.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv42.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv42.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv42.put(KEY_OPE, "Both I and II are necessary to answer");
        cv42.put(KEY_CORRECT, "3");

        cv43.put(KEY_ID, 43);
        cv43.put(KEY_QUESTION, "T studies in which of the schools B, C, D, E and F ?\n Statements:\nI. T does not study in the same school as either R or J.\nII. R and J study in schools D and F respectively.");
        cv43.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv43.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv43.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv43.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv43.put(KEY_OPE, "Both I and II are necessary to answer");
        cv43.put(KEY_CORRECT, "4");

        cv44.put(KEY_ID, 44);
        cv44.put(KEY_QUESTION, "How is Divya related to Shaloo ?\n Statements:\nI. Divya's mother is sister of Shaloo's father.\nII. Shaloo is the daughter of Divya's grandfather's only child.");
        cv44.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv44.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv44.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv44.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv44.put(KEY_OPE, "Both I and II are necessary to answer");
        cv44.put(KEY_CORRECT, "3");

        cv45.put(KEY_ID, 45);
        cv45.put(KEY_QUESTION, "How many New Year's greeting cards were sold this year in your shop ?\n Statements:\nI. Last year 2935 cards were sold.\nII. The number of cards sold this year was 1.2 times that of last year.");
        cv45.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv45.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv45.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv45.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv45.put(KEY_OPE, "Both I and II are necessary to answer");
        cv45.put(KEY_CORRECT, "5");

        cv46.put(KEY_ID, 46);
        cv46.put(KEY_QUESTION, "On which day in April is Gautam's birthday?\n Statements:\nI. Gautam was born exactly 28 years after his mother was born.\nII. His mother will be 55 years 4 months and 5 days on August 18 this year.");
        cv46.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv46.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv46.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv46.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv46.put(KEY_OPE, "Both I and II are necessary to answer");
        cv46.put(KEY_CORRECT, 5);

        cv47.put(KEY_ID, 47);
        cv47.put(KEY_QUESTION, "What is the code for 'is' in the code language ?\n Statements:\nI. In the code language, 'shi tu ke' means 'pen is blue'.\nII. In the same code language, 'ke si re' means 'this is wonderful'.");
        cv47.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv47.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv47.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv47.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv47.put(KEY_OPE, "Both I and II are necessary to answer");
        cv47.put(KEY_CORRECT, 5);

        cv48.put(KEY_ID, 48);
        cv48.put(KEY_QUESTION, "Among A, B, C, D and E, who is in the middle while standing in a row ?\n Statements:\nI. C, who is third to the left of D, is to the immediate right of A and second to the left of E.\nII. C is second to the left of E, who is not at any of the ends and who is third to the right of A. D is at one of the ends.");
        cv48.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv48.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv48.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv48.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv48.put(KEY_OPE, "Both I and II are necessary to answer");
        cv48.put(KEY_CORRECT, "3");

        cv49.put(KEY_ID, 49);
        cv49.put(KEY_QUESTION, "Among A, B, C, D, E and F, who is the heaviest ?\n Statements:\nI. A and D are heavier than B, E and F but none of them is the heaviest.\nII. A is heavier than D but lighter than C.");
        cv49.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv49.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv49.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv49.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv49.put(KEY_OPE, "Both I and II are necessary to answer");
        cv49.put(KEY_CORRECT, "1");

        cv50.put(KEY_ID, 50);
        cv50.put(KEY_QUESTION, "Who among P, Q, T, V and M is exactly in the middle when they are arranged in ascending order of their heights ?\n Statements:\nI. V is taller than Q but shorter than M.");
        cv50.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv50.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv50.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv50.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv50.put(KEY_OPE, "Both I and II are necessary to answer");
        cv50.put(KEY_CORRECT, "5");

        cv51.put(KEY_ID, 1);
        cv51.put(KEY_QUESTION, "Statement: Some actors are singers. All the singers are dancers.\n Conclusions:\nI. Some actors are dancers.\nII. No singer is actor.");
        cv51.put(KEY_OPA, "If only I conclusion follows");
        cv51.put(KEY_OPB, "If only II conclusion follows");
        cv51.put(KEY_OPC, "If either I or II  follows");
        cv51.put(KEY_OPD, "If neither I nor II  follows");
        cv51.put(KEY_OPE, "If both I and II  follows");
        cv51.put(KEY_CORRECT, "1");

        cv52.put(KEY_ID, 2);
        cv52.put(KEY_QUESTION, "Statement: All the harmoniums are instruments. All the instruments are flutes.\n Conclusions:\nI. All the flutes are instruments.\nII. All the harmoniums are flutes.");
        cv52.put(KEY_OPA, "If only I conclusion follows");
        cv52.put(KEY_OPB, "If only II conclusion follows");
        cv52.put(KEY_OPC, "If either I or II  follows");
        cv52.put(KEY_OPD, "If neither I nor II  follows");
        cv52.put(KEY_OPE, "If both I and II  follows");
        cv52.put(KEY_CORRECT, "2");

        cv53.put(KEY_ID, 3);
        cv53.put(KEY_QUESTION, "Statement: Some mangoes are yellow. Some tixo are mangoes.\n Conclusions:\nI. Some mangoes are green.\nII. Tixo is a yellow.");
        cv53.put(KEY_OPA, "If only I conclusion follows");
        cv53.put(KEY_OPB, "If only II conclusion follows");
        cv53.put(KEY_OPC, "If either I or II  follows");
        cv53.put(KEY_OPD, "If neither I nor II  follows");
        cv53.put(KEY_OPE, "If both I and II  follows");
        cv53.put(KEY_CORRECT, "4");

        cv54.put(KEY_ID, 4);
        cv54.put(KEY_QUESTION, "Statement: Some ants are parrots. All the parrots are apples.\n Conclusions:\nI. All the apples are parrots.\nII. Some ants are apples.");
        cv54.put(KEY_OPA, "If only I conclusion follows");
        cv54.put(KEY_OPB, "If only II conclusion follows");
        cv54.put(KEY_OPC, "If either I or II  follows");
        cv54.put(KEY_OPD, "If neither I nor II  follows");
        cv54.put(KEY_OPE, "If both I and II  follows");
        cv54.put(KEY_CORRECT, "2");

        cv55.put(KEY_ID, 5);
        cv55.put(KEY_QUESTION, "Statement: Some papers are pens. All the pencils are pens.\n Conclusions:\nI. Some pens are pencils.\nII. Some pens are papers.");
        cv55.put(KEY_OPA, "If only I conclusion follows");
        cv55.put(KEY_OPB, "If only II conclusion follows");
        cv55.put(KEY_OPC, "If either I or II  follows");
        cv55.put(KEY_OPD, "If neither I nor II  follows");
        cv55.put(KEY_OPE, "If both I and II  follows");
        cv55.put(KEY_CORRECT, "5");

        cv56.put(KEY_ID, 6);
        cv56.put(KEY_QUESTION, "Statement: All the actors are girls. All the girls are beautiful.\n Conclusions:\nI. All the actors are beautiful.\nII. Some girls are actors.");
        cv56.put(KEY_OPA, "If only I conclusion follows");
        cv56.put(KEY_OPB, "If only II conclusion follows");
        cv56.put(KEY_OPC, "If either I or II  follows");
        cv56.put(KEY_OPD, "If neither I nor II  follows");
        cv56.put(KEY_OPE, "If both I and II  follows");
        cv56.put(KEY_CORRECT, "5");

        cv57.put(KEY_ID, 7);
        cv57.put(KEY_QUESTION, "Statement: All the windows are doors. No door is a wall..\n Conclusions:\nI Some windows are walls.\nII. No wall is a door.");
        cv57.put(KEY_OPA, "If only I conclusion follows");
        cv57.put(KEY_OPB, "If only II conclusion follows");
        cv57.put(KEY_OPC, "If either I or II  follows");
        cv57.put(KEY_OPD, "If neither I nor II  follows");
        cv57.put(KEY_OPE, "If both I and II  follows");
        cv57.put(KEY_CORRECT, "2");

        cv58.put(KEY_ID, 8);
        cv58.put(KEY_QUESTION, "Statement: All cups are books. All books are shirts.\n Conclusions:\nI. Some cups are not shirts.\nII. Some shirts are cups.");
        cv58.put(KEY_OPA, "If only I conclusion follows");
        cv58.put(KEY_OPB, "If only II conclusion follows");
        cv58.put(KEY_OPC, "If either I or II  follows");
        cv58.put(KEY_OPD, "If neither I nor II  follows");
        cv58.put(KEY_OPE, "If both I and II  follows");
        cv58.put(KEY_CORRECT, "2");

        cv59.put(KEY_ID, 9);
        cv59.put(KEY_QUESTION, "Statement: Some cows are crows. Some crows are elephants.\n Conclusions:\nI. Some cows are elephants.\nII. All crows are elephants.");
        cv59.put(KEY_OPA, "If only I conclusion follows");
        cv59.put(KEY_OPB, "If only II conclusion follows");
        cv59.put(KEY_OPC, "If either I or II  follows");
        cv59.put(KEY_OPD, "If neither I nor II  follows");
        cv59.put(KEY_OPE, "If both I and II  follows");
        cv59.put(KEY_CORRECT, "4");

        cv60.put(KEY_ID, 10);
        cv60.put(KEY_QUESTION, "Statement: All the pencils are pens. All the pens are inks.\n Conclusions:\nI. All the pencils are inks.\nII. Some inks are pencils.");
        cv60.put(KEY_OPA, "If only I conclusion follows");
        cv60.put(KEY_OPB, "If only II conclusion follows");
        cv60.put(KEY_OPC, "If either I or II  follows");
        cv60.put(KEY_OPD, "If neither I nor II  follows");
        cv60.put(KEY_OPE, "If both I and II  follows");
        cv60.put(KEY_CORRECT, "5");

        cv61.put(KEY_ID, 11);
        cv61.put(KEY_QUESTION, "Statement: Some dogs are bats. Some bats are cats.\n Conclusions:\nI. Some dogs are cats.\nII. Some cats are dogs.");
        cv61.put(KEY_OPA, "If only I conclusion follows");
        cv61.put(KEY_OPB, "If only II conclusion follows");
        cv61.put(KEY_OPC, "If either I or II  follows");
        cv61.put(KEY_OPD, "If neither I nor II  follows");
        cv61.put(KEY_OPE, "If both I and II  follows");
        cv61.put(KEY_CORRECT, "4");

        cv62.put(KEY_ID, 12);
        cv62.put(KEY_QUESTION, "Statement: All the trucks are flies. Some scooters are flies.\n Conclusions:\nI. All the trucks are scooters.\nII. Some scooters are trucks.");
        cv62.put(KEY_OPA, "If only I conclusion follows");
        cv62.put(KEY_OPB, "If only II conclusion follows");
        cv62.put(KEY_OPC, "If either I or II  follows");
        cv62.put(KEY_OPD, "If neither I nor II  follows");
        cv62.put(KEY_OPE, "If both I and II  follows");
        cv62.put(KEY_CORRECT, "4");

        cv63.put(KEY_ID, 13);
        cv63.put(KEY_QUESTION, "Statement: All buildings are chalks. No chalk is toffee.\n Conclusions:\nI. No building is toffee All chalks are buildings.");
        cv63.put(KEY_OPA, "If only I conclusion follows");
        cv63.put(KEY_OPB, "If only II conclusion follows");
        cv63.put(KEY_OPC, "If either I or II  follows");
        cv63.put(KEY_OPD, "If neither I nor II  follows");
        cv63.put(KEY_OPE, "If both I and II  follows");
        cv63.put(KEY_CORRECT, "1");

        cv64.put(KEY_ID, 14);
        cv64.put(KEY_QUESTION, "Statement: All cars are cats. All fans are cats.\n Conclusions:\nI. All cars are fans.\nII. Some fans are cars.");
        cv64.put(KEY_OPA, "If only I conclusion follows");
        cv64.put(KEY_OPB, "If only II conclusion follows");
        cv64.put(KEY_OPC, "If either I or II  follows");
        cv64.put(KEY_OPD, "If neither I nor II  follows");
        cv64.put(KEY_OPE, "If both I and II  follows");
        cv64.put(KEY_CORRECT, "4");

        cv65.put(KEY_ID, 15);
        cv65.put(KEY_QUESTION, " Statement: No door is dog. All the dogs are cats.\nConclusions:\nI.No door is cat.\nII.No cat is door.\nIII.Some cats are dogs.\nIV.All the cats are dogs.");
        cv65.put(KEY_OPA, "Only II or IV");
        cv65.put(KEY_OPB, "Only I or III");
        cv65.put(KEY_OPC, "Only III or IV");
        cv65.put(KEY_OPD, "Only III");
        cv65.put(KEY_OPE, "All the four");
        cv65.put(KEY_CORRECT, "4");

        cv66.put(KEY_ID, 16);
        cv66.put(KEY_QUESTION, "Statement:  All green are blue. All blue are white.\nConclusions:\nI.Some blue are green.\nII.Some white are green.\nIII.Some green are not white.\nIV.All white are blue.");
        cv66.put(KEY_OPA, "Only I or II");
        cv66.put(KEY_OPB, "Only I or III");
        cv66.put(KEY_OPC, "Only I or IV");
        cv66.put(KEY_OPD, "Only II or IV");
        cv66.put(KEY_OPE, "All the four");
        cv66.put(KEY_CORRECT, "1");

        cv67.put(KEY_ID, 17);
        cv67.put(KEY_QUESTION, "Statement: All men are vertebrates. Some mammals are vertebrates. Conclusions: All men are mammals. All mammals are men. Some vertebrates are mammals. All vertebrates are men.");
        cv67.put(KEY_OPA, "Only IV");
        cv67.put(KEY_OPB, "Only II");
        cv67.put(KEY_OPC, "Only III");
        cv67.put(KEY_OPD, "Only I ");
        cv67.put(KEY_OPE, "Only I and III");
        cv67.put(KEY_CORRECT, "3");

        cv68.put(KEY_ID, 18);
        cv68.put(KEY_QUESTION, "Statement: All the phones are scales. All the scales are calculators.\nConclusions:\nI.All the calculators are scales.\nII.All the phones are calculators.\nIII.All the scales are phones.\nIV.Some calculators are phones.");
        cv68.put(KEY_OPA, "Only I and IV");
        cv68.put(KEY_OPB, "Only III and IV");
        cv68.put(KEY_OPC, "Only II and IV");
        cv68.put(KEY_OPD, "Only I and II");
        cv68.put(KEY_OPE, "Only I and III");
        cv68.put(KEY_CORRECT, "3");

        cv69.put(KEY_ID, 19);
        cv69.put(KEY_QUESTION, "Statement: Some tables are T.V. Some T.V. are radios.\n Conclusions:\nI. Some tables are radios.\nII. Some radios are tables.\nIII. All the radios are T.V.\nIV. All the T.V. are tables.");
        cv69.put(KEY_OPA, "Only II and IV");
        cv69.put(KEY_OPB, "Only I and III");
        cv69.put(KEY_OPC, "Only IV");
        cv69.put(KEY_OPD, "Only I and IV");
        cv69.put(KEY_OPE, "None of the four");
        cv69.put(KEY_CORRECT, "5");

        cv70.put(KEY_ID, 20);
        cv70.put(KEY_QUESTION, "Statement: Some pens are books. Some books are pencils.\n Conclusions:\nI. Some pens are pencils.\nII. Some pencils are pens.\nIII. All pencils are pens.\nIV. All books are pens.");
        cv70.put(KEY_OPA, "Only I and III");
        cv70.put(KEY_OPB, "Only II and IV");
        cv70.put(KEY_OPC, "All the four");
        cv70.put(KEY_OPD, "None of the four");
        cv70.put(KEY_OPE, "Only I");
        cv70.put(KEY_CORRECT, "4");

        cv71.put(KEY_ID, 21);
        cv71.put(KEY_QUESTION, ":Statement: All the goats are tigers. All the tigers are lions.\n Conclusions:\nI. All the goats are lions.\nII. All the lions are goats.\nIII. Some lions are goats.\nIV. Some tigers are goats.");
        cv71.put(KEY_OPA, "All the four");
        cv71.put(KEY_OPB, "Only I,II and III");
        cv71.put(KEY_OPC, "Only I,III and IV");
        cv71.put(KEY_OPD, "Only II,IIIand IV");
        cv71.put(KEY_OPE, "None of the four");
        cv71.put(KEY_CORRECT, "3");

        cv72.put(KEY_ID, 22);
        cv72.put(KEY_QUESTION, "Statement: All the books are pencils. No pencil is eraser.\n Conclusions:\nI. All the pencils are books.\nII. Some erasers are books.\nIII. No book is eraser.\nIV. Some books are erasers.");
        cv72.put(KEY_OPA, "Only III");
        cv72.put(KEY_OPB, "Only I and III");
        cv72.put(KEY_OPC, "Only I and II");
        cv72.put(KEY_OPD, "Only II and III");
        cv72.put(KEY_OPE, "Only III and IV");
        cv72.put(KEY_CORRECT, "1");

        cv73.put(KEY_ID, 23);
        cv73.put(KEY_QUESTION, "Statement: All the locks are keys. All the keys are bats. Some watches are bats.\n Conclusions:\nI. Some bats are locks.\nII. Some watches are keys.\nIII. All the keys are locks.");
        cv73.put(KEY_OPA, "Only I and II");
        cv73.put(KEY_OPB, "Only I ");
        cv73.put(KEY_OPC, "Only II");
        cv73.put(KEY_OPD, "Only I and III");
        cv73.put(KEY_OPE, "All the four ");
        cv73.put(KEY_CORRECT, "2");

        cv74.put(KEY_ID, 24);
        cv74.put(KEY_QUESTION, "Statement: Some keys are staplers. Some staplers are stickers. All the stickers are pens.\nConclusions:\nI. Some pens are staplers.\nII. Some stickers are keys.\nIII. No sticker is key.\nIV. Some staplers are keys.");
        cv74.put(KEY_OPA, "Only I and II");
        cv74.put(KEY_OPB, "Only II and IV");
        cv74.put(KEY_OPC, "Only II and III");
        cv74.put(KEY_OPD, "Only I and IV and either II or III");
        cv74.put(KEY_OPE, "All the four ");
        cv74.put(KEY_CORRECT, "4");

        cv75.put(KEY_ID, 25);
        cv75.put(KEY_QUESTION, "Statements: Some questions are answers. Some answers are writers. All the writers are poets.\n Conclusions:\nI. Some writers are answers.\nII. Some poets are questions.\nIII. All the questions are poets.\nIV. Some poets are answers.");
        cv75.put(KEY_OPA, "Only I and II");
        cv75.put(KEY_OPB, "Only I and IV");
        cv75.put(KEY_OPC, "Only I and III");
        cv75.put(KEY_OPD, "Only II and IV");
        cv75.put(KEY_OPE, "All the four");
        cv75.put(KEY_CORRECT, "2");

        cv76.put(KEY_ID, 26);
        cv76.put(KEY_QUESTION, "Statements: Some envelops are gums. Some gums are seals. Some seals are adhesives.\n Conclusions:\nI. Some envelopes are seals.\nII. Some gums are adhesives.\nIII. Some adhesives are seals.\nIV. Some adhesives are gums.");
        cv76.put(KEY_OPA, "Only III");
        cv76.put(KEY_OPB, "Only I");
        cv76.put(KEY_OPC, "Only II");
        cv76.put(KEY_OPD, "Only IV");
        cv76.put(KEY_OPE, "All the four");
        cv76.put(KEY_CORRECT, "1");

        cv77.put(KEY_ID, 27);
        cv77.put(KEY_QUESTION, "Statements: All the papers are books. All the bags are books. Some purses are bags.\n Conclusions:\nI. Some papers are bags.\nII. Some books are papers. \nIII. Some books are purses.");
        cv77.put(KEY_OPA, " only I ");
        cv77.put(KEY_OPB, "Only II and III");
        cv77.put(KEY_OPC, "Only I and II");
        cv77.put(KEY_OPD, "Only I and III");
        cv77.put(KEY_OPE, "All the four");
        cv77.put(KEY_CORRECT, "2");

        cv78.put(KEY_ID, 28);
        cv78.put(KEY_QUESTION, "Statements: Some rats are cats. Some cats are dogs. No dog is cow.\nConclusions:\nI. No cow is cat.\nII. No dog is rat.\nIII. Some cats are rats.");
        cv78.put(KEY_OPA, "Only I");
        cv78.put(KEY_OPB, "Only I and II");
        cv78.put(KEY_OPC, "Only I and III");
        cv78.put(KEY_OPD, "Only II and III");
        cv78.put(KEY_OPE, "Only III");
        cv78.put(KEY_CORRECT, "5");

        cv79.put(KEY_ID, 29);
        cv79.put(KEY_QUESTION, "Statements: All the books are papers. Some papers are journals. Some journals are calendars.\n Conclusions:\nI. Some journals are books.\nII. Some calendars are papers.\nIII. Some books are journals.\nIV. Some books are calendars.");
        cv79.put(KEY_OPA, "Only I");
        cv79.put(KEY_OPB, "Only II");
        cv79.put(KEY_OPC, "Only III");
        cv79.put(KEY_OPD, "Only IV");
        cv79.put(KEY_OPE, "None of the four");
        cv79.put(KEY_CORRECT, "5");

        cv80.put(KEY_ID, 30);
        cv80.put(KEY_QUESTION, "Statements: All the bottles are boxes. All the boxes are bags. Some bags are trays.\n Conclusions:\nI. Some bottles are trays.\nII. Some trays are boxes.\nIII. All the bottles are bags.\nIV. Some trays are bags.");
        cv80.put(KEY_OPA, "Only III and IV");
        cv80.put(KEY_OPB, "Only I and II");
        cv80.put(KEY_OPC, "Only II and III");
        cv80.put(KEY_OPD, "Only I and IV");
        cv80.put(KEY_OPE, "All the four");
        cv80.put(KEY_CORRECT, "1");

        cv81.put(KEY_ID, 31);
        cv81.put(KEY_QUESTION, "Statements: Some cars are jeeps. All the boxes are jeeps. All the pens are cars.\n Conclusions:\nI. Some cars are boxes.\nII. No pen is jeep.\nIII. Some boxes are cars.");
        cv81.put(KEY_OPA, "None of three");
        cv81.put(KEY_OPB, "Only I and II");
        cv81.put(KEY_OPC, "Only I and III");
        cv81.put(KEY_OPD, "Only II and III");
        cv81.put(KEY_OPE, "All the four");
        cv81.put(KEY_CORRECT, "1");

        cv82.put(KEY_ID, 32);
        cv82.put(KEY_QUESTION, "Statements: All benches are cots.No cot is lamp.Some lamps are candles.\nConclusions:\nI. some cots are candles.\nII. Some candles are cots");
        cv82.put(KEY_OPA, "If only I conclusion follows");
        cv82.put(KEY_OPB, "If only II conclusion follows");
        cv82.put(KEY_OPC, "If either I or II  follows");
        cv82.put(KEY_OPD, "If neither I nor II  follows");
        cv82.put(KEY_OPE, "If both I and II  follows");
        cv82.put(KEY_CORRECT, "4");

        cv83.put(KEY_ID, 33);
        cv83.put(KEY_QUESTION, "Statements: All pens are books.Some pencils are pens.\nConclusions:\n1. some books are pencils.\n2. Some pencils are books.\n3. All pens are pencils.\n4. None");
        cv83.put(KEY_OPA, " 1 ");
        cv83.put(KEY_OPB, " 2");
        cv83.put(KEY_OPC, " 3");
        cv83.put(KEY_OPD, " 4");
        cv83.put(KEY_OPE, "1,2 and 3");
        cv83.put(KEY_CORRECT, "2");

        cv84.put(KEY_ID, 34);
        cv84.put(KEY_QUESTION, "Statements: All pens are books.No pencils are books.\nConclusion:\n1. All books are pencils.\n2. All pencils are books.\n3. Some pencils are books.\n4. None");
        cv84.put(KEY_OPA, "1");
        cv84.put(KEY_OPB, "2");
        cv84.put(KEY_OPC, "3");
        cv84.put(KEY_OPD, "4s");
        cv84.put(KEY_OPE, "1,2 and 3");
        cv84.put(KEY_CORRECT, "3");

        cv85.put(KEY_ID, 35);
        cv85.put(KEY_QUESTION, "Statements: No mat is pot.All pots are bats.\nConclusion:\n1. No mats are bats.\n2. No bats are mats.\n3. Some bats are mats.\n4. Some bats are not mats");
        cv85.put(KEY_OPA, "1");
        cv85.put(KEY_OPB, "2");
        cv85.put(KEY_OPC, "3");
        cv85.put(KEY_OPD, "4");
        cv85.put(KEY_OPE, "1,2 and 3");
        cv85.put(KEY_CORRECT, "4");

        cv86.put(KEY_ID, 36);
        cv86.put(KEY_QUESTION, " Statements: Some cats are dogs.All dogs are goats.All goats are walls.\nConclusion:\nI. Some walls are dogs.\nII.Some walls are cats");
        cv86.put(KEY_OPA, "If only I conclusion follows");
        cv86.put(KEY_OPB, "If only II conclusion follows");
        cv86.put(KEY_OPC, "If either I or II  follows");
        cv86.put(KEY_OPD, "If neither I nor II  follows");
        cv86.put(KEY_OPE, "If both I and II  follows");
        cv86.put(KEY_CORRECT, "5");

        cv87.put(KEY_ID, 37);
        cv87.put(KEY_QUESTION, " Statements: Some roads are ponds.All ponds are stores.Some stores are bags.\nConclusion:\nI. Some bags are ponds.\nII. Some stores are roads.");
        cv87.put(KEY_OPA, "If only I conclusion follows");
        cv87.put(KEY_OPB, "If only II conclusion follows");
        cv87.put(KEY_OPC, "If either I or II  follows");
        cv87.put(KEY_OPD, "If neither I nor II  follows");
        cv87.put(KEY_OPE, "If both I and II  follows");
        cv87.put(KEY_CORRECT, "5");

        cv88.put(KEY_ID, 38);
        cv88.put(KEY_QUESTION, " Statements: Some roses are flowers.Some flowers are buds.All buds are leaves.All leaves are plants.\nConclusion:\n1. Some plants are flowers.\n2. Some roses are buds.\n3. No leaves are roses.\n4. No roses are buds");
        cv88.put(KEY_OPA, "Only 1 follows");
        cv88.put(KEY_OPB, "Only 1 and 2 follows");
        cv88.put(KEY_OPC, "Only 1 and 2 or 4 follows");
        cv88.put(KEY_OPD, "Only 2 or 4 follows");
        cv88.put(KEY_OPE, "None of the four");
        cv88.put(KEY_CORRECT, "3");

        cv89.put(KEY_ID, 39);
        cv89.put(KEY_QUESTION, " Statements: All rods are bricks.Some bricks are ropes.All ropes are doors.\nConcussion: 1. Some rods are doors.\n2. Some doors are bricks.\n3. Some rods are not doors.\n4. All doors are ropes");
        cv89.put(KEY_OPA, "Only 1 and 2 follows");
        cv89.put(KEY_OPB, "Only 1,2 and 3 follows");
        cv89.put(KEY_OPC, "Only 1 or 3 and 2 follows");
        cv89.put(KEY_OPD, "Only 1 or 3 and 4 follows");
        cv89.put(KEY_OPE, "None of the four");
        cv89.put(KEY_CORRECT, "3");

        cv90.put(KEY_ID, 40);
        cv90.put(KEY_QUESTION, " Statements: No rats are cats.All cats are tigers.\nConcussion: 1. No rats are tigers.\n2. No tigers are rats.\n3. Some tigers are rats.\n4. Some tigers are not rats");
        cv90.put(KEY_OPA, "Only 1 and 2 follows");
        cv90.put(KEY_OPB, "Only 1,2 and 3 follows");
        cv90.put(KEY_OPC, "Only either 1 or 3 and 2 follows");
        cv90.put(KEY_OPD, "Only either 1 or 3 and 4 follows");
        cv90.put(KEY_OPE, "Only 4 follows");
        cv90.put(KEY_CORRECT, "5");

        cv91.put(KEY_ID, 41);
        cv91.put(KEY_QUESTION, "Statements : No magazine is cap. All caps are cameras.\n Conclusions: \n I. No camera is magazine.\n II. some cameras are magazines.");
        cv91.put(KEY_OPA, "If only I conclusion follows");
        cv91.put(KEY_OPB, "If only II conclusion follows");
        cv91.put(KEY_OPC, "If either I or II  follows");
        cv91.put(KEY_OPD, "If neither I nor II  follows");
        cv91.put(KEY_OPE, "If both I and II  follows");
        cv91.put(KEY_CORRECT, "3");

        cv92.put(KEY_ID, 42);
        cv92.put(KEY_QUESTION, "Statements : Some desks are caps.No cap is red.\nConclusions: \n I. Some caps are desks.\n II.No desk is red.");
        cv92.put(KEY_OPA, "If only I conclusion follows");
        cv92.put(KEY_OPB, "If only II conclusion follows");
        cv92.put(KEY_OPC, "If either I or II  follows");
        cv92.put(KEY_OPD, "If neither I nor II  follows");
        cv92.put(KEY_OPE, "If both I and II  follows");
        cv92.put(KEY_CORRECT, "1");

        cv93.put(KEY_ID, 43);
        cv93.put(KEY_QUESTION, "Statements :Some books are pens.No pen is pencil .\nConclusions: \n I. Some books are pencils.\n II.No book is pencil.");
        cv93.put(KEY_OPA, "If only I conclusion follows");
        cv93.put(KEY_OPB, "If only II conclusion follows");
        cv93.put(KEY_OPC, "If either I or II  follows");
        cv93.put(KEY_OPD, "If neither I nor II  follows");
        cv93.put(KEY_OPE, "If both I and II  follows");
        cv93.put(KEY_CORRECT, "3");

        cv94.put(KEY_ID, 44);
        cv94.put(KEY_QUESTION, "Statements : No women teacher can play.Some women teachers are atheletes .\nConclusions: \n I. Male teachers can play .\n II. Some atheletes can play.");
        cv94.put(KEY_OPA, "If only I conclusion follows");
        cv94.put(KEY_OPB, "If only II conclusion follows");
        cv94.put(KEY_OPC, "If either I or II  follows");
        cv94.put(KEY_OPD, "If neither I nor II  follows");
        cv94.put(KEY_OPE, "If both I and II  follows");
        cv94.put(KEY_CORRECT, "4");

        cv95.put(KEY_ID, 45);
        cv95.put(KEY_QUESTION, "Statements :No bat is ball.No ball is wicket .\nConclusions: \n I. No bat is wicket .\n II. All wickets are bats.");
        cv95.put(KEY_OPA, "If only I conclusion follows");
        cv95.put(KEY_OPB, "If only II conclusion follows");
        cv95.put(KEY_OPC, "If either I or II  follows");
        cv95.put(KEY_OPD, "If neither I nor II  follows");
        cv95.put(KEY_OPE, "If both I and II  follows");
        cv95.put(KEY_CORRECT, "4");

        cv96.put(KEY_ID, 46);
        cv96.put(KEY_QUESTION, "Statements : Many scooters are trucks.All trucks are trains .\nConclusions: \n I. Some scooters are train .\n II. No truck is scooter.");
        cv96.put(KEY_OPA, "If only I conclusion follows");
        cv96.put(KEY_OPB, "If only II conclusion follows");
        cv96.put(KEY_OPC, "If either I or II  follows");
        cv96.put(KEY_OPD, "If neither I nor II  follows");
        cv96.put(KEY_OPE, "If both I and II  follows");
        cv96.put(KEY_CORRECT, "1");

        cv97.put(KEY_ID, 47);
        cv97.put(KEY_QUESTION, "Statements : Most teachers are boys.Some boys are students .\nConclusions: \n I. Some students are boys .\n II.Some teachers are students.");
        cv97.put(KEY_OPA, "If only I conclusion follows");
        cv97.put(KEY_OPB, "If only II conclusion follows");
        cv97.put(KEY_OPC, "If either I or II  follows");
        cv97.put(KEY_OPD, "If neither I nor II  follows");
        cv97.put(KEY_OPE, "If both I and II  follows");
        cv97.put(KEY_CORRECT, "1");

        cv98.put(KEY_ID, 48);
        cv98.put(KEY_QUESTION, "A: All cushions are pillows.\nB: Some pillows are sheets.\nC: Some sheets are cushions.\nD: Some pillows are not cushions.\nE: All pillows are sheets.\nF: No pillows are sheets");
        cv98.put(KEY_OPA, "ABC");
        cv98.put(KEY_OPB, "BCD");
        cv98.put(KEY_OPC, "EAC");
        cv98.put(KEY_OPD, "EDC");
        cv98.put(KEY_OPE, "None of the above");
        cv98.put(KEY_CORRECT, "3");

        cv99.put(KEY_ID, 49);
        cv99.put(KEY_QUESTION, "A: All synopses are poets.\nB: Some synopses are mentors.\nC: Some x are not mentors.\nD: All x are poets.\nE: All synopses are mentors.\nF: All synopses are x.");
        cv99.put(KEY_OPA, "ACB");
        cv99.put(KEY_OPB, "AEC");
        cv99.put(KEY_OPC, "FEC");
        cv99.put(KEY_OPD, "DFA");
        cv99.put(KEY_OPE, "None of the above");
        cv99.put(KEY_CORRECT, "4");

        cv100.put(KEY_ID, 50);
        cv100.put(KEY_QUESTION, "A: All balls are locks.\nB: All keys are locks.\nC: All keys are balls.\nD: Some keys are locks.\nE: Some locks are balls.\nF: No ball is lock.");
        cv100.put(KEY_OPA, "ACD");
        cv100.put(KEY_OPB, "BEF");
        cv100.put(KEY_OPC, "CDE");
        cv100.put(KEY_OPD, "CEF");
        cv100.put(KEY_OPE, "None of the above");
        cv100.put(KEY_CORRECT, "3");

        cv101.put(KEY_ID, 1);
        cv101.put(KEY_QUESTION, "Look at this series: 2, 1, (1/2), (1/4), ... What number should come next?");
        cv101.put(KEY_OPA, "1/3");
        cv101.put(KEY_OPB, "1/8");
        cv101.put(KEY_OPC, "1/4");
        cv101.put(KEY_OPD, "1/16");
        cv101.put(KEY_OPE, "3/4");
        cv101.put(KEY_CORRECT, "2");

        cv102.put(KEY_ID, 2);
        cv102.put(KEY_QUESTION, "Look at this series: 7, 10, 8, 11, 9, 12, ... What number should come next?");
        cv102.put(KEY_OPA, "7");
        cv102.put(KEY_OPB, "10");
        cv102.put(KEY_OPC, "12");
        cv102.put(KEY_OPD, "13");
        cv102.put(KEY_OPE, "8");
        cv102.put(KEY_CORRECT, "2");

        cv103.put(KEY_ID, 3);
        cv103.put(KEY_QUESTION, "Look at this series: 21, 9, 21, 11, 21, 13, 21, ... What number should come next?");
        cv103.put(KEY_OPA, "14");
        cv103.put(KEY_OPB, "15");
        cv103.put(KEY_OPC, "21");
        cv103.put(KEY_OPD, "23");
        cv103.put(KEY_OPE, "25");
        cv103.put(KEY_CORRECT, "2");

        cv104.put(KEY_ID, 4);
        cv104.put(KEY_QUESTION, "Look at this series: 58, 52, 46, 40, 34, ... What number should come next?");
        cv104.put(KEY_OPA, "26");
        cv104.put(KEY_OPB, "30");
        cv104.put(KEY_OPC, "28");
        cv104.put(KEY_OPD, "32");
        cv104.put(KEY_OPE, "24");
        cv104.put(KEY_CORRECT, "3");

        cv105.put(KEY_ID, 5);
        cv105.put(KEY_QUESTION, "Look at this series: 3, 4, 7, 8, 11, 12, ... What number should come next?");
        cv105.put(KEY_OPA, "7");
        cv105.put(KEY_OPB, "10");
        cv105.put(KEY_OPC, "14");
        cv105.put(KEY_OPD, "15");
        cv105.put(KEY_OPE, "16");
        cv105.put(KEY_CORRECT, "4");

        cv106.put(KEY_ID, 6);
        cv106.put(KEY_QUESTION, "Look at this series: 31, 29, 24, 22, 17, ... What number should come next?");
        cv106.put(KEY_OPA, "15");
        cv106.put(KEY_OPB, "14");
        cv106.put(KEY_OPC, "13");
        cv106.put(KEY_OPD, "12");
        cv106.put(KEY_OPE, "11");
        cv106.put(KEY_CORRECT, "1");

        cv107.put(KEY_ID, 7);
        cv107.put(KEY_QUESTION, "Look at this series: 1.5, 2.3, 3.1, 3.9, ... What number should come next?");
        cv107.put(KEY_OPA, "4.2");
        cv107.put(KEY_OPB, "4.4");
        cv107.put(KEY_OPC, "4.7");
        cv107.put(KEY_OPD, "4.9");
        cv107.put(KEY_OPE, "5.1");
        cv107.put(KEY_CORRECT, "3");

        cv108.put(KEY_ID, 8);
        cv108.put(KEY_QUESTION, "Look at this series: 201, 202, 204, 207, ... What number should come next?");
        cv108.put(KEY_OPA, "205");
        cv108.put(KEY_OPB, "208");
        cv108.put(KEY_OPC, "210");
        cv108.put(KEY_OPD, "211");
        cv108.put(KEY_OPE, "212");
        cv108.put(KEY_CORRECT, "4");

        cv109.put(KEY_ID, 9);
        cv109.put(KEY_QUESTION, "Look at this series: 544, 509, 474, 439, ... What number should come next?");
        cv109.put(KEY_OPA, "404");
        cv109.put(KEY_OPB, "414");
        cv109.put(KEY_OPC, "420");
        cv109.put(KEY_OPD, "445");
        cv109.put(KEY_OPE, "456");
        cv109.put(KEY_CORRECT, "3");

        cv110.put(KEY_ID, 10);
        cv110.put(KEY_QUESTION, "Look at this series: 5.2, 4.8, 4.4, 4, ... What number should come next?");
        cv110.put(KEY_OPA, "3.6");
        cv110.put(KEY_OPB, "3.7");
        cv110.put(KEY_OPC, "3.8");
        cv110.put(KEY_OPD, "3.2");
        cv110.put(KEY_OPE, "3.5");
        cv110.put(KEY_CORRECT, "1");

        cv111.put(KEY_ID, 11);
        cv111.put(KEY_QUESTION, "Look at this series: 80, 10, 70, 15, 60, ... What number should come next?");
        cv111.put(KEY_OPA, "20");
        cv111.put(KEY_OPB, "25");
        cv111.put(KEY_OPC, "30");
        cv111.put(KEY_OPD, "40");
        cv111.put(KEY_OPE, "50");
        cv111.put(KEY_CORRECT, "1");

        cv112.put(KEY_ID, 12);
        cv112.put(KEY_QUESTION, "Look at this series: 8, 6, 9, 23, 87 , ... What number should come next?");
        cv112.put(KEY_OPA, "128");
        cv112.put(KEY_OPB, "224");
        cv112.put(KEY_OPC, "300");
        cv112.put(KEY_OPD, "429");
        cv112.put(KEY_OPE, "None of these");
        cv112.put(KEY_CORRECT, "4");

        cv113.put(KEY_ID, 13);
        cv113.put(KEY_QUESTION, "28 25 5 21 18 5 14 next 2 ?");
        cv113.put(KEY_OPA, "11 5");
        cv113.put(KEY_OPB, "11 7");
        cv113.put(KEY_OPC, "10 8");
        cv113.put(KEY_OPD, "5 10");
        cv113.put(KEY_OPE, "10 5");
        cv113.put(KEY_CORRECT, "1");

        cv114.put(KEY_ID, 14);
        cv114.put(KEY_QUESTION, "8 11 21 15 18 21 22 next 2?");
        cv114.put(KEY_OPA, "25 18");
        cv114.put(KEY_OPB, "25 21");
        cv114.put(KEY_OPC, "25 19");
        cv114.put(KEY_OPD, "24 21");
        cv114.put(KEY_OPE, "22 21");
        cv114.put(KEY_CORRECT, "2");

        cv115.put(KEY_ID, 15);
        cv115.put(KEY_QUESTION, "2 8 14 20 26 32 38 next 2?");
        cv115.put(KEY_OPA, "2 46");
        cv115.put(KEY_OPB, "44 50");
        cv115.put(KEY_OPC, "42 58");
        cv115.put(KEY_OPD, "40 42");
        cv115.put(KEY_OPE, "32 26");
        cv115.put(KEY_CORRECT, "2");

        cv116.put(KEY_ID, 16);
        cv116.put(KEY_QUESTION, "9 11 33 13 15 33 17 next 2?");
        cv116.put(KEY_OPA, "33 35");
        cv116.put(KEY_OPB, "33 19");
        cv116.put(KEY_OPC, "15 33");
        cv116.put(KEY_OPD, "19 21");
        cv116.put(KEY_OPE, "19 33");
        cv116.put(KEY_CORRECT, "5");

        cv117.put(KEY_ID, 17);
        cv117.put(KEY_QUESTION, "2 3 4 5 6 4 8 next 2?");
        cv117.put(KEY_OPA, "9 10");
        cv117.put(KEY_OPB, "4 8");
        cv117.put(KEY_OPC, "10 4");
        cv117.put(KEY_OPD, "9 4");
        cv117.put(KEY_OPE, "8 9");
        cv117.put(KEY_CORRECT, "4");

        cv118.put(KEY_ID, 18);
        cv118.put(KEY_QUESTION, "17 17 34 20 20 31 23 next 2?");
        cv118.put(KEY_OPA, "26 23");
        cv118.put(KEY_OPB, "34 20");
        cv118.put(KEY_OPC, "23 33");
        cv118.put(KEY_OPD, "27 28");
        cv118.put(KEY_OPE, "23 28");
        cv118.put(KEY_CORRECT, "5");

        cv119.put(KEY_ID, 19);
        cv119.put(KEY_QUESTION, "21 25 18 29 33 18 next 2?");
        cv119.put(KEY_OPA, "43 18");
        cv119.put(KEY_OPB, "41 44");
        cv119.put(KEY_OPC, "37 18");
        cv119.put(KEY_OPD, "37 41");
        cv119.put(KEY_OPE, "38 41");
        cv119.put(KEY_CORRECT, "4");

        cv120.put(KEY_ID, 20);
        cv120.put(KEY_QUESTION, "11 16 21 26 31 36 41 next 2?");
        cv120.put(KEY_OPA, "47 52");
        cv120.put(KEY_OPB, "46 52");
        cv120.put(KEY_OPC, "45 49");
        cv120.put(KEY_OPD, "46 51");
        cv120.put(KEY_OPE, "19 33");
        cv120.put(KEY_CORRECT, "4");

        cv121.put(KEY_ID, 21);
        cv121.put(KEY_QUESTION, "84 78 72 66 60 54 48 next 2?");
        cv121.put(KEY_OPA, "44 34");
        cv121.put(KEY_OPB, "42 36");
        cv121.put(KEY_OPC, "42 32");
        cv121.put(KEY_OPD, "40 34");
        cv121.put(KEY_OPE, "38 32");
        cv121.put(KEY_CORRECT, "2");

        cv122.put(KEY_ID, 22);
        cv122.put(KEY_QUESTION, "61 57 50 61 43 36 61 next 2?");
        cv122.put(KEY_OPA, "29 61");
        cv122.put(KEY_OPB, "31 61");
        cv122.put(KEY_OPC, "27 20");
        cv122.put(KEY_OPD, "22 15");
        cv122.put(KEY_OPE, "29 22");
        cv122.put(KEY_CORRECT, "5");

        cv123.put(KEY_ID, 23);
        cv123.put(KEY_QUESTION, "9 12 11 14 13 16 15 next 2?");
        cv123.put(KEY_OPA, "14 13");
        cv123.put(KEY_OPB, "18 21");
        cv123.put(KEY_OPC, "14 17");
        cv123.put(KEY_OPD, "12 21");
        cv123.put(KEY_OPE, "18 17");
        cv123.put(KEY_CORRECT, "5");


        cv124.put(KEY_ID, 24);
        cv124.put(KEY_QUESTION, "40 40 31 31 22 22 13 next 2?");
        cv124.put(KEY_OPA, "13 4");
        cv124.put(KEY_OPB, "13 5");
        cv124.put(KEY_OPC, "4 13");
        cv124.put(KEY_OPD, "4 4");
        cv124.put(KEY_OPE, "9 4");
        cv124.put(KEY_CORRECT, "1");

        cv125.put(KEY_ID, 25);
        cv125.put(KEY_QUESTION, "10 20 25 35 40 50 55 next 2?");
        cv125.put(KEY_OPA, "70 65");
        cv125.put(KEY_OPB, "60 70");
        cv125.put(KEY_OPC, "60 75");
        cv125.put(KEY_OPD, "60 65");
        cv125.put(KEY_OPE, "65 70");
        cv125.put(KEY_CORRECT, "5");

        cv126.put(KEY_ID, 26);
        cv126.put(KEY_QUESTION, "42 40 38 35 33 31 28 next 2?");
        cv126.put(KEY_OPA, "25 22");
        cv126.put(KEY_OPB, "26 23");
        cv126.put(KEY_OPC, "26 24");
        cv126.put(KEY_OPD, "25 23");
        cv126.put(KEY_OPE, "26 22");
        cv126.put(KEY_CORRECT, "3");

        cv127.put(KEY_ID, 27);
        cv127.put(KEY_QUESTION, "6 10 14 18 22 26 30 next 2?");
        cv127.put(KEY_OPA, "36 40");
        cv127.put(KEY_OPB, "33 37");
        cv127.put(KEY_OPC, "32 36");
        cv127.put(KEY_OPD, "34 37");
        cv127.put(KEY_OPE, "34 38");
        cv127.put(KEY_CORRECT, "5");

        cv128.put(KEY_ID, 28);
        cv128.put(KEY_QUESTION, "3 5 35 10 12 35 17 next 2?");
        cv128.put(KEY_OPA, "22 35");
        cv128.put(KEY_OPB, "35 19");
        cv128.put(KEY_OPC, "19 35");
        cv128.put(KEY_OPD, "19 24");
        cv128.put(KEY_OPE, "22 24");
        cv128.put(KEY_CORRECT, "3");

        cv129.put(KEY_ID, 29);
        cv129.put(KEY_QUESTION, "36 31 29 24 22 17 15 next 2?");
        cv129.put(KEY_OPA, "13 11");
        cv129.put(KEY_OPB, "10 5");
        cv129.put(KEY_OPC, "13 5");
        cv129.put(KEY_OPD, "11 10");
        cv129.put(KEY_OPE, "10 8");
        cv129.put(KEY_CORRECT, "5");

        cv130.put(KEY_ID, 30);
        cv130.put(KEY_QUESTION, "13 29 15 26 17 23 19 next 2?");
        cv130.put(KEY_OPA, "21 23");
        cv130.put(KEY_OPB, "20 21");
        cv130.put(KEY_OPC, "20 17");
        cv130.put(KEY_OPD, "21 23");
        cv130.put(KEY_OPE, "23 17");
        cv130.put(KEY_CORRECT, "2");

        cv131.put(KEY_ID, 31);
        cv131.put(KEY_QUESTION, "34 30 26 22 18 14 10 next 2?");
        cv131.put(KEY_OPA, "8 6");
        cv131.put(KEY_OPB, "6 4");
        cv131.put(KEY_OPC, "14 18");
        cv131.put(KEY_OPD, "6 2");
        cv131.put(KEY_OPE, "4 0");
        cv131.put(KEY_CORRECT, "4");

        cv132.put(KEY_ID, 32);
        cv132.put(KEY_QUESTION, "32 31 32 29 32 27 32 next 2?");
        cv132.put(KEY_OPA, "25 32");
        cv132.put(KEY_OPB, "31 32");
        cv132.put(KEY_OPC, "29 30");
        cv132.put(KEY_OPD, "30 32");
        cv132.put(KEY_OPE, "25 28");
        cv132.put(KEY_CORRECT, "1");

        cv133.put(KEY_ID, 33);
        cv133.put(KEY_QUESTION, "44 41 38 35 32 29 26 next 2?");
        cv133.put(KEY_OPA, "24 21");
        cv133.put(KEY_OPB, "22 19");
        cv133.put(KEY_OPC, "23 19");
        cv133.put(KEY_OPD, "29 32");
        cv133.put(KEY_OPE, "23 20");
        cv133.put(KEY_CORRECT, "5");

        cv134.put(KEY_ID, 34);
        cv134.put(KEY_QUESTION, "7 9 66 12 14 66 17 next 2?");
        cv134.put(KEY_OPA, "19 66");
        cv134.put(KEY_OPB, "66 19");
        cv134.put(KEY_OPC, "19 22");
        cv134.put(KEY_OPD, "20 26");
        cv134.put(KEY_OPE, "66 20");
        cv134.put(KEY_CORRECT, "1");

        cv135.put(KEY_ID, 35);
        cv135.put(KEY_QUESTION, "3 8 10 15 17 22 24 next 2?");
        cv135.put(KEY_OPA, "26 28");
        cv135.put(KEY_OPB, "29 34");
        cv135.put(KEY_OPC, "29 31");
        cv135.put(KEY_OPD, "26 32");
        cv135.put(KEY_OPE, "26 31");
        cv135.put(KEY_CORRECT, "3");

        cv136.put(KEY_ID, 36);
        cv136.put(KEY_QUESTION, "32 29 26 23 20 17 14 next 2?");
        cv136.put(KEY_OPA, "11 8");
        cv136.put(KEY_OPB, "11 7");
        cv136.put(KEY_OPC, "10 9");
        cv136.put(KEY_OPD, "12 8");
        cv136.put(KEY_OPE, "9 11");
        cv136.put(KEY_CORRECT, "1");

        cv137.put(KEY_ID, 37);
        cv137.put(KEY_QUESTION, "16 26 56 36 46 68 56 next 2?");
        cv137.put(KEY_OPA, "80 66");
        cv137.put(KEY_OPB, "64 82");
        cv137.put(KEY_OPC, "66 80");
        cv137.put(KEY_OPD, "66 82");
        cv137.put(KEY_OPE, "80 82");
        cv137.put(KEY_CORRECT, "3");

        cv138.put(KEY_ID, 38);
        cv138.put(KEY_QUESTION, "2 44 4 41 6 38 8 next 2?");
        cv138.put(KEY_OPA, "10 12");
        cv138.put(KEY_OPB, "35 32");
        cv138.put(KEY_OPC, "34 9");
        cv138.put(KEY_OPD, "35 10");
        cv138.put(KEY_OPE, "10 34");
        cv138.put(KEY_CORRECT, "4");

        cv139.put(KEY_ID, 39);
        cv139.put(KEY_QUESTION, "17 14 14 11 11 8 8 next 2?");
        cv139.put(KEY_OPA, "8 5");
        cv139.put(KEY_OPB, "5 2");
        cv139.put(KEY_OPC, "5 5");
        cv139.put(KEY_OPD, "8 2");
        cv139.put(KEY_OPE, "5 8");
        cv139.put(KEY_CORRECT, "3");

        cv140.put(KEY_ID, 40);
        cv140.put(KEY_QUESTION, "11 14 14 17 17 20 20 next 2?");
        cv140.put(KEY_OPA, "23 23");
        cv140.put(KEY_OPB, "23 26");
        cv140.put(KEY_OPC, "21 24");
        cv140.put(KEY_OPD, "24 24");
        cv140.put(KEY_OPE, "24 27");
        cv140.put(KEY_CORRECT, "1");

        cv141.put(KEY_ID, 41);
        cv141.put(KEY_QUESTION, "Look at this series: F2, __, D8, C16, B32, ... What number should fill the blank?");
        cv141.put(KEY_OPA, "A16");
        cv141.put(KEY_OPB, "G4");
        cv141.put(KEY_OPC, "E4");
        cv141.put(KEY_OPD, "E3");
        cv141.put(KEY_OPE, "E2");
        cv141.put(KEY_CORRECT, "3");

        cv142.put(KEY_ID, 42);
        cv142.put(KEY_QUESTION, "Look at this series: V, VIII, XI, XIV, __, XX, ... What number should fill the blank?");
        cv142.put(KEY_OPA, "IX");
        cv142.put(KEY_OPB, "XXIII");
        cv142.put(KEY_OPC, "XV");
        cv142.put(KEY_OPD, "XVIII");
        cv142.put(KEY_OPE, "XX");
        cv142.put(KEY_CORRECT, "4");


        cv143.put(KEY_ID, 43);
        cv143.put(KEY_QUESTION, "Look at this series: 70, 71, 76, __, 81, 86, 70, 91, ... What number should fill the blank?");
        cv143.put(KEY_OPA, "8");
        cv143.put(KEY_OPB, "14");
        cv143.put(KEY_OPC, "43");
        cv143.put(KEY_OPD, "44");
        cv143.put(KEY_OPE, "46");
        cv143.put(KEY_CORRECT, "2");


        cv144.put(KEY_ID, 44);
        cv144.put(KEY_QUESTION, "Look at this series: VI, 10, V, 11, __, 12, III, ... What number should fill the blank?");
        cv144.put(KEY_OPA, "II");
        cv144.put(KEY_OPB, "IV");
        cv144.put(KEY_OPC, "IX");
        cv144.put(KEY_OPD, "11");
        cv144.put(KEY_OPE, "14");
        cv144.put(KEY_CORRECT, "2");


        cv145.put(KEY_ID, 45);
        cv145.put(KEY_QUESTION, "Look at this series: 83, 73, 93, 63, __, 93, 43, ... What number should fill the blank?");
        cv145.put(KEY_OPA, "13");
        cv145.put(KEY_OPB, "33");
        cv145.put(KEY_OPC, "53");
        cv145.put(KEY_OPD, "73");
        cv145.put(KEY_OPE, "93");
        cv145.put(KEY_CORRECT, "4");


        cv146.put(KEY_ID, 46);
        cv146.put(KEY_QUESTION, "Look at this series: V, VIII, XI, XIV, __, XX, ... What number should fill the blank?");
        cv146.put(KEY_OPA, "IX");
        cv146.put(KEY_OPB, "XXIII");
        cv146.put(KEY_OPC, "XV");
        cv146.put(KEY_OPD, "XVIII");
        cv146.put(KEY_OPE, "XX");
        cv146.put(KEY_CORRECT, "4");


        cv147.put(KEY_ID, 47);
        cv147.put(KEY_QUESTION, "Look at this series: V, VIII, XI, XIV, __, XX, ... What number should fill the blank?");
        cv147.put(KEY_OPA, "IX");
        cv147.put(KEY_OPB, "XXIII");
        cv147.put(KEY_OPC, "XV");
        cv147.put(KEY_OPD, "XVIII");
        cv147.put(KEY_OPE, "XX");
        cv147.put(KEY_CORRECT, "3");


        cv148.put(KEY_ID, 48);
        cv148.put(KEY_QUESTION, "Look at this series: 72, 76, 73, 77, 74, __, 75, ... What number should fill the blank?");
        cv148.put(KEY_OPA, "70");
        cv148.put(KEY_OPB, "71");
        cv148.put(KEY_OPC, "75");
        cv148.put(KEY_OPD, "78");
        cv148.put(KEY_OPE, "80");
        cv148.put(KEY_CORRECT, "4");


        cv149.put(KEY_ID, 49);
        cv149.put(KEY_QUESTION, "Look at this series: J14, L16, __, P20, R22, ... What number should fill the blank?");
        cv149.put(KEY_OPA, "S24");
        cv149.put(KEY_OPB, "N18");
        cv149.put(KEY_OPC, "M18");
        cv149.put(KEY_OPD, "T18");
        cv149.put(KEY_OPE, "T24");
        cv149.put(KEY_CORRECT, "2");


        cv150.put(KEY_ID, 50);
        cv150.put(KEY_QUESTION, "Look at this series: XXIV, XX, __, XII, VIII, ... What number should fill the blank?");
        cv150.put(KEY_OPA, "XXII");
        cv150.put(KEY_OPB, "XIII");
        cv150.put(KEY_OPC, "XVI");
        cv150.put(KEY_OPD, "IV");
        cv150.put(KEY_OPE, "XX");
        cv150.put(KEY_CORRECT, "3");


        cv201.put(KEY_ID, 1);
        cv201.put(KEY_QUESTION, "Pointing to a photograph of a boy Suresh said, 'He is the son of the only son of my mother.' How is Suresh related to that boy?");
        cv201.put(KEY_OPA, "brother");
        cv201.put(KEY_OPB, "uncle");
        cv201.put(KEY_OPC, "cousin");
        cv201.put(KEY_OPD, "father");
        cv201.put(KEY_OPE, "father-in-law");
        cv201.put(KEY_CORRECT, "4");

        cv202.put(KEY_ID, 2);
        cv202.put(KEY_QUESTION, "If A + B means A is the mother of B; A - B means A is the brother B; A % B means A is the father of B and A x B means A is the sister of B, which of the following shows that P is the maternal uncle of Q?");
        cv202.put(KEY_OPA, "Q - N + M x P");
        cv202.put(KEY_OPB, "P + S x N - Q");
        cv202.put(KEY_OPC, "P - M + N x Q");
        cv202.put(KEY_OPD, "Q - S % P");
        cv202.put(KEY_OPE, "none of these");
        cv202.put(KEY_CORRECT, "3");

        cv203.put(KEY_ID, 3);
        cv203.put(KEY_QUESTION, "If A is the brother of B; B is the sister of C; and C is the father of D, how D is related to A?");
        cv203.put(KEY_OPA, "brother");
        cv203.put(KEY_OPB, "sister");
        cv203.put(KEY_OPC, "nephew");
        cv203.put(KEY_OPD, "mother");
        cv203.put(KEY_OPE, "cannot be determined");
        cv203.put(KEY_CORRECT, "5");

        cv204.put(KEY_ID, 4);
        cv204.put(KEY_QUESTION, "If A + B means A is the brother of B; A - B means A is the sister of B and A x B means A is the father of B. Which of the following means that C is the son of M?");
        cv204.put(KEY_OPA, "M - N x C + F");
        cv204.put(KEY_OPB, "F - C + N x M");
        cv204.put(KEY_OPC, "N + M - F x C");
        cv204.put(KEY_OPD, "M x N - C + F");
        cv204.put(KEY_OPE, "cannot be determined");
        cv204.put(KEY_CORRECT, "4");

        cv205.put(KEY_ID, 5);
        cv205.put(KEY_QUESTION, "Introducing a boy, a girl said, 'He is the son of the daughter of the father of my uncle.' How is the boy related to the girl?");
        cv205.put(KEY_OPA, "brother");
        cv205.put(KEY_OPB, "nephew");
        cv205.put(KEY_OPC, "uncle");
        cv205.put(KEY_OPD, "son-in-law");
        cv205.put(KEY_OPE, "cannot be determined");
        cv205.put(KEY_CORRECT, "1");

        cv206.put(KEY_ID, 6);
        cv206.put(KEY_QUESTION, "Pointing to a photograph Lata says, 'He is the son of the only son of my grandfather.' How is the man in the photograph related to Lata?");
        cv206.put(KEY_OPA, "brother");
        cv206.put(KEY_OPB, "cousin");
        cv206.put(KEY_OPC, "uncle");
        cv206.put(KEY_OPD, "son-in-law");
        cv206.put(KEY_OPE, "cannot be determined");
        cv206.put(KEY_CORRECT, "1");

        cv207.put(KEY_ID, 7);
        cv207.put(KEY_QUESTION, "If A + B means A is the brother of B; A x B means A is the son of B; and A % B means B is the daughter of A then which of the following means M is the maternal uncle of N?");
        cv207.put(KEY_OPA, "M + O x N");
        cv207.put(KEY_OPB, "M % O x N + P");
        cv207.put(KEY_OPC, "M + O % N");
        cv207.put(KEY_OPD, "none of these");
        cv207.put(KEY_OPE, "cannot be determined");
        cv207.put(KEY_CORRECT, "4");

        cv208.put(KEY_ID, 8);
        cv208.put(KEY_QUESTION, "If D is the brother of B, how B is related to C? To answer this question which of the statements is/are necessary?\n1. The son of D is the grandson of C.\n2. B is the sister of D.");
        cv208.put(KEY_OPA, "only 1");
        cv208.put(KEY_OPB, "only 2");
        cv208.put(KEY_OPC, "either 1 or 2");
        cv208.put(KEY_OPD, "both 1 and 2");
        cv208.put(KEY_OPE, "cannot be determined");
        cv208.put(KEY_CORRECT, "4");

        cv209.put(KEY_ID, 9);
        cv209.put(KEY_QUESTION, "If A + B means A is the father of B; A - B means A is the brother B; A % B means A is the wife of B and A x B means A is the mother of B, which of the following shows that M is the maternal grandmother of T?");
        cv209.put(KEY_OPA, "M x N % S + T");
        cv209.put(KEY_OPB, "M x N - S % T");
        cv209.put(KEY_OPC, "M x S - N % T");
        cv209.put(KEY_OPD, "M x N x S % T");
        cv209.put(KEY_OPE, "cannot be determined");
        cv209.put(KEY_CORRECT, "1");

        cv210.put(KEY_ID, 10);
        cv210.put(KEY_QUESTION, "Pointing to a photograph. Bajpai said, 'He is the son of the only daughter of the father of my brother.' How Bajpai is related to the man in the photograph?");
        cv210.put(KEY_OPA, "nephew");
        cv210.put(KEY_OPB, "brother");
        cv210.put(KEY_OPC, "father");
        cv210.put(KEY_OPD, "maternal uncle");
        cv210.put(KEY_OPE, "cannot be determined");
        cv210.put(KEY_CORRECT, "4");

        cv211.put(KEY_ID, 11);
        cv211.put(KEY_QUESTION, "Deepak said to Nitin, 'That boy playing with the football is the younger of the two brothers of the daughter of my father's wife.' How is the boy playing football related to Deepak?");
        cv211.put(KEY_OPA, "son");
        cv211.put(KEY_OPB, "brother");
        cv211.put(KEY_OPC, "cousin");
        cv211.put(KEY_OPD, "bother-in-law");
        cv211.put(KEY_OPE, "cannot be determined");
        cv211.put(KEY_CORRECT, "2");

        cv212.put(KEY_ID, 12);
        cv212.put(KEY_QUESTION, "Pointing a photograph X said to his friend Y, 'She is the only daughter of the father of my mother.' How X is related to the person of photograph?");
        cv212.put(KEY_OPA, "son");
        cv212.put(KEY_OPB, "brother");
        cv212.put(KEY_OPC, "daughter");
        cv212.put(KEY_OPD, "nephew");
        cv212.put(KEY_OPE, "cannot be determined");
        cv212.put(KEY_CORRECT, "1");

        cv213.put(KEY_ID, 13);
        cv213.put(KEY_QUESTION, "Veena who is the sister-in-law of AshoKEY_ID,is the daughter-in-law of Kalyani. Dheeraj is the father of Sudeep who is the only brother of Ashok. How Kalyani is related to Ashok?");
        cv213.put(KEY_OPA, "mother-in-law");
        cv213.put(KEY_OPB, "aunt");
        cv213.put(KEY_OPC, "wife");
        cv213.put(KEY_OPD, "none of these");
        cv213.put(KEY_OPE, "cannot be determined");
        cv213.put(KEY_CORRECT, "4");

        cv214.put(KEY_ID, 14);
        cv214.put(KEY_QUESTION, "Pointing to a woman, Abhijit said, 'Her granddaughter is the only daughter of my brother.' How is the woman related to Abhijit?");
        cv214.put(KEY_OPA, "mother-in-law");
        cv214.put(KEY_OPB, "aunt");
        cv214.put(KEY_OPC, "mother");
        cv214.put(KEY_OPD, "none of these");
        cv214.put(KEY_OPE, "cannot be determined");
        cv214.put(KEY_CORRECT, "3");

        cv215.put(KEY_ID, 15);
        cv215.put(KEY_QUESTION, "If A + B means A is the sister of B; A x B means A is the wife of B, A % B means A is the father of B and A - B means A is the brother of B. Which of the following means T is the daughter of P?");
        cv215.put(KEY_OPA, "P x Q % R + S - T");
        cv215.put(KEY_OPB, "P x Q % R - T + S");
        cv215.put(KEY_OPC, "P x Q % R + T - S");
        cv215.put(KEY_OPD, "P x Q % R + S + T");
        cv215.put(KEY_OPE, "cannot be determined");
        cv215.put(KEY_CORRECT, "2");

        cv216.put(KEY_ID, 16);
        cv216.put(KEY_QUESTION, "Amit said - 'This girl is the wife of the grandson of my mother.' How is Amit related to the girl?");
        cv216.put(KEY_OPA, "brother");
        cv216.put(KEY_OPB, "grandfather");
        cv216.put(KEY_OPC, "husband");
        cv216.put(KEY_OPD, "father in law");
        cv216.put(KEY_OPE, "cannot be determined");
        cv216.put(KEY_CORRECT, "4");

        cv217.put(KEY_ID, 17);
        cv217.put(KEY_QUESTION, "A and B are children of D. Who is the father of A? To answer this question which of the statements (1) and (2) is necessary?\n1. C is the brother of A and the son of E.\n2. F is the mother B.");
        cv217.put(KEY_OPA, "only 1");
        cv217.put(KEY_OPB, "only 2");
        cv217.put(KEY_OPC, "either 1 or 2");
        cv217.put(KEY_OPD, "Both 1 and 2");
        cv217.put(KEY_OPE, "none of these");
        cv217.put(KEY_CORRECT, "2");

        cv218.put(KEY_ID, 18);
        cv218.put(KEY_QUESTION, "Pointing towards a man, a woman said, 'His mother is the only daughter of my mother.' How is the woman related to the man?");
        cv218.put(KEY_OPA, "mother");
        cv218.put(KEY_OPB, "grandmother");
        cv218.put(KEY_OPC, "sister");
        cv218.put(KEY_OPD, "daughter");
        cv218.put(KEY_OPE, "None of these");
        cv218.put(KEY_CORRECT, "1");

        cv219.put(KEY_ID, 19);
        cv219.put(KEY_QUESTION, "If P $ Q means P is the brother of Q; P # Q means P is the mother of Q; P * Q means P is the daughter of Q in A # B $ C * D, who is the father?");
        cv219.put(KEY_OPA, "D");
        cv219.put(KEY_OPB, "B");
        cv219.put(KEY_OPC, "C");
        cv219.put(KEY_OPD, "data inadequate");
        cv219.put(KEY_OPE, "none of these");
        cv219.put(KEY_CORRECT, "1");

        cv220.put(KEY_ID, 20);
        cv220.put(KEY_QUESTION, "Introducing Sonia, Aamir says, 'She is the wife of only nephew of only brother of my mother.' How Sonia is related to Aamir?");
        cv220.put(KEY_OPA, "wife");
        cv220.put(KEY_OPB, "sister");
        cv220.put(KEY_OPC, "sister-in-law");
        cv220.put(KEY_OPD, "data inadequate");
        cv220.put(KEY_OPE, "none of these");
        cv220.put(KEY_CORRECT, "1");

        cv221.put(KEY_ID, 21);
        cv221.put(KEY_QUESTION, "If A + B means A is the brother of B; A % B means A is the father of B and A x B means A is the sister of B. Which of the following means M is the uncle of P?");
        cv221.put(KEY_OPA, "M % N x P");
        cv221.put(KEY_OPB, "N x P % M");
        cv221.put(KEY_OPC, "M + S % R % P");
        cv221.put(KEY_OPD, "M + K % T x P");
        cv221.put(KEY_OPE, "none of these");
        cv221.put(KEY_CORRECT, "4");

        cv222.put(KEY_ID, 22);
        cv222.put(KEY_QUESTION, "Pointing to Varman, Madhav said, 'I am the only son of one of the sons of his father.' How is Varman related to Madhav?");
        cv222.put(KEY_OPA, "nephew");
        cv222.put(KEY_OPB, "uncle");
        cv222.put(KEY_OPC, "father or uncle");
        cv222.put(KEY_OPD, "father");
        cv222.put(KEY_OPE, "none of these");
        cv222.put(KEY_CORRECT, "3");

        cv223.put(KEY_ID, 23);
        cv223.put(KEY_QUESTION, "Introducing a woman, Shashank said, 'She is the mother of the only daughter of my son.' How that woman is related to Shashank?");
        cv223.put(KEY_OPA, "daughter");
        cv223.put(KEY_OPB, "sister");
        cv223.put(KEY_OPC, "wife");
        cv223.put(KEY_OPD, "daughter-in-law");
        cv223.put(KEY_OPE, "none of these");
        cv223.put(KEY_CORRECT, "4");

        cv224.put(KEY_ID, 24);
        cv224.put(KEY_QUESTION, "if A + B means B is the brother of A; A x B means B is the husband of A; A - B means A is the mother of B and A % B means A is the father of B, which of the following relations shows that Q is the grandmother of T?");
        cv224.put(KEY_OPA, "Q - P + R % T");
        cv224.put(KEY_OPB, "P x Q % R - T");
        cv224.put(KEY_OPC, "P x Q % R + T");
        cv224.put(KEY_OPD, "P + Q % R - T");
        cv224.put(KEY_OPE, "none of these");
        cv224.put(KEY_CORRECT, "1");

        cv225.put(KEY_ID, 25);
        cv225.put(KEY_QUESTION, "1. A3P means A is the mother of P\n2. A4P means A is the brother of P\n3. A9P means A is the husband of P\n4. A5P means A is the daughter of P\nWhich of the following means that K is the mother-in-law of M?");
        cv225.put(KEY_OPA, "M9N3K4J");
        cv225.put(KEY_OPB, "M9N5K3J");
        cv225.put(KEY_OPC, "K5J9M3N");
        cv225.put(KEY_OPD, "K3J9N4M");
        cv225.put(KEY_OPE, "none of these");
        cv225.put(KEY_CORRECT, "2");

        cv226.put(KEY_ID, 26);
        cv226.put(KEY_QUESTION, "Pointing to a photograph Anjali said, 'He is the son of the only son of my grandfather.' How is the man in the photograph related to Anjali?");
        cv226.put(KEY_OPA, "brother");
        cv226.put(KEY_OPB, "uncle");
        cv226.put(KEY_OPC, "son");
        cv226.put(KEY_OPD, "daughter-in-law");
        cv226.put(KEY_OPE, "none of these");
        cv226.put(KEY_CORRECT, "1");

        cv227.put(KEY_ID, 27);
        cv227.put(KEY_QUESTION, "Pointing to a person, Deepak said, 'His only brother is the father of my daughter's father.' How is the person related to Deepak?");
        cv227.put(KEY_OPA, "brother");
        cv227.put(KEY_OPB, "uncle");
        cv227.put(KEY_OPC, "son");
        cv227.put(KEY_OPD, "daughter-in-law");
        cv227.put(KEY_OPE, "none of these");
        cv227.put(KEY_CORRECT, "2");

        cv228.put(KEY_ID, 28);
        cv228.put(KEY_QUESTION, "P is the mother of K; K is the sister of D; D is the father of J. How is P related to J?");
        cv228.put(KEY_OPA, "mother");
        cv228.put(KEY_OPB, "grandmother");
        cv228.put(KEY_OPC, "aunt");
        cv228.put(KEY_OPD, "daughter-in-law");
        cv228.put(KEY_OPE, "none of these");
        cv228.put(KEY_CORRECT, "2");

        cv229.put(KEY_ID, 29);
        cv229.put(KEY_QUESTION, "If P $ Q means P is the father of Q; P # Q means P is the mother of Q and P * Q means P is the sister of Q, then N # L $ P * Q shows which of the relation of Q to N?");
        cv229.put(KEY_OPA, "grandson");
        cv229.put(KEY_OPB, "granddaughter");
        cv229.put(KEY_OPC, "nephew");
        cv229.put(KEY_OPD, "data inadequate");
        cv229.put(KEY_OPE, "none of these");
        cv229.put(KEY_CORRECT, "4");

        cv230.put(KEY_ID, 30);
        cv230.put(KEY_QUESTION, "If A $ B means A is the brother of B; A @ B means A is the wife of B; A # B means A is the daughter of B and A * B means A is the father of B, which of the following indicates that U is the father-in-law of P?");
        cv230.put(KEY_OPA, "P @ Q $ T # U * W");
        cv230.put(KEY_OPB, "P @ W $ Q * T # U");
        cv230.put(KEY_OPC, "P @ Q $ W * T # U");
        cv230.put(KEY_OPD, "P @ Q $ T # W * U");
        cv230.put(KEY_OPE, "none of these");
        cv230.put(KEY_CORRECT, "1");

        cv231.put(KEY_ID, 31);
        cv231.put(KEY_QUESTION, "Introducing a man, a woman said, 'He is the only son of the mother of my mother.' How is the woman related to the man?");
        cv231.put(KEY_OPA, "mother");
        cv231.put(KEY_OPB, "sister");
        cv231.put(KEY_OPC, "maternal aunt");
        cv231.put(KEY_OPD, "niece");
        cv231.put(KEY_OPE, "none of these");
        cv231.put(KEY_CORRECT, "4");

        cv232.put(KEY_ID, 32);
        cv232.put(KEY_QUESTION, "Pointing to Gopi, Nalni says, 'I am the daughter of the only son of his grandfather.' How Nalni is related to Gopi?");
        cv232.put(KEY_OPA, "mother");
        cv232.put(KEY_OPB, "sister");
        cv232.put(KEY_OPC, "maternal aunt");
        cv232.put(KEY_OPD, "niece");
        cv232.put(KEY_OPE, "none of these");
        cv232.put(KEY_CORRECT, "2");

        cv233.put(KEY_ID, 33);
        cv233.put(KEY_QUESTION, "A's son B is married with C whose sister D is married to E the brother of B. How D is related to A?");
        cv233.put(KEY_OPA, "mother");
        cv233.put(KEY_OPB, "sister");
        cv233.put(KEY_OPC, "daughter-in-law");
        cv233.put(KEY_OPD, "niece");
        cv233.put(KEY_OPE, "none of these");
        cv233.put(KEY_CORRECT, "3");

        cv234.put(KEY_ID, 34);
        cv234.put(KEY_QUESTION, "Pointing to a lady a person said, 'The son of her only brother is the brother of my wife.' How is the lady related to the person?");
        cv234.put(KEY_OPA, "mother");
        cv234.put(KEY_OPB, "sister");
        cv234.put(KEY_OPC, "sister of father-in-law");
        cv234.put(KEY_OPD, "niece");
        cv234.put(KEY_OPE, "none of these");
        cv234.put(KEY_CORRECT, "3");

        cv235.put(KEY_ID, 35);
        cv235.put(KEY_QUESTION, "1. B5D means B is the father of D.\n2. B9D means B is the sister of D.\n3. B4D means B is the brother of D.\n4. B3D means B is the wife of D.\nWhich of the following means F is the mother of K?");
        cv235.put(KEY_OPA, "F3M5K");
        cv235.put(KEY_OPB, "F5M3K");
        cv235.put(KEY_OPC, "F9M4N3K");
        cv235.put(KEY_OPD, "F3M5N3K");
        cv235.put(KEY_OPE, "none of these");
        cv235.put(KEY_CORRECT, "1");

        cv236.put(KEY_ID, 36);
        cv236.put(KEY_QUESTION, "A $ B means A is the father of B; A # B means A is the sister of B; A * B means A is the daughter of B and A @ B means A is the brother of B. Which of the following indicates that M is the wife of Q?");
        cv236.put(KEY_OPA, "Q $ R # T @ M");
        cv236.put(KEY_OPB, "Q $ R @ T # M");
        cv236.put(KEY_OPC, "Q $ R * T # M");
        cv236.put(KEY_OPD, "Q $ R @ T * M");
        cv236.put(KEY_OPE, "none of these");
        cv236.put(KEY_CORRECT, "4");

        cv237.put(KEY_ID, 37);
        cv237.put(KEY_QUESTION, "If A $ B means A is the brother of B; B * C means B is the son of C; C @ D means C is the wife of D and A # D means A is the son of D, how C is related to A?");
        cv237.put(KEY_OPA, "grandmother");
        cv237.put(KEY_OPB, "sister");
        cv237.put(KEY_OPC, "daughter");
        cv237.put(KEY_OPD, "mother");
        cv237.put(KEY_OPE, "none of these");
        cv237.put(KEY_CORRECT, "4");

        cv238.put(KEY_ID, 38);
        cv238.put(KEY_QUESTION, "Pointing to a girl Sandeep said, 'She is the daughter of the only sister of my father.' How is sandeep related to the girl?");
        cv238.put(KEY_OPA, "uncle");
        cv238.put(KEY_OPB, "cousin");
        cv238.put(KEY_OPC, "father");
        cv238.put(KEY_OPD, "grandfather");
        cv238.put(KEY_OPE, "none of these");
        cv238.put(KEY_CORRECT, "2");

        cv239.put(KEY_ID, 39);
        cv239.put(KEY_QUESTION, "Pointing to a boy in the photograph Reena said, 'He is the only son of the only child of my grandfather.' How Reena is related to that boy?");
        cv239.put(KEY_OPA, "mother");
        cv239.put(KEY_OPB, "sister");
        cv239.put(KEY_OPC, "father");
        cv239.put(KEY_OPD, "grandfather");
        cv239.put(KEY_OPE, "none of these");
        cv239.put(KEY_CORRECT, "2");

        cv240.put(KEY_ID, 40);
        cv240.put(KEY_QUESTION, "1. A * B means A is the sister of B\n2. A $ B means B is the mother of A\n3. A + B means A is the brother of B\n4. A = B means B is the father of A.\nWhich of the following means M is the maternal uncle of N?");
        cv240.put(KEY_OPA, "M = P + Q * N");
        cv240.put(KEY_OPB, "N + P = Q * M");
        cv240.put(KEY_OPC, "N * P $ Q * M");
        cv240.put(KEY_OPD, "data inadequate");
        cv240.put(KEY_OPE, "none of these");
        cv240.put(KEY_CORRECT, "4");

        cv241.put(KEY_ID, 41);
        cv241.put(KEY_QUESTION, "If P + Q means P is the brother of Q; P x Q means P is the father of Q and P - Q means P is the sister of Q, which of the following relations shows that I is the niece of K?");
        cv241.put(KEY_OPA, "K + Y + Z - I");
        cv241.put(KEY_OPB, "K + Y x I - Z");
        cv241.put(KEY_OPC, "Z - I x Y + K");
        cv241.put(KEY_OPD, "K x Y + I - Z");
        cv241.put(KEY_OPE, "none of these");
        cv241.put(KEY_CORRECT, "2");

        cv242.put(KEY_ID, 42);
        cv242.put(KEY_QUESTION, "If M x N means M is the daughter of N; M + N means M is the father of N; M % N means M is the mother of N and M - N means M is the brother of N then P % Q + R - T x K indicates which relation of P to K?");
        cv242.put(KEY_OPA, "mother");
        cv242.put(KEY_OPB, "sister");
        cv242.put(KEY_OPC, "daughter-in-law");
        cv242.put(KEY_OPD, "data inadequate");
        cv242.put(KEY_OPE, "none of these");
        cv242.put(KEY_CORRECT, "5");

        cv243.put(KEY_ID, 43);
        cv243.put(KEY_QUESTION, "Pointing towards a girl, Abhisek says, 'This girl is the daughter of only a child of my father.' What is the relation of Abhisek's wife to that girl?");
        cv243.put(KEY_OPA, "mother");
        cv243.put(KEY_OPB, "sister");
        cv243.put(KEY_OPC, "daughter-in-law");
        cv243.put(KEY_OPD, "data inadequate");
        cv243.put(KEY_OPE, "none of these");
        cv243.put(KEY_CORRECT, "1");

        cv244.put(KEY_ID, 44);
        cv244.put(KEY_QUESTION, "If A $ B means B is the father of A; A # B means B is the mother of A; A * B means B is the sister of A and A @ B means B is the husband of A, which of the following indicates that N is the grandmother of P?");
        cv244.put(KEY_OPA, "P * Q # M $ N");
        cv244.put(KEY_OPB, "P @ Q $ M # N");
        cv244.put(KEY_OPC, "P # Q $ N * M");
        cv244.put(KEY_OPD, "data inadequate");
        cv244.put(KEY_OPE, "none of these");
        cv244.put(KEY_CORRECT, "5");

        cv245.put(KEY_ID, 45);
        cv245.put(KEY_QUESTION, "Anupam said to a lady sitting in a car, 'The only daughter of the brother of my wife is the sister-in-law of the brother of your sister.' How the husband of the lady is related to Anupam?");
        cv245.put(KEY_OPA, "maternal uncle");
        cv245.put(KEY_OPB, "uncle");
        cv245.put(KEY_OPC, "son-in-law");
        cv245.put(KEY_OPD, "data inadequate");
        cv245.put(KEY_OPE, "none of these");
        cv245.put(KEY_CORRECT, "3");

        cv246.put(KEY_ID, 46);
        cv246.put(KEY_QUESTION, "If P + Q means P is the brother of Q; P x Q means P is the wife of Q and P % Q means P is the daughter of Q then which of the following means D is the uncle of A?");
        cv246.put(KEY_OPA, "A % B x C + D");
        cv246.put(KEY_OPB, "A x B + C % D");
        cv246.put(KEY_OPC, "A + C % B x D");
        cv246.put(KEY_OPD, "data inadequate");
        cv246.put(KEY_OPE, "none of these");
        cv246.put(KEY_CORRECT, "5");

        cv247.put(KEY_ID, 47);
        cv247.put(KEY_QUESTION, "A is the son of C; C and Q are sisters; Z is the mother of Q and P is the son of Z. Which of the following statements is true?");
        cv247.put(KEY_OPA, "P and A are cousins");
        cv247.put(KEY_OPB, "P is the maternal uncle of A");
        cv247.put(KEY_OPC, "Q is the maternal grandfather of A");
        cv247.put(KEY_OPD, "C and P are sisters");
        cv247.put(KEY_OPE, "none of these");
        cv247.put(KEY_CORRECT, "2");

        cv248.put(KEY_ID, 48);
        cv248.put(KEY_QUESTION, "M is the father of N who is the son of V. In order to know the relation of M to P, which of the statement/statements is/are necessary?\n1. P is the brother of V.\n2. The daughter of N is the granddaughter of V.");
        cv248.put(KEY_OPA, "only 1");
        cv248.put(KEY_OPB, "only 2");
        cv248.put(KEY_OPC, "either 1 or 2");
        cv248.put(KEY_OPD, "both 1 and 2");
        cv248.put(KEY_OPE, "none of these");
        cv248.put(KEY_CORRECT, "1");

        cv249.put(KEY_ID, 49);
        cv249.put(KEY_QUESTION, "If X + Y means X is the daughter of Y; X - Y means X is the brother of Y; X % Y means X is the father of Y and X x Y means X is the sister of Y. Which of the following means I is the niece of J?");
        cv249.put(KEY_OPA, "J - N % C x I");
        cv249.put(KEY_OPB, "I x C - N % J");
        cv249.put(KEY_OPC, "J + M x C % I");
        cv249.put(KEY_OPD, "I x C + N - J");
        cv249.put(KEY_OPE, "none of these");
        cv249.put(KEY_CORRECT, "4");

        cv250.put(KEY_ID, 50);
        cv250.put(KEY_QUESTION, "Pointing to a girl Sandeep said, 'She is the daughter of the only sister of my father.' How is sandeep related to the girl?");
        cv250.put(KEY_OPA, "uncle");
        cv250.put(KEY_OPB, "cousin");
        cv250.put(KEY_OPC, "father");
        cv250.put(KEY_OPD, "aunt");
        cv250.put(KEY_OPE, "none of these");
        cv250.put(KEY_CORRECT, "2");


        cv451.put(KEY_ID, 1);
        cv451.put(KEY_QUESTION, "Father is aged three times more than his son Ronit. After 8 years, he would be two and a half times of Ronit's age. After further 8 years, how many times would he be of Ronit's age?");
        cv451.put(KEY_OPA, "2 times");
        cv451.put(KEY_OPB, "2.5 times");
        cv451.put(KEY_OPC, "2.75 times");
        cv451.put(KEY_OPD, "3 times");
        cv451.put(KEY_OPE, "None of these");
        cv451.put(KEY_CORRECT, "1");

        cv452.put(KEY_ID, 2);
        cv452.put(KEY_QUESTION, "The sum of ages of 5 children born at the intervals of 3 years each is 50 years. What is the age of the youngest child?");
        cv452.put(KEY_OPA, "4 years");
        cv452.put(KEY_OPB, "8 years");
        cv452.put(KEY_OPC, "10 years");
        cv452.put(KEY_OPD, "12 years");
        cv452.put(KEY_OPE, "None of these");
        cv452.put(KEY_CORRECT, "1");

        cv453.put(KEY_ID, 3);
        cv453.put(KEY_QUESTION, "A father said to his son, 'I was as old as you are at the present at the time of your birth'. If the father's age is 38 years now, the son's age five years back was:");
        cv453.put(KEY_OPA, "14 years");
        cv453.put(KEY_OPB, "19 years");
        cv453.put(KEY_OPC, "33 years");
        cv453.put(KEY_OPD, "38 years");
        cv453.put(KEY_OPE, "None of these");
        cv453.put(KEY_CORRECT, "1");

        cv454.put(KEY_ID, 4);
        cv454.put(KEY_QUESTION, "A is two years older than B who is twice as old as C. If the total of the ages of A, B and C be 27, the how old is B?");
        cv454.put(KEY_OPA, "7");
        cv454.put(KEY_OPB, "8");
        cv454.put(KEY_OPC, "9");
        cv454.put(KEY_OPD, "10");
        cv454.put(KEY_OPE, "11");
        cv454.put(KEY_CORRECT, "4");

        cv455.put(KEY_ID, 5);
        cv455.put(KEY_QUESTION, "Present ages of Sameer and Anand are in the ratio of 5 : 4 respectively. Three years hence, the ratio of their ages will become 11 : 9 respectively. What is Anand's present age in years?");
        cv455.put(KEY_OPA, "24");
        cv455.put(KEY_OPB, "27");
        cv455.put(KEY_OPC, "40");
        cv455.put(KEY_OPD, "33");
        cv455.put(KEY_OPE, "None of these");
        cv455.put(KEY_CORRECT, "1");

        cv456.put(KEY_ID, 6);
        cv456.put(KEY_QUESTION, "A man is 24 years older than his son. In two years, his age will be twice the age of his son. The present age of his son is:");
        cv456.put(KEY_OPA, "14 years");
        cv456.put(KEY_OPB, "18 years");
        cv456.put(KEY_OPC, "20 years");
        cv456.put(KEY_OPD, "22 years");
        cv456.put(KEY_OPE, "None of these");
        cv456.put(KEY_CORRECT, "4");

        cv457.put(KEY_ID, 7);
        cv457.put(KEY_QUESTION, "Six years ago, the ratio of the ages of Kunal and Sagar was 6 : 5. Four years hence, the ratio of their ages will be 11 : 10. What is Sagar's age at present?");
        cv457.put(KEY_OPA, "16 years");
        cv457.put(KEY_OPB, "18 years");
        cv457.put(KEY_OPC, "20 years");
        cv457.put(KEY_OPD, "cannot be determined");
        cv457.put(KEY_OPE, "None of these");
        cv457.put(KEY_CORRECT, "1");

        cv458.put(KEY_ID, 8);
        cv458.put(KEY_QUESTION, "The sum of the present ages of a father and his son is 60 years. Six years ago, father's age was five times the age of the son. After 6 years, son's age will be:");
        cv458.put(KEY_OPA, "12 years");
        cv458.put(KEY_OPB, "14 years");
        cv458.put(KEY_OPC, "18 years");
        cv458.put(KEY_OPD, "20 years");
        cv458.put(KEY_OPE, "None of these");
        cv458.put(KEY_CORRECT, "4");

        cv459.put(KEY_ID, 9);
        cv459.put(KEY_QUESTION, "At present, the ratio between the ages of Arun and Deepak is 4 : 3. After 6 years, Arun's age will be 26 years. What is the age of Deepak at present ?");
        cv459.put(KEY_OPA, "12 years");
        cv459.put(KEY_OPB, "19.5 years");
        cv459.put(KEY_OPC, "21 years");
        cv459.put(KEY_OPD, "15");
        cv459.put(KEY_OPE, "None of these");
        cv459.put(KEY_CORRECT, "4");

        cv460.put(KEY_ID, 10);
        cv460.put(KEY_QUESTION, "Sachin is younger than Rahul by 7 years. If their ages are in the respective ratio of 7 : 9, how old is Sachin?");
        cv460.put(KEY_OPA, "16 years");
        cv460.put(KEY_OPB, "18 years");
        cv460.put(KEY_OPC, "28 years");
        cv460.put(KEY_OPD, "24.5 years");
        cv460.put(KEY_OPE, "None of these");
        cv460.put(KEY_CORRECT, "4");

        cv461.put(KEY_ID, 11);
        cv461.put(KEY_QUESTION, "The present ages of three persons in proportions 4 : 7 : 9. Eight years ago, the sum of their ages was 56. Find their present ages (in years).");
        cv461.put(KEY_OPA, "8,20,28");
        cv461.put(KEY_OPB, "16,28,36");
        cv461.put(KEY_OPC, "20,35,45");
        cv461.put(KEY_OPD, "cannot be determined");
        cv461.put(KEY_OPE, "None of these");
        cv461.put(KEY_CORRECT, "2");

        cv462.put(KEY_ID, 12);
        cv462.put(KEY_QUESTION, "Ayesha's father was 38 years of age when she was born while her mother was 36 years old when her brother four years younger to her was born. What is the difference between the ages of her parents?");
        cv462.put(KEY_OPA, "2 years");
        cv462.put(KEY_OPB, "4 years");
        cv462.put(KEY_OPC, "6 years");
        cv462.put(KEY_OPD, "8 years");
        cv462.put(KEY_OPE, "None of these");
        cv462.put(KEY_CORRECT, "3");

        cv463.put(KEY_ID, 13);
        cv463.put(KEY_QUESTION, "A person's present age is two-fifth of the age of his mother. After 8 years, he will be one-half of the age of his mother. How old is the mother at present?");
        cv463.put(KEY_OPA, "32 years");
        cv463.put(KEY_OPB, "36 years");
        cv463.put(KEY_OPC, "40 years");
        cv463.put(KEY_OPD, "48 years");
        cv463.put(KEY_OPE, "None of these");
        cv463.put(KEY_CORRECT, "3");

        cv464.put(KEY_ID, 14);
        cv464.put(KEY_QUESTION, "Q is as much younger than R as he is older than T. If the sum of the ages of R and T is 50 years, what is definitely the difference between R and Q's age?");
        cv464.put(KEY_OPA, "1 year");
        cv464.put(KEY_OPB, "2 years");
        cv464.put(KEY_OPC, "25 years");
        cv464.put(KEY_OPD, "Data inadequate");
        cv464.put(KEY_OPE, "None of these");
        cv464.put(KEY_CORRECT, "4");

        cv465.put(KEY_ID, 15);
        cv465.put(KEY_QUESTION, "The age of father 10 years ago was thrice the age of his son. Ten years hence, father's age will be twice that of his son. The ratio of their present ages is:");
        cv465.put(KEY_OPA, "5:2");
        cv465.put(KEY_OPB, "7:3");
        cv465.put(KEY_OPC, "9:2");
        cv465.put(KEY_OPD, "13:4");
        cv465.put(KEY_OPE, "None of these");
        cv465.put(KEY_CORRECT, "2");

        cv466.put(KEY_ID, 16);
        cv466.put(KEY_QUESTION, "What is Sonia's present age?\nI. Sonia's present age is five times Deepak's present age.\nII. Five years ago her age was twenty-five times Deepak's age at that time.");
        cv466.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv466.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv466.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv466.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv466.put(KEY_OPE, "Both I and II are necessary to answer");
        cv466.put(KEY_CORRECT, "5");

        cv467.put(KEY_ID, 17);
        cv467.put(KEY_QUESTION, "Average age of employees working in a department is 30 years. In the next year, ten workers will retire. What will be the average age in the next year?\nI. Retirement age is 60 years\nII. There are 50 employees in the department.");
        cv467.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv467.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv467.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv467.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv467.put(KEY_OPE, "Both I and II are necessary to answer");
        cv467.put(KEY_CORRECT, "5");

        cv468.put(KEY_ID, 18);
        cv468.put(KEY_QUESTION, "Divya is twice as old as Shruti. What is the difference in their ages?\nI. Five years hence, the ratio of their ages would be 9 : 5.\nII. Ten years bacKEY_ID,the ratio of their ages was 3 : 1.");
        cv468.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv468.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv468.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv468.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv468.put(KEY_OPE, "Both I and II are necessary to answer");
        cv468.put(KEY_CORRECT, "3");

        cv469.put(KEY_ID, 19);
        cv469.put(KEY_QUESTION, "What is Arun's present age?\nI. Five years ago, Arun's age was double that of his son's age at that time.\nII. Present ages of Arun and his son are in the ratio of 11 : 6 respectively.\nIII. Five years hence, the respective ratio of Arun's age and his son's age will become 12 : 7.");
        cv469.put(KEY_OPA, "Only I and II are sufficient to answer");
        cv469.put(KEY_OPB, "Only II and III are sufficient to answer");
        cv469.put(KEY_OPC, "Only I and III are sufficient to answer");
        cv469.put(KEY_OPD, "Any two of three are sufficient to answer");
        cv469.put(KEY_OPE, "None of these");
        cv469.put(KEY_CORRECT, "4");

        cv470.put(KEY_ID, 20);
        cv470.put(KEY_QUESTION, "What is Ravi's present age?\nI. The present age of Ravi is half of that of his father.\nII. After 5 years, the ratio of Ravi's age to that of his father's age will be 6 : 11.\nIII. Ravi is 5 years younger than his brother.");
        cv470.put(KEY_OPA, "Only I and II are sufficient to answer");
        cv470.put(KEY_OPB, "Only II and III are sufficient to answer");
        cv470.put(KEY_OPC, "Only I and III are sufficient to answer");
        cv470.put(KEY_OPD, "All are required to get the answer");
        cv470.put(KEY_OPE, "Even with all the three statements answer cannot be determined");
        cv470.put(KEY_CORRECT, "1");

        cv471.put(KEY_ID, 21);
        cv471.put(KEY_QUESTION, "What is the present age of Tanya?\nI. The ratio between the present ages of Tanya and her brother Rahul is 3 : 4 respectively.\nII. After 5 years the ratio between the ages of Tanya and Rahul will be 4 : 5.\nIII. Rahul is 5 years older than Tanya.");
        cv471.put(KEY_OPA, "Only I and II are sufficient to answer");
        cv471.put(KEY_OPB, "Only II and III are sufficient to answer");
        cv471.put(KEY_OPC, "Only I and III are sufficient to answer");
        cv471.put(KEY_OPD, "All are required to get the answer");
        cv471.put(KEY_OPE, "Any two of three are sufficient to answer");
        cv471.put(KEY_CORRECT, "5");

        cv472.put(KEY_ID, 22);
        cv472.put(KEY_QUESTION, "What will be the ratio between ages of Sam and Albert after 5 years?\nI. Sam's present age is more than Albert's present age by 4 years.\nII. Albert's present age is 20 years.\nIII. The ratio of Albert's present age to Sam's present age is 5 : 6.");
        cv472.put(KEY_OPA, "Any two of three are sufficient to answer");
        cv472.put(KEY_OPB, "II alone is sufficient to answer");
        cv472.put(KEY_OPC, "III alone is sufficient to answer");
        cv472.put(KEY_OPD, "I or III are sufficient to answer");
        cv472.put(KEY_OPE, "II or III are sufficient to answer");
        cv472.put(KEY_CORRECT, "1");

        cv473.put(KEY_ID, 23);
        cv473.put(KEY_QUESTION, "What is the difference between the present ages of Ayush and Deepak?\nI. The ratio between Ayush's present age and his age after 8 years 4 : 5.\nII. The ratio between the present ages of Ayush and Deepak is 4 : 3.\nIII. The ratio between Deepak's present age and his age four years ago is 6 : 5.");
        cv473.put(KEY_OPA, "Any two of three are sufficient to answer");
        cv473.put(KEY_OPB, "I or III are sufficient to answer");
        cv473.put(KEY_OPC, "Any one of three is sufficient to answer");
        cv473.put(KEY_OPD, "All are required to answer");
        cv473.put(KEY_OPE, "Even with all answer cannot be determined");
        cv473.put(KEY_CORRECT, "1");

        cv474.put(KEY_ID, 24);
        cv474.put(KEY_QUESTION, "How old is C now?\nI. Three years ago, the average of A and B was 18 years.\nII. With C joining them now, the average becomes 22.");
        cv474.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv474.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv474.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv474.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv474.put(KEY_OPE, "Both I and II are necessary to answer");
        cv474.put(KEY_CORRECT, "5");

        cv475.put(KEY_ID, 25);
        cv475.put(KEY_QUESTION, "What is the ratio between the ages of the father and the son?\nI. The sum of their ages is 50 years.\nII. 3 times the sum of their ages equal to 5 times the father's age.");
        cv475.put(KEY_OPA, "I alone sufficient while II alone not sufficient to answer");
        cv475.put(KEY_OPB, "II alone sufficient while I alone not sufficient to answer");
        cv475.put(KEY_OPC, "Either I or II alone sufficient to answer");
        cv475.put(KEY_OPD, "Both I and II are not sufficient to answer");
        cv475.put(KEY_OPE, "Both I and II are necessary to answer");
        cv475.put(KEY_CORRECT, "2");

        cv476.put(KEY_ID, 1);
        cv476.put(KEY_QUESTION, "Who among the teachers was teaching maximum number of subjects ? ");
        cv476.put(KEY_OPA, "A ");
        cv476.put(KEY_OPB, "B");
        cv476.put(KEY_OPC, "C");
        cv476.put(KEY_OPD, "D");
        cv476.put(KEY_OPE, "E");
        cv476.put(KEY_CORRECT, "2");

        cv477.put(KEY_ID, 2);
        cv477.put(KEY_QUESTION, "Which of the following pairs was teaching both Geography and Hindi ? ");
        cv477.put(KEY_OPA, "A and B ");
        cv477.put(KEY_OPB, "B and C");
        cv477.put(KEY_OPC, "C and A ");
        cv477.put(KEY_OPD, "D and B");
        cv477.put(KEY_OPE, "None of these");
        cv477.put(KEY_CORRECT, "5");

        cv478.put(KEY_ID, 3);
        cv478.put(KEY_QUESTION, "More than two teachers were teaching which subject ?");
        cv478.put(KEY_OPA, "History");
        cv478.put(KEY_OPB, "Hindi");
        cv478.put(KEY_OPC, " French ");
        cv478.put(KEY_OPD, "Geography");
        cv478.put(KEY_OPE, "Methematics");
        cv478.put(KEY_CORRECT, "2");

        cv479.put(KEY_ID, 4);
        cv479.put(KEY_QUESTION, "D, B and A were teaching which of the following subjects ?");
        cv479.put(KEY_OPA, " English only");
        cv479.put(KEY_OPB, "Hindi and English ");
        cv479.put(KEY_OPC, " Hindi only ");
        cv479.put(KEY_OPD, "English and Geography  ");
        cv479.put(KEY_OPE, " Mathematics and Hindi ");
        cv479.put(KEY_CORRECT, "3");

        cv480.put(KEY_ID, 5);
        cv480.put(KEY_QUESTION, "Who among the teachers was teaching less than two subjects ? ");
        cv480.put(KEY_OPA, "A");
        cv480.put(KEY_OPB, "B");
        cv480.put(KEY_OPC, "D");
        cv480.put(KEY_OPD, "Data inadequate ");
        cv480.put(KEY_OPE, "There is no such teachers");
        cv480.put(KEY_CORRECT, "5");

        cv481.put(KEY_ID, 6);
        cv481.put(KEY_QUESTION, "Who is good in Computer Science, History and Dramatics ? ");
        cv481.put(KEY_OPA, "Anjali");
        cv481.put(KEY_OPB, "Madhu");
        cv481.put(KEY_OPC, "Shobha");
        cv481.put(KEY_OPD, "Nisha");
        cv481.put(KEY_OPE, "None of these ");
        cv481.put(KEY_CORRECT, "3");

        cv482.put(KEY_ID, 7);
        cv482.put(KEY_QUESTION, "Who is good in Physics, Dramatics and Computer Science ?");
        cv482.put(KEY_OPA, "Shobha");
        cv482.put(KEY_OPB, "Poonam");
        cv482.put(KEY_OPC, "Madhu");
        cv482.put(KEY_OPD, "Anjali");
        cv482.put(KEY_OPE, "Data inadequate ");
        cv482.put(KEY_CORRECT, "3");

        cv483.put(KEY_ID, 8);
        cv483.put(KEY_QUESTION, "Who is the good in Physics, History and Dramatics ? ");
        cv483.put(KEY_OPA, "Poonam");
        cv483.put(KEY_OPB, " Shobha ");
        cv483.put(KEY_OPC, " Madhu ");
        cv483.put(KEY_OPD, " Anjali ");
        cv483.put(KEY_OPE, " None of these");
        cv483.put(KEY_CORRECT, "1");

        cv484.put(KEY_ID, 9);
        cv484.put(KEY_QUESTION, "Who is good in History, Physics, Computer Science and Mathematics ?");
        cv484.put(KEY_OPA, "Poonam ");
        cv484.put(KEY_OPB, "Nisha ");
        cv484.put(KEY_OPC, "Madhu");
        cv484.put(KEY_OPD, "Anjali");
        cv484.put(KEY_OPE, "None of these");
        cv484.put(KEY_CORRECT, "4");

        cv485.put(KEY_ID, 10);
        cv485.put(KEY_QUESTION, " Who is good in Physics, History and Mathematics but not in Computer Science ?");
        cv485.put(KEY_OPA, "Madhu");
        cv485.put(KEY_OPB, "Poonam");
        cv485.put(KEY_OPC, "Nisha ");
        cv485.put(KEY_OPD, " Anjali");
        cv485.put(KEY_OPE, "None of these");
        cv485.put(KEY_CORRECT, "3");

        cv486.put(KEY_ID, 11);
        cv486.put(KEY_QUESTION, "With whom is Sushma friendly ?");
        cv486.put(KEY_OPA, "Raj");
        cv486.put(KEY_OPB, "prem");
        cv486.put(KEY_OPC, "ved");
        cv486.put(KEY_OPD, "ashok");
        cv486.put(KEY_OPE, "none of these ");
        cv486.put(KEY_CORRECT, "4");

        cv487.put(KEY_ID, 12);
        cv487.put(KEY_QUESTION, "Who is Poonam's boy friend ?");
        cv487.put(KEY_OPA, " ashok");
        cv487.put(KEY_OPB, "ved");
        cv487.put(KEY_OPC, "prem");
        cv487.put(KEY_OPD, "Raj");
        cv487.put(KEY_OPE, "none of these ");
        cv487.put(KEY_CORRECT, "2");

        cv488.put(KEY_ID, 13);
        cv488.put(KEY_QUESTION, "Who is Raj's girl friend ?");
        cv488.put(KEY_OPA, "Sushma");
        cv488.put(KEY_OPB, "Kusum");
        cv488.put(KEY_OPC, "Vimla");
        cv488.put(KEY_OPD, "Poonam ");
        cv488.put(KEY_OPE, "none of these");
        cv488.put(KEY_CORRECT, "2");

        cv489.put(KEY_ID, 14);
        cv489.put(KEY_QUESTION, "Who does not like Sushma and Vimla ?");
        cv489.put(KEY_OPA, "Poonam");
        cv489.put(KEY_OPB, "Raj");
        cv489.put(KEY_OPC, "Ashok");
        cv489.put(KEY_OPD, "Ved ");
        cv489.put(KEY_OPE, "none of these");
        cv489.put(KEY_CORRECT, "1");

        cv490.put(KEY_ID, 15);
        cv490.put(KEY_QUESTION, "Who is friend of Sushma ?");
        cv490.put(KEY_OPA, "Poonam ");
        cv490.put(KEY_OPB, "Raj");
        cv490.put(KEY_OPC, "Vimla");
        cv490.put(KEY_OPD, "Ved ");
        cv490.put(KEY_OPE, " Ashok ");
        cv490.put(KEY_CORRECT, "3");

        cv491.put(KEY_ID, 16);
        cv491.put(KEY_QUESTION, "Name the boy interested in sports");
        cv491.put(KEY_OPA, "A");
        cv491.put(KEY_OPB, "B");
        cv491.put(KEY_OPC, "C");
        cv491.put(KEY_OPD, "D");
        cv491.put(KEY_OPE, "NONE OF THESE ");
        cv491.put(KEY_CORRECT, "3");

        cv492.put(KEY_ID, 17);
        cv492.put(KEY_QUESTION, "Name the boy interested in music.");
        cv492.put(KEY_OPA, "A");
        cv492.put(KEY_OPB, "B");
        cv492.put(KEY_OPC, "C");
        cv492.put(KEY_OPD, "D");
        cv492.put(KEY_OPE, "E");
        cv492.put(KEY_CORRECT, "2");

        cv493.put(KEY_ID, 18);
        cv493.put(KEY_QUESTION, "Name the middle-class family boy interested in acting.");
        cv493.put(KEY_OPA, "A");
        cv493.put(KEY_OPB, "B");
        cv493.put(KEY_OPC, "C");
        cv493.put(KEY_OPD, "D");
        cv493.put(KEY_OPE, "E");
        cv493.put(KEY_CORRECT, "4");

        cv494.put(KEY_ID, 19);
        cv494.put(KEY_QUESTION, "Name the boys studying in post-graduate classes.");
        cv494.put(KEY_OPA, "A, D");
        cv494.put(KEY_OPB, "A, E");
        cv494.put(KEY_OPC, "B, C");
        cv494.put(KEY_OPD, "D, E");
        cv494.put(KEY_OPE, "A, C");
        cv494.put(KEY_CORRECT, "2");

        cv495.put(KEY_ID, 20);
        cv495.put(KEY_QUESTION, "Name the boy who is not industrious and is average in studies ");
        cv495.put(KEY_OPA, "A");
        cv495.put(KEY_OPB, "B");
        cv495.put(KEY_OPC, "C");
        cv495.put(KEY_OPD, "D");
        cv495.put(KEY_OPE, "E");
        cv495.put(KEY_CORRECT, "4");

        cv496.put(KEY_ID, 21);
        cv496.put(KEY_QUESTION, "Which of the following two towns are those whose population is less than 5 lacs ?");
        cv496.put(KEY_OPA, "D and A");
        cv496.put(KEY_OPB, "B and C");
        cv496.put(KEY_OPC, "A and B");
        cv496.put(KEY_OPD, "A and C ");
        cv496.put(KEY_OPE, "None of these");
        cv496.put(KEY_CORRECT, "3");

        cv497.put(KEY_ID, 22);
        cv497.put(KEY_QUESTION, "Which of the following towns is not a capital ?");
        cv497.put(KEY_OPA, "A");
        cv497.put(KEY_OPB, "C");
        cv497.put(KEY_OPC, "D");
        cv497.put(KEY_OPD, "E");
        cv497.put(KEY_OPE, "B");
        cv497.put(KEY_CORRECT, "5");

        cv498.put(KEY_ID, 23);
        cv498.put(KEY_QUESTION, "Which of the following is harbour, capital and industrial town ?");
        cv498.put(KEY_OPA, "A");
        cv498.put(KEY_OPB, "B");
        cv498.put(KEY_OPC, "C");
        cv498.put(KEY_OPD, "E");
        cv498.put(KEY_OPE, "D");
        cv498.put(KEY_CORRECT, "4");

        cv499.put(KEY_ID, 24);
        cv499.put(KEY_QUESTION, "Which of the following towns have population more than 50 lacs ?");
        cv499.put(KEY_OPA, "A and D");
        cv499.put(KEY_OPB, "B and E");
        cv499.put(KEY_OPC, "C and E");
        cv499.put(KEY_OPD, "C and D");
        cv499.put(KEY_OPE, "A and C");
        cv499.put(KEY_CORRECT, "3");

        cv500.put(KEY_ID, 25);
        cv500.put(KEY_QUESTION, "Which one of the following towns is hill station as well as capital ?");
        cv500.put(KEY_OPA, "B");
        cv500.put(KEY_OPB, "C");
        cv500.put(KEY_OPC, "E");
        cv500.put(KEY_OPD, "D");
        cv500.put(KEY_OPE, "A");
        cv500.put(KEY_CORRECT, "5");

        cv501.put(KEY_ID, 26);
        cv501.put(KEY_QUESTION, "Who is an Engineer ?");
        cv501.put(KEY_OPA, "Nanu ");
        cv501.put(KEY_OPB, "Mohini ");
        cv501.put(KEY_OPC, "Sunita");
        cv501.put(KEY_OPD, "Cannot be determined ");
        cv501.put(KEY_OPE, "None of these");
        cv501.put(KEY_CORRECT, "5");

        cv502.put(KEY_ID, 27);
        cv502.put(KEY_QUESTION, "What is the profession of Sunita ?");
        cv502.put(KEY_OPA, "Engineer ");
        cv502.put(KEY_OPB, "Doctor ");
        cv502.put(KEY_OPC, "Teacher  ");
        cv502.put(KEY_OPD, "Cannot be determined");
        cv502.put(KEY_OPE, "None of these");
        cv502.put(KEY_CORRECT, "4");

        cv503.put(KEY_ID, 28);
        cv503.put(KEY_QUESTION, "Which of the following is the correct pair of two couples ?");
        cv503.put(KEY_OPA, "Mohini-Vinod and Rohan-Sunita");
        cv503.put(KEY_OPB, "Vinod-Mohini and Rohan-Nanu");
        cv503.put(KEY_OPC, "Rohan-Sunita and Tanmay-Nanu");
        cv503.put(KEY_OPD, "Cannot be determined");
        cv503.put(KEY_OPE, "None of these");
        cv503.put(KEY_CORRECT, "1");

        cv504.put(KEY_ID, 29);
        cv504.put(KEY_QUESTION, "How many ladies are there in the family ?");
        cv504.put(KEY_OPA, "Two ");
        cv504.put(KEY_OPB, "Three ");
        cv504.put(KEY_OPC, "Four ");
        cv504.put(KEY_OPD, "Cannot be determined ");
        cv504.put(KEY_OPE, "None of these");
        cv504.put(KEY_CORRECT, "2");

        cv505.put(KEY_ID, 30);
        cv505.put(KEY_QUESTION, "Which colour is liked by CA ?");
        cv505.put(KEY_OPA, "Green");
        cv505.put(KEY_OPB, "White ");
        cv505.put(KEY_OPC, "Either White or Green");
        cv505.put(KEY_OPD, "Cannot be determined");
        cv505.put(KEY_OPE, "None of these");
        cv505.put(KEY_CORRECT, "1");

        cv506.put(KEY_ID, 31);
        cv506.put(KEY_QUESTION, "How is C related to D ?");
        cv506.put(KEY_OPA, "Grandmother ");
        cv506.put(KEY_OPB, "Cousin");
        cv506.put(KEY_OPC, "Sister");
        cv506.put(KEY_OPD, "Mother");
        cv506.put(KEY_OPE, "None of these");
        cv506.put(KEY_CORRECT, "1");

        cv507.put(KEY_ID, 32);
        cv507.put(KEY_QUESTION, "How is E related to F ?");
        cv507.put(KEY_OPA, "Grandmother ");
        cv507.put(KEY_OPB, "Brother");
        cv507.put(KEY_OPC, "Father");
        cv507.put(KEY_OPD, "Data inadequate ");
        cv507.put(KEY_OPE, "None of these");
        cv507.put(KEY_CORRECT, "3");

        cv508.put(KEY_ID, 33);
        cv508.put(KEY_QUESTION, "Which of the following is a pair of married couples ?");
        cv508.put(KEY_OPA, "AB");
        cv508.put(KEY_OPB, "BC");
        cv508.put(KEY_OPC, "AD");
        cv508.put(KEY_OPD, "BE");
        cv508.put(KEY_OPE, "None of these");
        cv508.put(KEY_CORRECT, "4");

        cv509.put(KEY_ID, 34);
        cv509.put(KEY_QUESTION, "How many male members are there in the family ?");
        cv509.put(KEY_OPA, "Two");
        cv509.put(KEY_OPB, "Three ");
        cv509.put(KEY_OPC, "Four");
        cv509.put(KEY_OPD, "Data inadequate ");
        cv509.put(KEY_OPE, "None of these");
        cv509.put(KEY_CORRECT, "4");

        cv510.put(KEY_ID, 35);
        cv510.put(KEY_QUESTION, "Who among the following will be in the second place if all the members in the family are arranged in the descending order of their weights ?");
        cv510.put(KEY_OPA, "A");
        cv510.put(KEY_OPB, "C");
        cv510.put(KEY_OPC, "D");
        cv510.put(KEY_OPD, "Data inadequate ");
        cv510.put(KEY_OPE, "None of these");
        cv510.put(KEY_CORRECT, "2");

        cv511.put(KEY_ID, 36);
        cv511.put(KEY_QUESTION, "If the program sets operated on a day is P, Q, W, T, U, each of the following could be the next day's progam set except :");
        cv511.put(KEY_OPA, "W, T, U, V, S");
        cv511.put(KEY_OPB, "W, T, S, P, U");
        cv511.put(KEY_OPC, "W, R, V, T, U");
        cv511.put(KEY_OPD, "Q, T, V, W, S");
        cv511.put(KEY_OPE, "Q, R, V, T, U");
        cv511.put(KEY_CORRECT, "2");

        cv512.put(KEY_ID, 37);
        cv512.put(KEY_QUESTION, "Which of the following could be the set of programs to be operated on the first day of a month ?Which of the following could be the set of programs to be operated on the first day of a month ?");
        cv512.put(KEY_OPA, "V, Q, R, T, S");
        cv512.put(KEY_OPB, "U, Q, S, T, W");
        cv512.put(KEY_OPC, "T, U, R, V, S");
        cv512.put(KEY_OPD, "Q, S, R, V, U");
        cv512.put(KEY_OPE, "P, R, V, S, U");
        cv512.put(KEY_CORRECT, "3");

        cv513.put(KEY_ID, 38);
        cv513.put(KEY_QUESTION, "Which of the following is true of any day's valid program set operation ?");
        cv513.put(KEY_OPA, "P cannot be operated at third place.");
        cv513.put(KEY_OPB, "Q cannot be operated at third place.");
        cv513.put(KEY_OPC, "R cannot be operated at fourth place.");
        cv513.put(KEY_OPD, "T cannot be operated at third place");
        cv513.put(KEY_OPE, "U cannot be operated at fourth place.");
        cv513.put(KEY_CORRECT, "3");

        cv514.put(KEY_ID, 39);
        cv514.put(KEY_QUESTION, "If R is operated at third place in a sequence, which of the following cannot be the second program in that sequence ?");
        cv514.put(KEY_OPA, "Q");
        cv514.put(KEY_OPB, "S");
        cv514.put(KEY_OPC, "T");
        cv514.put(KEY_OPD, "U");
        cv514.put(KEY_OPE, "W");
        cv514.put(KEY_CORRECT, "1");

        cv515.put(KEY_ID, 40);
        cv515.put(KEY_QUESTION, "If the program sets R and W are to be operated on the first day, which of the following could be the other programs on that day ?");
        cv515.put(KEY_OPA, "P, T, V");
        cv515.put(KEY_OPB, "Q, S, V");
        cv515.put(KEY_OPC, "Q, T, V");
        cv515.put(KEY_OPD, "T, S, V");
        cv515.put(KEY_OPE, "T, S, V");
        cv515.put(KEY_CORRECT, "5");

        cv516.put(KEY_ID, 41);
        cv516.put(KEY_QUESTION, "If the team consists of two doctors, three females teachers and two engineers, the members of the team are :");
        cv516.put(KEY_OPA, "A B O P Q G H");
        cv516.put(KEY_OPB, "C D K L O P Q");
        cv516.put(KEY_OPC, "C D O P Q G H");
        cv516.put(KEY_OPD, "D E G H O P Q");
        cv516.put(KEY_OPE, "D K L O P Q C");
        cv516.put(KEY_CORRECT, "1");

        cv517.put(KEY_ID, 42);
        cv517.put(KEY_QUESTION, "If the team consists of two doctors, one engineer and four teachers, all the following teams are possible except :");
        cv517.put(KEY_OPA, "A B G M N O P");
        cv517.put(KEY_OPB, "A B H M O P Q");
        cv517.put(KEY_OPC, "A B H M R P Q");
        cv517.put(KEY_OPD, "A B K N R P Q");
        cv517.put(KEY_OPE, "A B M O P H Q");
        cv517.put(KEY_CORRECT, "3");

        cv518.put(KEY_ID, 43);
        cv518.put(KEY_QUESTION, "If the team consists of two doctors, female teachers and two engineers, all the following teams are possible except :");
        cv518.put(KEY_OPA, "A B G H O Q");
        cv518.put(KEY_OPB, "A B G H P Q");
        cv518.put(KEY_OPC, "A B K L P Q");
        cv518.put(KEY_OPD, "O P G H A B");
        cv518.put(KEY_OPE, "O P G H B A");
        cv518.put(KEY_CORRECT, "3");

        cv519.put(KEY_ID, 44);
        cv519.put(KEY_QUESTION, "If the team consists of three doctors, two male engineers and two teachers, the members of the team could be :");
        cv519.put(KEY_OPA, "A B C K L M R");
        cv519.put(KEY_OPB, "B C D K L N R");
        cv519.put(KEY_OPC, "C D E K L M N");
        cv519.put(KEY_OPD, "C D E K L P R");
        cv519.put(KEY_OPE, "None of these");
        cv519.put(KEY_CORRECT, "3");

        cv520.put(KEY_ID, 45);
        cv520.put(KEY_QUESTION, "If the team consists of two doctors, two engineers and two teachers, all the following teams are possible except :");
        cv520.put(KEY_OPA, "A B G H O P");
        cv520.put(KEY_OPB, "A B G H M N");
        cv520.put(KEY_OPC, "C E K L N R");
        cv520.put(KEY_OPD, "C D K L O P");
        cv520.put(KEY_OPE, "None of these");
        cv520.put(KEY_CORRECT, "4");

        cv521.put(KEY_ID, 46);
        cv521.put(KEY_QUESTION, "The sales representative could visit any of the following companies immediately after P except :");
        cv521.put(KEY_OPA, "S");
        cv521.put(KEY_OPB, "R");
        cv521.put(KEY_OPC, "Q");
        cv521.put(KEY_OPD, "N");
        cv521.put(KEY_OPE, "M");
        cv521.put(KEY_CORRECT, "5");

        cv522.put(KEY_ID, 47);
        cv522.put(KEY_QUESTION, "If the sales representative visits Q immediately before R and immediately after S, she must visit Q :");
        cv522.put(KEY_OPA, "first");
        cv522.put(KEY_OPB, "second");
        cv522.put(KEY_OPC, "fourth");
        cv522.put(KEY_OPD, "fifth");
        cv522.put(KEY_OPE, "sixth");
        cv522.put(KEY_CORRECT, "4");

        cv523.put(KEY_ID, 48);
        cv523.put(KEY_QUESTION, "Which of the following could be the order in which the sales representative visits the six companies ?");
        cv523.put(KEY_OPA, "M, S, P, N, R, Q");
        cv523.put(KEY_OPB, "Q, N, P, R, S, M");
        cv523.put(KEY_OPC, "M, R, N, Q, P, S");
        cv523.put(KEY_OPD, "P, S, M, R, Q, N");
        cv523.put(KEY_OPE, "P, R, M, N, Q, S");
        cv523.put(KEY_CORRECT, "1");

        cv524.put(KEY_ID, 49);
        cv524.put(KEY_QUESTION, "Which of the following must be true of the sales representative's schedule ?");
        cv524.put(KEY_OPA, "She visits M before Q.");
        cv524.put(KEY_OPB, "She visits N before R.");
        cv524.put(KEY_OPC, "She visits P before M.");
        cv524.put(KEY_OPD, "She visits P before S.");
        cv524.put(KEY_OPE, "She visits Q before R.");
        cv524.put(KEY_CORRECT, "1");

        cv525.put(KEY_ID, 50);
        cv525.put(KEY_QUESTION, "If the sales representative visits S first, which company must she visit second ?");
        cv525.put(KEY_OPA, "M");
        cv525.put(KEY_OPB, "N");
        cv525.put(KEY_OPC, "P");
        cv525.put(KEY_OPD, "Q");
        cv525.put(KEY_OPE, "R");
        cv525.put(KEY_CORRECT, "1");

        cv526.put(KEY_ID, 26);
        cv526.put(KEY_QUESTION, "The total of the ages of Amar, Akbar and Anthony is 80 years. What was the total of their ages three years ago ?");
        cv526.put(KEY_OPA, "71 years");
        cv526.put(KEY_OPB, "72 years");
        cv526.put(KEY_OPC, "74 years");
        cv526.put(KEY_OPD, "77 years");
        cv526.put(KEY_OPE, " None of the above");
        cv526.put(KEY_CORRECT, "1");

        cv527.put(KEY_ID, 27);
        cv527.put(KEY_QUESTION, "Two bus tickets from city A to B and three tickets from city A to C cost Rs. 77 but three tickets from city A to B and two tickets from city A to C cost Rs. 73. What are the fares for cities B and C from A ?");
        cv527.put(KEY_OPA, "Rs. 4,Rs. 23");
        cv527.put(KEY_OPB, "Rs. 13,Rs. 17");
        cv527.put(KEY_OPC, "Rs. 15,Rs. 14");
        cv527.put(KEY_OPD, "Rs. 17,Rs. 13");
        cv527.put(KEY_OPE, "None of the above");
        cv527.put(KEY_CORRECT, "2");

        cv528.put(KEY_ID, 28);
        cv528.put(KEY_QUESTION, "An institute organised a fete and 1/5 of the girls and 1/8 of the boys participated in the same. What fraction of the total number of students took part in the fete ?");
        cv528.put(KEY_OPA, "2/13");
        cv528.put(KEY_OPB, "13/40");
        cv528.put(KEY_OPC, "Data Inadequate");
        cv528.put(KEY_OPD, "11/40");
        cv528.put(KEY_OPE, "None of the aboveNone of the above");
        cv528.put(KEY_CORRECT, "3");

        cv529.put(KEY_ID, 29);
        cv529.put(KEY_QUESTION, "A number of friends decided to go on a picnic and planned to spend Rs. 96 on eatables. Four of them, however, did not turn up. As a consequence, the remaining ones had to contribute Rs. 4 each extra. The number of those who attended the picnic was");
        cv529.put(KEY_OPA, "8");
        cv529.put(KEY_OPB, "12");
        cv529.put(KEY_OPC, "16");
        cv529.put(KEY_OPD, "24");
        cv529.put(KEY_OPE, "None of the above");
        cv529.put(KEY_CORRECT, "1");

        cv530.put(KEY_ID, 30);
        cv530.put(KEY_QUESTION, "A, B, C, D and E play a game of cards. A says to B, 'If you give me three cards, you will have as many as E has and if I give you three cards, you will have as many as D has.' A and B together have 10 cards more than what D and E together have. If B has two cards more than what C has and the total number of cards be 133, how many cards does B have ?");
        cv530.put(KEY_OPA, "22");
        cv530.put(KEY_OPB, "23");
        cv530.put(KEY_OPC, "25");
        cv530.put(KEY_OPD, "35");
        cv530.put(KEY_OPE, "None of the above");
        cv530.put(KEY_CORRECT, "3");

        cv531.put(KEY_ID, 31);
        cv531.put(KEY_QUESTION, "A pineapple costs Rs. 7 each. A watermelon costs Rs. 5 each. X spends Rs. 38 on these fruits. The number of pineapples purchased is");
        cv531.put(KEY_OPA, "2");
        cv531.put(KEY_OPB, "3");
        cv531.put(KEY_OPC, "4");
        cv531.put(KEY_OPD, "Data Inadequate");
        cv531.put(KEY_OPE, "None of the above");
        cv531.put(KEY_CORRECT, "3");

        cv532.put(KEY_ID, 32);
        cv532.put(KEY_QUESTION, "A woman says, 'If you reverse my own age, the figures represent my husband's age. He is, of course, senior to me and the difference between our ages is one-eleventh of their sum.' The woman's age is");
        cv532.put(KEY_OPA, "23 ");
        cv532.put(KEY_OPB, "34");
        cv532.put(KEY_OPC, "45");
        cv532.put(KEY_OPD, "Data Inadequate");
        cv532.put(KEY_OPE, "None of the above");
        cv532.put(KEY_CORRECT, "3");

        cv533.put(KEY_ID, 33);
        cv533.put(KEY_QUESTION, "A girl counted in the following way on the fingers of her left hand : She started by calling the thumb 1, the index finger 2, middle finger 3, ring finger 4, little finger 5 and then reversed direction calling the ring finger 6, middle finger 7 and so on. She counted upto 1994. She ended counting on which finger ?");
        cv533.put(KEY_OPA, "Thumb");
        cv533.put(KEY_OPB, "Index finger");
        cv533.put(KEY_OPC, "Middle finger");
        cv533.put(KEY_OPD, "Ring finger ");
        cv533.put(KEY_OPE, "None of the above");
        cv533.put(KEY_CORRECT, "2");

        cv534.put(KEY_ID, 34);
        cv534.put(KEY_QUESTION, "A man has Rs. 480 in the denominations of one-rupee notes, five-rupee notes and ten-rupee notes. The number of notes of each denomination is equal. What is the total number of notes that he has ?");
        cv534.put(KEY_OPA, "45");
        cv534.put(KEY_OPB, "60");
        cv534.put(KEY_OPC, "75");
        cv534.put(KEY_OPD, "90");
        cv534.put(KEY_OPE, "None of the above");
        cv534.put(KEY_CORRECT, "4");

        cv535.put(KEY_ID, 35);
        cv535.put(KEY_QUESTION, "What is the product of all the numbers in the dial of a telephone ?");
        cv535.put(KEY_OPA, "158480");
        cv535.put(KEY_OPB, "158450");
        cv535.put(KEY_OPC, "159480");
        cv535.put(KEY_OPD, "Data Inadequate");
        cv535.put(KEY_OPE, "None of the above");
        cv535.put(KEY_CORRECT, "5");

        cv536.put(KEY_ID, 36);
        cv536.put(KEY_QUESTION, "A is 3 years older to B and 3 years younger to C, while B and D are twins. How many years older is C to D?");
        cv536.put(KEY_OPA, "2");
        cv536.put(KEY_OPB, "3");
        cv536.put(KEY_OPC, "6");
        cv536.put(KEY_OPD, "12");
        cv536.put(KEY_OPE, "None of the above");
        cv536.put(KEY_CORRECT, "3");

        cv537.put(KEY_ID, 37);
        cv537.put(KEY_QUESTION, "The 30 members of a club decided to play a badminton singles tournament. Every time a member loses a game he is out of the tournament. There are no ties. What is the minimum number of matches that must be played to determine the winner ?");
        cv537.put(KEY_OPA, "15");
        cv537.put(KEY_OPB, "29");
        cv537.put(KEY_OPC, "61");
        cv537.put(KEY_OPD, "45");
        cv537.put(KEY_OPE, "None of the above");
        cv537.put(KEY_CORRECT, "2");

        cv538.put(KEY_ID, 38);
        cv538.put(KEY_QUESTION, "In a garden, there are 10 rows and 12 columns of mango trees. The distance between the two trees is 2 metres and a distance of one metre is left from all sides of the boundary of the garden. The length of the garden is");
        cv538.put(KEY_OPA, "20 m");
        cv538.put(KEY_OPB, "22 m");
        cv538.put(KEY_OPC, "24 m");
        cv538.put(KEY_OPD, "26 m");
        cv538.put(KEY_OPE, "None of the above");
        cv538.put(KEY_CORRECT, "3");

        cv539.put(KEY_ID, 39);
        cv539.put(KEY_QUESTION, "12 year old Manick is three times as old as his brother Rahul. How old will Manick be when he is twice as old as Rahul ?");
        cv539.put(KEY_OPA, "14");
        cv539.put(KEY_OPB, "16");
        cv539.put(KEY_OPC, "18");
        cv539.put(KEY_OPD, "20");
        cv539.put(KEY_OPE, "None of the above");
        cv539.put(KEY_CORRECT, "2");

        cv540.put(KEY_ID, 40);
        cv540.put(KEY_QUESTION, "A tailor had a number of shirt pieces to cut from a roll of fabric. He cut each roll of equal length into 10 pieces. He cut at the rate of 45 cuts a minute. How many rolls would be cut in 24 minutes ?");
        cv540.put(KEY_OPA, "32 rolls");
        cv540.put(KEY_OPB, "54 rolls");
        cv540.put(KEY_OPC, "108 rolls");
        cv540.put(KEY_OPD, "120 rolls");
        cv540.put(KEY_OPE, "None of the above");
        cv540.put(KEY_CORRECT, "4");

        cv541.put(KEY_ID, 41);
        cv541.put(KEY_QUESTION, "In a class of 60 students, the number of boys and girls participating in the annual sports is in the ratio 3 : 2 respectively. The number of girls not participating in the sports is 5 more than the number of boys not participating in the sports. If the number of boys participating in the sports is 15, then how many girls are there in the class ?");
        cv541.put(KEY_OPA, "20");
        cv541.put(KEY_OPB, "25");
        cv541.put(KEY_OPC, "30");
        cv541.put(KEY_OPD, "Data inadequate");
        cv541.put(KEY_OPE, "None of the above");
        cv541.put(KEY_CORRECT, "3");

        cv542.put(KEY_ID, 42);
        cv542.put(KEY_QUESTION, "There are deer and peacocks in a zoo. By counting heads they are 80. The number of their legs is 200. How many peacocks are there ?");
        cv542.put(KEY_OPA, "20");
        cv542.put(KEY_OPB, "30");
        cv542.put(KEY_OPC, "50");
        cv542.put(KEY_OPD, "60");
        cv542.put(KEY_OPE, "None of the above");
        cv542.put(KEY_CORRECT, "4");

        cv543.put(KEY_ID, 43);
        cv543.put(KEY_QUESTION, "A man wears socks of two colours - Black and brown. He has altogether 20 black socks and 20 brown socks in a drawer. Supposing he has to take out the socks in the darKEY_ID,how many must he take out to be sure that he has a matching pair ?");
        cv543.put(KEY_OPA, "3");
        cv543.put(KEY_OPB, "20");
        cv543.put(KEY_OPC, "39");
        cv543.put(KEY_OPD, "Data inadequate");
        cv543.put(KEY_OPE, "None of the above");
        cv543.put(KEY_CORRECT, "1");

        cv544.put(KEY_ID, 44);
        cv544.put(KEY_QUESTION, "A motorist knows four different routes from Bristol to Birmingham. From Birmingham to Sheffield he knows three different routes and from Sheffield to Carlisle he knows two different routes. How many routes does he know from Bristol to Carlisle ?");
        cv544.put(KEY_OPA, "4");
        cv544.put(KEY_OPB, "8");
        cv544.put(KEY_OPC, "12");
        cv544.put(KEY_OPD, "24");
        cv544.put(KEY_OPE, "None of the above");
        cv544.put(KEY_CORRECT, "4");

        cv545.put(KEY_ID, 45);
        cv545.put(KEY_QUESTION, "Mac has $ 3 more than Ken, but then Ken wins on the horses and trebles his money, so that he now has $ 2 more than the original amount of money that the two boys had between them. How much money did Mac and Ken have between them before Ken's win ?");
        cv545.put(KEY_OPA, "$9");
        cv545.put(KEY_OPB, "$11");
        cv545.put(KEY_OPC, "$13");
        cv545.put(KEY_OPD, "$15");
        cv545.put(KEY_OPE, "None of the above");
        cv545.put(KEY_CORRECT, "3");

        cv546.put(KEY_ID, 46);
        cv546.put(KEY_QUESTION, "In a class, there are 18 boys who are over 160 cm tall. If these constitute three-fourths of the boys and the total number of boys is two-thirds of the total number of students in the class, what is the number of girls in the class ?");
        cv546.put(KEY_OPA, "6");
        cv546.put(KEY_OPB, "12");
        cv546.put(KEY_OPC, "18");
        cv546.put(KEY_OPD, "24");
        cv546.put(KEY_OPE, "None of the above");
        cv546.put(KEY_CORRECT, "2");

        cv547.put(KEY_ID, 47);
        cv547.put(KEY_QUESTION, "A waiter's salary consists of his salary and tips. During one week his tips were 5/4 of his salary. What fraction of his income came from tips ?");
        cv547.put(KEY_OPA, "4/9");
        cv547.put(KEY_OPB, "5/4");
        cv547.put(KEY_OPC, "5/8");
        cv547.put(KEY_OPD, "5/9");
        cv547.put(KEY_OPE, "None of the above");
        cv547.put(KEY_CORRECT, "4");

        cv548.put(KEY_ID, 48);
        cv548.put(KEY_QUESTION, "If you write down all the numbers from 1 to 100, then how many times do you write 3 ?");
        cv548.put(KEY_OPA, "11");
        cv548.put(KEY_OPB, "18");
        cv548.put(KEY_OPC, "20");
        cv548.put(KEY_OPD, "21");
        cv548.put(KEY_OPE, "None of the above");
        cv548.put(KEY_CORRECT, "3");

        cv549.put(KEY_ID, 49);
        cv549.put(KEY_QUESTION, "If 100 cats kill 100 mice in 100 days, then 4 cats would kill 4 mice in how many days ?");
        cv549.put(KEY_OPA, "1");
        cv549.put(KEY_OPB, "4");
        cv549.put(KEY_OPC, "40");
        cv549.put(KEY_OPD, "100");
        cv549.put(KEY_OPE, "None of the above");
        cv549.put(KEY_CORRECT, "4");

        cv550.put(KEY_ID, 50);
        cv550.put(KEY_QUESTION, "A bus starts from city X. The number of women in the bus is half of the number of men. In city Y, 10 men leave the bus and five women enter. Now, number of men and women is equal. In the beginning, how many passengers entered the bus ?");
        cv550.put(KEY_OPA, "15");
        cv550.put(KEY_OPB, "30");
        cv550.put(KEY_OPC, "36");
        cv550.put(KEY_OPD, "45");
        cv550.put(KEY_OPE, "None of the above");
        cv550.put(KEY_CORRECT, "4");

        cv551.put(KEY_PID, 1);
        cv551.put(KEY_PARA, " In a school, there were five teachers.\nA and B were teaching Hindi and English.\nC and D were teaching English and Geography.\nD and A were teaching Mathematics and Hindi.\nE and B were teaching History and French.");

        cv552.put(KEY_PID, 2);
        cv552.put(KEY_PARA, "Madhu and Shobha are good in Dramatics and Computer Science.\nAnjali and Madhu are good in Computer Science and Physics.\nAnjali, Poonam and Nisha are good in Physics and Mathematics.\nPoonam and Shobha are good in History and Dramatics.");

        cv553.put(KEY_PID, 3);
        cv553.put(KEY_PARA, "Four youngmen Raj, Prem, Ved and Ashok are friendly with four girls Sushma, Kushum, Vimla and Poonam.\nSushma and Vimla are friends.\nVed's girl friend does not like Sushma and Vimla.\nKusum does not care for Ved.\nPrem's girl friend is friendly with Sushma. Sushma does not like Raj. ");

        cv554.put(KEY_PID, 4);
        cv554.put(KEY_PARA, "Of the five boys A, B, C, D and E two are good, one is poor and two are average is studies.Two of them study in post-graduate classes and there in under-graduate classes. One comes from a rich family, two from middle-class families and two from poor families. One of them is interested in music, two in acting and one in sports. Of those studying in under-graduate classes, two are average and one is poor in studies. Of the two boys interested in acting, one is a post-graduate student. The one interested in music comes from a middle-class family. Both the boys interested in acting are not industrious. The two boys coming from middle-class families are average in studies and one of them is interested in acting. The boy interested in sports comes from a poor family, while the one interested in music is industrious. E is industrious, good in studies, comes from a poor family and is not interested in acting, music or sports. C is poor in studies inspite of being industrious. A comes from a ri		ch family and is not industrious but good in studies. B is industrious and comes from a middle-class family.");

        cv555.put(KEY_PID, 5);
        cv555.put(KEY_PARA, "A, B, C, D and E are five towns out of which two are hill stations and the rest are in plain. Two towns, which are in plain, are harbours. Four towns out of five are capitals and two are industrial towns. Population of two towns is less than 5 lacs. It is 20 lacs of one town and more than 50lacs of two towns. Two towns are on the same latitudes and other two are on the same longitudes. Latitudes and longitudes of both harbours are different and out of these one is an industrial town. The population of both industrial towns is more than 50 lacs. The longitudes of one hill station and one of the industrial towns are same. The latitudes and longitudes of the other hill station and other harbour are different. One industrial town is neither a hill station nor a harbour. None of the hill stations is an industrial town. The hill station of which longitudes of A and E are same. E is a harbour. The latitudes of D and C are same and the population of D is 20 lacs. Both the harbours are capitals 	and one of them is an industrial town.");

        cv556.put(KEY_PID, 6);
        cv556.put(KEY_PARA, "(i) In a family of six persons, there are people from three generations. Each person has separate profession and also they like different colours. There are two couples in the family.\n(ii) Rohan is a CA and his wife neither is a doctor nor likes green colour.\n(iii) Engineer likes red colour and his wife is a teacher.\n(iv) Mohini is mother-in-law of Sunita and she likes orange colour.\n(v) Vinod is grandfather of Tanmay and Tanmay, who is a principal, likes black colour.\n(vi) Nanu is grand-daughter of Mohini and she likes blue colour. Nanu’s mother likes white colour. ");

        cv557.put(KEY_PID, 7);
        cv557.put(KEY_PARA, "(i) A, B, C, D, E and F are six members in a family in which there are two married couples.\n(ii) D is brother of F. Both D and F are lighter than B.\n(iii) B is mother of D and lighter than E.\n(iv) C, a lady, is neither heaviest nor the lightest in the family.\n(v) E is lighter than C.\n(vi) The grandfather in the family is the heaviest.");

        cv558.put(KEY_PID, 8);
        cv558.put(KEY_PARA, "At an Electronic Data Processing Unit, five out of the eight program sets P, Q, R, S, T, U, V and W are  to be operated daily. On any one day, except for the first day of a month, only three of the program sets must be the ones that were operated on the previous day. The program operating must also satisfy the following conditions :\n(i). If program P is to be operated on a day, V cannot be operated on that day.\n(ii). If Q is to be operated on a day, T must be one of the programs to be operated after Q.\n(iii). If R is to be operated on a day, V must be one of the programs to be operated after R.\n(iv). The last program to be operated on any day must be either S or U.");

        cv559.put(KEY_PID, 9);
        cv559.put(KEY_PARA, "From amongst five doctors A, B, C, D and E, four engineers G, H, K and L and six teachers M, N, O, P, Q and R, some teams are to be selected. Of these, A, B, G, H, O, P and Q are females and the rest are males.\nThe formation of teams is subject to the following conditions :\nWherever there is a male doctor, there will be no female teacher.\nWherever there is a male engineer, there will be no female doctor.\nThere shall not be more than two male teachers in any team.");

        cv560.put(KEY_PID, 10);
        cv560.put(KEY_PARA, "A sales representative plans to visit each of six companies M, N, P, Q, R and S exactly once during the course of one day. She is setting up her schedule for the day according to the following conditions :\n(i). She must visit M before N and R.\n(ii). She must visit N before Q.\n(iii). The third company she visits must be P.");

        db.insert(KEY_SUFFICIENCY, null, cv1);
        db.insert(KEY_SUFFICIENCY, null, cv2);
        db.insert(KEY_SUFFICIENCY, null, cv3);
        db.insert(KEY_SUFFICIENCY, null, cv4);
        db.insert(KEY_SUFFICIENCY, null, cv5);
        db.insert(KEY_SUFFICIENCY, null, cv6);
        db.insert(KEY_SUFFICIENCY, null, cv7);
        db.insert(KEY_SUFFICIENCY, null, cv8);
        db.insert(KEY_SUFFICIENCY, null, cv9);
        db.insert(KEY_SUFFICIENCY, null, cv10);
        db.insert(KEY_SUFFICIENCY, null, cv11);
        db.insert(KEY_SUFFICIENCY, null, cv12);
        db.insert(KEY_SUFFICIENCY, null, cv13);
        db.insert(KEY_SUFFICIENCY, null, cv14);
        db.insert(KEY_SUFFICIENCY, null, cv15);
        db.insert(KEY_SUFFICIENCY, null, cv16);
        db.insert(KEY_SUFFICIENCY, null, cv17);
        db.insert(KEY_SUFFICIENCY, null, cv18);
        db.insert(KEY_SUFFICIENCY, null, cv19);
        db.insert(KEY_SUFFICIENCY, null, cv20);
        db.insert(KEY_SUFFICIENCY, null, cv21);
        db.insert(KEY_SUFFICIENCY, null, cv22);
        db.insert(KEY_SUFFICIENCY, null, cv23);
        db.insert(KEY_SUFFICIENCY, null, cv24);
        db.insert(KEY_SUFFICIENCY, null, cv25);
        db.insert(KEY_SUFFICIENCY, null, cv26);
        db.insert(KEY_SUFFICIENCY, null, cv27);
        db.insert(KEY_SUFFICIENCY, null, cv28);
        db.insert(KEY_SUFFICIENCY, null, cv29);
        db.insert(KEY_SUFFICIENCY, null, cv30);
        db.insert(KEY_SUFFICIENCY, null, cv31);
        db.insert(KEY_SUFFICIENCY, null, cv32);
        db.insert(KEY_SUFFICIENCY, null, cv33);
        db.insert(KEY_SUFFICIENCY, null, cv34);
        db.insert(KEY_SUFFICIENCY, null, cv35);
        db.insert(KEY_SUFFICIENCY, null, cv36);
        db.insert(KEY_SUFFICIENCY, null, cv37);
        db.insert(KEY_SUFFICIENCY, null, cv38);
        db.insert(KEY_SUFFICIENCY, null, cv39);
        db.insert(KEY_SUFFICIENCY, null, cv40);
        db.insert(KEY_SUFFICIENCY, null, cv41);
        db.insert(KEY_SUFFICIENCY, null, cv42);
        db.insert(KEY_SUFFICIENCY, null, cv43);
        db.insert(KEY_SUFFICIENCY, null, cv44);
        db.insert(KEY_SUFFICIENCY, null, cv45);
        db.insert(KEY_SUFFICIENCY, null, cv46);
        db.insert(KEY_SUFFICIENCY, null, cv47);
        db.insert(KEY_SUFFICIENCY, null, cv48);
        db.insert(KEY_SUFFICIENCY, null, cv49);
        db.insert(KEY_SUFFICIENCY, null, cv50);
        db.insert(KEY_LOGIC, null, cv51);
        db.insert(KEY_LOGIC, null, cv52);
        db.insert(KEY_LOGIC, null, cv53);
        db.insert(KEY_LOGIC, null, cv54);
        db.insert(KEY_LOGIC, null, cv55);
        db.insert(KEY_LOGIC, null, cv56);
        db.insert(KEY_LOGIC, null, cv57);
        db.insert(KEY_LOGIC, null, cv58);
        db.insert(KEY_LOGIC, null, cv59);
        db.insert(KEY_LOGIC, null, cv60);
        db.insert(KEY_LOGIC, null, cv61);
        db.insert(KEY_LOGIC, null, cv62);
        db.insert(KEY_LOGIC, null, cv63);
        db.insert(KEY_LOGIC, null, cv64);
        db.insert(KEY_LOGIC, null, cv65);
        db.insert(KEY_LOGIC, null, cv66);
        db.insert(KEY_LOGIC, null, cv67);
        db.insert(KEY_LOGIC, null, cv68);
        db.insert(KEY_LOGIC, null, cv69);
        db.insert(KEY_LOGIC, null, cv70);
        db.insert(KEY_LOGIC, null, cv71);
        db.insert(KEY_LOGIC, null, cv72);
        db.insert(KEY_LOGIC, null, cv73);
        db.insert(KEY_LOGIC, null, cv74);
        db.insert(KEY_LOGIC, null, cv75);
        db.insert(KEY_LOGIC, null, cv76);
        db.insert(KEY_LOGIC, null, cv77);
        db.insert(KEY_LOGIC, null, cv78);
        db.insert(KEY_LOGIC, null, cv79);
        db.insert(KEY_LOGIC, null, cv80);
        db.insert(KEY_LOGIC, null, cv81);
        db.insert(KEY_LOGIC, null, cv82);
        db.insert(KEY_LOGIC, null, cv83);
        db.insert(KEY_LOGIC, null, cv84);
        db.insert(KEY_LOGIC, null, cv85);
        db.insert(KEY_LOGIC, null, cv86);
        db.insert(KEY_LOGIC, null, cv87);
        db.insert(KEY_LOGIC, null, cv88);
        db.insert(KEY_LOGIC, null, cv89);
        db.insert(KEY_LOGIC, null, cv90);
        db.insert(KEY_LOGIC, null, cv91);
        db.insert(KEY_LOGIC, null, cv92);
        db.insert(KEY_LOGIC, null, cv93);
        db.insert(KEY_LOGIC, null, cv94);
        db.insert(KEY_LOGIC, null, cv95);
        db.insert(KEY_LOGIC, null, cv96);
        db.insert(KEY_LOGIC, null, cv97);
        db.insert(KEY_LOGIC, null, cv98);
        db.insert(KEY_LOGIC, null, cv99);
        db.insert(KEY_LOGIC, null, cv100);
        db.insert(KEY_SERIES, null, cv101);
        db.insert(KEY_SERIES, null, cv102);
        db.insert(KEY_SERIES, null, cv103);
        db.insert(KEY_SERIES, null, cv104);
        db.insert(KEY_SERIES, null, cv105);
        db.insert(KEY_SERIES, null, cv106);
        db.insert(KEY_SERIES, null, cv107);
        db.insert(KEY_SERIES, null, cv108);
        db.insert(KEY_SERIES, null, cv109);
        db.insert(KEY_SERIES, null, cv110);
        db.insert(KEY_SERIES, null, cv111);
        db.insert(KEY_SERIES, null, cv112);
        db.insert(KEY_SERIES, null, cv113);
        db.insert(KEY_SERIES, null, cv114);
        db.insert(KEY_SERIES, null, cv115);
        db.insert(KEY_SERIES, null, cv116);
        db.insert(KEY_SERIES, null, cv117);
        db.insert(KEY_SERIES, null, cv118);
        db.insert(KEY_SERIES, null, cv119);
        db.insert(KEY_SERIES, null, cv120);
        db.insert(KEY_SERIES, null, cv121);
        db.insert(KEY_SERIES, null, cv122);
        db.insert(KEY_SERIES, null, cv123);
        db.insert(KEY_SERIES, null, cv124);
        db.insert(KEY_SERIES, null, cv125);
        db.insert(KEY_SERIES, null, cv126);
        db.insert(KEY_SERIES, null, cv127);
        db.insert(KEY_SERIES, null, cv128);
        db.insert(KEY_SERIES, null, cv129);
        db.insert(KEY_SERIES, null, cv130);
        db.insert(KEY_SERIES, null, cv131);
        db.insert(KEY_SERIES, null, cv132);
        db.insert(KEY_SERIES, null, cv133);
        db.insert(KEY_SERIES, null, cv134);
        db.insert(KEY_SERIES, null, cv135);
        db.insert(KEY_SERIES, null, cv136);
        db.insert(KEY_SERIES, null, cv137);
        db.insert(KEY_SERIES, null, cv138);
        db.insert(KEY_SERIES, null, cv139);
        db.insert(KEY_SERIES, null, cv140);
        db.insert(KEY_SERIES, null, cv141);
        db.insert(KEY_SERIES, null, cv142);
        db.insert(KEY_SERIES, null, cv143);
        db.insert(KEY_SERIES, null, cv144);
        db.insert(KEY_SERIES, null, cv145);
        db.insert(KEY_SERIES, null, cv146);
        db.insert(KEY_SERIES, null, cv147);
        db.insert(KEY_SERIES, null, cv148);
        db.insert(KEY_SERIES, null, cv149);
        db.insert(KEY_SERIES, null, cv150);
        db.insert(KEY_RELATION, null, cv201);
        db.insert(KEY_RELATION, null, cv202);
        db.insert(KEY_RELATION, null, cv203);
        db.insert(KEY_RELATION, null, cv204);
        db.insert(KEY_RELATION, null, cv205);
        db.insert(KEY_RELATION, null, cv206);
        db.insert(KEY_RELATION, null, cv207);
        db.insert(KEY_RELATION, null, cv208);
        db.insert(KEY_RELATION, null, cv209);
        db.insert(KEY_RELATION, null, cv210);
        db.insert(KEY_RELATION, null, cv211);
        db.insert(KEY_RELATION, null, cv212);
        db.insert(KEY_RELATION, null, cv213);
        db.insert(KEY_RELATION, null, cv214);
        db.insert(KEY_RELATION, null, cv215);
        db.insert(KEY_RELATION, null, cv216);
        db.insert(KEY_RELATION, null, cv217);
        db.insert(KEY_RELATION, null, cv218);
        db.insert(KEY_RELATION, null, cv219);
        db.insert(KEY_RELATION, null, cv220);
        db.insert(KEY_RELATION, null, cv221);
        db.insert(KEY_RELATION, null, cv222);
        db.insert(KEY_RELATION, null, cv223);
        db.insert(KEY_RELATION, null, cv224);
        db.insert(KEY_RELATION, null, cv225);
        db.insert(KEY_RELATION, null, cv226);
        db.insert(KEY_RELATION, null, cv227);
        db.insert(KEY_RELATION, null, cv228);
        db.insert(KEY_RELATION, null, cv229);
        db.insert(KEY_RELATION, null, cv230);
        db.insert(KEY_RELATION, null, cv231);
        db.insert(KEY_RELATION, null, cv232);
        db.insert(KEY_RELATION, null, cv233);
        db.insert(KEY_RELATION, null, cv234);
        db.insert(KEY_RELATION, null, cv235);
        db.insert(KEY_RELATION, null, cv236);
        db.insert(KEY_RELATION, null, cv237);
        db.insert(KEY_RELATION, null, cv238);
        db.insert(KEY_RELATION, null, cv239);
        db.insert(KEY_RELATION, null, cv240);
        db.insert(KEY_RELATION, null, cv241);
        db.insert(KEY_RELATION, null, cv242);
        db.insert(KEY_RELATION, null, cv243);
        db.insert(KEY_RELATION, null, cv244);
        db.insert(KEY_RELATION, null, cv245);
        db.insert(KEY_RELATION, null, cv246);
        db.insert(KEY_RELATION, null, cv247);
        db.insert(KEY_RELATION, null, cv248);
        db.insert(KEY_RELATION, null, cv249);
        db.insert(KEY_RELATION, null, cv250);
        db.insert(KEY_MISC, null, cv451);
        db.insert(KEY_MISC, null, cv452);
        db.insert(KEY_MISC, null, cv453);
        db.insert(KEY_MISC, null, cv454);
        db.insert(KEY_MISC, null, cv455);
        db.insert(KEY_MISC, null, cv456);
        db.insert(KEY_MISC, null, cv457);
        db.insert(KEY_MISC, null, cv458);
        db.insert(KEY_MISC, null, cv459);
        db.insert(KEY_MISC, null, cv460);
        db.insert(KEY_MISC, null, cv461);
        db.insert(KEY_MISC, null, cv462);
        db.insert(KEY_MISC, null, cv463);
        db.insert(KEY_MISC, null, cv464);
        db.insert(KEY_MISC, null, cv465);
        db.insert(KEY_MISC, null, cv466);
        db.insert(KEY_MISC, null, cv467);
        db.insert(KEY_MISC, null, cv468);
        db.insert(KEY_MISC, null, cv469);
        db.insert(KEY_MISC, null, cv470);
        db.insert(KEY_MISC, null, cv471);
        db.insert(KEY_MISC, null, cv472);
        db.insert(KEY_MISC, null, cv473);
        db.insert(KEY_MISC, null, cv474);
        db.insert(KEY_MISC, null, cv475);
        db.insert(KEY_PUZZLE, null, cv476);
        db.insert(KEY_PUZZLE, null, cv477);
        db.insert(KEY_PUZZLE, null, cv478);
        db.insert(KEY_PUZZLE, null, cv479);
        db.insert(KEY_PUZZLE, null, cv480);
        db.insert(KEY_PUZZLE, null, cv481);
        db.insert(KEY_PUZZLE, null, cv482);
        db.insert(KEY_PUZZLE, null, cv483);
        db.insert(KEY_PUZZLE, null, cv484);
        db.insert(KEY_PUZZLE, null, cv485);
        db.insert(KEY_PUZZLE, null, cv486);
        db.insert(KEY_PUZZLE, null, cv487);
        db.insert(KEY_PUZZLE, null, cv488);
        db.insert(KEY_PUZZLE, null, cv489);
        db.insert(KEY_PUZZLE, null, cv490);
        db.insert(KEY_PUZZLE, null, cv491);
        db.insert(KEY_PUZZLE, null, cv492);
        db.insert(KEY_PUZZLE, null, cv493);
        db.insert(KEY_PUZZLE, null, cv494);
        db.insert(KEY_PUZZLE, null, cv495);
        db.insert(KEY_PUZZLE, null, cv496);
        db.insert(KEY_PUZZLE, null, cv497);
        db.insert(KEY_PUZZLE, null, cv498);
        db.insert(KEY_PUZZLE, null, cv499);
        db.insert(KEY_PUZZLE, null, cv500);
        db.insert(KEY_PUZZLE, null, cv501);
        db.insert(KEY_PUZZLE, null, cv502);
        db.insert(KEY_PUZZLE, null, cv503);
        db.insert(KEY_PUZZLE, null, cv504);
        db.insert(KEY_PUZZLE, null, cv505);
        db.insert(KEY_PUZZLE, null, cv506);
        db.insert(KEY_PUZZLE, null, cv507);
        db.insert(KEY_PUZZLE, null, cv508);
        db.insert(KEY_PUZZLE, null, cv509);
        db.insert(KEY_PUZZLE, null, cv510);
        db.insert(KEY_PUZZLE, null, cv511);
        db.insert(KEY_PUZZLE, null, cv512);
        db.insert(KEY_PUZZLE, null, cv513);
        db.insert(KEY_PUZZLE, null, cv514);
        db.insert(KEY_PUZZLE, null, cv515);
        db.insert(KEY_PUZZLE, null, cv516);
        db.insert(KEY_PUZZLE, null, cv517);
        db.insert(KEY_PUZZLE, null, cv518);
        db.insert(KEY_PUZZLE, null, cv519);
        db.insert(KEY_PUZZLE, null, cv520);
        db.insert(KEY_PUZZLE, null, cv521);
        db.insert(KEY_PUZZLE, null, cv522);
        db.insert(KEY_PUZZLE, null, cv523);
        db.insert(KEY_PUZZLE, null, cv524);
        db.insert(KEY_PUZZLE, null, cv525);
        db.insert(KEY_MISC, null, cv526);
        db.insert(KEY_MISC, null, cv527);
        db.insert(KEY_MISC, null, cv528);
        db.insert(KEY_MISC, null, cv529);
        db.insert(KEY_MISC, null, cv530);
        db.insert(KEY_MISC, null, cv531);
        db.insert(KEY_MISC, null, cv532);
        db.insert(KEY_MISC, null, cv533);
        db.insert(KEY_MISC, null, cv534);
        db.insert(KEY_MISC, null, cv535);
        db.insert(KEY_MISC, null, cv536);
        db.insert(KEY_MISC, null, cv537);
        db.insert(KEY_MISC, null, cv538);
        db.insert(KEY_MISC, null, cv539);
        db.insert(KEY_MISC, null, cv540);
        db.insert(KEY_MISC, null, cv541);
        db.insert(KEY_MISC, null, cv542);
        db.insert(KEY_MISC, null, cv543);
        db.insert(KEY_MISC, null, cv544);
        db.insert(KEY_MISC, null, cv545);
        db.insert(KEY_MISC, null, cv546);
        db.insert(KEY_MISC, null, cv547);
        db.insert(KEY_MISC, null, cv548);
        db.insert(KEY_MISC, null, cv549);
        db.insert(KEY_MISC, null, cv550);
        db.insert(KEY_PARA, null, cv551);
        db.insert(KEY_PARA, null, cv552);
        db.insert(KEY_PARA, null, cv553);
        db.insert(KEY_PARA, null, cv554);
        db.insert(KEY_PARA, null, cv555);
        db.insert(KEY_PARA, null, cv556);
        db.insert(KEY_PARA, null, cv557);
        db.insert(KEY_PARA, null, cv558);
        db.insert(KEY_PARA, null, cv559);
        db.insert(KEY_PARA, null, cv560);
        db.close();
    }

    @Override
    public void onClick(View v) {
        if (v == b1) {
            Intent in = new Intent(this, Aptitude.class);
            startActivity(in);
        }


    }

}
