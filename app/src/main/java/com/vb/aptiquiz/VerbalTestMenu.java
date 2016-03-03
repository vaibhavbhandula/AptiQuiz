package com.vb.aptiquiz;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;

public class VerbalTestMenu extends AppCompatActivity implements OnClickListener {

    BootstrapButton b1;
    TextView tv;
    String t;

    SQLiteDatabase db;

    final static String KEY_CORRECT = "correct";
    final static String KEY_ID = "Id";
    final static String KEY_QUESTION = "Question";
    final static String KEY_OPA = "optiona";
    final static String KEY_OPB = "optionb";
    final static String KEY_OPC = "optionc";
    final static String KEY_OPD = "optiond";
    final static String KEY_OPE = "optione";
    final static String KEY_DB = "project";
    final static String KEY_COMPLETE_SENTENCE = "comsen";
    final static String KEY_THEME = "theme";
    final static String KEY_CORRECT_SENTENCE = "corsen";
    final static String KEY_IMPORTANT_SENTENCE = "impsen";
    final static String KEY_SELECT_WORD = "selword";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbal_test_menu);
        b1 = (BootstrapButton) findViewById(R.id.button1);
        tv = (TextView) findViewById(R.id.textView3);

        b1.setOnClickListener(this);
        tv.setMovementMethod(new ScrollingMovementMethod());
        t = "Test Instructions :\n\n";
        t += "1.  Pass percentage is 60.\n\n" +
                "2.  There are no negative marks.\n\n" +
                "3.  Number of Questions = 30.\n\n" +
                "4.  Time allotted = 25 minutes.\n\n" +
                "5.  Scroll to view the full question if required.\n\n" +
                "6.  Click on Summary in the Test section to view Test Summary and jump to a question directly.\n\n" +
                "All the Best!!!";
        tv.setText(t);


        db = openOrCreateDatabase(KEY_DB, SQLiteDatabase.CREATE_IF_NECESSARY, null);

        Cursor c1, c2, c3, c4, c5;

        c1 = db.query(KEY_CORRECT_SENTENCE, null, null, null, null, null, null);//cv151 to cv200
        c2 = db.query(KEY_IMPORTANT_SENTENCE, null, null, null, null, null, null);//cv251 to cv300 //verbal
        c3 = db.query(KEY_THEME, null, null, null, null, null, null);//cv301 to cv322
        c4 = db.query(KEY_COMPLETE_SENTENCE, null, null, null, null, null, null);//cv323 to cv400 // verbal
        c5 = db.query(KEY_SELECT_WORD, null, null, null, null, null, null);//cv401 to cv450

        if (c1.getCount() != 50 || c2.getCount() != 50 || c3.getCount() != 22 || c4.getCount() != 78 || c5.getCount() != 50) {
            c1.close();
            c2.close();
            c3.close();
            c4.close();
            c5.close();
            db.close();

            loadQuestions();
        }
    }

    void loadQuestions()

    {

        db = openOrCreateDatabase(KEY_DB, SQLiteDatabase.CREATE_IF_NECESSARY, null);

        ContentValues cv151 = new ContentValues();
        ContentValues cv152 = new ContentValues();
        ContentValues cv153 = new ContentValues();
        ContentValues cv154 = new ContentValues();
        ContentValues cv155 = new ContentValues();
        ContentValues cv156 = new ContentValues();
        ContentValues cv157 = new ContentValues();
        ContentValues cv158 = new ContentValues();
        ContentValues cv159 = new ContentValues();
        ContentValues cv160 = new ContentValues();
        ContentValues cv161 = new ContentValues();
        ContentValues cv162 = new ContentValues();
        ContentValues cv163 = new ContentValues();
        ContentValues cv164 = new ContentValues();
        ContentValues cv165 = new ContentValues();
        ContentValues cv166 = new ContentValues();
        ContentValues cv167 = new ContentValues();
        ContentValues cv168 = new ContentValues();
        ContentValues cv169 = new ContentValues();
        ContentValues cv170 = new ContentValues();
        ContentValues cv171 = new ContentValues();
        ContentValues cv172 = new ContentValues();
        ContentValues cv173 = new ContentValues();
        ContentValues cv174 = new ContentValues();
        ContentValues cv175 = new ContentValues();
        ContentValues cv176 = new ContentValues();
        ContentValues cv177 = new ContentValues();
        ContentValues cv178 = new ContentValues();
        ContentValues cv179 = new ContentValues();
        ContentValues cv180 = new ContentValues();
        ContentValues cv181 = new ContentValues();
        ContentValues cv182 = new ContentValues();
        ContentValues cv183 = new ContentValues();
        ContentValues cv184 = new ContentValues();
        ContentValues cv185 = new ContentValues();
        ContentValues cv186 = new ContentValues();
        ContentValues cv187 = new ContentValues();
        ContentValues cv188 = new ContentValues();
        ContentValues cv189 = new ContentValues();
        ContentValues cv190 = new ContentValues();
        ContentValues cv191 = new ContentValues();
        ContentValues cv192 = new ContentValues();
        ContentValues cv193 = new ContentValues();
        ContentValues cv194 = new ContentValues();
        ContentValues cv195 = new ContentValues();
        ContentValues cv196 = new ContentValues();
        ContentValues cv197 = new ContentValues();
        ContentValues cv198 = new ContentValues();
        ContentValues cv199 = new ContentValues();
        ContentValues cv200 = new ContentValues();
        ContentValues cv251 = new ContentValues();
        ContentValues cv252 = new ContentValues();
        ContentValues cv253 = new ContentValues();
        ContentValues cv254 = new ContentValues();
        ContentValues cv255 = new ContentValues();
        ContentValues cv256 = new ContentValues();
        ContentValues cv257 = new ContentValues();
        ContentValues cv258 = new ContentValues();
        ContentValues cv259 = new ContentValues();
        ContentValues cv260 = new ContentValues();
        ContentValues cv261 = new ContentValues();
        ContentValues cv262 = new ContentValues();
        ContentValues cv263 = new ContentValues();
        ContentValues cv264 = new ContentValues();
        ContentValues cv265 = new ContentValues();
        ContentValues cv266 = new ContentValues();
        ContentValues cv267 = new ContentValues();
        ContentValues cv268 = new ContentValues();
        ContentValues cv269 = new ContentValues();
        ContentValues cv270 = new ContentValues();
        ContentValues cv271 = new ContentValues();
        ContentValues cv272 = new ContentValues();
        ContentValues cv273 = new ContentValues();
        ContentValues cv274 = new ContentValues();
        ContentValues cv275 = new ContentValues();
        ContentValues cv276 = new ContentValues();
        ContentValues cv277 = new ContentValues();
        ContentValues cv278 = new ContentValues();
        ContentValues cv279 = new ContentValues();
        ContentValues cv280 = new ContentValues();
        ContentValues cv281 = new ContentValues();
        ContentValues cv282 = new ContentValues();
        ContentValues cv283 = new ContentValues();
        ContentValues cv284 = new ContentValues();
        ContentValues cv285 = new ContentValues();
        ContentValues cv286 = new ContentValues();
        ContentValues cv287 = new ContentValues();
        ContentValues cv288 = new ContentValues();
        ContentValues cv289 = new ContentValues();
        ContentValues cv290 = new ContentValues();
        ContentValues cv291 = new ContentValues();
        ContentValues cv292 = new ContentValues();
        ContentValues cv293 = new ContentValues();
        ContentValues cv294 = new ContentValues();
        ContentValues cv295 = new ContentValues();
        ContentValues cv296 = new ContentValues();
        ContentValues cv297 = new ContentValues();
        ContentValues cv298 = new ContentValues();
        ContentValues cv299 = new ContentValues();
        ContentValues cv300 = new ContentValues();
        ContentValues cv301 = new ContentValues();
        ContentValues cv302 = new ContentValues();
        ContentValues cv303 = new ContentValues();
        ContentValues cv304 = new ContentValues();
        ContentValues cv305 = new ContentValues();
        ContentValues cv306 = new ContentValues();
        ContentValues cv307 = new ContentValues();
        ContentValues cv308 = new ContentValues();
        ContentValues cv309 = new ContentValues();
        ContentValues cv310 = new ContentValues();
        ContentValues cv311 = new ContentValues();
        ContentValues cv312 = new ContentValues();
        ContentValues cv313 = new ContentValues();
        ContentValues cv314 = new ContentValues();
        ContentValues cv315 = new ContentValues();
        ContentValues cv316 = new ContentValues();
        ContentValues cv317 = new ContentValues();
        ContentValues cv318 = new ContentValues();
        ContentValues cv319 = new ContentValues();
        ContentValues cv320 = new ContentValues();
        ContentValues cv321 = new ContentValues();
        ContentValues cv322 = new ContentValues();
        ContentValues cv323 = new ContentValues();
        ContentValues cv324 = new ContentValues();
        ContentValues cv325 = new ContentValues();
        ContentValues cv326 = new ContentValues();
        ContentValues cv327 = new ContentValues();
        ContentValues cv328 = new ContentValues();
        ContentValues cv329 = new ContentValues();
        ContentValues cv330 = new ContentValues();
        ContentValues cv331 = new ContentValues();
        ContentValues cv332 = new ContentValues();
        ContentValues cv333 = new ContentValues();
        ContentValues cv334 = new ContentValues();
        ContentValues cv335 = new ContentValues();
        ContentValues cv336 = new ContentValues();
        ContentValues cv337 = new ContentValues();
        ContentValues cv338 = new ContentValues();
        ContentValues cv339 = new ContentValues();
        ContentValues cv340 = new ContentValues();
        ContentValues cv341 = new ContentValues();
        ContentValues cv342 = new ContentValues();
        ContentValues cv343 = new ContentValues();
        ContentValues cv344 = new ContentValues();
        ContentValues cv345 = new ContentValues();
        ContentValues cv346 = new ContentValues();
        ContentValues cv347 = new ContentValues();
        ContentValues cv348 = new ContentValues();
        ContentValues cv349 = new ContentValues();
        ContentValues cv350 = new ContentValues();
        ContentValues cv351 = new ContentValues();
        ContentValues cv352 = new ContentValues();
        ContentValues cv353 = new ContentValues();
        ContentValues cv354 = new ContentValues();
        ContentValues cv355 = new ContentValues();
        ContentValues cv356 = new ContentValues();
        ContentValues cv357 = new ContentValues();
        ContentValues cv358 = new ContentValues();
        ContentValues cv359 = new ContentValues();
        ContentValues cv360 = new ContentValues();
        ContentValues cv361 = new ContentValues();
        ContentValues cv362 = new ContentValues();
        ContentValues cv363 = new ContentValues();
        ContentValues cv364 = new ContentValues();
        ContentValues cv365 = new ContentValues();
        ContentValues cv366 = new ContentValues();
        ContentValues cv367 = new ContentValues();
        ContentValues cv368 = new ContentValues();
        ContentValues cv369 = new ContentValues();
        ContentValues cv370 = new ContentValues();
        ContentValues cv371 = new ContentValues();
        ContentValues cv372 = new ContentValues();
        ContentValues cv373 = new ContentValues();
        ContentValues cv374 = new ContentValues();
        ContentValues cv375 = new ContentValues();
        ContentValues cv376 = new ContentValues();
        ContentValues cv377 = new ContentValues();
        ContentValues cv378 = new ContentValues();
        ContentValues cv379 = new ContentValues();
        ContentValues cv380 = new ContentValues();
        ContentValues cv381 = new ContentValues();
        ContentValues cv382 = new ContentValues();
        ContentValues cv383 = new ContentValues();
        ContentValues cv384 = new ContentValues();
        ContentValues cv385 = new ContentValues();
        ContentValues cv386 = new ContentValues();
        ContentValues cv387 = new ContentValues();
        ContentValues cv388 = new ContentValues();
        ContentValues cv389 = new ContentValues();
        ContentValues cv390 = new ContentValues();
        ContentValues cv391 = new ContentValues();
        ContentValues cv392 = new ContentValues();
        ContentValues cv393 = new ContentValues();
        ContentValues cv394 = new ContentValues();
        ContentValues cv395 = new ContentValues();
        ContentValues cv396 = new ContentValues();
        ContentValues cv397 = new ContentValues();
        ContentValues cv398 = new ContentValues();
        ContentValues cv399 = new ContentValues();
        ContentValues cv400 = new ContentValues();
        ContentValues cv401 = new ContentValues();
        ContentValues cv402 = new ContentValues();
        ContentValues cv403 = new ContentValues();
        ContentValues cv404 = new ContentValues();
        ContentValues cv405 = new ContentValues();
        ContentValues cv406 = new ContentValues();
        ContentValues cv407 = new ContentValues();
        ContentValues cv408 = new ContentValues();
        ContentValues cv409 = new ContentValues();
        ContentValues cv410 = new ContentValues();
        ContentValues cv411 = new ContentValues();
        ContentValues cv412 = new ContentValues();
        ContentValues cv413 = new ContentValues();
        ContentValues cv414 = new ContentValues();
        ContentValues cv415 = new ContentValues();
        ContentValues cv416 = new ContentValues();
        ContentValues cv417 = new ContentValues();
        ContentValues cv418 = new ContentValues();
        ContentValues cv419 = new ContentValues();
        ContentValues cv420 = new ContentValues();
        ContentValues cv421 = new ContentValues();
        ContentValues cv422 = new ContentValues();
        ContentValues cv423 = new ContentValues();
        ContentValues cv424 = new ContentValues();
        ContentValues cv425 = new ContentValues();
        ContentValues cv426 = new ContentValues();
        ContentValues cv427 = new ContentValues();
        ContentValues cv428 = new ContentValues();
        ContentValues cv429 = new ContentValues();
        ContentValues cv430 = new ContentValues();
        ContentValues cv431 = new ContentValues();
        ContentValues cv432 = new ContentValues();
        ContentValues cv433 = new ContentValues();
        ContentValues cv434 = new ContentValues();
        ContentValues cv435 = new ContentValues();
        ContentValues cv436 = new ContentValues();
        ContentValues cv437 = new ContentValues();
        ContentValues cv438 = new ContentValues();
        ContentValues cv439 = new ContentValues();
        ContentValues cv440 = new ContentValues();
        ContentValues cv441 = new ContentValues();
        ContentValues cv442 = new ContentValues();
        ContentValues cv443 = new ContentValues();
        ContentValues cv444 = new ContentValues();
        ContentValues cv445 = new ContentValues();
        ContentValues cv446 = new ContentValues();
        ContentValues cv447 = new ContentValues();
        ContentValues cv448 = new ContentValues();
        ContentValues cv449 = new ContentValues();
        ContentValues cv450 = new ContentValues();


        cv151.put(KEY_ID, 1);
        cv151.put(KEY_QUESTION, "The small child does whatever his father WAS DONE.");
        cv151.put(KEY_OPA, "has done");
        cv151.put(KEY_OPB, "did");
        cv151.put(KEY_OPC, "does");
        cv151.put(KEY_OPD, "had done");
        cv151.put(KEY_OPE, "no correction");
        cv151.put(KEY_CORRECT, "3");

        cv152.put(KEY_ID, 2);
        cv152.put(KEY_QUESTION, "There are not many men who are so famous that they are frequently referred to by their SHORT NAMES only");
        cv152.put(KEY_OPA, "initials");
        cv152.put(KEY_OPB, "signature");
        cv152.put(KEY_OPC, "pictures");
        cv152.put(KEY_OPD, "middle name");
        cv152.put(KEY_OPE, "no correction");
        cv152.put(KEY_CORRECT, "1");

        cv153.put(KEY_ID, 3);
        cv153.put(KEY_QUESTION, "The man to WHO I SOLD my house was a cheat.");
        cv153.put(KEY_OPA, "to whom I sell");
        cv153.put(KEY_OPB, "to who I sell");
        cv153.put(KEY_OPC, "to whom I sold");
        cv153.put(KEY_OPD, "who was sold to");
        cv153.put(KEY_OPE, "no correction");
        cv153.put(KEY_CORRECT, "3");

        cv154.put(KEY_ID, 4);
        cv154.put(KEY_QUESTION, "He is too important FOR TOLERATING any delay");
        cv154.put(KEY_OPA, "to tolerate");
        cv154.put(KEY_OPB, "to tolerating");
        cv154.put(KEY_OPC, "at tolerating");
        cv154.put(KEY_OPD, "with tolerating");
        cv154.put(KEY_OPE, "no correction");
        cv154.put(KEY_CORRECT, "1");

        cv155.put(KEY_ID, 5);
        cv155.put(KEY_QUESTION, "The population of Tokyo is GREATER THAN THAT OF ANY OTHER town in the world.");
        cv155.put(KEY_OPA, "greater among any other");
        cv155.put(KEY_OPB, "greater than all other");
        cv155.put(KEY_OPC, "greater than those of any other");
        cv155.put(KEY_OPD, "greater than any otherS");
        cv155.put(KEY_OPE, "no correction");
        cv155.put(KEY_CORRECT, "5");

        cv156.put(KEY_ID, 6);
        cv156.put(KEY_QUESTION, "SHAPES of gods and goddess are worshipped by people.");
        cv156.put(KEY_OPA, "images");
        cv156.put(KEY_OPB, "reflection");
        cv156.put(KEY_OPC, "clay shapes");
        cv156.put(KEY_OPD, "clay toys");
        cv156.put(KEY_OPE, "no correction");
        cv156.put(KEY_CORRECT, "1");

        cv157.put(KEY_ID, 7);
        cv157.put(KEY_QUESTION, "The intruder stood quietly FOR FEW MOMENTS");
        cv157.put(KEY_OPA, "for few time");
        cv157.put(KEY_OPB, "for the few minutes");
        cv157.put(KEY_OPC, "for moments");
        cv157.put(KEY_OPD, "for a few moments");
        cv157.put(KEY_OPE, "no correction");
        cv157.put(KEY_CORRECT, "4");

        cv158.put(KEY_ID, 8);
        cv158.put(KEY_QUESTION, "He confidentially asked the crowd if they thought he was right\nand the crowd shouted THAT THEY DID.");
        cv158.put(KEY_OPA, "that he did");
        cv158.put(KEY_OPB, "that they had");
        cv158.put(KEY_OPC, "that he is");
        cv158.put(KEY_OPD, "that he didn't");
        cv158.put(KEY_OPE, "no correction");
        cv158.put(KEY_CORRECT, "5");

        cv159.put(KEY_ID, 9);
        cv159.put(KEY_QUESTION, "He found the gold coin AS HE CLEANS the floor.");
        cv159.put(KEY_OPA, "as he had cleaned");
        cv159.put(KEY_OPB, "while he cleaned");
        cv159.put(KEY_OPC, "while cleaning");
        cv159.put(KEY_OPD, "while he cleans");
        cv159.put(KEY_OPE, "no correction");
        cv159.put(KEY_CORRECT, "3");

        cv160.put(KEY_ID, 10);
        cv160.put(KEY_QUESTION, "Maria unnecessarily PICKED UP a quarrel with Rani and left the party hurried.");
        cv160.put(KEY_OPA, "has picked up");
        cv160.put(KEY_OPB, "picked on");
        cv160.put(KEY_OPC, "picked");
        cv160.put(KEY_OPD, "picking up");
        cv160.put(KEY_OPE, "no correction");
        cv160.put(KEY_CORRECT, "3");

        cv161.put(KEY_ID, 11);
        cv161.put(KEY_QUESTION, "She cooks, washes dishes, does her homework and THEN RELAXING");
        cv161.put(KEY_OPA, "relaxing then");
        cv161.put(KEY_OPB, "then is relaxing");
        cv161.put(KEY_OPC, "relaxing is then ");
        cv161.put(KEY_OPD, "then relaxes");
        cv161.put(KEY_OPE, "no correction");
        cv161.put(KEY_CORRECT, "4");

        cv162.put(KEY_ID, 12);
        cv162.put(KEY_QUESTION, "Technology MUST USE TO FEED the forces of change");
        cv162.put(KEY_OPA, "must be used to feed");
        cv162.put(KEY_OPB, "must have been using to feed");
        cv162.put(KEY_OPC, "must use having fed");
        cv162.put(KEY_OPD, "must be using to feed");
        cv162.put(KEY_OPE, "no correction");
        cv162.put(KEY_CORRECT, "1");

        cv163.put(KEY_ID, 13);
        cv163.put(KEY_QUESTION, "They ARE NOT BEWARE OF all the facts");
        cv163.put(KEY_OPA, "are not aware for");
        cv163.put(KEY_OPB, "are not aware of");
        cv163.put(KEY_OPC, "are not to be aware");
        cv163.put(KEY_OPD, "must not to be aware of");
        cv163.put(KEY_OPE, "no correction");
        cv163.put(KEY_CORRECT, "1");

        cv164.put(KEY_ID, 14);
        cv164.put(KEY_QUESTION, "We CAN NOT ALWAYS CONVEY ourselves in simple sentences.");
        cv164.put(KEY_OPA, "cannot always convey");
        cv164.put(KEY_OPB, "can not always express");
        cv164.put(KEY_OPC, "cannot always express");
        cv164.put(KEY_OPD, "can not always convey");
        cv164.put(KEY_OPE, "no correction");
        cv164.put(KEY_CORRECT, "3");

        cv165.put(KEY_ID, 15);
        cv165.put(KEY_QUESTION, "As there was no time, the remaining items WERE DEFERRED INTO the next meeting");
        cv165.put(KEY_OPA, "are deferred till");
        cv165.put(KEY_OPB, "were deferred till");
        cv165.put(KEY_OPC, "were deferred to");
        cv165.put(KEY_OPD, "had deferred with");
        cv165.put(KEY_OPE, "no correction");
        cv165.put(KEY_CORRECT, "2");

        cv166.put(KEY_ID, 16);
        cv166.put(KEY_QUESTION, "What DOES AGONISE ME MOST is not this criticism, but the trivial reason behind it.");
        cv166.put(KEY_OPA, "most agonising me");
        cv166.put(KEY_OPB, "agonising me most");
        cv166.put(KEY_OPC, "agonises me most");
        cv166.put(KEY_OPD, "I most agonised");
        cv166.put(KEY_OPE, "no correction");
        cv166.put(KEY_CORRECT, "2");

        cv167.put(KEY_ID, 17);
        cv167.put(KEY_QUESTION, "For many centuries in Indian History there was no city so famous LIKE the city of Ujjain.");
        cv167.put(KEY_OPA, "as");
        cv167.put(KEY_OPB, "such as");
        cv167.put(KEY_OPC, "likewise");
        cv167.put(KEY_OPD, "so like");
        cv167.put(KEY_OPE, "no correction");
        cv167.put(KEY_CORRECT, "1");

        cv168.put(KEY_ID, 18);
        cv168.put(KEY_QUESTION, "We don't know HOW DID THE THIEF MADE an escape.");
        cv168.put(KEY_OPA, "how the thief did make");
        cv168.put(KEY_OPB, "how the thief does make");
        cv168.put(KEY_OPC, "how the thief made");
        cv168.put(KEY_OPD, "how does the thief made");
        cv168.put(KEY_OPE, "no correction");
        cv168.put(KEY_CORRECT, "3");

        cv169.put(KEY_ID, 19);
        cv169.put(KEY_QUESTION, "One of the most significant PHENOMENONS of our time has been the development of cinema.");
        cv169.put(KEY_OPA, "phenomenon");
        cv169.put(KEY_OPB, "phenomena");
        cv169.put(KEY_OPC, "phenomenonna");
        cv169.put(KEY_OPD, "phenomenonns");
        cv169.put(KEY_OPE, "no correction");
        cv169.put(KEY_CORRECT, "2");

        cv170.put(KEY_ID, 20);
        cv170.put(KEY_QUESTION, "Anand has the guts TO RISE FROM the occasion and come out successfully.");
        cv170.put(KEY_OPA, "in rising from");
        cv170.put(KEY_OPB, "to raise with");
        cv170.put(KEY_OPC, "to rise to");
        cv170.put(KEY_OPD, "to rise against");
        cv170.put(KEY_OPE, "no correction");
        cv170.put(KEY_CORRECT, "3");

        cv171.put(KEY_ID, 21);
        cv171.put(KEY_QUESTION, "The orator HAD BEEN LEFT the auditorium before the audience stood up.");
        cv171.put(KEY_OPA, "had been leaving");
        cv171.put(KEY_OPB, "was left");
        cv171.put(KEY_OPC, "had left");
        cv171.put(KEY_OPD, "would leave");
        cv171.put(KEY_OPE, "no correction");
        cv171.put(KEY_CORRECT, "3");

        cv172.put(KEY_ID, 22);
        cv172.put(KEY_QUESTION, "He dislikes the word dislike, ISN'T HE");
        cv172.put(KEY_OPA, "didn't he");
        cv172.put(KEY_OPB, "doesn't he");
        cv172.put(KEY_OPC, "hasn't he");
        cv172.put(KEY_OPD, "does he");
        cv172.put(KEY_OPE, "no correction");
        cv172.put(KEY_CORRECT, "2");

        cv173.put(KEY_ID, 23);
        cv173.put(KEY_QUESTION, "We must TAKE IT GRANTED that Madhu will not come for today's function.");
        cv173.put(KEY_OPA, "take it for granted");
        cv173.put(KEY_OPB, "taking granted");
        cv173.put(KEY_OPC, "took is as granted");
        cv173.put(KEY_OPD, "have it granted");
        cv173.put(KEY_OPE, "no correction");
        cv173.put(KEY_CORRECT, "1");

        cv174.put(KEY_ID, 24);
        cv174.put(KEY_QUESTION, "The research study is an eye-opener and ATTEMPTS TO ACQUAINT us with the problems of poor nations.");
        cv174.put(KEY_OPA, "attempted to acquaint");
        cv174.put(KEY_OPB, "attempts at acquainting");
        cv174.put(KEY_OPC, "attempt to acquaint");
        cv174.put(KEY_OPD, "attempting to acquaint");
        cv174.put(KEY_OPE, "no correction");
        cv174.put(KEY_CORRECT, "2");

        cv175.put(KEY_ID, 25);
        cv175.put(KEY_QUESTION, "It is always better to make people realise the importance of discipline than to IMPOSE THEM ON IT.");
        cv175.put(KEY_OPA, "impose it with them");
        cv175.put(KEY_OPB, "impose them with it");
        cv175.put(KEY_OPC, "imposing them on it");
        cv175.put(KEY_OPD, "impose it on them");
        cv175.put(KEY_OPE, "no correction");
        cv175.put(KEY_CORRECT, "4");

        cv176.put(KEY_ID, 26);
        cv176.put(KEY_QUESTION, "Later he became unpopular because he tried TO LORD IT ON his followers.");
        cv176.put(KEY_OPA, "to lord it for");
        cv176.put(KEY_OPB, "to lord over");
        cv176.put(KEY_OPC, "to lord it over");
        cv176.put(KEY_OPD, "to load it on");
        cv176.put(KEY_OPE, "no correction");
        cv176.put(KEY_CORRECT, "3");

        cv177.put(KEY_ID, 27);
        cv177.put(KEY_QUESTION, "The crops are dying; it MUST NOT HAD rained.");
        cv177.put(KEY_OPA, "must had not");
        cv177.put(KEY_OPB, "must not be");
        cv177.put(KEY_OPC, "must not have");
        cv177.put(KEY_OPD, "must not been");
        cv177.put(KEY_OPE, "no correction");
        cv177.put(KEY_CORRECT, "3");

        cv178.put(KEY_ID, 28);
        cv178.put(KEY_QUESTION, "Hardly DOES THE SUN RISE when the stars disappeared.");
        cv178.put(KEY_OPA, "have the sun rose");
        cv178.put(KEY_OPB, "have the sun risen");
        cv178.put(KEY_OPC, "did the sun rose");
        cv178.put(KEY_OPD, "the sun rose");
        cv178.put(KEY_OPE, "no correction");
        cv178.put(KEY_CORRECT, "2");

        cv179.put(KEY_ID, 29);
        cv179.put(KEY_QUESTION, "You will be late if you DO NOT LEAVE now");
        cv179.put(KEY_OPA, "did not leave");
        cv179.put(KEY_OPB, "will not leave");
        cv179.put(KEY_OPC, "left");
        cv179.put(KEY_OPD, "do not happens to leave");
        cv179.put(KEY_OPE, "no correction");
        cv179.put(KEY_CORRECT, "5");

        cv180.put(KEY_ID, 30);
        cv180.put(KEY_QUESTION, "The train will leave at 8.30 pm, we HAVE BEEN ready by 7.30pm so that, we can reach the station in time.");
        cv180.put(KEY_OPA, "were");
        cv180.put(KEY_OPB, "must be");
        cv180.put(KEY_OPC, "should have");
        cv180.put(KEY_OPD, "are");
        cv180.put(KEY_OPE, "no correction");
        cv180.put(KEY_CORRECT, "2");

        cv181.put(KEY_ID, 31);
        cv181.put(KEY_QUESTION, "All the allegations LEVELLED AGAINST him were found to be baseless");
        cv181.put(KEY_OPA, "level against");
        cv181.put(KEY_OPB, "level with");
        cv181.put(KEY_OPC, "levelling with");
        cv181.put(KEY_OPD, "levelled for");
        cv181.put(KEY_OPE, "no correction");
        cv181.put(KEY_CORRECT, "5");

        cv182.put(KEY_ID, 32);
        cv182.put(KEY_QUESTION, "Ramesh is AS TALL IF NOT, taller than Mahesh.");
        cv182.put(KEY_OPA, "not as tall but");
        cv182.put(KEY_OPB, "not but tall as");
        cv182.put(KEY_OPC, "as tall as, if not");
        cv182.put(KEY_OPD, "if not");
        cv182.put(KEY_OPE, "no correction");
        cv182.put(KEY_CORRECT, "3");

        cv183.put(KEY_ID, 33);
        cv183.put(KEY_QUESTION, "The prosecution failed IN establish in every case today.");
        cv183.put(KEY_OPA, "to");
        cv183.put(KEY_OPB, "on");
        cv183.put(KEY_OPC, "as");
        cv183.put(KEY_OPD, "upon");
        cv183.put(KEY_OPE, "no correction");
        cv183.put(KEY_CORRECT, "1");

        cv184.put(KEY_ID, 34);
        cv184.put(KEY_QUESTION, "One of my drawbacks is that I DO NOT HAVE TO tolerance of ambiguity");
        cv184.put(KEY_OPA, "do not have");
        cv184.put(KEY_OPB, "cannot have");
        cv184.put(KEY_OPC, "am not");
        cv184.put(KEY_OPD, "did not have to");
        cv184.put(KEY_OPE, "no correction");
        cv184.put(KEY_CORRECT, "1");

        cv185.put(KEY_ID, 35);
        cv185.put(KEY_QUESTION, "We demonstrated to them how we WERE PREPARED the artistic patterns");
        cv185.put(KEY_OPA, "are prepared");
        cv185.put(KEY_OPB, "have prepared");
        cv185.put(KEY_OPC, "are preparing");
        cv185.put(KEY_OPD, "had prepared");
        cv185.put(KEY_OPE, "no correction");
        cv185.put(KEY_CORRECT, "4");

        cv186.put(KEY_ID, 36);
        cv186.put(KEY_QUESTION, "Because of his mastery in this field, his suggestions ARE WIDE ACCEPTED");
        cv186.put(KEY_OPA, "are widely accepted");
        cv186.put(KEY_OPB, "are widely acceptance");
        cv186.put(KEY_OPC, "widely acceptance");
        cv186.put(KEY_OPD, "have widely accepted");
        cv186.put(KEY_OPE, "no correction");
        cv186.put(KEY_CORRECT, "1");

        cv187.put(KEY_ID, 37);
        cv187.put(KEY_QUESTION, "They felt humiliated because they realised that they HAD CHEATED.");
        cv187.put(KEY_OPA, "have been cheated");
        cv187.put(KEY_OPB, "had been cheated");
        cv187.put(KEY_OPC, "had been cheating");
        cv187.put(KEY_OPD, "were cheating");
        cv187.put(KEY_OPE, "no correction");
        cv187.put(KEY_CORRECT, "2");

        cv188.put(KEY_ID, 38);
        cv188.put(KEY_QUESTION, "Tax evaders SHOULD HEAVILY PUNISHED as they do it intentionally.");
        cv188.put(KEY_OPA, "should be heavy fined");
        cv188.put(KEY_OPB, "should have heavily fined");
        cv188.put(KEY_OPC, "shall have heavy fine");
        cv188.put(KEY_OPD, "should be heavily fined");
        cv188.put(KEY_OPE, "no correction");
        cv188.put(KEY_CORRECT, "4");

        cv189.put(KEY_ID, 39);
        cv189.put(KEY_QUESTION, "We met him immediately after the session in which he HAD BEEN GIVEN a nice speech");
        cv189.put(KEY_OPA, "would be giving");
        cv189.put(KEY_OPB, "has been given");
        cv189.put(KEY_OPC, "will have given");
        cv189.put(KEY_OPD, "had given");
        cv189.put(KEY_OPE, "no correction");
        cv189.put(KEY_CORRECT, "4");

        cv190.put(KEY_ID, 40);
        cv190.put(KEY_QUESTION, "For some days the new professor lectured ABOVE THE HEADS OF his pupils.");
        cv190.put(KEY_OPA, "over the head of");
        cv190.put(KEY_OPB, "over the heads of");
        cv190.put(KEY_OPC, "on the heads of");
        cv190.put(KEY_OPD, "through the heads of");
        cv190.put(KEY_OPE, "no correction");
        cv190.put(KEY_CORRECT, "4");

        cv191.put(KEY_ID, 41);
        cv191.put(KEY_QUESTION, "We were still standing in the queue when the FILM WAS BEGINNING");
        cv191.put(KEY_OPA, "film began");
        cv191.put(KEY_OPB, "film had began");
        cv191.put(KEY_OPC, "beginning of the film was over");
        cv191.put(KEY_OPD, "film begins");
        cv191.put(KEY_OPE, "no correction");
        cv191.put(KEY_CORRECT, "2");

        cv192.put(KEY_ID, 42);
        cv192.put(KEY_QUESTION, "IF I WOULD HAVE realised the nature of job earlier, I would not have accepted it");
        cv192.put(KEY_OPA, "If I have had");
        cv192.put(KEY_OPB, "In case I would have");
        cv192.put(KEY_OPC, "Had I been");
        cv192.put(KEY_OPD, "Had I");
        cv192.put(KEY_OPE, "no correction");
        cv192.put(KEY_CORRECT, "1");

        cv193.put(KEY_ID, 43);
        cv193.put(KEY_QUESTION, "BY SUCH TIME you finish that chapter, I will write a letter");
        cv193.put(KEY_OPA, "The time when");
        cv193.put(KEY_OPB, "By the time");
        cv193.put(KEY_OPC, "By that time");
        cv193.put(KEY_OPD, "The time");
        cv193.put(KEY_OPE, "no correction");
        cv193.put(KEY_CORRECT, "2");

        cv194.put(KEY_ID, 44);
        cv194.put(KEY_QUESTION, "Friends and comrades, the light has gone AWAY FROM our lives and there is darkness everywhere");
        cv194.put(KEY_OPA, "of");
        cv194.put(KEY_OPB, "out of");
        cv194.put(KEY_OPC, "out off");
        cv194.put(KEY_OPD, "out from");
        cv194.put(KEY_OPE, "no correction");
        cv194.put(KEY_CORRECT, "2");

        cv195.put(KEY_ID, 45);
        cv195.put(KEY_QUESTION, "The tea-estate administration is IN SUCH MESS THERE is no leader to set the things right.");
        cv195.put(KEY_OPA, "in such a mess here");
        cv195.put(KEY_OPB, "in a such mess that here");
        cv195.put(KEY_OPC, "in such a mess that there");
        cv195.put(KEY_OPD, "with such a mess that there");
        cv195.put(KEY_OPE, "no correction");
        cv195.put(KEY_CORRECT, "3");

        cv196.put(KEY_ID, 46);
        cv196.put(KEY_QUESTION, "Because of his ill health, the doctor has advised him NOT TO REFRAIN FROM smoking");
        cv196.put(KEY_OPA, "to not refrain from");
        cv196.put(KEY_OPB, "to resort to");
        cv196.put(KEY_OPC, "to refrain from");
        cv196.put(KEY_OPD, "to be refrain from");
        cv196.put(KEY_OPE, "no correction");
        cv196.put(KEY_CORRECT, "3");

        cv197.put(KEY_ID, 47);
        cv197.put(KEY_QUESTION, "Making friends is more rewarding than TO MAKE ENEMIES");
        cv197.put(KEY_OPA, "to be unsociable");
        cv197.put(KEY_OPB, "to be sociable");
        cv197.put(KEY_OPC, "being unsociable");
        cv197.put(KEY_OPD, "making enemies");
        cv197.put(KEY_OPE, "no correction");
        cv197.put(KEY_CORRECT, "4");

        cv198.put(KEY_ID, 48);
        cv198.put(KEY_QUESTION, "The moment they saw me, they WERE DELIGHT");
        cv198.put(KEY_OPA, "had delighted");
        cv198.put(KEY_OPB, "were delighted");
        cv198.put(KEY_OPC, "was delighted");
        cv198.put(KEY_OPD, "are delighted");
        cv198.put(KEY_OPE, "no correction");
        cv198.put(KEY_CORRECT, "2");

        cv199.put(KEY_ID, 49);
        cv199.put(KEY_QUESTION, "He SHOULD NOT HAD done it");
        cv199.put(KEY_OPA, "had not");
        cv199.put(KEY_OPB, "should had not");
        cv199.put(KEY_OPC, "should not have");
        cv199.put(KEY_OPD, "should have");
        cv199.put(KEY_OPE, "no correction");
        cv199.put(KEY_CORRECT, "3");

        cv200.put(KEY_ID, 50);
        cv200.put(KEY_QUESTION, "The world has seen SMALL real attempt at population and resource planning");
        cv200.put(KEY_OPA, "few");
        cv200.put(KEY_OPB, "little");
        cv200.put(KEY_OPC, "less");
        cv200.put(KEY_OPD, "a few");
        cv200.put(KEY_OPE, "no correction");
        cv200.put(KEY_CORRECT, "2");


        cv251.put(KEY_ID, 1);
        cv251.put(KEY_QUESTION, "The workers are HELL BENT AT GETTING what is due to them.");
        cv251.put(KEY_OPA, "hell bent on getting");
        cv251.put(KEY_OPB, "hell bent for getting");
        cv251.put(KEY_OPC, "hell bent upon getting");
        cv251.put(KEY_OPD, "No improvement");
        cv251.put(KEY_OPE, "none of these");
        cv251.put(KEY_CORRECT, "3");

        cv252.put(KEY_ID, 2);
        cv252.put(KEY_QUESTION, "When it was feared that the serfs might go too far and gain their freedom from serfdom, the protestant leaders joined the princes AT CRUSHING them.");
        cv252.put(KEY_OPA, "into crushing");
        cv252.put(KEY_OPB, "in crushing");
        cv252.put(KEY_OPC, "without crushing");
        cv252.put(KEY_OPD, "No improvement");
        cv252.put(KEY_OPE, "none of these");
        cv252.put(KEY_CORRECT, "2");

        cv253.put(KEY_ID, 3);
        cv253.put(KEY_QUESTION, "IF THE ROOM HAD BEEN BRIGHTER, I would have been able to read for a while before bed time.");
        cv253.put(KEY_OPA, "If the room was brighter");
        cv253.put(KEY_OPB, "If the room are brighter");
        cv253.put(KEY_OPC, "Had the room been brighter");
        cv253.put(KEY_OPD, "No improvement");
        cv253.put(KEY_OPE, "none of these");
        cv253.put(KEY_CORRECT, "3");

        cv254.put(KEY_ID, 4);
        cv254.put(KEY_QUESTION, "The record for the biggest tiger hunt has not been MET since 1911 when Lord Hardinge. then Viceroy of India, shot a tiger than measured 11 feet and 6 inches.");
        cv254.put(KEY_OPA, "improved");
        cv254.put(KEY_OPB, "broken");
        cv254.put(KEY_OPC, "bettered");
        cv254.put(KEY_OPD, "No improvement");
        cv254.put(KEY_OPE, "none of these");
        cv254.put(KEY_CORRECT, "2");

        cv255.put(KEY_ID, 5);
        cv255.put(KEY_QUESTION, "HIS POWERFUL DRSIRE  brought about his downfall.");
        cv255.put(KEY_OPA, "his intense desire");
        cv255.put(KEY_OPB, "his desire for power");
        cv255.put(KEY_OPC, "his fatal desire");
        cv255.put(KEY_OPD, "No improvement");
        cv255.put(KEY_OPE, "none of these");
        cv255.put(KEY_CORRECT, "2");

        cv256.put(KEY_ID, 6);
        cv256.put(KEY_QUESTION, "Will you kindly OPEN the knot?");
        cv256.put(KEY_OPA, "untie");
        cv256.put(KEY_OPB, "break");
        cv256.put(KEY_OPC, "loose");
        cv256.put(KEY_OPD, "No improvement");
        cv256.put(KEY_OPE, "none of these");
        cv256.put(KEY_CORRECT, "1");

        cv257.put(KEY_ID, 7);
        cv257.put(KEY_QUESTION, "He SENT A WORD  to me that he would be coming late.");
        cv257.put(KEY_OPA, "sent word");
        cv257.put(KEY_OPB, "had sent a word");
        cv257.put(KEY_OPC, "sent words");
        cv257.put(KEY_OPD, "No improvement");
        cv257.put(KEY_OPE, "none of these");
        cv257.put(KEY_CORRECT, "1");

        cv258.put(KEY_ID, 8);
        cv258.put(KEY_QUESTION, "John HAD TOLD  me that he hasn't done it yet.");
        cv258.put(KEY_OPA, "told");
        cv258.put(KEY_OPB, "tell");
        cv258.put(KEY_OPC, "was telling");
        cv258.put(KEY_OPD, "No improvement");
        cv258.put(KEY_OPE, "none of these");
        cv258.put(KEY_CORRECT, "2");

        cv259.put(KEY_ID, 9);
        cv259.put(KEY_QUESTION, "If he had time he WILL call you.");
        cv259.put(KEY_OPA, "would have");
        cv259.put(KEY_OPB, "would have had");
        cv259.put(KEY_OPC, " has");
        cv259.put(KEY_OPD, "No improvement");
        cv259.put(KEY_OPE, "none of these");
        cv259.put(KEY_CORRECT, "3");

        cv260.put(KEY_ID, 10);
        cv260.put(KEY_QUESTION, "Will you LEND ME FEW RUPEES in this hour of need?");
        cv260.put(KEY_OPA, "lend me any rupees");
        cv260.put(KEY_OPB, "borrow me a few rupees");
        cv260.put(KEY_OPC, "lend me a few rupees");
        cv260.put(KEY_OPD, "no improvement");
        cv260.put(KEY_OPE, "none of these");
        cv260.put(KEY_CORRECT, "3");

        cv261.put(KEY_ID, 11);
        cv261.put(KEY_QUESTION, "During his long discourse, he did not TOUCH that point.");
        cv261.put(KEY_OPA, "touch upon");
        cv261.put(KEY_OPB, "touch on");
        cv261.put(KEY_OPC, "touch of");
        cv261.put(KEY_OPD, "no improvement");
        cv261.put(KEY_OPE, "none of these");
        cv261.put(KEY_CORRECT, "2");

        cv262.put(KEY_ID, 12);
        cv262.put(KEY_QUESTION, "He found a WOODEN BROKEN CHAIR in the room.");
        cv262.put(KEY_OPA, "wooden and broken chair");
        cv262.put(KEY_OPB, "broken wooden chair");
        cv262.put(KEY_OPC, "broken and wooden chair");
        cv262.put(KEY_OPD, "no improvement");
        cv262.put(KEY_OPE, "none of these");
        cv262.put(KEY_CORRECT, "2");

        cv263.put(KEY_ID, 13);
        cv263.put(KEY_QUESTION, "He could not LOOK anything in the dark room.");
        cv263.put(KEY_OPA, "look at");
        cv263.put(KEY_OPB, "see");
        cv263.put(KEY_OPC, "see through");
        cv263.put(KEY_OPD, "no improvement");
        cv263.put(KEY_OPE, "none of these");
        cv263.put(KEY_CORRECT, "2");

        cv264.put(KEY_ID, 14);
        cv264.put(KEY_QUESTION, "The greatest THING in style is to have a use of metaphor.");
        cv264.put(KEY_OPA, "knowledge");
        cv264.put(KEY_OPB, "command");
        cv264.put(KEY_OPC, "need");
        cv264.put(KEY_OPD, "no improvement");
        cv264.put(KEY_OPE, "none of these");
        cv264.put(KEY_CORRECT, "1");

        cv265.put(KEY_ID, 15);
        cv265.put(KEY_QUESTION, "While crossing the highway a five year old child was knocked OUT by a passing car.");
        cv265.put(KEY_OPA, "away");
        cv265.put(KEY_OPB, "up");
        cv265.put(KEY_OPC, "down");
        cv265.put(KEY_OPD, "no improvement");
        cv265.put(KEY_OPE, "none of these");
        cv265.put(KEY_CORRECT, "3");

        cv266.put(KEY_ID, 16);
        cv266.put(KEY_QUESTION, "hoping not to be disturbed, I sat down in my easy chair to read the book. I WON AS A PRIZE");
        cv266.put(KEY_OPA, "I had won as a prize");
        cv266.put(KEY_OPB, "I have won as prize");
        cv266.put(KEY_OPC, "I had to win as a prize");
        cv266.put(KEY_OPD, "no improvement");
        cv266.put(KEY_OPE, "none of these");
        cv266.put(KEY_CORRECT, "1");

        cv267.put(KEY_ID, 17);
        cv267.put(KEY_QUESTION, "More than one person WAS KILLED in accident.");
        cv267.put(KEY_OPA, "were killed");
        cv267.put(KEY_OPB, "have been killed");
        cv267.put(KEY_OPC, "are killed");
        cv267.put(KEY_OPD, "no improvement");
        cv267.put(KEY_OPE, "none of these");
        cv267.put(KEY_CORRECT, "1");

        cv268.put(KEY_ID, 18);
        cv268.put(KEY_QUESTION, "No one could explain how a calm and balanced person like him could PENETRATE such a mindless act on his friends.");
        cv268.put(KEY_OPA, "perpetuate");
        cv268.put(KEY_OPB, "perpetrate");
        cv268.put(KEY_OPC, "precipitate");
        cv268.put(KEY_OPD, "no improvement");
        cv268.put(KEY_OPE, "none of these");
        cv268.put(KEY_CORRECT, "2");

        cv269.put(KEY_ID, 19);
        cv269.put(KEY_QUESTION, "Five years ago today, I AM SITTING in a small Japanese car, driving across Poland towards Berlin.");
        cv269.put(KEY_OPA, "was sitting");
        cv269.put(KEY_OPB, "sat");
        cv269.put(KEY_OPC, "have been sitting");
        cv269.put(KEY_OPD, "no improvement");
        cv269.put(KEY_OPE, "none of these");
        cv269.put(KEY_CORRECT, "1");

        cv270.put(KEY_ID, 20);
        cv270.put(KEY_QUESTION, "I took the cycle WHICH HE BOUGHT YESTERDAY.");
        cv270.put(KEY_OPA, "I took the cycle which he bought yesterday.");
        cv270.put(KEY_OPB, "that which he had bought yesterday");
        cv270.put(KEY_OPC, "that he bought yesterday");
        cv270.put(KEY_OPD, "no improvement");
        cv270.put(KEY_OPE, "none of these");
        cv270.put(KEY_CORRECT, "3");

        cv271.put(KEY_ID, 21);
        cv271.put(KEY_QUESTION, "Please make it a point to send you letter AT MY ADDRESS");
        cv271.put(KEY_OPA, "on my address");
        cv271.put(KEY_OPB, "in my address");
        cv271.put(KEY_OPC, "to my address");
        cv271.put(KEY_OPD, "no improvement");
        cv271.put(KEY_OPE, "none of these");
        cv271.put(KEY_CORRECT, "3");

        cv272.put(KEY_ID, 22);
        cv272.put(KEY_QUESTION, "If you are living near a market place you should be ready TO BEAR the disturbances caused by traffic.");
        cv272.put(KEY_OPA, "to bear upon");
        cv272.put(KEY_OPB, "to bear with");
        cv272.put(KEY_OPC, "to bear away");
        cv272.put(KEY_OPD, "no improvement");
        cv272.put(KEY_OPE, "none of these");
        cv272.put(KEY_CORRECT, "2");

        cv273.put(KEY_ID, 23);
        cv273.put(KEY_QUESTION, "I hope you won't object TO ME WATCHING while you work.");
        cv273.put(KEY_OPA, "against me watching");
        cv273.put(KEY_OPB, "me to watch");
        cv273.put(KEY_OPC, "to my watching");
        cv273.put(KEY_OPD, "no improvement");
        cv273.put(KEY_OPE, "none of these");
        cv273.put(KEY_CORRECT, "3");

        cv274.put(KEY_ID, 24);
        cv274.put(KEY_QUESTION, "You cannot forbid HIM LEAVING.");
        cv274.put(KEY_OPA, "he leaving");
        cv274.put(KEY_OPB, "his leaving");
        cv274.put(KEY_OPC, "him to leave");
        cv274.put(KEY_OPD, "no improvement");
        cv274.put(KEY_OPE, "none of these");
        cv274.put(KEY_CORRECT, "3");

        cv275.put(KEY_ID, 25);
        cv275.put(KEY_QUESTION, "You have come here with a view TO INSULT ME.");
        cv275.put(KEY_OPA, "to insulting me");
        cv275.put(KEY_OPB, "of insulting me");
        cv275.put(KEY_OPC, "for insulting me");
        cv275.put(KEY_OPD, "no improvement");
        cv275.put(KEY_OPE, "none of these");
        cv275.put(KEY_CORRECT, "1");

        cv276.put(KEY_ID, 26);
        cv276.put(KEY_QUESTION, "20 kms ARE NOT A GREAT DISTANCE in these days of fast moving vehicles.");
        cv276.put(KEY_OPA, "is not a great distance");
        cv276.put(KEY_OPB, "is no distance");
        cv276.put(KEY_OPC, "aren't a great distance");
        cv276.put(KEY_OPD, "no improvement");
        cv276.put(KEY_OPE, "none of these");
        cv276.put(KEY_CORRECT, "1");

        cv277.put(KEY_ID, 27);
        cv277.put(KEY_QUESTION, "THE MORE THEY EARN, MORE THEY SPEND.");
        cv277.put(KEY_OPA, "More they earn, more they spend");
        cv277.put(KEY_OPB, "More they earn, the more they spend");
        cv277.put(KEY_OPC, "The more they earn, the more they spend");
        cv277.put(KEY_OPD, "no improvement");
        cv277.put(KEY_OPE, "none of these");
        cv277.put(KEY_CORRECT, "3");

        cv278.put(KEY_ID, 28);
        cv278.put(KEY_QUESTION, "It became clear that the strangers were heading INTO a serious disaster.");
        cv278.put(KEY_OPA, "along");
        cv278.put(KEY_OPB, "towards");
        cv278.put(KEY_OPC, "for");
        cv278.put(KEY_OPD, "no improvement");
        cv278.put(KEY_OPE, "none of these");
        cv278.put(KEY_CORRECT, "2");

        cv279.put(KEY_ID, 29);
        cv279.put(KEY_QUESTION, "The dissidents HOLD a great problem in every political party.");
        cv279.put(KEY_OPA, "cause");
        cv279.put(KEY_OPB, "give");
        cv279.put(KEY_OPC, "pose");
        cv279.put(KEY_OPD, "no improvement");
        cv279.put(KEY_OPE, "none of these");
        cv279.put(KEY_CORRECT, "1");

        cv280.put(KEY_ID, 30);
        cv280.put(KEY_QUESTION, "I would have waited for you at the station if I KNEW that you would come.");
        cv280.put(KEY_OPA, "had known");
        cv280.put(KEY_OPB, "was knowing");
        cv280.put(KEY_OPC, "has known");
        cv280.put(KEY_OPD, "no improvement");
        cv280.put(KEY_OPE, "none of these");
        cv280.put(KEY_CORRECT, "1");

        cv281.put(KEY_ID, 31);
        cv281.put(KEY_QUESTION, "They are social insects, LIVING IN COMMUNITIES, regulated by definite laws, each member of society bearing well-defined and separate part in the work of a colony");
        cv281.put(KEY_OPA, "who are living in communities");
        cv281.put(KEY_OPB, "living among a community");
        cv281.put(KEY_OPC, "who lives with a community");
        cv281.put(KEY_OPD, "no improvement");
        cv281.put(KEY_OPE, "none of these");
        cv281.put(KEY_CORRECT, "4");

        cv282.put(KEY_ID, 32);
        cv282.put(KEY_QUESTION, "Practically EVERY PART of the banana tree is used by man");
        cv282.put(KEY_OPA, "each part");
        cv282.put(KEY_OPB, "any part");
        cv282.put(KEY_OPC, "most part");
        cv282.put(KEY_OPD, "no improvement");
        cv282.put(KEY_OPE, "none of these");
        cv282.put(KEY_CORRECT, "4");

        cv283.put(KEY_ID, 33);
        cv283.put(KEY_QUESTION, "My OPINION FOR the film is that it will bag the national ward.");
        cv283.put(KEY_OPA, "opinion to");
        cv283.put(KEY_OPB, "opinion about");
        cv283.put(KEY_OPC, "opinion on");
        cv283.put(KEY_OPD, "no improvement");
        cv283.put(KEY_OPE, "none of these");
        cv283.put(KEY_CORRECT, "3");

        cv284.put(KEY_ID, 34);
        cv284.put(KEY_QUESTION, "The end of the examinations is (an) OPPORTUNITY for celebrating");
        cv284.put(KEY_OPA, "chance");
        cv284.put(KEY_OPB, "moment");
        cv284.put(KEY_OPC, "occasion");
        cv284.put(KEY_OPD, "no improvement");
        cv284.put(KEY_OPE, "none of these");
        cv284.put(KEY_CORRECT, "2");

        cv285.put(KEY_ID, 35);
        cv285.put(KEY_QUESTION, "We were NOT the wiser for all this effort to explain the case to us..");
        cv285.put(KEY_OPA, "none");
        cv285.put(KEY_OPB, "neither");
        cv285.put(KEY_OPC, "nevertheless");
        cv285.put(KEY_OPD, "no improvement");
        cv285.put(KEY_OPE, "none of these");
        cv285.put(KEY_CORRECT, "1");

        cv286.put(KEY_ID, 36);
        cv286.put(KEY_QUESTION, "Whenever my students come across new words, I ask them TO LOOK FOR THEM in the dictionary.");
        cv286.put(KEY_OPA, "to look it up");
        cv286.put(KEY_OPB, "to look them up");
        cv286.put(KEY_OPC, "to look at them");
        cv286.put(KEY_OPD, "no improvement");
        cv286.put(KEY_OPE, "none of these");
        cv286.put(KEY_CORRECT, "2");

        cv287.put(KEY_ID, 37);
        cv287.put(KEY_QUESTION, "We look forward to HEAR from you");
        cv287.put(KEY_OPA, "hearing");
        cv287.put(KEY_OPB, "have heard");
        cv287.put(KEY_OPC, "listen");
        cv287.put(KEY_OPD, "no improvement");
        cv287.put(KEY_OPE, "none of these");
        cv287.put(KEY_CORRECT, "1");

        cv288.put(KEY_ID, 38);
        cv288.put(KEY_QUESTION, "It was indeed a shock for her, but she has LATER recovered from it.");
        cv288.put(KEY_OPA, "since");
        cv288.put(KEY_OPB, "then");
        cv288.put(KEY_OPC, "afterwards");
        cv288.put(KEY_OPD, "no improvement");
        cv288.put(KEY_OPE, "none of these");
        cv288.put(KEY_CORRECT, "1");

        cv289.put(KEY_ID, 39);
        cv289.put(KEY_QUESTION, "Realising is the significance of technical education for developing country, the government LAID ASIDE a large sum on it during the last plan-period.");
        cv289.put(KEY_OPA, "laid up");
        cv289.put(KEY_OPB, "set aside");
        cv289.put(KEY_OPC, "laid down");
        cv289.put(KEY_OPD, "no improvement");
        cv289.put(KEY_OPE, "none of these");
        cv289.put(KEY_CORRECT, "2");

        cv290.put(KEY_ID, 40);
        cv290.put(KEY_QUESTION, "If you are not clear about the meaning of a word, it is wise to LOOK TO a dictionary.");
        cv290.put(KEY_OPA, "look for");
        cv290.put(KEY_OPB, "look at");
        cv290.put(KEY_OPC, "look up");
        cv290.put(KEY_OPD, "no improvement");
        cv290.put(KEY_OPE, "none of these");
        cv290.put(KEY_CORRECT, "3");

        cv291.put(KEY_ID, 41);
        cv291.put(KEY_QUESTION, "No sooner HE HAD RETURNED HOME THEN his mother felt happy.");
        cv291.put(KEY_OPA, "had he returned home when");
        cv291.put(KEY_OPB, "he had returned home than");
        cv291.put(KEY_OPC, "did he return home than");
        cv291.put(KEY_OPD, "no improvement");
        cv291.put(KEY_OPE, "none of these");
        cv291.put(KEY_CORRECT, "3");

        cv292.put(KEY_ID, 42);
        cv292.put(KEY_QUESTION, "He should move on to the next point, and not HARP ONE STING ONLY.");
        cv292.put(KEY_OPA, "harp on string only");
        cv292.put(KEY_OPB, "harp only one string");
        cv292.put(KEY_OPC, "harp upon one string only");
        cv292.put(KEY_OPD, "no improvement");
        cv292.put(KEY_OPE, "none of these");
        cv292.put(KEY_CORRECT, "3");

        cv293.put(KEY_ID, 43);
        cv293.put(KEY_QUESTION, "Either HE OR I AM GOING.");
        cv293.put(KEY_OPA, "he or i are going");
        cv293.put(KEY_OPB, "he is going or i am");
        cv293.put(KEY_OPC, "i or he is going");
        cv293.put(KEY_OPD, "no improvement");
        cv293.put(KEY_OPE, "none of these");
        cv293.put(KEY_CORRECT, "4");

        cv294.put(KEY_ID, 44);
        cv294.put(KEY_QUESTION, "I hope you vividly remember the premier of the film when I, MY WIFE AND YOU were present in the hall.");
        cv294.put(KEY_OPA, "my wife, I and you");
        cv294.put(KEY_OPB, "you, I and my wife");
        cv294.put(KEY_OPC, "my wife, you and I");
        cv294.put(KEY_OPD, "no improvement");
        cv294.put(KEY_OPE, "none of these");
        cv294.put(KEY_CORRECT, "3");

        cv295.put(KEY_ID, 45);
        cv295.put(KEY_QUESTION, "To get one's name in the Rowland Ward's book of hunting records was the HOT ambition of every serious hunter.");
        cv295.put(KEY_OPA, "extreme");
        cv295.put(KEY_OPB, "burning");
        cv295.put(KEY_OPC, "high");
        cv295.put(KEY_OPD, "no improvement");
        cv295.put(KEY_OPE, "none of these");
        cv295.put(KEY_CORRECT, "3");

        cv296.put(KEY_ID, 46);
        cv296.put(KEY_QUESTION, "Taxpayers ARE TO be conscious of their privileges.");
        cv296.put(KEY_OPA, "have to");
        cv296.put(KEY_OPB, "need");
        cv296.put(KEY_OPC, "ought to");
        cv296.put(KEY_OPD, "no improvement");
        cv296.put(KEY_OPE, "none of these");
        cv296.put(KEY_CORRECT, "1");

        cv297.put(KEY_ID, 47);
        cv297.put(KEY_QUESTION, "As she was suffering from high fever, she could not FACE the examination.");
        cv297.put(KEY_OPA, "bear");
        cv297.put(KEY_OPB, "suffer");
        cv297.put(KEY_OPC, "take");
        cv297.put(KEY_OPD, "no improvement");
        cv297.put(KEY_OPE, "none of these");
        cv297.put(KEY_CORRECT, "3");

        cv298.put(KEY_ID, 48);
        cv298.put(KEY_QUESTION, "The demonstration PASSED OFF peacefully");
        cv298.put(KEY_OPA, "passed out");
        cv298.put(KEY_OPB, "passed away");
        cv298.put(KEY_OPC, "passed on");
        cv298.put(KEY_OPD, "no improvement");
        cv298.put(KEY_OPE, "none of these");
        cv298.put(KEY_CORRECT, "4");

        cv299.put(KEY_ID, 49);
        cv299.put(KEY_QUESTION, "Every time I GO IN A LIFT to my sixth floor apartment, I remember the calm and serenity of my ancestral home in the village.");
        cv299.put(KEY_OPA, "move in a lift");
        cv299.put(KEY_OPB, "ascend in a lift");
        cv299.put(KEY_OPC, "take a lift");
        cv299.put(KEY_OPD, "no improvement");
        cv299.put(KEY_OPE, "none of these");
        cv299.put(KEY_CORRECT, "3");

        cv300.put(KEY_ID, 50);
        cv300.put(KEY_QUESTION, "In fact, if it hadn't been for his INVALUABLE ADVICE on so many occasions I wouldn't have achieved anything in life.");
        cv300.put(KEY_OPA, "remarkable advice");
        cv300.put(KEY_OPB, "valuable advice");
        cv300.put(KEY_OPC, "priceless suggestion");
        cv300.put(KEY_OPD, "no improvement");
        cv300.put(KEY_OPE, "none of these");
        cv300.put(KEY_CORRECT, "4");

        cv301.put(KEY_ID, 1);
        cv301.put(KEY_QUESTION, "The attainment of individual and organisational goals is mutually interdependent and linked by a common denominator - employee work motivation. Organisational members are motivated to satisfy their personal goals, and they contribute their efforts to the attainment of organisational objectives as means of achieving these personal goals.The passage best supports the statement that motivation -");
        cv301.put(KEY_OPA, "encourages an individual to give priority to personal goals over organisational goals");
        cv301.put(KEY_OPB, "is crucial for the survival of an individual and organisation.");
        cv301.put(KEY_OPC, "is the product of an individual's physical and mental energy.");
        cv301.put(KEY_OPD, "is the external force which induces an individual to contribute his efforts.");
        cv301.put(KEY_OPE, "makes organisation and society inseparable.");
        cv301.put(KEY_CORRECT, "1");

        cv302.put(KEY_ID, 2);
        cv302.put(KEY_QUESTION, "Due to enormous profits involved in smuggling, hundreds of persons have been attracted towards this anti-national activity. Some of them became millionaires overnight. India has a vast coastline both on the Eastern and Western Coast. It has been a heaven for smugglers who have been carrying on their activities with great impunity. There is no doubt, that from time to time certain seizures were made by the enforcement authorities, during raids and ambush but even allowing these losses the smugglers made huge profits.The passage best supports the statement that");
        cv302.put(KEY_OPA, "smuggling hampers the economic development of a nation.");
        cv302.put(KEY_OPB, "smuggling ought to be curbed.");
        cv302.put(KEY_OPC, "authorities are taking strict measures to curb smuggling.");
        cv302.put(KEY_OPD, "smuggling is fast increasing in our country owing to the quick profit it entails");
        cv302.put(KEY_OPE, "None of these");
        cv302.put(KEY_CORRECT, "4");

        cv303.put(KEY_ID, 3);
        cv303.put(KEY_QUESTION, "Though the waste of time or the expenditure on fashions is very large, yet fashions have come to stay. They will not go, come what may. However, what is now required is that strong efforts should be made to displace the excessive craze for fashion from the minds of these youngsters.The passage best supports the statement that:");
        cv303.put(KEY_OPA, "fashion is the need of the day.");
        cv303.put(KEY_OPB, "the excessive craze for fashion is detrimental to one's personality.");
        cv303.put(KEY_OPC, "the hoard for fashion should be done away with so as not to let down the constructive development.");
        cv303.put(KEY_OPD, "work and other activities should be valued more than the outward appearance.");
        cv303.put(KEY_OPE, "None of these");
        cv303.put(KEY_CORRECT, "3");

        cv304.put(KEY_ID, 4);
        cv304.put(KEY_QUESTION, "One of the important humanitarian by-products of technology is the greater dignity and value that it imparts to human labour. In a highly industrialized society, there is no essential difference between Brahmin and Dalit, Muslim and Hindu; they are equally useful and hence equally valuable for in the industrial society individual productivity fixes the size of the pay cheque and this fixes social status.The passage best supports the statement that:");
        cv304.put(KEY_OPA, "technology decides individual's social status.");
        cv304.put(KEY_OPB, "castes and religions are man-made.");
        cv304.put(KEY_OPC, "human labour has dignity and value.");
        cv304.put(KEY_OPD, "all individuals, irrespective of caste and creed, are born equal.");
        cv304.put(KEY_OPE, "industrial society is a great leveller of men.");
        cv304.put(KEY_CORRECT, "3");

        cv305.put(KEY_ID, 5);
        cv305.put(KEY_QUESTION, "The future of women in India is quite bright and let us hope that they will justify their abilities by rising to the occasion. Napoleon was right when he declared that by educating the women we can educate the whole nation. Because a country can never rise without the contribution of 50% of their population.The passage best supports the statement that:");
        cv305.put(KEY_OPA, "India is striving hard for the emancipation of women");
        cv305.put(KEY_OPB, "all women should be well educated.");
        cv305.put(KEY_OPC, "a nation can progress only when women are given equal rights and opportunities as men.");
        cv305.put(KEY_OPD, "women ought to be imparted full freedom to prove their worth and contribute to the progress of the nation");
        cv305.put(KEY_OPE, "None of these");
        cv305.put(KEY_CORRECT, "4");

        cv306.put(KEY_ID, 6);
        cv306.put(KEY_QUESTION, "The prevention of accidents makes it necessary not only that safety devices be used to guard exposed machinery but also that mechanics be instructed in safety rules which they must follow for their own protection, and that lighting in the plant be adequate.The passage best supports the statement that industrial accidents -");
        cv306.put(KEY_OPA, "are always avoidable;");
        cv306.put(KEY_OPB, "may be due to ignorance.");
        cv306.put(KEY_OPC, "cannot be entirely overcome");
        cv306.put(KEY_OPD, "can be eliminated with the help of safety rules.");
        cv306.put(KEY_OPE, "usually result from inadequate machinery.");
        cv306.put(KEY_CORRECT, "4");

        cv307.put(KEY_ID, 7);
        cv307.put(KEY_QUESTION, "To forgive an injury is often considered to be a sign of weakness; it is really a sign of strength. It is easy to allow oneself to be carried away by resentment and hate into an act of vengeance; but it takes a strong character to restrain those natural passions. The man who forgives an injury proves himself to be the superior of the man who wronged himself and puts the wrong-doer to shame.The passage best supports' the statement that:");
        cv307.put(KEY_OPA, "the sufferer alone knows the intensity of his sufferings.");
        cv307.put(KEY_OPB, "people tend to forgive the things happened in the past.");
        cv307.put(KEY_OPC, "natural passions are difficult to suppress.");
        cv307.put(KEY_OPD, "mercy is the noblest form of revenge.");
        cv307.put(KEY_OPE, "a person with calm and composed nature has depth of thought and vision.");
        cv307.put(KEY_CORRECT, "4");

        cv308.put(KEY_ID, 8);
        cv308.put(KEY_QUESTION, "Industrial exhibitions play a major role in a country's economy. Such exhibitions, now regularly held in Delhi, enable us to measure the extent of our own less advanced industrial progress and the mighty industrial power and progress of countries like the U.K., U.S.A. and Russia whose pavilions are the centres of the greatest attention and attractions.The passage best supports the statement that industrial exhibitions -");
        cv308.put(KEY_OPA, "greatly tax the poor economies.");
        cv308.put(KEY_OPB, "are more useful for the developed countries like U.S.A. whose products stand out superior to those of the developing countries.");
        cv308.put(KEY_OPC, "are not of much use to the countries who are industrially backward");
        cv308.put(KEY_OPD, "boost up production qualitatively and quantitatively by analytical comparison of a country's products with those of the developed countries.");
        cv308.put(KEY_OPE, "None of these");
        cv308.put(KEY_CORRECT, "4");

        cv309.put(KEY_ID, 9);
        cv309.put(KEY_QUESTION, "The school has always been the most important means of transferring the wealth of tradition form one generation to the next. This applies today in an even higher degree than in former times for, through the modern development of economy, the family as bearer of tradition and education has become weakened.This passage best supports the statement that for transferring the wealth of tradition from one generation to the next -");
        cv309.put(KEY_OPA, "there are means other than the school.");
        cv309.put(KEY_OPB, "several different sources must be tried.");
        cv309.put(KEY_OPC, "economic development plays a crucial role");
        cv309.put(KEY_OPD, "modern technology must be put to use");
        cv309.put(KEY_OPE, "family, as ever, is the most potent means");
        cv309.put(KEY_CORRECT, "3");

        cv310.put(KEY_ID, 10);
        cv310.put(KEY_QUESTION, "Emerson said that the poet was landlord, Sealord, airlord. The flight of imagination made the poet master of land, sea and air. But a poet's dream of yesterday becomes today an actual achievement and a reality for all men. Even those who invented, improved and perfected the aeroplane could hardly have dreamt of the possibility of flight into outer space.The passage best supports the statement that:");
        cv310.put(KEY_OPA, "seemingly impossible imaginations make one a good poet,");
        cv310.put(KEY_OPB, "all imaginations become a reality some day.");
        cv310.put(KEY_OPC, "what man imagined has never been impossible; he has always turned it a reality through his conception of ideas and sheer hard labour.");
        cv310.put(KEY_OPD, "man has reached the climax of technological development with his exploration into outer space.");
        cv310.put(KEY_OPE, "None of these");
        cv310.put(KEY_CORRECT, "3");

        cv311.put(KEY_ID, 11);
        cv311.put(KEY_QUESTION, "It is up to our government and planners to devise ways and means for the mobilisation of about ten crore workers whose families total up about forty crore men, women and children. Our agriculture is over-manned. A lesser number of agriculturists would mean more purchasing or spending power to every agriculturist. This will result in the shortage of man-power for many commodities to be produced for which there will be a new demand from a prosperous agrarian class. This shortage will be removed by surplus man-power released from agriculture as suggested above.The passage best supports the statement that:");
        cv311.put(KEY_OPA, "employment in production is more fruitful than employment in agriculture.");
        cv311.put(KEY_OPB, "Indian economy is in a poor shape basically due to improper mobilisation of man-power.");
        cv311.put(KEY_OPC, "a shift of labour from agricultural sector to the industrial sector would uplift the living standard.");
        cv311.put(KEY_OPD, "the industrial sector is labour-deficient while the agricultural sector is over-manned in our country.");
        cv311.put(KEY_OPE, "None of these");
        cv311.put(KEY_CORRECT, "2");

        cv312.put(KEY_ID, 12);
        cv312.put(KEY_QUESTION, "Exports and imports, a swelling favourable balance of trade, investments and bank-balances, are not an index or a balance sheet of national prosperity. Till the beginning of the Second World War, English exports were noticeably greater than what they are today. And yet England has greater national prosperity today than it ever had. Because the income of average Englishmen, working as field and factory labourers, clerks, policemen, petty shopkeepers and shop assistants, domestic workers and other low-paid workers, has gone up.The passage best supports the statement that:");
        cv312.put(KEY_OPA, "a country's economic standard can be best adjudged by per capital income");
        cv312.put(KEY_OPB, "a country's balance of trade is the main criteria of determining its economic prosperity.");
        cv312.put(KEY_OPC, "a nation's economy strengthens with the increase in exports");
        cv312.put(KEY_OPD, "English trade has continually increased since the Second World War.");
        cv312.put(KEY_OPE, "None of these");
        cv312.put(KEY_CORRECT, "1");

        cv313.put(KEY_ID, 13);
        cv313.put(KEY_QUESTION, "Satisfaction with co-workers, promotion opportunities, the nature of work, and pay goes with high performance among those with strong growth needs. Among those with weak growth needs, no such relationship is present - and, in fact, satisfaction with promotion opportunities goes with low performance.This passage best supports the statement that:");
        cv313.put(KEY_OPA, "satisfaction is an inevitable organisational variable");
        cv313.put(KEY_OPB, "job satisfaction and performance are directly and closely related.");
        cv313.put(KEY_OPC, "relationship between job satisfaction and performance is moderated by growth need.");
        cv313.put(KEY_OPD, "every organisation has few employees having weak growth need.");
        cv313.put(KEY_OPE, "high performance is essential for organisational effectiveness");
        cv313.put(KEY_CORRECT, "3");

        cv314.put(KEY_ID, 14);
        cv314.put(KEY_QUESTION, "The only true education comes through the stimulation of the child's powers by the demands of the social situations in which he finds himself. Through these demands he is stimulated to act as a member of a unity, to emerge from his original narrowness of action and feeling, and to conceive himself from the standpoint of the welfare of the group to which he belongs. The passage best supports the statement that real education -");
        cv314.put(KEY_OPA, "will take place if the children imbibe action and feeling.");
        cv314.put(KEY_OPB, "will take place if the children are physically strong.");
        cv314.put(KEY_OPC, "is not provided in our schools today.");
        cv314.put(KEY_OPD, "comes through the interaction with social situations.");
        cv314.put(KEY_OPE, "comes from the self-centred approach of the students.");
        cv314.put(KEY_CORRECT, "4");

        cv315.put(KEY_ID, 15);
        cv315.put(KEY_QUESTION, "The press should not be afraid of upholding and supporting a just and righteous cause. It should not be afraid of criticising the government in a healthy manner. The press has to be eternally vigilant to protect the rights of the workers, backward and suppressed sections of the society. It should also give a balanced view of the things so that people can be helped in the formation of a healthy public opinion.The passage best supports the statement that");
        cv315.put(KEY_OPA, "press has a great role to play in a democracy");
        cv315.put(KEY_OPB, "the press is the only means to project to the masses the policies of the government.");
        cv315.put(KEY_OPC, "the freedom of press is essential for the proper functioning of democracy.");
        cv315.put(KEY_OPD, "the press can be used by the governments as an effective media for the upliftment of the backward sections of society.");
        cv315.put(KEY_OPE, "all the information given by the press should be well-articulated so as to gain a good opinion towards the ruling party.");
        cv315.put(KEY_CORRECT, "3");

        cv316.put(KEY_ID, 16);
        cv316.put(KEY_QUESTION, "Throughout the ages the businessman has helped build civilisation's great cities, provided people with luxuries and artists with patronage, and lift his fellow citizens to understand the standard of living. In the last few centuries the businessman has seeded the Industrial Revolution around the world.The passage best supports the statement that the businessman -");
        cv316.put(KEY_OPA, "is accountable to the society");
        cv316.put(KEY_OPB, "lives luxurious and comfortable life.");
        cv316.put(KEY_OPC, "is the beneficiary of the Industrial Revolution..");
        cv316.put(KEY_OPD, "is capable of raising his standard of living.");
        cv316.put(KEY_OPE, "has contributed to the growth of civilisation.");
        cv316.put(KEY_CORRECT, "5");

        cv317.put(KEY_ID, 17);
        cv317.put(KEY_QUESTION, "There is a shift in our economy from a manufacturing to a service orientation. The increase in service-sector will require the managers to work more with people rather than with objects and things from the assembly line.This passage best supports the statement that:");
        cv317.put(KEY_OPA, "managers should have a balanced mind.");
        cv317.put(KEY_OPB, "assembly line will exist in service organisations.");
        cv317.put(KEY_OPC, "interpersonal skills will become more important in the future work place.");
        cv317.put(KEY_OPD, "manufacturing organisations ignore importance of people.");
        cv317.put(KEY_OPE, "service organisations will not deal with objects and things.");
        cv317.put(KEY_CORRECT, "3");

        cv318.put(KEY_ID, 18);
        cv318.put(KEY_QUESTION, "The virtue of art does not allow the work to be interfered with or immediately ruled by anything other than itself. It insists that it alone shall touch the work in order to bring it into being. Art requires that nothing shall attain the work except through art itself.This passage best supports the statement that:");
        cv318.put(KEY_OPA, "art is governed by external rules and conditions");
        cv318.put(KEY_OPB, "art is for the sake of art and life.");
        cv318.put(KEY_OPC, "art is for the sake of art alone..");
        cv318.put(KEY_OPD, "artist realises his dreams through his artistic creation");
        cv318.put(KEY_OPE, "artist should use his art for the sake of society.");
        cv318.put(KEY_CORRECT, "3");

        cv319.put(KEY_ID, 19);
        cv319.put(KEY_QUESTION, "There is a shift in our economy from a manufacturing to a service orientation. The increase in the service sector will require the manager to work more with people rather than with objects and things from the assembly line.This passage best supports the statement that");
        cv319.put(KEY_OPA, " managers should have a balanced mind");
        cv319.put(KEY_OPB, "interpersonal skills will become more important in the future work place");
        cv319.put(KEY_OPC, "manufacturing organisations ignore importance of people");
        cv319.put(KEY_OPD, "service organisation will not deal with objects and things");
        cv319.put(KEY_OPE, "none of these");
        cv319.put(KEY_CORRECT, "3");

        cv320.put(KEY_ID, 20);
        cv320.put(KEY_QUESTION, "Through advertising, manufacturing exercises a high degree of control over consumer's desires. However the manufacturer assumes enormous risks in attempting to predict what consumers will want and in producing goods in quantity and distributing them in advance of final selection by the consumers. The paragraph best supports the statement that manufacturers ");
        cv320.put(KEY_OPA, "distribute goods directly to the consumers ");
        cv320.put(KEY_OPB, "can eliminate the risk of overproducing by advertising");
        cv320.put(KEY_OPC, " always take moderate and calculated risk ");
        cv320.put(KEY_OPD, "None of these");
        cv320.put(KEY_OPE, "can predict with great accuracy the success of any product they put on the market");
        cv320.put(KEY_CORRECT, "2");

        cv321.put(KEY_ID, 21);
        cv321.put(KEY_QUESTION, "To forgive an injury is often considered to be a sign of weakness; it is really a sign of strength. It is easy to allow oneself to be carried away by resentment and hate into an act of vengeance; but it takes a strong character to restrain those natural passions. The man who forgives an injury proves to be superior to the man who wronged himself and puts the wrong-doer to shame.The passage best supports the statement that");
        cv321.put(KEY_OPA, "the sufferer alone knows the intensity of his sufferings");
        cv321.put(KEY_OPB, "people tend to forgive the things happened in the past");
        cv321.put(KEY_OPC, "natural passions are difficult to suppress.");
        cv321.put(KEY_OPD, "mercy is the noblest form of revenge");
        cv321.put(KEY_OPE, "a person with calm and composed nature has depth of thought and vision");
        cv321.put(KEY_CORRECT, "4");

        cv322.put(KEY_ID, 22);
        cv322.put(KEY_QUESTION, "Satisfaction with co-workers, promotion opportunities, the nature of work, and pay goes with high performance among those with strong growth needs. Among those with weak growth needs, no such relationship is present – and, in fact, satisfaction with promotion opportunities goes with low performance.This passage best supports the statement that ");
        cv322.put(KEY_OPA, "satisfaction is an inevitable organisational variable");
        cv322.put(KEY_OPB, "job satisfaction and performance are directly and closely related ");
        cv322.put(KEY_OPC, "relationship between job satisfaction and performance is moderated by growth need.");
        cv322.put(KEY_OPD, " every organisation has few employees having weak growth need");
        cv322.put(KEY_OPE, " high performance is essential for organisational effectiveness");
        cv322.put(KEY_CORRECT, "3");
        /*theme detection till here*/

        cv323.put(KEY_ID, 1);
        cv323.put(KEY_QUESTION, "Standing on the ______, the preacher greeted the parishioners every Sunday morning.");
        cv323.put(KEY_OPA, "steeple");
        cv323.put(KEY_OPB, "pillar");
        cv323.put(KEY_OPC, "parvis");
        cv323.put(KEY_OPD, "manifestation");
        cv323.put(KEY_OPE, "sensor");
        cv323.put(KEY_CORRECT, "3");

        cv324.put(KEY_ID, 2);
        cv324.put(KEY_QUESTION, "Simona’s ______ with her money caught up with her when she didn’t have the resources to buy a badly needed new car.");
        cv324.put(KEY_OPA, "miserliness");
        cv324.put(KEY_OPB, "thriftiness");
        cv324.put(KEY_OPC, "wantonness");
        cv324.put(KEY_OPD, "intuition");
        cv324.put(KEY_OPE, "predilection");
        cv324.put(KEY_CORRECT, "3");

        cv325.put(KEY_ID, 3);
        cv325.put(KEY_QUESTION, "The architect designed the ceiling using wood ______ that would remain uncovered, creating a rustic ambience in the living room.");
        cv325.put(KEY_OPA, "pediments");
        cv325.put(KEY_OPB, "joists");
        cv325.put(KEY_OPC, "mullions");
        cv325.put(KEY_OPD, "banisters");
        cv325.put(KEY_OPE, "abutments");
        cv325.put(KEY_CORRECT, "2");

        cv326.put(KEY_ID, 4);
        cv326.put(KEY_QUESTION, "When the house on the corner burned down, the entire neighborhood ______ together to help to the victims re-establish their lives.");
        cv326.put(KEY_OPA, "rallied");
        cv326.put(KEY_OPB, "recited");
        cv326.put(KEY_OPC, "skulked");
        cv326.put(KEY_OPD, "disintegrated");
        cv326.put(KEY_OPE, "expedited");
        cv326.put(KEY_CORRECT, "1");

        cv327.put(KEY_ID, 5);
        cv327.put(KEY_QUESTION, "The massage therapist’s ______ fingers quickly eased the tension in Blanche’s back.");
        cv327.put(KEY_OPA, "deft");
        cv327.put(KEY_OPB, "furtive");
        cv327.put(KEY_OPC, "listless");
        cv327.put(KEY_OPD, "tentative");
        cv327.put(KEY_OPE, "blithe");
        cv327.put(KEY_CORRECT, "1");

        cv328.put(KEY_ID, 6);
        cv328.put(KEY_QUESTION, "Jade’s parents were in ______ about the decision not to allow her to drive the family car to the prom; they both agreed that it would be unsafe");
        cv328.put(KEY_OPA, "affluence");
        cv328.put(KEY_OPB, "redress");
        cv328.put(KEY_OPC, "refraction");
        cv328.put(KEY_OPD, "discord");
        cv328.put(KEY_OPE, "unison");
        cv328.put(KEY_CORRECT, "5");

        cv329.put(KEY_ID, 7);
        cv329.put(KEY_QUESTION, "As she walked through the halls of her old grade school, Madeline became ______, remembering her old friends and teachers.");
        cv329.put(KEY_OPA, "prolific");
        cv329.put(KEY_OPB, "nostalgic");
        cv329.put(KEY_OPC, "credulous");
        cv329.put(KEY_OPD, "precocious");
        cv329.put(KEY_OPE, "ambitious");
        cv329.put(KEY_CORRECT, "2");

        cv330.put(KEY_ID, 8);
        cv330.put(KEY_QUESTION, "After being cleared of all charges for slander, the attorney was able to go back to work and ______ his role as a prosecutor.");
        cv330.put(KEY_OPA, "inhibit");
        cv330.put(KEY_OPB, "reprimand");
        cv330.put(KEY_OPC, "remand");
        cv330.put(KEY_OPD, "resume");
        cv330.put(KEY_OPE, "dissipate");
        cv330.put(KEY_CORRECT, "4");

        cv331.put(KEY_ID, 9);
        cv331.put(KEY_QUESTION, "Ignacio’s pain was so ______ that he called 911.");
        cv331.put(KEY_OPA, "remiss");
        cv331.put(KEY_OPB, "rapacious");
        cv331.put(KEY_OPC, "genteel");
        cv331.put(KEY_OPD, "resolute");
        cv331.put(KEY_OPE, "acute");
        cv331.put(KEY_CORRECT, "5");

        cv332.put(KEY_ID, 10);
        cv332.put(KEY_QUESTION, "The captain ______ the cargo to keep his ship afloat.");
        cv332.put(KEY_OPA, "rebuked");
        cv332.put(KEY_OPB, "listed");
        cv332.put(KEY_OPC, "disunited");
        cv332.put(KEY_OPD, "flanked");
        cv332.put(KEY_OPE, "jettisoned");
        cv332.put(KEY_CORRECT, "5");

        cv333.put(KEY_ID, 11);
        cv333.put(KEY_QUESTION, "The teacher tried to ______ her class of their dependence on the number lines pasted to the tops of their desks.");
        cv333.put(KEY_OPA, "wane");
        cv333.put(KEY_OPB, "wax");
        cv333.put(KEY_OPC, "whet");
        cv333.put(KEY_OPD, "wean");
        cv333.put(KEY_OPE, "wield");
        cv333.put(KEY_CORRECT, "4");

        cv334.put(KEY_ID, 12);
        cv334.put(KEY_QUESTION, "The young girl was so full of enthusiasm and ______ that she infected the room with energy.");
        cv334.put(KEY_OPA, "languidness");
        cv334.put(KEY_OPB, "apathy");
        cv334.put(KEY_OPC, "vivacity");
        cv334.put(KEY_OPD, "blandness");
        cv334.put(KEY_OPE, "tenacity");
        cv334.put(KEY_CORRECT, "3");

        cv335.put(KEY_ID, 13);
        cv335.put(KEY_QUESTION, "Ricky is a ______ of the local coffee shop; you can find him there just about every morning.");
        cv335.put(KEY_OPA, "diva");
        cv335.put(KEY_OPB, "relic");
        cv335.put(KEY_OPC, "denizen");
        cv335.put(KEY_OPD, "maverick");
        cv335.put(KEY_OPE, "pariah");
        cv335.put(KEY_CORRECT, "3");

        cv336.put(KEY_ID, 14);
        cv336.put(KEY_QUESTION, "The child danced with ______ joy at hearing the news that her father had arrived home from his lengthy business trip.");
        cv336.put(KEY_OPA, "staid");
        cv336.put(KEY_OPB, "unbridled");
        cv336.put(KEY_OPC, "stealthy");
        cv336.put(KEY_OPD, "beneficial");
        cv336.put(KEY_OPE, "restrained");
        cv336.put(KEY_CORRECT, "2");

        cv337.put(KEY_ID, 15);
        cv337.put(KEY_QUESTION, "Having never left the landlocked Midwest his entire life, Albert found that swimming in the ocean was quite a(n) ______.");
        cv337.put(KEY_OPA, "familiarity");
        cv337.put(KEY_OPB, "extrovert");
        cv337.put(KEY_OPC, "instinct");
        cv337.put(KEY_OPD, "novelty");
        cv337.put(KEY_OPE, "tabernacle");
        cv337.put(KEY_CORRECT, "4");

        cv338.put(KEY_ID, 16);
        cv338.put(KEY_QUESTION, "The rowdy crowd at the music concert ______ Herve, and he spilled his soda on his pants.");
        cv338.put(KEY_OPA, "jettisoned");
        cv338.put(KEY_OPB, "harrowed");
        cv338.put(KEY_OPC, "jostled");
        cv338.put(KEY_OPD, "lauded");
        cv338.put(KEY_OPE, "superceded");
        cv338.put(KEY_CORRECT, "3");

        cv339.put(KEY_ID, 17);
        cv339.put(KEY_QUESTION, "Known for his strong command of the courtroom, it was common knowledge that Judge Disantis considered outbursts from defendants to be ______.");
        cv339.put(KEY_OPA, "questionable");
        cv339.put(KEY_OPB, "objectionable");
        cv339.put(KEY_OPC, "antisocial");
        cv339.put(KEY_OPD, "pliable");
        cv339.put(KEY_OPE, "visionary");
        cv339.put(KEY_CORRECT, "2");

        cv340.put(KEY_ID, 18);
        cv340.put(KEY_QUESTION, "Blinded by ______, Nicholas accepted the job offer with the highest pay but the least possibility of making him happy.");
        cv340.put(KEY_OPA, "ennui");
        cv340.put(KEY_OPB, "heresy");
        cv340.put(KEY_OPC, "infamy");
        cv340.put(KEY_OPD, "avarice");
        cv340.put(KEY_OPE, "temperance");
        cv340.put(KEY_CORRECT, "4");

        cv341.put(KEY_ID, 19);
        cv341.put(KEY_QUESTION, "It was very unprofessional of you to ______ your assistant in front of everyone at the meeting; she deserves more respect, and any criticism of her performance should be done in private.");
        cv341.put(KEY_OPA, "placate");
        cv341.put(KEY_OPB, "augment");
        cv341.put(KEY_OPC, "usurp");
        cv341.put(KEY_OPD, "preclude");
        cv341.put(KEY_OPE, "deride");
        cv341.put(KEY_CORRECT, "5");

        cv342.put(KEY_ID, 20);
        cv342.put(KEY_QUESTION, "The log cabin had a(n) ______ feel, so it was often enjoyed by vacationers from the city throughout the year.");
        cv342.put(KEY_OPA, "abstract");
        cv342.put(KEY_OPB, "ersatz");
        cv342.put(KEY_OPC, "rustic");
        cv342.put(KEY_OPD, "raucous");
        cv342.put(KEY_OPE, "repellent");
        cv342.put(KEY_CORRECT, "3");

        cv343.put(KEY_ID, 21);
        cv343.put(KEY_QUESTION, "We knew Jana had ______ motives for running for class president: She wanted the nearby parking space that came with the office.");
        cv343.put(KEY_OPA, "anterior");
        cv343.put(KEY_OPB, "interior");
        cv343.put(KEY_OPC, "inferior");
        cv343.put(KEY_OPD, "posterior");
        cv343.put(KEY_OPE, "posterior");
        cv343.put(KEY_CORRECT, "5");

        cv344.put(KEY_ID, 22);
        cv344.put(KEY_QUESTION, "The town board heard many outraged and ______ arguments from the citizens against the destruction of some wooded areas in order to build a new mall.");
        cv344.put(KEY_OPA, "tenuous");
        cv344.put(KEY_OPB, "vociferous");
        cv344.put(KEY_OPC, "vacuous");
        cv344.put(KEY_OPD, "satisfied");
        cv344.put(KEY_OPE, "egregious");
        cv344.put(KEY_CORRECT, "2");

        cv345.put(KEY_ID, 23);
        cv345.put(KEY_QUESTION, "The villainous gang’s hideout was a den of ______ that no one would dare to enter.");
        cv345.put(KEY_OPA, "innocence");
        cv345.put(KEY_OPB, "habitants");
        cv345.put(KEY_OPC, "iniquity");
        cv345.put(KEY_OPD, "accolades");
        cv345.put(KEY_OPE, "innovation");
        cv345.put(KEY_CORRECT, "3");

        cv346.put(KEY_ID, 24);
        cv346.put(KEY_QUESTION, "Indigestion is a common ______ of participating in a hot-dog eating contest.");
        cv346.put(KEY_OPA, "euphemism");
        cv346.put(KEY_OPB, "penchant");
        cv346.put(KEY_OPC, "corollary");
        cv346.put(KEY_OPD, "juxtaposition");
        cv346.put(KEY_OPE, "itinerary");
        cv346.put(KEY_CORRECT, "3");

        cv347.put(KEY_ID, 25);
        cv347.put(KEY_QUESTION, "Although it was so ridiculous that no one believed it to be true, the reporter’s ______ still cost the governor his re-election");
        cv347.put(KEY_OPA, "hegemony");
        cv347.put(KEY_OPB, "sedition");
        cv347.put(KEY_OPC, "malaise");
        cv347.put(KEY_OPD, "compendium");
        cv347.put(KEY_OPE, "calumny");
        cv347.put(KEY_CORRECT, "5");

        cv348.put(KEY_ID, 26);
        cv348.put(KEY_QUESTION, "People on the street stopped to ______ over the artist’s rendition of the Eiffel Tower, amazed by his ability to capture the detail.");
        cv348.put(KEY_OPA, "bedazzle");
        cv348.put(KEY_OPB, "innovate");
        cv348.put(KEY_OPC, "gratify");
        cv348.put(KEY_OPD, "counteract");
        cv348.put(KEY_OPE, "objectify");
        cv348.put(KEY_CORRECT, "5");

        cv349.put(KEY_ID, 27);
        cv349.put(KEY_QUESTION, "The veteran lieutenant was not happy with his ______ rank behind the two inexperienced men.");
        cv349.put(KEY_OPA, "tertiary");
        cv349.put(KEY_OPB, "silly");
        cv349.put(KEY_OPC, "unctuous");
        cv349.put(KEY_OPD, "superior");
        cv349.put(KEY_OPE, "fastened");
        cv349.put(KEY_CORRECT, "1");

        cv350.put(KEY_ID, 28);
        cv350.put(KEY_QUESTION, "The prime minister was admired by all, a(n) ______ even in an environment of corruption and disdain.");
        cv350.put(KEY_OPA, "admonishment");
        cv350.put(KEY_OPB, "alleviation");
        cv350.put(KEY_OPC, "nonpareil");
        cv350.put(KEY_OPD, "prototype");
        cv350.put(KEY_OPE, "profanation");
        cv350.put(KEY_CORRECT, "3");

        cv351.put(KEY_ID, 29);
        cv351.put(KEY_QUESTION, "Despite his best efforts to conceal his anger ......");
        cv351.put(KEY_OPA, "we could detect that he was very happy");
        cv351.put(KEY_OPB, "he failed to give us an impression of his agony");
        cv351.put(KEY_OPC, "he succeeded in camouflaging his emotions");
        cv351.put(KEY_OPD, "he could succeed in doing it easily");
        cv351.put(KEY_OPE, "people came to know that he was annoyed");
        cv351.put(KEY_CORRECT, "5");

        cv352.put(KEY_ID, 30);
        cv352.put(KEY_QUESTION, "Even if it rains I shall come means ......");
        cv352.put(KEY_OPA, "if I come it will not rain");
        cv352.put(KEY_OPB, "if it rains I shall not come");
        cv352.put(KEY_OPC, "I will certainly come whether it rains or not");
        cv352.put(KEY_OPD, "whenever there is rain I shall come");
        cv352.put(KEY_OPE, "I am less likely to come if it rains");
        cv352.put(KEY_CORRECT, "3");

        cv353.put(KEY_ID, 31);
        cv353.put(KEY_QUESTION, "His appearance is unsmiling but ......");
        cv353.put(KEY_OPA, "his heart is full of compassion for others");
        cv353.put(KEY_OPB, "he looks very serious on most occasions");
        cv353.put(KEY_OPC, "people are afraid of him");
        cv353.put(KEY_OPD, "he is uncompromising on matters of task performance");
        cv353.put(KEY_OPE, "he is full of jealousy towards his colleagues");
        cv353.put(KEY_CORRECT, "1");

        cv354.put(KEY_ID, 32);
        cv354.put(KEY_QUESTION, "She never visits any zoo because she is strong opponent of the idea of ......");
        cv354.put(KEY_OPA, "setting the animals free into forest");
        cv354.put(KEY_OPB, "feeding the animals while others are watching");
        cv354.put(KEY_OPC, "watching the animals in their natural abode");
        cv354.put(KEY_OPD, "going out of the house on a holiday");
        cv354.put(KEY_OPE, "holding the animals in captivity for our joy");
        cv354.put(KEY_CORRECT, "5");

        cv355.put(KEY_ID, 33);
        cv355.put(KEY_QUESTION, "I felt somewhat more relaxed .....");
        cv355.put(KEY_OPA, "but tense as compared to earlier");
        cv355.put(KEY_OPB, "and tense as compared to earlier");
        cv355.put(KEY_OPC, "as there was already no tension at all");
        cv355.put(KEY_OPD, "and tension-free as compared to earlier");
        cv355.put(KEY_OPE, "because the worry had already captured by mind");
        cv355.put(KEY_CORRECT, "4");

        cv356.put(KEY_ID, 34);
        cv356.put(KEY_QUESTION, "It is not easy to remain tranquil when those around you .....");
        cv356.put(KEY_OPA, "behave in a socially acceptable manner");
        cv356.put(KEY_OPB, "exhibit pleasant mannerism");
        cv356.put(KEY_OPC, "are losing their heads");
        cv356.put(KEY_OPD, "agree to whatever you say");
        cv356.put(KEY_OPE, "exhibit generous and magnanimous gestures");
        cv356.put(KEY_CORRECT, "3");

        cv357.put(KEY_ID, 35);
        cv357.put(KEY_QUESTION, "Although initial investigations pointed towards him ......");
        cv357.put(KEY_OPA, "the preceding events corroborated his involvement in the crime");
        cv357.put(KEY_OPB, "the additional information confirmed his guilt");
        cv357.put(KEY_OPC, "the subsequent events established that he was guilt");
        cv357.put(KEY_OPD, "the subsequent events proved that he was innocent");
        cv357.put(KEY_OPE, "he gave an open confession of his crime");
        cv357.put(KEY_CORRECT, "4");

        cv358.put(KEY_ID, 36);
        cv358.put(KEY_QUESTION, "'The food in this hotel is no match to what were forced at late hours in Hotel Kohinoor' means ......");
        cv358.put(KEY_OPA, "The food in this hotel is quite good compared to what we ate at kohinoor");
        cv358.put(KEY_OPB, "Hotel kohinoor served us good quality food than what we get here");
        cv358.put(KEY_OPC, "Both hotels have maintained good quality of food");
        cv358.put(KEY_OPD, "Both hotels serve poor quality of food");
        cv358.put(KEY_OPE, "it is better to eat food than remain hungry");
        cv358.put(KEY_CORRECT, "2");

        cv359.put(KEY_ID, 37);
        cv359.put(KEY_QUESTION, "The weather outside was extremely pleasant and hence we decided to ......");
        cv359.put(KEY_OPA, "utilise our time in watching the television");
        cv359.put(KEY_OPB, "refrain from going out for a morning walk");
        cv359.put(KEY_OPC, "enjoy a morning ride in the open");
        cv359.put(KEY_OPD, "employ this rare opportunity for writing letters");
        cv359.put(KEY_OPE, "remain seated in our rooms in the bungalow");
        cv359.put(KEY_CORRECT, "3");

        cv360.put(KEY_ID, 38);
        cv360.put(KEY_QUESTION, "'It is an uphill task but you will have to do it' means ......");
        cv360.put(KEY_OPA, "The work is above the hill and you will have to do it");
        cv360.put(KEY_OPB, "It is a very easy task but you must do it");
        cv360.put(KEY_OPC, "It is very difficult task but you have to do it");
        cv360.put(KEY_OPD, "This work is not reserved for you but you will have to do it");
        cv360.put(KEY_OPE, "It is almost impossible for others but you can do it");
        cv360.put(KEY_CORRECT, "3");

        cv361.put(KEY_ID, 39);
        cv361.put(KEY_QUESTION, "'You are thinking very highly about Ravi but he is not so' means ......");
        cv361.put(KEY_OPA, "Ravi is as good as you think about him");
        cv361.put(KEY_OPB, "You have a good opinion about Ravi but he is not as good as you think");
        cv361.put(KEY_OPC, "Your view about Ravi is philosophical, keep it up");
        cv361.put(KEY_OPD, "Ravi is much better, than what you think of him");
        cv361.put(KEY_OPE, "You have a good opinion about Ravi but he does not have a good opinion about you");
        cv361.put(KEY_CORRECT, "2");

        cv362.put(KEY_ID, 40);
        cv362.put(KEY_QUESTION, "'Anand stuck up a friendship with Mahesh in just 2 days' means ......");
        cv362.put(KEY_OPA, "Anand friendship with Mahesh came to an end recently");
        cv362.put(KEY_OPB, "Anand found out the other friends of Mahesh");
        cv362.put(KEY_OPC, "Anand fixed a deal with Mahesh in 2 days");
        cv362.put(KEY_OPD, "Anand's friendship with Mahesh lasted for 2 years");
        cv362.put(KEY_OPE, "Anand became a friend of Mahesh in less than 2 days");
        cv362.put(KEY_CORRECT, "5");

        cv363.put(KEY_ID, 41);
        cv363.put(KEY_QUESTION, "Although, he is reputed for making very candid statements ......");
        cv363.put(KEY_OPA, "his today speech was not fairly audible");
        cv363.put(KEY_OPB, "his promises had always been realistic");
        cv363.put(KEY_OPC, "his speech was very interesting");
        cv363.put(KEY_OPD, "people follow whatever he instructs to them");
        cv363.put(KEY_OPE, "his today's statements were very ambiguous");
        cv363.put(KEY_CORRECT, "5");

        cv364.put(KEY_ID, 42);
        cv364.put(KEY_QUESTION, "The manager would like you to help Dhiraj, means ......");
        cv364.put(KEY_OPA, "the manager would like you if you help Dhiraj");
        cv364.put(KEY_OPB, "the manager desires you to help Dhiraj");
        cv364.put(KEY_OPC, "the manager likes you because you help Dhiraj");
        cv364.put(KEY_OPD, "Dhiraj expects the manager to tell you to help him");
        cv364.put(KEY_OPE, "it will be a help to the manager if you like Dhiraj");
        cv364.put(KEY_CORRECT, "2");

        cv365.put(KEY_ID, 43);
        cv365.put(KEY_QUESTION, "Owing to the acute power shortage, the people of our locality have decided to ......");
        cv365.put(KEY_OPA, "dispense with other non-conventional energy sources");
        cv365.put(KEY_OPB, "resort to abundant use of electricity for illumination");
        cv365.put(KEY_OPC, "off-switch the electrical appliance while not in use");
        cv365.put(KEY_OPD, "explore other avenues for utilising the excess power");
        cv365.put(KEY_OPE, "resort to use of electricity only when it is inevitable");
        cv365.put(KEY_CORRECT, "5");

        cv366.put(KEY_ID, 44);
        cv366.put(KEY_QUESTION, "He has no money now ......");
        cv366.put(KEY_OPA, "although he was very poor once");
        cv366.put(KEY_OPB, "as he has given up all his wealth");
        cv366.put(KEY_OPC, "because he was very rich once");
        cv366.put(KEY_OPD, "because he has received huge donation");
        cv366.put(KEY_OPE, "because he has received huge donation");
        cv366.put(KEY_CORRECT, "2");

        cv367.put(KEY_ID, 45);
        cv367.put(KEY_QUESTION, "He is so lazy that he ......");
        cv367.put(KEY_OPA, "cannot depend on others for getting his work done");
        cv367.put(KEY_OPB, "cannot delay the schedule of completing the work");
        cv367.put(KEY_OPC, "can seldom complete his work on time");
        cv367.put(KEY_OPD, "dislike to postpone the work that he undertakes to do");
        cv367.put(KEY_OPE, "always help others to complete their work");
        cv367.put(KEY_CORRECT, "3");

        cv368.put(KEY_ID, 46);
        cv368.put(KEY_QUESTION, "Dinesh is as stupid as he is lazy means ......");
        cv368.put(KEY_OPA, "Dinesh is stupid because he is lazy");
        cv368.put(KEY_OPB, "Dinesh is lazy because he is stupid");
        cv368.put(KEY_OPC, "Dinesh is either stupid or lazy");
        cv368.put(KEY_OPD, "Dinesh is hardly stupid but he is lazy");
        cv368.put(KEY_OPE, "Dinesh is equally stupid and lazy");
        cv368.put(KEY_CORRECT, "5");

        cv369.put(KEY_ID, 47);
        cv369.put(KEY_QUESTION, "Practically, very little work could be completed in the last week as it was ......");
        cv369.put(KEY_OPA, "full of working days");
        cv369.put(KEY_OPB, "a very hectic week");
        cv369.put(KEY_OPC, "full of holidays");
        cv369.put(KEY_OPD, "a very busy week");
        cv369.put(KEY_OPE, "loaded with work");
        cv369.put(KEY_CORRECT, "3");

        cv370.put(KEY_ID, 48);
        cv370.put(KEY_QUESTION, "Because he believes in democratic principles, he always ......");
        cv370.put(KEY_OPA, "decides all the matters himself");
        cv370.put(KEY_OPB, "listen to others views and enforces his own");
        cv370.put(KEY_OPC, "shown respect to others opinions if they match his own");
        cv370.put(KEY_OPD, "reconciles with the majority views and gives us his own");
        cv370.put(KEY_OPE, "imposes his own views on others");
        cv370.put(KEY_CORRECT, "4");

        cv371.put(KEY_ID, 49);
        cv371.put(KEY_QUESTION, "With great efforts his son succeeded in convincing him not to donate his entire wealth to an orphanage ......");
        cv371.put(KEY_OPA, "and lead the life of a wealthy merchant");
        cv371.put(KEY_OPB, "but to a home for the forsaken children");
        cv371.put(KEY_OPC, "and make an orphan of himself");
        cv371.put(KEY_OPD, "as the orphanage needed a lot of donations");
        cv371.put(KEY_OPE, "as the orphanage had been set up by him");
        cv371.put(KEY_CORRECT, "3");

        cv372.put(KEY_ID, 50);
        cv372.put(KEY_QUESTION, "The employer appeared to be in such an affable mood that Rohit ......");
        cv372.put(KEY_OPA, "decided to ask for a raise in his salary");
        cv372.put(KEY_OPB, "was scared to talk to him about his leave");
        cv372.put(KEY_OPC, "felt very guilty for his inadvertent slip");
        cv372.put(KEY_OPD, "promised him that he would not commit mistake again");
        cv372.put(KEY_OPE, "was pained to press his demand for a new flat");
        cv372.put(KEY_CORRECT, "1");

        cv373.put(KEY_ID, 51);
        cv373.put(KEY_QUESTION, "He always stammers in public meetings, but his today's speech ......");
        cv373.put(KEY_OPA, "was fairly audible to everyone present in the hall");
        cv373.put(KEY_OPB, "was not received satisfactorily");
        cv373.put(KEY_OPC, "could not be understood properly");
        cv373.put(KEY_OPD, "was not liked by the audience");
        cv373.put(KEY_OPE, "was free from that defect");
        cv373.put(KEY_CORRECT, "5");

        cv374.put(KEY_ID, 52);
        cv374.put(KEY_QUESTION, "Even though it is very large house, ......");
        cv374.put(KEY_OPA, "there is a lot of space available in it for children");
        cv374.put(KEY_OPB, "there is hardly any space available for children");
        cv374.put(KEY_OPC, "there is no dearth of space for children");
        cv374.put(KEY_OPD, "the servants take a long time to clean it");
        cv374.put(KEY_OPE, "the municipal taxes on it are very happy");
        cv374.put(KEY_CORRECT, "2");

        cv375.put(KEY_ID, 53);
        cv375.put(KEY_QUESTION, "It was an extremely pleasant surprise for the hutment-dweller when the Government officials told him that ......");
        cv375.put(KEY_OPA, "he had to vacate hutment which he had been unauthorisedly occupying");
        cv375.put(KEY_OPB, "he had been gifted with a furnished apartment in a multi-storeyed building");
        cv375.put(KEY_OPC, "he would be arrested for wrongfully encroaching on the pavement outside his dwelling");
        cv375.put(KEY_OPD, "they would not accede to his request");
        cv375.put(KEY_OPE, "they had received the orders from the court to take possession of all his belongings");
        cv375.put(KEY_CORRECT, "2");

        cv376.put(KEY_ID, 54);
        cv376.put(KEY_QUESTION, "In order to help the company attain its goal of enhancing profit, all the employees ......");
        cv376.put(KEY_OPA, "urged the management to grant paid leave");
        cv376.put(KEY_OPB, "appealed the management to implement new welfare schemes");
        cv376.put(KEY_OPC, "voluntarily offered to work overtime with lucrative compensation");
        cv376.put(KEY_OPD, "voluntarily offered to render additional services in lieu of nothing");
        cv376.put(KEY_OPE, "decided to enhance production at the cost of quality of the product");
        cv376.put(KEY_CORRECT, "4");

        cv377.put(KEY_ID, 55);
        cv377.put(KEY_QUESTION, "'Whatever Dev uttered was without rhyme or reason' means ......");
        cv377.put(KEY_OPA, "Dev could not recite any poem or speech");
        cv377.put(KEY_OPB, "Dev said something which has no meaning, it was totally baseless");
        cv377.put(KEY_OPC, "Dev was talking something which was beyond our experience");
        cv377.put(KEY_OPD, "Dev spoke flatly without any emotion or reason");
        cv377.put(KEY_OPE, "Dev did not refer to any poem to support his statements");
        cv377.put(KEY_CORRECT, "4");

        cv378.put(KEY_ID, 56);
        cv378.put(KEY_QUESTION, "He tames animals because he ......");
        cv378.put(KEY_OPA, "is fond of them");
        cv378.put(KEY_OPB, "hates them");
        cv378.put(KEY_OPC, "is afraid of them");
        cv378.put(KEY_OPD, "want to set them free");
        cv378.put(KEY_OPE, "seldom loves them");
        cv378.put(KEY_CORRECT, "1");

        cv379.put(KEY_ID, 57);
        cv379.put(KEY_QUESTION, "Mahesh need not have purchased the bag, means ......");
        cv379.put(KEY_OPA, "it was not necessary for Mahesh to purchase the bag but he has purchased it");
        cv379.put(KEY_OPB, "it was necessary for Mahesh to purchase the bag and he has not purchased it");
        cv379.put(KEY_OPC, "it was not necessary for Mahesh to purchase the bag and he has not purchased it");
        cv379.put(KEY_OPD, "it was necessary for Mahesh to purchase the bag but he has not purchased it");
        cv379.put(KEY_OPE, "Mahesh already has a bag but still he purchased another one");
        cv379.put(KEY_CORRECT, "1");

        cv380.put(KEY_ID, 58);
        cv380.put(KEY_QUESTION, "In order to raise company's profit, the employees ......");
        cv380.put(KEY_OPA, "demanded two additional increments");
        cv380.put(KEY_OPB, "decided to go on paid holidays");
        cv380.put(KEY_OPC, "requested the management to implement new welfare schemes");
        cv380.put(KEY_OPD, "offered to work overtime without any compensation");
        cv380.put(KEY_OPE, "decided to raise the cost of raw material");
        cv380.put(KEY_CORRECT, "4");

        cv381.put(KEY_ID, 59);
        cv381.put(KEY_QUESTION, "The officer who had neglected to files his income tax returns had to ......");
        cv381.put(KEY_OPA, "return the files");
        cv381.put(KEY_OPB, "pay a fine");
        cv381.put(KEY_OPC, "be rewarded");
        cv381.put(KEY_OPD, "play mischief");
        cv381.put(KEY_OPE, "give warning");
        cv381.put(KEY_CORRECT, "2");

        cv382.put(KEY_ID, 60);
        cv382.put(KEY_QUESTION, "Unless you work harder you will fail, means ......");
        cv382.put(KEY_OPA, "if you fail you will work harder");
        cv382.put(KEY_OPB, "you must at least plan well than you will not fail");
        cv382.put(KEY_OPC, "hardly you will fail if you do not desire so");
        cv382.put(KEY_OPD, "if you do not put more efforts, then you will fail");
        cv382.put(KEY_OPE, "if you only work and work alone, you will fail");
        cv382.put(KEY_CORRECT, "4");

        cv383.put(KEY_ID, 61);
        cv383.put(KEY_QUESTION, "His behaviour is so unpredictable that he ......");
        cv383.put(KEY_OPA, "never depends upon others for getting his work done");
        cv383.put(KEY_OPB, "is seldom trusted by others");
        cv383.put(KEY_OPC, "always finds it difficult to keep his word");
        cv383.put(KEY_OPD, "always insists on getting the work completed on time");
        cv383.put(KEY_OPE, "seldom trusts others as far as the work schedule is concerned");
        cv383.put(KEY_CORRECT, "2");

        cv384.put(KEY_ID, 62);
        cv384.put(KEY_QUESTION, "Wedding ceremonies often include the exchange of ______ rings to symbolize the couple’s promises to each other.");
        cv384.put(KEY_OPA, "hirsute");
        cv384.put(KEY_OPB, "acrimonious");
        cv384.put(KEY_OPC, "plaintive");
        cv384.put(KEY_OPD, "deciduous");
        cv384.put(KEY_OPE, "deciduous");
        cv384.put(KEY_CORRECT, "3");

        cv385.put(KEY_ID, 63);
        cv385.put(KEY_QUESTION, "Kym was ______ in choosing her friends, so her parties were attended by vastly different and sometimes bizarre personalities.");
        cv385.put(KEY_OPA, "indispensable");
        cv385.put(KEY_OPB, "indiscriminate");
        cv385.put(KEY_OPC, "commensurate");
        cv385.put(KEY_OPD, "propulsive");
        cv385.put(KEY_OPE, "indisputable");
        cv385.put(KEY_CORRECT, "2");

        cv386.put(KEY_ID, 64);
        cv386.put(KEY_QUESTION, "With all of the recent negative events in her life, she felt ______forces must be at work.");
        cv386.put(KEY_OPA, "resurgent");
        cv386.put(KEY_OPB, "premature");
        cv386.put(KEY_OPC, "malignant");
        cv386.put(KEY_OPD, "punctilious");
        cv386.put(KEY_OPE, "antecedent");
        cv386.put(KEY_CORRECT, "3");

        cv387.put(KEY_ID, 65);
        cv387.put(KEY_QUESTION, "The ______ rumors did a great deal of damage even though they turned out to be false.");
        cv387.put(KEY_OPA, "bemused");
        cv387.put(KEY_OPB, "prosaic");
        cv387.put(KEY_OPC, "apocryphal");
        cv387.put(KEY_OPD, "ebullient");
        cv387.put(KEY_OPE, "tantamount");
        cv387.put(KEY_CORRECT, "3");

        cv388.put(KEY_ID, 66);
        cv388.put(KEY_QUESTION, "When her schoolwork got to be too much, Pam had a tendency to______, which always put her further behind.");
        cv388.put(KEY_OPA, "dedicate");
        cv388.put(KEY_OPB, "rejuvenate");
        cv388.put(KEY_OPC, "ponder");
        cv388.put(KEY_OPD, "excel");
        cv388.put(KEY_OPE, "procrastinate");
        cv388.put(KEY_CORRECT, "3");

        cv389.put(KEY_ID, 67);
        cv389.put(KEY_QUESTION, "Racha’s glance was a ______ invitation to speak later in private about events of the meeting.");
        cv389.put(KEY_OPA, "trecherous");
        cv389.put(KEY_OPB, "scintillating");
        cv389.put(KEY_OPC, "tactful");
        cv389.put(KEY_OPD, "tacit");
        cv389.put(KEY_OPE, "taboo");
        cv389.put(KEY_CORRECT, "3");

        cv390.put(KEY_ID, 68);
        cv390.put(KEY_QUESTION, "She reached the ______ of her career with her fourth novel, which won the Pulitzer Prize.");
        cv390.put(KEY_OPA, "harbinger");
        cv390.put(KEY_OPB, "apogee");
        cv390.put(KEY_OPC, "metamorphosis");
        cv390.put(KEY_OPD, "dictum");
        cv390.put(KEY_OPE, "synthesis");
        cv390.put(KEY_CORRECT, "2");

        cv391.put(KEY_ID, 69);
        cv391.put(KEY_QUESTION, "The ______ townspeople celebrated the soldier’s return to his home by adorning trees with yellow ribbons and balloons.");
        cv391.put(KEY_OPA, "somber");
        cv391.put(KEY_OPB, "jubilant");
        cv391.put(KEY_OPC, "pitiless");
        cv391.put(KEY_OPD, "cunning");
        cv391.put(KEY_OPE, "unsullied");
        cv391.put(KEY_CORRECT, "2");

        cv392.put(KEY_ID, 70);
        cv392.put(KEY_QUESTION, "The governor-elect was hounded by a group of ______ lobbyists and others hoping to gain favor with her administration.");
        cv392.put(KEY_OPA, "facetious");
        cv392.put(KEY_OPB, "abstruse");
        cv392.put(KEY_OPC, "magnanimous");
        cv392.put(KEY_OPD, "fawning");
        cv392.put(KEY_OPE, "saccharine");
        cv392.put(KEY_CORRECT, "4");

        cv393.put(KEY_ID, 71);
        cv393.put(KEY_QUESTION, "The mock graduation ceremony with a trained skunk posing as the college president was a complete ______ that offended many college officials.");
        cv393.put(KEY_OPA, "tempest");
        cv393.put(KEY_OPB, "epitome");
        cv393.put(KEY_OPC, "quintessence");
        cv393.put(KEY_OPD, "travesty");
        cv393.put(KEY_OPE, "recitative");
        cv393.put(KEY_CORRECT, "4");

        cv394.put(KEY_ID, 72);
        cv394.put(KEY_QUESTION, "The busy, ______ fabric of the clown’s tie matched his oversized jacket, which was equally atrocious.");
        cv394.put(KEY_OPA, "mottled");
        cv394.put(KEY_OPB, "bleak");
        cv394.put(KEY_OPC, "credible");
        cv394.put(KEY_OPD, "malleable");
        cv394.put(KEY_OPE, "communicable");
        cv394.put(KEY_CORRECT, "1");

        cv395.put(KEY_ID, 73);
        cv395.put(KEY_QUESTION, "Kendrick’s talent ______ under the tutelage of Anya Kowalonek,who as a young woman had been the most accomplished pianist in her native Lithuania.");
        cv395.put(KEY_OPA, "bantered");
        cv395.put(KEY_OPB, "touted");
        cv395.put(KEY_OPC, "flourished");
        cv395.put(KEY_OPD, "embellished");
        cv395.put(KEY_OPE, "colluded");
        cv395.put(KEY_CORRECT, "3");

        cv396.put(KEY_ID, 74);
        cv396.put(KEY_QUESTION, "The children were ______ by the seemingly nonsensical clues until Kinan pointed out that the messages were in code.");
        cv396.put(KEY_OPA, "censured");
        cv396.put(KEY_OPB, "striated");
        cv396.put(KEY_OPC, "feigned");
        cv396.put(KEY_OPD, "prevaricated");
        cv396.put(KEY_OPE, "flummoxed");
        cv396.put(KEY_CORRECT, "3");

        cv397.put(KEY_ID, 75);
        cv397.put(KEY_QUESTION, "As the ______ in Romeo and Juliet, Romeo is a hero able to capture the audience’s sympathy by continually professing his love for Juliet.");
        cv397.put(KEY_OPA, "protagonist");
        cv397.put(KEY_OPB, "enigma");
        cv397.put(KEY_OPC, "facade");
        cv397.put(KEY_OPD, "activist");
        cv397.put(KEY_OPE, "catechist");
        cv397.put(KEY_CORRECT, "1");

        cv398.put(KEY_ID, 76);
        cv398.put(KEY_QUESTION, "The chess master promised to ______ havoc upon his opponent’s pawns for taking his bishop");
        cv398.put(KEY_OPA, "wreak");
        cv398.put(KEY_OPB, "warrant");
        cv398.put(KEY_OPC, "ensue");
        cv398.put(KEY_OPD, "placate");
        cv398.put(KEY_OPE, "endow");
        cv398.put(KEY_CORRECT, "1");

        cv399.put(KEY_ID, 77);
        cv399.put(KEY_QUESTION, "I have always admired Seymour’s ______; I’ve never seen him rattled by anything.");
        cv399.put(KEY_OPA, "aplomb");
        cv399.put(KEY_OPB, "confluence");
        cv399.put(KEY_OPC, "propriety");
        cv399.put(KEY_OPD, "compunction");
        cv399.put(KEY_OPE, "nostalgia");
        cv399.put(KEY_CORRECT, "1");

        cv400.put(KEY_ID, 78);
        cv400.put(KEY_QUESTION, "The soldiers received a military ______ to inspect all their vehicles before traveling.");
        cv400.put(KEY_OPA, "allotment");
        cv400.put(KEY_OPB, "dominion");
        cv400.put(KEY_OPC, "affectation");
        cv400.put(KEY_OPD, "calculation");
        cv400.put(KEY_OPE, "mandate");
        cv400.put(KEY_CORRECT, "3");

        cv401.put(KEY_ID, 1);
        cv401.put(KEY_QUESTION, "Fate smiles ...... those who untiringly grapple with stark realities of life.");
        cv401.put(KEY_OPA, "with");
        cv401.put(KEY_OPB, "over");
        cv401.put(KEY_OPC, "on");
        cv401.put(KEY_OPD, "round");
        cv401.put(KEY_OPE, "none of these");
        cv401.put(KEY_CORRECT, "3");

        cv402.put(KEY_ID, 2);
        cv402.put(KEY_QUESTION, "The miser gazed ...... at the pile of gold coins in front of him.");
        cv402.put(KEY_OPA, "avidly");
        cv402.put(KEY_OPB, "admiringly");
        cv402.put(KEY_OPC, "thoughtfully");
        cv402.put(KEY_OPD, "earnestly");
        cv402.put(KEY_OPE, "none of these");
        cv402.put(KEY_CORRECT, "1");

        cv403.put(KEY_ID, 3);
        cv403.put(KEY_QUESTION, "Catching the earlier train will give us the ...... to do some shopping");
        cv403.put(KEY_OPA, "chance");
        cv403.put(KEY_OPB, "luck");
        cv403.put(KEY_OPC, "possibility");
        cv403.put(KEY_OPD, "occasion");
        cv403.put(KEY_OPE, "cannot be determined");
        cv403.put(KEY_CORRECT, "1");

        cv404.put(KEY_ID, 4);
        cv404.put(KEY_QUESTION, "I saw a ...... of cows in the field.");
        cv404.put(KEY_OPA, "group");
        cv404.put(KEY_OPB, "herd");
        cv404.put(KEY_OPC, "swarm");
        cv404.put(KEY_OPD, "flock");
        cv404.put(KEY_OPE, "cannot be determined");
        cv404.put(KEY_CORRECT, "2");

        cv405.put(KEY_ID, 5);
        cv405.put(KEY_QUESTION, "The grapes are now ...... enough to be picked.");
        cv405.put(KEY_OPA, "ready");
        cv405.put(KEY_OPB, "mature");
        cv405.put(KEY_OPC, "ripe");
        cv405.put(KEY_OPD, "advanced");
        cv405.put(KEY_OPE, "cannot be determined");
        cv405.put(KEY_CORRECT, "3");

        cv406.put(KEY_ID, 6);
        cv406.put(KEY_QUESTION, "Success in this examination depends ...... hard work alone.");
        cv406.put(KEY_OPA, "at");
        cv406.put(KEY_OPB, "over");
        cv406.put(KEY_OPC, "for");
        cv406.put(KEY_OPD, "on");
        cv406.put(KEY_OPE, "cannot be determined");
        cv406.put(KEY_CORRECT, "4");

        cv407.put(KEY_ID, 7);
        cv407.put(KEY_QUESTION, "My uncle decided to take ...... and my sister to the market");
        cv407.put(KEY_OPA, "i");
        cv407.put(KEY_OPB, "mine");
        cv407.put(KEY_OPC, "me");
        cv407.put(KEY_OPD, "none of these");
        cv407.put(KEY_OPE, "myself");
        cv407.put(KEY_CORRECT, "3");

        cv408.put(KEY_ID, 8);
        cv408.put(KEY_QUESTION, "If you smuggle goods into the country, they may be ...... by the customs authority.");
        cv408.put(KEY_OPA, "possessed");
        cv408.put(KEY_OPB, "punished");
        cv408.put(KEY_OPC, "confiscated");
        cv408.put(KEY_OPD, "fined");
        cv408.put(KEY_OPE, "cannot be determined");
        cv408.put(KEY_CORRECT, "3");

        cv409.put(KEY_ID, 9);
        cv409.put(KEY_QUESTION, "Man does not live by ...... alone");
        cv409.put(KEY_OPA, "food");
        cv409.put(KEY_OPB, "bread");
        cv409.put(KEY_OPC, "meals");
        cv409.put(KEY_OPD, "diet");
        cv409.put(KEY_OPE, "cannot be determined");
        cv409.put(KEY_CORRECT, "2");

        cv410.put(KEY_ID, 10);
        cv410.put(KEY_QUESTION, "Piyush behaves strangely at times and, therefore, nobody gets ...... with him.");
        cv410.put(KEY_OPA, "about");
        cv410.put(KEY_OPB, "through");
        cv410.put(KEY_OPC, "along");
        cv410.put(KEY_OPD, "up");
        cv410.put(KEY_OPE, "cannot be determined");
        cv410.put(KEY_CORRECT, "3");

        cv411.put(KEY_ID, 11);
        cv411.put(KEY_QUESTION, "Rohan and Rohit are twin brothers, but they do not look ......");
        cv411.put(KEY_OPA, "unique");
        cv411.put(KEY_OPB, "different");
        cv411.put(KEY_OPC, "likely");
        cv411.put(KEY_OPD, "alike");
        cv411.put(KEY_OPE, "cannot be determined");
        cv411.put(KEY_CORRECT, "4");

        cv412.put(KEY_ID, 12);
        cv412.put(KEY_QUESTION, "To err is ...... to forgive divine");
        cv412.put(KEY_OPA, "human");
        cv412.put(KEY_OPB, "devil");
        cv412.put(KEY_OPC, "god");
        cv412.put(KEY_OPD, "teacher");
        cv412.put(KEY_OPE, "cannot be determined");
        cv412.put(KEY_CORRECT, "1");

        cv413.put(KEY_ID, 13);
        cv413.put(KEY_QUESTION, "The ruling party will have to put its own house ...... order.");
        cv413.put(KEY_OPA, "in");
        cv413.put(KEY_OPB, "on");
        cv413.put(KEY_OPC, "to");
        cv413.put(KEY_OPD, "none of these");
        cv413.put(KEY_OPE, "into");
        cv413.put(KEY_CORRECT, "1");

        cv414.put(KEY_ID, 14);
        cv414.put(KEY_QUESTION, "...... of old paintings is a job for experts");
        cv414.put(KEY_OPA, "resurrection");
        cv414.put(KEY_OPB, "retrieval");
        cv414.put(KEY_OPC, "restore");
        cv414.put(KEY_OPD, "none of these");
        cv414.put(KEY_OPE, "resumption");
        cv414.put(KEY_CORRECT, "3");

        cv415.put(KEY_ID, 15);
        cv415.put(KEY_QUESTION, "During Diwali the shops are ...... of people");
        cv415.put(KEY_OPA, "busy");
        cv415.put(KEY_OPB, "full");
        cv415.put(KEY_OPC, "crowded");
        cv415.put(KEY_OPD, "bubbly");
        cv415.put(KEY_OPE, "cannot be determined");
        cv415.put(KEY_CORRECT, "2");

        cv416.put(KEY_ID, 16);
        cv416.put(KEY_QUESTION, "The paths of glory lead ...... to the grave.");
        cv416.put(KEY_OPA, "straight");
        cv416.put(KEY_OPB, "but");
        cv416.put(KEY_OPC, "in");
        cv416.put(KEY_OPD, "directly");
        cv416.put(KEY_OPE, "cannot be determined");
        cv416.put(KEY_CORRECT, "2");

        cv417.put(KEY_ID, 17);
        cv417.put(KEY_QUESTION, "The telephone ...... several times before I answered it.");
        cv417.put(KEY_OPA, "was ringing");
        cv417.put(KEY_OPB, "has rung");
        cv417.put(KEY_OPC, "had rung");
        cv417.put(KEY_OPD, "would ring");
        cv417.put(KEY_OPE, "none of these");
        cv417.put(KEY_CORRECT, "3");

        cv418.put(KEY_ID, 18);
        cv418.put(KEY_QUESTION, "He passed the examination in the first class because he ......");
        cv418.put(KEY_OPA, "was hard working for it");
        cv418.put(KEY_OPB, "worked hardly for it");
        cv418.put(KEY_OPC, "had worked hard for it");
        cv418.put(KEY_OPD, "was working hard for it");
        cv418.put(KEY_OPE, "None of these");
        cv418.put(KEY_CORRECT, "3");

        cv419.put(KEY_ID, 19);
        cv419.put(KEY_QUESTION, "Jawaharlal spent his childhood ...... Anand Bhawan.");
        cv419.put(KEY_OPA, "at");
        cv419.put(KEY_OPB, "in");
        cv419.put(KEY_OPC, "on");
        cv419.put(KEY_OPD, "across");
        cv419.put(KEY_OPE, "none of these");
        cv419.put(KEY_CORRECT, "1");

        cv420.put(KEY_ID, 20);
        cv420.put(KEY_QUESTION, "If negotiations are to prove fruitful, there must not only be sincerity on each side, but there must also be ...... in the sincerity of the other side.");
        cv420.put(KEY_OPA, "faith");
        cv420.put(KEY_OPB, "belief");
        cv420.put(KEY_OPC, "substance");
        cv420.put(KEY_OPD, "certainty");
        cv420.put(KEY_OPE, "none of these");
        cv420.put(KEY_CORRECT, "1");

        cv421.put(KEY_ID, 21);
        cv421.put(KEY_QUESTION, "I hate sitting ...... him as he always smells of garlic.");
        cv421.put(KEY_OPA, "besides");
        cv421.put(KEY_OPB, "along");
        cv421.put(KEY_OPC, "at");
        cv421.put(KEY_OPD, "beside");
        cv421.put(KEY_OPE, "none of these");
        cv421.put(KEY_CORRECT, "4");

        cv422.put(KEY_ID, 22);
        cv422.put(KEY_QUESTION, "Some regions of our country still remain ...... to the average man.");
        cv422.put(KEY_OPA, "inaccessible");
        cv422.put(KEY_OPB, "impossible");
        cv422.put(KEY_OPC, "impermeable");
        cv422.put(KEY_OPD, "impenetrable");
        cv422.put(KEY_OPE, "none of these");
        cv422.put(KEY_CORRECT, "1");

        cv423.put(KEY_ID, 23);
        cv423.put(KEY_QUESTION, "It ...... that Prashant will not be selected for the post");
        cv423.put(KEY_OPA, "feels");
        cv423.put(KEY_OPB, "looks");
        cv423.put(KEY_OPC, "believes");
        cv423.put(KEY_OPD, "seems");
        cv423.put(KEY_OPE, "none of these");
        cv423.put(KEY_CORRECT, "4");

        cv424.put(KEY_ID, 24);
        cv424.put(KEY_QUESTION, "In Bush, Saddam was up ...... more than his match.");
        cv424.put(KEY_OPA, "for");
        cv424.put(KEY_OPB, "into");
        cv424.put(KEY_OPC, "against");
        cv424.put(KEY_OPD, "to");
        cv424.put(KEY_OPE, "none of these");
        cv424.put(KEY_CORRECT, "3");

        cv425.put(KEY_ID, 25);
        cv425.put(KEY_QUESTION, "I haven't seen you ...... a week.");
        cv425.put(KEY_OPA, "within");
        cv425.put(KEY_OPB, "since");
        cv425.put(KEY_OPC, "for");
        cv425.put(KEY_OPD, "from");
        cv425.put(KEY_OPE, "none of these");
        cv425.put(KEY_CORRECT, "3");

        cv426.put(KEY_ID, 26);
        cv426.put(KEY_QUESTION, "I listened, but I had no idea what he was ...... about");
        cv426.put(KEY_OPA, "saying");
        cv426.put(KEY_OPB, "talking");
        cv426.put(KEY_OPC, "telling");
        cv426.put(KEY_OPD, "discussing");
        cv426.put(KEY_OPE, "none of these");
        cv426.put(KEY_CORRECT, "2");

        cv427.put(KEY_ID, 27);
        cv427.put(KEY_QUESTION, "The car in which the minister was traveling ...... with an accident.");
        cv427.put(KEY_OPA, "hit");
        cv427.put(KEY_OPB, "drove");
        cv427.put(KEY_OPC, "crashed");
        cv427.put(KEY_OPD, "met");
        cv427.put(KEY_OPE, "none of these");
        cv427.put(KEY_CORRECT, "4");

        cv428.put(KEY_ID, 28);
        cv428.put(KEY_QUESTION, "The non cooperative attitude of the members can only ...... the image of the society.");
        cv428.put(KEY_OPA, "spoil");
        cv428.put(KEY_OPB, "improve");
        cv428.put(KEY_OPC, "degrade");
        cv428.put(KEY_OPD, "deframe");
        cv428.put(KEY_OPE, "none of these");
        cv428.put(KEY_CORRECT, "1");

        cv429.put(KEY_ID, 29);
        cv429.put(KEY_QUESTION, "Sonika is quite intelligent but rather ......");
        cv429.put(KEY_OPA, "idealistic");
        cv429.put(KEY_OPB, "optimistic");
        cv429.put(KEY_OPC, "lazy");
        cv429.put(KEY_OPD, "generous");
        cv429.put(KEY_OPE, "none of these");
        cv429.put(KEY_CORRECT, "3");

        cv430.put(KEY_ID, 30);
        cv430.put(KEY_QUESTION, "In a little-publicised deal, Pepsi, Cola has ...... the entire soft drink market in Afghanistan.");
        cv430.put(KEY_OPA, "occupied");
        cv430.put(KEY_OPB, "conquered");
        cv430.put(KEY_OPC, "swallowed");
        cv430.put(KEY_OPD, "captured");
        cv430.put(KEY_OPE, "none of these");
        cv430.put(KEY_CORRECT, "4");

        cv431.put(KEY_ID, 31);
        cv431.put(KEY_QUESTION, "He ...... in wearing the old fashioned coat in spite of his wife's disapproval.");
        cv431.put(KEY_OPA, "insists");
        cv431.put(KEY_OPB, "persists");
        cv431.put(KEY_OPC, "desists");
        cv431.put(KEY_OPD, "resists");
        cv431.put(KEY_OPE, "none of these");
        cv431.put(KEY_CORRECT, "2");

        cv432.put(KEY_ID, 32);
        cv432.put(KEY_QUESTION, "She ...... a brief appearance at the end of party.");
        cv432.put(KEY_OPA, "put on");
        cv432.put(KEY_OPB, "put in");
        cv432.put(KEY_OPC, "put across");
        cv432.put(KEY_OPD, "put up");
        cv432.put(KEY_OPE, "none of these");
        cv432.put(KEY_CORRECT, "2");

        cv433.put(KEY_ID, 33);
        cv433.put(KEY_QUESTION, "Life is to death as pleasure is to ......");
        cv433.put(KEY_OPA, "poverty");
        cv433.put(KEY_OPB, "suffering");
        cv433.put(KEY_OPC, "anguish");
        cv433.put(KEY_OPD, "pain");
        cv433.put(KEY_OPE, "none of these");
        cv433.put(KEY_CORRECT, "4");

        cv434.put(KEY_ID, 34);
        cv434.put(KEY_QUESTION, "This, partly, explains how the Mehta family has been able to ...... its lavish lifestyle in recent times, despite the fact that all its assets have been .....");
        cv434.put(KEY_OPA, "keep,removed");
        cv434.put(KEY_OPB, "afford,attached");
        cv434.put(KEY_OPC, "develop,liquidated");
        cv434.put(KEY_OPD, "keep up,destroyed");
        cv434.put(KEY_OPE, "none of these");
        cv434.put(KEY_CORRECT, "4");

        cv435.put(KEY_ID, 35);
        cv435.put(KEY_QUESTION, "The machine is difficult to build ...... easy to maintain.");
        cv435.put(KEY_OPA, "but");
        cv435.put(KEY_OPB, "and");
        cv435.put(KEY_OPC, "for");
        cv435.put(KEY_OPD, "if");
        cv435.put(KEY_OPE, "none of these");
        cv435.put(KEY_CORRECT, "1");

        cv436.put(KEY_ID, 36);
        cv436.put(KEY_QUESTION, "If you persists in telling lies to me I shall sue you ...... slander.");
        cv436.put(KEY_OPA, "to ");
        cv436.put(KEY_OPB, "on");
        cv436.put(KEY_OPC, "for");
        cv436.put(KEY_OPD, "with");
        cv436.put(KEY_OPE, "none of these");
        cv436.put(KEY_CORRECT, "3");

        cv437.put(KEY_ID, 37);
        cv437.put(KEY_QUESTION, "His father-in-law ...... him up in business");
        cv437.put(KEY_OPA, "put");
        cv437.put(KEY_OPB, "made");
        cv437.put(KEY_OPC, "set");
        cv437.put(KEY_OPD, "built");
        cv437.put(KEY_OPE, "none of these");
        cv437.put(KEY_CORRECT, "3");

        cv438.put(KEY_ID, 38);
        cv438.put(KEY_QUESTION, "...... works of reference are valuable as Encyclopedia, Brittanica.");
        cv438.put(KEY_OPA, "a few");
        cv438.put(KEY_OPB, "few");
        cv438.put(KEY_OPC, "the few");
        cv438.put(KEY_OPD, "fewer");
        cv438.put(KEY_OPE, "none of these");
        cv438.put(KEY_CORRECT, "2");

        cv439.put(KEY_ID, 39);
        cv439.put(KEY_QUESTION, "This book is quite similar ......");
        cv439.put(KEY_OPA, "with the 'Treasure Island'");
        cv439.put(KEY_OPB, "of that film we saw at school");
        cv439.put(KEY_OPC, "to the one I read last week");
        cv439.put(KEY_OPD, "than a story told by our teacher");
        cv439.put(KEY_OPE, "none of these");
        cv439.put(KEY_CORRECT, "3");

        cv440.put(KEY_ID, 40);
        cv440.put(KEY_QUESTION, "If our friends are not able to take us in their car, we must make ...... arrangements to go to the airport.");
        cv440.put(KEY_OPA, "alternative");
        cv440.put(KEY_OPB, "another");
        cv440.put(KEY_OPC, "alternate");
        cv440.put(KEY_OPD, "possible");
        cv440.put(KEY_OPE, "none of these");
        cv440.put(KEY_CORRECT, "1");

        cv441.put(KEY_ID, 41);
        cv441.put(KEY_QUESTION, "A crescendo of metallic thuds arose from the market, where the iron-smiths were ...... the pieces of metals.");
        cv441.put(KEY_OPA, "flattening");
        cv441.put(KEY_OPB, "striking");
        cv441.put(KEY_OPC, "hammering");
        cv441.put(KEY_OPD, "thrashing");
        cv441.put(KEY_OPE, "none of these");
        cv441.put(KEY_CORRECT, "3");

        cv442.put(KEY_ID, 42);
        cv442.put(KEY_QUESTION, "I haven't eaten an apple ...... a long while.");
        cv442.put(KEY_OPA, "from");
        cv442.put(KEY_OPB, "since");
        cv442.put(KEY_OPC, "for");
        cv442.put(KEY_OPD, "until");
        cv442.put(KEY_OPE, "none of these");
        cv442.put(KEY_CORRECT, "3");

        cv443.put(KEY_ID, 43);
        cv443.put(KEY_QUESTION, "The parliament invested the new organisation ...... judicial authority.");
        cv443.put(KEY_OPA, "by");
        cv443.put(KEY_OPB, "with");
        cv443.put(KEY_OPC, "from");
        cv443.put(KEY_OPD, "through");
        cv443.put(KEY_OPE, "none of these");
        cv443.put(KEY_CORRECT, "2");

        cv444.put(KEY_ID, 44);
        cv444.put(KEY_QUESTION, "Owing to the power cut in the area, factories are being forced to ...... men");
        cv444.put(KEY_OPA, "throw away");
        cv444.put(KEY_OPB, "send off");
        cv444.put(KEY_OPC, "put off");
        cv444.put(KEY_OPD, "lay off");
        cv444.put(KEY_OPE, "none of these");
        cv444.put(KEY_CORRECT, "4");

        cv445.put(KEY_ID, 45);
        cv445.put(KEY_QUESTION, "Man must ...... to stop pollution.");
        cv445.put(KEY_OPA, "act");
        cv445.put(KEY_OPB, "perform");
        cv445.put(KEY_OPC, "operate");
        cv445.put(KEY_OPD, "behave");
        cv445.put(KEY_OPE, "none of these");
        cv445.put(KEY_CORRECT, "1");

        cv446.put(KEY_ID, 46);
        cv446.put(KEY_QUESTION, "He was sent to the prison for his ......");
        cv446.put(KEY_OPA, "sin");
        cv446.put(KEY_OPB, "vice");
        cv446.put(KEY_OPC, "crime");
        cv446.put(KEY_OPD, "guilt");
        cv446.put(KEY_OPE, "none of these");
        cv446.put(KEY_CORRECT, "3");

        cv447.put(KEY_ID, 47);
        cv447.put(KEY_QUESTION, "The answer was written ...... blue ink.");
        cv447.put(KEY_OPA, "with");
        cv447.put(KEY_OPB, "by");
        cv447.put(KEY_OPC, "in ");
        cv447.put(KEY_OPD, "on");
        cv447.put(KEY_OPE, "none of these");
        cv447.put(KEY_CORRECT, "3");

        cv448.put(KEY_ID, 48);
        cv448.put(KEY_QUESTION, "Many ...... decisions were taken at the meeting.");
        cv448.put(KEY_OPA, "hectic");
        cv448.put(KEY_OPB, "historic");
        cv448.put(KEY_OPC, "historical");
        cv448.put(KEY_OPD, "histrionic");
        cv448.put(KEY_OPE, "none of these");
        cv448.put(KEY_CORRECT, "2");

        cv449.put(KEY_ID, 49);
        cv449.put(KEY_QUESTION, "Those who persist in the endeavor at long last triumph ...... the odds of life.");
        cv449.put(KEY_OPA, "over");
        cv449.put(KEY_OPB, "on");
        cv449.put(KEY_OPC, "upon");
        cv449.put(KEY_OPD, "about");
        cv449.put(KEY_OPE, "none of these");
        cv449.put(KEY_CORRECT, "1");

        cv450.put(KEY_ID, 50);
        cv450.put(KEY_QUESTION, "In the modern materialistic society, the only aim of people appears to be ...... money by fair means or foul.");
        cv450.put(KEY_OPA, "print");
        cv450.put(KEY_OPB, "produce");
        cv450.put(KEY_OPC, "acquire");
        cv450.put(KEY_OPD, "extrot");
        cv450.put(KEY_OPE, "none of these");
        cv450.put(KEY_CORRECT, "3");

        db.insert(KEY_CORRECT_SENTENCE, null, cv151);
        db.insert(KEY_CORRECT_SENTENCE, null, cv152);
        db.insert(KEY_CORRECT_SENTENCE, null, cv153);
        db.insert(KEY_CORRECT_SENTENCE, null, cv154);
        db.insert(KEY_CORRECT_SENTENCE, null, cv155);
        db.insert(KEY_CORRECT_SENTENCE, null, cv156);
        db.insert(KEY_CORRECT_SENTENCE, null, cv157);
        db.insert(KEY_CORRECT_SENTENCE, null, cv158);
        db.insert(KEY_CORRECT_SENTENCE, null, cv159);
        db.insert(KEY_CORRECT_SENTENCE, null, cv160);
        db.insert(KEY_CORRECT_SENTENCE, null, cv161);
        db.insert(KEY_CORRECT_SENTENCE, null, cv162);
        db.insert(KEY_CORRECT_SENTENCE, null, cv163);
        db.insert(KEY_CORRECT_SENTENCE, null, cv164);
        db.insert(KEY_CORRECT_SENTENCE, null, cv165);
        db.insert(KEY_CORRECT_SENTENCE, null, cv166);
        db.insert(KEY_CORRECT_SENTENCE, null, cv167);
        db.insert(KEY_CORRECT_SENTENCE, null, cv168);
        db.insert(KEY_CORRECT_SENTENCE, null, cv169);
        db.insert(KEY_CORRECT_SENTENCE, null, cv170);
        db.insert(KEY_CORRECT_SENTENCE, null, cv171);
        db.insert(KEY_CORRECT_SENTENCE, null, cv172);
        db.insert(KEY_CORRECT_SENTENCE, null, cv173);
        db.insert(KEY_CORRECT_SENTENCE, null, cv174);
        db.insert(KEY_CORRECT_SENTENCE, null, cv175);
        db.insert(KEY_CORRECT_SENTENCE, null, cv176);
        db.insert(KEY_CORRECT_SENTENCE, null, cv177);
        db.insert(KEY_CORRECT_SENTENCE, null, cv178);
        db.insert(KEY_CORRECT_SENTENCE, null, cv179);
        db.insert(KEY_CORRECT_SENTENCE, null, cv180);
        db.insert(KEY_CORRECT_SENTENCE, null, cv181);
        db.insert(KEY_CORRECT_SENTENCE, null, cv182);
        db.insert(KEY_CORRECT_SENTENCE, null, cv183);
        db.insert(KEY_CORRECT_SENTENCE, null, cv184);
        db.insert(KEY_CORRECT_SENTENCE, null, cv185);
        db.insert(KEY_CORRECT_SENTENCE, null, cv186);
        db.insert(KEY_CORRECT_SENTENCE, null, cv187);
        db.insert(KEY_CORRECT_SENTENCE, null, cv188);
        db.insert(KEY_CORRECT_SENTENCE, null, cv189);
        db.insert(KEY_CORRECT_SENTENCE, null, cv190);
        db.insert(KEY_CORRECT_SENTENCE, null, cv191);
        db.insert(KEY_CORRECT_SENTENCE, null, cv192);
        db.insert(KEY_CORRECT_SENTENCE, null, cv193);
        db.insert(KEY_CORRECT_SENTENCE, null, cv194);
        db.insert(KEY_CORRECT_SENTENCE, null, cv195);
        db.insert(KEY_CORRECT_SENTENCE, null, cv196);
        db.insert(KEY_CORRECT_SENTENCE, null, cv197);
        db.insert(KEY_CORRECT_SENTENCE, null, cv198);
        db.insert(KEY_CORRECT_SENTENCE, null, cv199);
        db.insert(KEY_CORRECT_SENTENCE, null, cv200);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv251);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv252);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv253);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv254);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv255);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv256);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv257);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv258);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv259);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv260);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv261);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv262);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv263);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv264);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv265);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv266);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv267);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv268);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv269);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv270);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv271);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv272);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv273);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv274);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv275);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv276);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv277);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv278);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv279);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv280);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv281);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv282);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv283);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv284);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv285);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv286);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv287);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv288);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv289);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv290);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv291);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv292);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv293);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv294);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv295);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv296);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv297);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv298);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv299);
        db.insert(KEY_IMPORTANT_SENTENCE, null, cv300);
        db.insert(KEY_THEME, null, cv301);
        db.insert(KEY_THEME, null, cv302);
        db.insert(KEY_THEME, null, cv303);
        db.insert(KEY_THEME, null, cv304);
        db.insert(KEY_THEME, null, cv305);
        db.insert(KEY_THEME, null, cv306);
        db.insert(KEY_THEME, null, cv307);
        db.insert(KEY_THEME, null, cv308);
        db.insert(KEY_THEME, null, cv309);
        db.insert(KEY_THEME, null, cv310);
        db.insert(KEY_THEME, null, cv311);
        db.insert(KEY_THEME, null, cv312);
        db.insert(KEY_THEME, null, cv313);
        db.insert(KEY_THEME, null, cv314);
        db.insert(KEY_THEME, null, cv315);
        db.insert(KEY_THEME, null, cv316);
        db.insert(KEY_THEME, null, cv317);
        db.insert(KEY_THEME, null, cv318);
        db.insert(KEY_THEME, null, cv319);
        db.insert(KEY_THEME, null, cv320);
        db.insert(KEY_THEME, null, cv321);
        db.insert(KEY_THEME, null, cv322);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv323);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv324);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv325);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv326);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv327);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv328);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv329);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv330);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv331);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv332);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv333);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv334);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv335);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv336);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv337);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv338);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv339);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv340);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv341);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv342);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv343);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv344);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv345);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv346);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv347);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv348);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv349);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv350);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv351);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv352);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv353);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv354);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv355);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv356);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv357);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv358);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv359);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv360);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv361);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv362);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv363);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv364);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv365);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv366);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv367);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv368);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv369);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv370);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv371);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv372);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv373);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv374);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv375);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv376);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv377);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv378);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv379);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv380);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv381);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv382);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv383);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv384);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv385);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv386);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv387);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv388);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv389);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv390);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv391);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv392);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv393);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv394);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv395);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv396);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv397);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv398);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv399);
        db.insert(KEY_COMPLETE_SENTENCE, null, cv400);
        db.insert(KEY_SELECT_WORD, null, cv401);
        db.insert(KEY_SELECT_WORD, null, cv402);
        db.insert(KEY_SELECT_WORD, null, cv403);
        db.insert(KEY_SELECT_WORD, null, cv404);
        db.insert(KEY_SELECT_WORD, null, cv405);
        db.insert(KEY_SELECT_WORD, null, cv406);
        db.insert(KEY_SELECT_WORD, null, cv407);
        db.insert(KEY_SELECT_WORD, null, cv408);
        db.insert(KEY_SELECT_WORD, null, cv409);
        db.insert(KEY_SELECT_WORD, null, cv410);
        db.insert(KEY_SELECT_WORD, null, cv411);
        db.insert(KEY_SELECT_WORD, null, cv412);
        db.insert(KEY_SELECT_WORD, null, cv413);
        db.insert(KEY_SELECT_WORD, null, cv414);
        db.insert(KEY_SELECT_WORD, null, cv415);
        db.insert(KEY_SELECT_WORD, null, cv416);
        db.insert(KEY_SELECT_WORD, null, cv417);
        db.insert(KEY_SELECT_WORD, null, cv418);
        db.insert(KEY_SELECT_WORD, null, cv419);
        db.insert(KEY_SELECT_WORD, null, cv420);
        db.insert(KEY_SELECT_WORD, null, cv421);
        db.insert(KEY_SELECT_WORD, null, cv422);
        db.insert(KEY_SELECT_WORD, null, cv423);
        db.insert(KEY_SELECT_WORD, null, cv424);
        db.insert(KEY_SELECT_WORD, null, cv425);
        db.insert(KEY_SELECT_WORD, null, cv426);
        db.insert(KEY_SELECT_WORD, null, cv427);
        db.insert(KEY_SELECT_WORD, null, cv428);
        db.insert(KEY_SELECT_WORD, null, cv429);
        db.insert(KEY_SELECT_WORD, null, cv430);
        db.insert(KEY_SELECT_WORD, null, cv431);
        db.insert(KEY_SELECT_WORD, null, cv432);
        db.insert(KEY_SELECT_WORD, null, cv433);
        db.insert(KEY_SELECT_WORD, null, cv434);
        db.insert(KEY_SELECT_WORD, null, cv435);
        db.insert(KEY_SELECT_WORD, null, cv436);
        db.insert(KEY_SELECT_WORD, null, cv437);
        db.insert(KEY_SELECT_WORD, null, cv438);
        db.insert(KEY_SELECT_WORD, null, cv439);
        db.insert(KEY_SELECT_WORD, null, cv440);
        db.insert(KEY_SELECT_WORD, null, cv441);
        db.insert(KEY_SELECT_WORD, null, cv442);
        db.insert(KEY_SELECT_WORD, null, cv443);
        db.insert(KEY_SELECT_WORD, null, cv444);
        db.insert(KEY_SELECT_WORD, null, cv445);
        db.insert(KEY_SELECT_WORD, null, cv446);
        db.insert(KEY_SELECT_WORD, null, cv447);
        db.insert(KEY_SELECT_WORD, null, cv448);
        db.insert(KEY_SELECT_WORD, null, cv449);
        db.insert(KEY_SELECT_WORD, null, cv450);
        db.close();
    }

    @Override
    public void onClick(View v) {
        if (v == b1) {
            Intent in = new Intent(this, Verbal_Ability.class);
            startActivity(in);
        }


    }
}
