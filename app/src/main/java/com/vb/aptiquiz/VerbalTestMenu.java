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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbal_test_menu);
        b1 = (BootstrapButton) findViewById(R.id.button1);
        tv = (TextView) findViewById(R.id.textView3);

        b1.setOnClickListener(this);
        tv.setMovementMethod(new ScrollingMovementMethod());
        t = "Test Instructions :\n\n";
        t += "1.  Pass percentage is 60.\n\n2.  There are no negative marks.\n\n3.  Number of Questions = 30." +
                "\n\n4.  Time allotted = 25 minutes.\n\n5.  Scroll to view the full question if required.\n\n6.  Click on Summary in the Test section to view Test Summary and jump to a question directly.\n\n                               All the Best!";
        tv.setText(t);


        SQLiteDatabase db;
        db = openOrCreateDatabase("project", SQLiteDatabase.CREATE_IF_NECESSARY, null);
//
//        db.execSQL("create table if not exists corsen(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
//        db.execSQL("create table if not exists impsen(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
//        db.execSQL("create table if not exists theme(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
//        db.execSQL("create table if not exists comsen(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");
//        db.execSQL("create table if not exists selword(Id integer primary key,Question text,optiona text,optionb text,optionc text,optiond text,optione text,correct text)");

        Cursor c1, c2, c3, c4, c5;

        c1 = db.query("corsen", null, null, null, null, null, null);//cv151 to cv200
        c2 = db.query("impsen", null, null, null, null, null, null);//cv251 to cv300 //verbal
        c3 = db.query("theme", null, null, null, null, null, null);//cv301 to cv322
        c4 = db.query("comsen", null, null, null, null, null, null);//cv323 to cv400 // verbal
        c5 = db.query("selword", null, null, null, null, null, null);//cv401 to cv450

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

        SQLiteDatabase db;
        db = openOrCreateDatabase("project", SQLiteDatabase.CREATE_IF_NECESSARY, null);

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


        cv151.put("Id", 1);
        cv151.put("Question", "The small child does whatever his father WAS DONE.");
        cv151.put("optiona", "has done");
        cv151.put("optionb", "did");
        cv151.put("optionc", "does");
        cv151.put("optiond", "had done");
        cv151.put("optione", "no correction");
        cv151.put("correct", "3");

        cv152.put("Id", 2);
        cv152.put("Question", "There are not many men who are so famous that they are frequently referred to by their SHORT NAMES only");
        cv152.put("optiona", "initials");
        cv152.put("optionb", "signature");
        cv152.put("optionc", "pictures");
        cv152.put("optiond", "middle name");
        cv152.put("optione", "no correction");
        cv152.put("correct", "1");

        cv153.put("Id", 3);
        cv153.put("Question", "The man to WHO I SOLD my house was a cheat.");
        cv153.put("optiona", "to whom I sell");
        cv153.put("optionb", "to who I sell");
        cv153.put("optionc", "to whom I sold");
        cv153.put("optiond", "who was sold to");
        cv153.put("optione", "no correction");
        cv153.put("correct", "3");

        cv154.put("Id", 4);
        cv154.put("Question", "He is too important FOR TOLERATING any delay");
        cv154.put("optiona", "to tolerate");
        cv154.put("optionb", "to tolerating");
        cv154.put("optionc", "at tolerating");
        cv154.put("optiond", "with tolerating");
        cv154.put("optione", "no correction");
        cv154.put("correct", "1");

        cv155.put("Id", 5);
        cv155.put("Question", "The population of Tokyo is GREATER THAN THAT OF ANY OTHER town in the world.");
        cv155.put("optiona", "greater among any other");
        cv155.put("optionb", "greater than all other");
        cv155.put("optionc", "greater than those of any other");
        cv155.put("optiond", "greater than any otherS");
        cv155.put("optione", "no correction");
        cv155.put("correct", "5");

        cv156.put("Id", 6);
        cv156.put("Question", "SHAPES of gods and goddess are worshipped by people.");
        cv156.put("optiona", "images");
        cv156.put("optionb", "reflection");
        cv156.put("optionc", "clay shapes");
        cv156.put("optiond", "clay toys");
        cv156.put("optione", "no correction");
        cv156.put("correct", "1");

        cv157.put("Id", 7);
        cv157.put("Question", "The intruder stood quietly FOR FEW MOMENTS");
        cv157.put("optiona", "for few time");
        cv157.put("optionb", "for the few minutes");
        cv157.put("optionc", "for moments");
        cv157.put("optiond", "for a few moments");
        cv157.put("optione", "no correction");
        cv157.put("correct", "4");

        cv158.put("Id", 8);
        cv158.put("Question", "He confidentially asked the crowd if they thought he was right\nand the crowd shouted THAT THEY DID.");
        cv158.put("optiona", "that he did");
        cv158.put("optionb", "that they had");
        cv158.put("optionc", "that he is");
        cv158.put("optiond", "that he didn't");
        cv158.put("optione", "no correction");
        cv158.put("correct", "5");

        cv159.put("Id", 9);
        cv159.put("Question", "He found the gold coin AS HE CLEANS the floor.");
        cv159.put("optiona", "as he had cleaned");
        cv159.put("optionb", "while he cleaned");
        cv159.put("optionc", "while cleaning");
        cv159.put("optiond", "while he cleans");
        cv159.put("optione", "no correction");
        cv159.put("correct", "3");

        cv160.put("Id", 10);
        cv160.put("Question", "Maria unnecessarily PICKED UP a quarrel with Rani and left the party hurried.");
        cv160.put("optiona", "has picked up");
        cv160.put("optionb", "picked on");
        cv160.put("optionc", "picked");
        cv160.put("optiond", "picking up");
        cv160.put("optione", "no correction");
        cv160.put("correct", "3");

        cv161.put("Id", 11);
        cv161.put("Question", "She cooks, washes dishes, does her homework and THEN RELAXING");
        cv161.put("optiona", "relaxing then");
        cv161.put("optionb", "then is relaxing");
        cv161.put("optionc", "relaxing is then ");
        cv161.put("optiond", "then relaxes");
        cv161.put("optione", "no correction");
        cv161.put("correct", "4");

        cv162.put("Id", 12);
        cv162.put("Question", "Technology MUST USE TO FEED the forces of change");
        cv162.put("optiona", "must be used to feed");
        cv162.put("optionb", "must have been using to feed");
        cv162.put("optionc", "must use having fed");
        cv162.put("optiond", "must be using to feed");
        cv162.put("optione", "no correction");
        cv162.put("correct", "1");

        cv163.put("Id", 13);
        cv163.put("Question", "They ARE NOT BEWARE OF all the facts");
        cv163.put("optiona", "are not aware for");
        cv163.put("optionb", "are not aware of");
        cv163.put("optionc", "are not to be aware");
        cv163.put("optiond", "must not to be aware of");
        cv163.put("optione", "no correction");
        cv163.put("correct", "1");

        cv164.put("Id", 14);
        cv164.put("Question", "We CAN NOT ALWAYS CONVEY ourselves in simple sentences.");
        cv164.put("optiona", "cannot always convey");
        cv164.put("optionb", "can not always express");
        cv164.put("optionc", "cannot always express");
        cv164.put("optiond", "can not always convey");
        cv164.put("optione", "no correction");
        cv164.put("correct", "3");

        cv165.put("Id", 15);
        cv165.put("Question", "As there was no time, the remaining items WERE DEFERRED INTO the next meeting");
        cv165.put("optiona", "are deferred till");
        cv165.put("optionb", "were deferred till");
        cv165.put("optionc", "were deferred to");
        cv165.put("optiond", "had deferred with");
        cv165.put("optione", "no correction");
        cv165.put("correct", "2");

        cv166.put("Id", 16);
        cv166.put("Question", "What DOES AGONISE ME MOST is not this criticism, but the trivial reason behind it.");
        cv166.put("optiona", "most agonising me");
        cv166.put("optionb", "agonising me most");
        cv166.put("optionc", "agonises me most");
        cv166.put("optiond", "I most agonised");
        cv166.put("optione", "no correction");
        cv166.put("correct", "2");

        cv167.put("Id", 17);
        cv167.put("Question", "For many centuries in Indian History there was no city so famous LIKE the city of Ujjain.");
        cv167.put("optiona", "as");
        cv167.put("optionb", "such as");
        cv167.put("optionc", "likewise");
        cv167.put("optiond", "so like");
        cv167.put("optione", "no correction");
        cv167.put("correct", "1");

        cv168.put("Id", 18);
        cv168.put("Question", "We don't know HOW DID THE THIEF MADE an escape.");
        cv168.put("optiona", "how the thief did make");
        cv168.put("optionb", "how the thief does make");
        cv168.put("optionc", "how the thief made");
        cv168.put("optiond", "how does the thief made");
        cv168.put("optione", "no correction");
        cv168.put("correct", "3");

        cv169.put("Id", 19);
        cv169.put("Question", "One of the most significant PHENOMENONS of our time has been the development of cinema.");
        cv169.put("optiona", "phenomenon");
        cv169.put("optionb", "phenomena");
        cv169.put("optionc", "phenomenonna");
        cv169.put("optiond", "phenomenonns");
        cv169.put("optione", "no correction");
        cv169.put("correct", "2");

        cv170.put("Id", 20);
        cv170.put("Question", "Anand has the guts TO RISE FROM the occasion and come out successfully.");
        cv170.put("optiona", "in rising from");
        cv170.put("optionb", "to raise with");
        cv170.put("optionc", "to rise to");
        cv170.put("optiond", "to rise against");
        cv170.put("optione", "no correction");
        cv170.put("correct", "3");

        cv171.put("Id", 21);
        cv171.put("Question", "The orator HAD BEEN LEFT the auditorium before the audience stood up.");
        cv171.put("optiona", "had been leaving");
        cv171.put("optionb", "was left");
        cv171.put("optionc", "had left");
        cv171.put("optiond", "would leave");
        cv171.put("optione", "no correction");
        cv171.put("correct", "3");

        cv172.put("Id", 22);
        cv172.put("Question", "He dislikes the word dislike, ISN'T HE");
        cv172.put("optiona", "didn't he");
        cv172.put("optionb", "doesn't he");
        cv172.put("optionc", "hasn't he");
        cv172.put("optiond", "does he");
        cv172.put("optione", "no correction");
        cv172.put("correct", "2");

        cv173.put("Id", 23);
        cv173.put("Question", "We must TAKE IT GRANTED that Madhu will not come for today's function.");
        cv173.put("optiona", "take it for granted");
        cv173.put("optionb", "taking granted");
        cv173.put("optionc", "took is as granted");
        cv173.put("optiond", "have it granted");
        cv173.put("optione", "no correction");
        cv173.put("correct", "1");

        cv174.put("Id", 24);
        cv174.put("Question", "The research study is an eye-opener and ATTEMPTS TO ACQUAINT us with the problems of poor nations.");
        cv174.put("optiona", "attempted to acquaint");
        cv174.put("optionb", "attempts at acquainting");
        cv174.put("optionc", "attempt to acquaint");
        cv174.put("optiond", "attempting to acquaint");
        cv174.put("optione", "no correction");
        cv174.put("correct", "2");

        cv175.put("Id", 25);
        cv175.put("Question", "It is always better to make people realise the importance of discipline than to IMPOSE THEM ON IT.");
        cv175.put("optiona", "impose it with them");
        cv175.put("optionb", "impose them with it");
        cv175.put("optionc", "imposing them on it");
        cv175.put("optiond", "impose it on them");
        cv175.put("optione", "no correction");
        cv175.put("correct", "4");

        cv176.put("Id", 26);
        cv176.put("Question", "Later he became unpopular because he tried TO LORD IT ON his followers.");
        cv176.put("optiona", "to lord it for");
        cv176.put("optionb", "to lord over");
        cv176.put("optionc", "to lord it over");
        cv176.put("optiond", "to load it on");
        cv176.put("optione", "no correction");
        cv176.put("correct", "3");

        cv177.put("Id", 27);
        cv177.put("Question", "The crops are dying; it MUST NOT HAD rained.");
        cv177.put("optiona", "must had not");
        cv177.put("optionb", "must not be");
        cv177.put("optionc", "must not have");
        cv177.put("optiond", "must not been");
        cv177.put("optione", "no correction");
        cv177.put("correct", "3");

        cv178.put("Id", 28);
        cv178.put("Question", "Hardly DOES THE SUN RISE when the stars disappeared.");
        cv178.put("optiona", "have the sun rose");
        cv178.put("optionb", "have the sun risen");
        cv178.put("optionc", "did the sun rose");
        cv178.put("optiond", "the sun rose");
        cv178.put("optione", "no correction");
        cv178.put("correct", "2");

        cv179.put("Id", 29);
        cv179.put("Question", "You will be late if you DO NOT LEAVE now");
        cv179.put("optiona", "did not leave");
        cv179.put("optionb", "will not leave");
        cv179.put("optionc", "left");
        cv179.put("optiond", "do not happens to leave");
        cv179.put("optione", "no correction");
        cv179.put("correct", "5");

        cv180.put("Id", 30);
        cv180.put("Question", "The train will leave at 8.30 pm, we HAVE BEEN ready by 7.30pm so that, we can reach the station in time.");
        cv180.put("optiona", "were");
        cv180.put("optionb", "must be");
        cv180.put("optionc", "should have");
        cv180.put("optiond", "are");
        cv180.put("optione", "no correction");
        cv180.put("correct", "2");

        cv181.put("Id", 31);
        cv181.put("Question", "All the allegations LEVELLED AGAINST him were found to be baseless");
        cv181.put("optiona", "level against");
        cv181.put("optionb", "level with");
        cv181.put("optionc", "levelling with");
        cv181.put("optiond", "levelled for");
        cv181.put("optione", "no correction");
        cv181.put("correct", "5");

        cv182.put("Id", 32);
        cv182.put("Question", "Ramesh is AS TALL IF NOT, taller than Mahesh.");
        cv182.put("optiona", "not as tall but");
        cv182.put("optionb", "not but tall as");
        cv182.put("optionc", "as tall as, if not");
        cv182.put("optiond", "if not");
        cv182.put("optione", "no correction");
        cv182.put("correct", "3");

        cv183.put("Id", 33);
        cv183.put("Question", "The prosecution failed IN establish in every case today.");
        cv183.put("optiona", "to");
        cv183.put("optionb", "on");
        cv183.put("optionc", "as");
        cv183.put("optiond", "upon");
        cv183.put("optione", "no correction");
        cv183.put("correct", "1");

        cv184.put("Id", 34);
        cv184.put("Question", "One of my drawbacks is that I DO NOT HAVE TO tolerance of ambiguity");
        cv184.put("optiona", "do not have");
        cv184.put("optionb", "cannot have");
        cv184.put("optionc", "am not");
        cv184.put("optiond", "did not have to");
        cv184.put("optione", "no correction");
        cv184.put("correct", "1");

        cv185.put("Id", 35);
        cv185.put("Question", "We demonstrated to them how we WERE PREPARED the artistic patterns");
        cv185.put("optiona", "are prepared");
        cv185.put("optionb", "have prepared");
        cv185.put("optionc", "are preparing");
        cv185.put("optiond", "had prepared");
        cv185.put("optione", "no correction");
        cv185.put("correct", "4");

        cv186.put("Id", 36);
        cv186.put("Question", "Because of his mastery in this field, his suggestions ARE WIDE ACCEPTED");
        cv186.put("optiona", "are widely accepted");
        cv186.put("optionb", "are widely acceptance");
        cv186.put("optionc", "widely acceptance");
        cv186.put("optiond", "have widely accepted");
        cv186.put("optione", "no correction");
        cv186.put("correct", "1");

        cv187.put("Id", 37);
        cv187.put("Question", "They felt humiliated because they realised that they HAD CHEATED.");
        cv187.put("optiona", "have been cheated");
        cv187.put("optionb", "had been cheated");
        cv187.put("optionc", "had been cheating");
        cv187.put("optiond", "were cheating");
        cv187.put("optione", "no correction");
        cv187.put("correct", "2");

        cv188.put("Id", 38);
        cv188.put("Question", "Tax evaders SHOULD HEAVILY PUNISHED as they do it intentionally.");
        cv188.put("optiona", "should be heavy fined");
        cv188.put("optionb", "should have heavily fined");
        cv188.put("optionc", "shall have heavy fine");
        cv188.put("optiond", "should be heavily fined");
        cv188.put("optione", "no correction");
        cv188.put("correct", "4");

        cv189.put("Id", 39);
        cv189.put("Question", "We met him immediately after the session in which he HAD BEEN GIVEN a nice speech");
        cv189.put("optiona", "would be giving");
        cv189.put("optionb", "has been given");
        cv189.put("optionc", "will have given");
        cv189.put("optiond", "had given");
        cv189.put("optione", "no correction");
        cv189.put("correct", "4");

        cv190.put("Id", 40);
        cv190.put("Question", "For some days the new professor lectured ABOVE THE HEADS OF his pupils.");
        cv190.put("optiona", "over the head of");
        cv190.put("optionb", "over the heads of");
        cv190.put("optionc", "on the heads of");
        cv190.put("optiond", "through the heads of");
        cv190.put("optione", "no correction");
        cv190.put("correct", "4");

        cv191.put("Id", 41);
        cv191.put("Question", "We were still standing in the queue when the FILM WAS BEGINNING");
        cv191.put("optiona", "film began");
        cv191.put("optionb", "film had began");
        cv191.put("optionc", "beginning of the film was over");
        cv191.put("optiond", "film begins");
        cv191.put("optione", "no correction");
        cv191.put("correct", "2");

        cv192.put("Id", 42);
        cv192.put("Question", "IF I WOULD HAVE realised the nature of job earlier, I would not have accepted it");
        cv192.put("optiona", "If I have had");
        cv192.put("optionb", "In case I would have");
        cv192.put("optionc", "Had I been");
        cv192.put("optiond", "Had I");
        cv192.put("optione", "no correction");
        cv192.put("correct", "1");

        cv193.put("Id", 43);
        cv193.put("Question", "BY SUCH TIME you finish that chapter, I will write a letter");
        cv193.put("optiona", "The time when");
        cv193.put("optionb", "By the time");
        cv193.put("optionc", "By that time");
        cv193.put("optiond", "The time");
        cv193.put("optione", "no correction");
        cv193.put("correct", "2");

        cv194.put("Id", 44);
        cv194.put("Question", "Friends and comrades, the light has gone AWAY FROM our lives and there is darkness everywhere");
        cv194.put("optiona", "of");
        cv194.put("optionb", "out of");
        cv194.put("optionc", "out off");
        cv194.put("optiond", "out from");
        cv194.put("optione", "no correction");
        cv194.put("correct", "2");

        cv195.put("Id", 45);
        cv195.put("Question", "The tea-estate administration is IN SUCH MESS THERE is no leader to set the things right.");
        cv195.put("optiona", "in such a mess here");
        cv195.put("optionb", "in a such mess that here");
        cv195.put("optionc", "in such a mess that there");
        cv195.put("optiond", "with such a mess that there");
        cv195.put("optione", "no correction");
        cv195.put("correct", "3");

        cv196.put("Id", 46);
        cv196.put("Question", "Because of his ill health, the doctor has advised him NOT TO REFRAIN FROM smoking");
        cv196.put("optiona", "to not refrain from");
        cv196.put("optionb", "to resort to");
        cv196.put("optionc", "to refrain from");
        cv196.put("optiond", "to be refrain from");
        cv196.put("optione", "no correction");
        cv196.put("correct", "3");

        cv197.put("Id", 47);
        cv197.put("Question", "Making friends is more rewarding than TO MAKE ENEMIES");
        cv197.put("optiona", "to be unsociable");
        cv197.put("optionb", "to be sociable");
        cv197.put("optionc", "being unsociable");
        cv197.put("optiond", "making enemies");
        cv197.put("optione", "no correction");
        cv197.put("correct", "4");

        cv198.put("Id", 48);
        cv198.put("Question", "The moment they saw me, they WERE DELIGHT");
        cv198.put("optiona", "had delighted");
        cv198.put("optionb", "were delighted");
        cv198.put("optionc", "was delighted");
        cv198.put("optiond", "are delighted");
        cv198.put("optione", "no correction");
        cv198.put("correct", "2");

        cv199.put("Id", 49);
        cv199.put("Question", "He SHOULD NOT HAD done it");
        cv199.put("optiona", "had not");
        cv199.put("optionb", "should had not");
        cv199.put("optionc", "should not have");
        cv199.put("optiond", "should have");
        cv199.put("optione", "no correction");
        cv199.put("correct", "3");

        cv200.put("Id", 50);
        cv200.put("Question", "The world has seen SMALL real attempt at population and resource planning");
        cv200.put("optiona", "few");
        cv200.put("optionb", "little");
        cv200.put("optionc", "less");
        cv200.put("optiond", "a few");
        cv200.put("optione", "no correction");
        cv200.put("correct", "2");


        cv251.put("Id", 1);
        cv251.put("Question", "The workers are HELL BENT AT GETTING what is due to them.");
        cv251.put("optiona", "hell bent on getting");
        cv251.put("optionb", "hell bent for getting");
        cv251.put("optionc", "hell bent upon getting");
        cv251.put("optiond", "No improvement");
        cv251.put("optione", "none of these");
        cv251.put("correct", "3");

        cv252.put("Id", 2);
        cv252.put("Question", "When it was feared that the serfs might go too far and gain their freedom from serfdom, the protestant leaders joined the princes AT CRUSHING them.");
        cv252.put("optiona", "into crushing");
        cv252.put("optionb", "in crushing");
        cv252.put("optionc", "without crushing");
        cv252.put("optiond", "No improvement");
        cv252.put("optione", "none of these");
        cv252.put("correct", "2");

        cv253.put("Id", 3);
        cv253.put("Question", "IF THE ROOM HAD BEEN BRIGHTER, I would have been able to read for a while before bed time.");
        cv253.put("optiona", "If the room was brighter");
        cv253.put("optionb", "If the room are brighter");
        cv253.put("optionc", "Had the room been brighter");
        cv253.put("optiond", "No improvement");
        cv253.put("optione", "none of these");
        cv253.put("correct", "3");

        cv254.put("Id", 4);
        cv254.put("Question", "The record for the biggest tiger hunt has not been MET since 1911 when Lord Hardinge. then Viceroy of India, shot a tiger than measured 11 feet and 6 inches.");
        cv254.put("optiona", "improved");
        cv254.put("optionb", "broken");
        cv254.put("optionc", "bettered");
        cv254.put("optiond", "No improvement");
        cv254.put("optione", "none of these");
        cv254.put("correct", "2");

        cv255.put("Id", 5);
        cv255.put("Question", "HIS POWERFUL DRSIRE  brought about his downfall.");
        cv255.put("optiona", "his intense desire");
        cv255.put("optionb", "his desire for power");
        cv255.put("optionc", "his fatal desire");
        cv255.put("optiond", "No improvement");
        cv255.put("optione", "none of these");
        cv255.put("correct", "2");

        cv256.put("Id", 6);
        cv256.put("Question", "Will you kindly OPEN the knot?");
        cv256.put("optiona", "untie");
        cv256.put("optionb", "break");
        cv256.put("optionc", "loose");
        cv256.put("optiond", "No improvement");
        cv256.put("optione", "none of these");
        cv256.put("correct", "1");

        cv257.put("Id", 7);
        cv257.put("Question", "He SENT A WORD  to me that he would be coming late.");
        cv257.put("optiona", "sent word");
        cv257.put("optionb", "had sent a word");
        cv257.put("optionc", "sent words");
        cv257.put("optiond", "No improvement");
        cv257.put("optione", "none of these");
        cv257.put("correct", "1");

        cv258.put("Id", 8);
        cv258.put("Question", "John HAD TOLD  me that he hasn't done it yet.");
        cv258.put("optiona", "told");
        cv258.put("optionb", "tell");
        cv258.put("optionc", "was telling");
        cv258.put("optiond", "No improvement");
        cv258.put("optione", "none of these");
        cv258.put("correct", "2");

        cv259.put("Id", 9);
        cv259.put("Question", "If he had time he WILL call you.");
        cv259.put("optiona", "would have");
        cv259.put("optionb", "would have had");
        cv259.put("optionc", " has");
        cv259.put("optiond", "No improvement");
        cv259.put("optione", "none of these");
        cv259.put("correct", "3");

        cv260.put("Id", 10);
        cv260.put("Question", "Will you LEND ME FEW RUPEES in this hour of need?");
        cv260.put("optiona", "lend me any rupees");
        cv260.put("optionb", "borrow me a few rupees");
        cv260.put("optionc", "lend me a few rupees");
        cv260.put("optiond", "no improvement");
        cv260.put("optione", "none of these");
        cv260.put("correct", "3");

        cv261.put("Id", 11);
        cv261.put("Question", "During his long discourse, he did not TOUCH that point.");
        cv261.put("optiona", "touch upon");
        cv261.put("optionb", "touch on");
        cv261.put("optionc", "touch of");
        cv261.put("optiond", "no improvement");
        cv261.put("optione", "none of these");
        cv261.put("correct", "2");

        cv262.put("Id", 12);
        cv262.put("Question", "He found a WOODEN BROKEN CHAIR in the room.");
        cv262.put("optiona", "wooden and broken chair");
        cv262.put("optionb", "broken wooden chair");
        cv262.put("optionc", "broken and wooden chair");
        cv262.put("optiond", "no improvement");
        cv262.put("optione", "none of these");
        cv262.put("correct", "2");

        cv263.put("Id", 13);
        cv263.put("Question", "He could not LOOK anything in the dark room.");
        cv263.put("optiona", "look at");
        cv263.put("optionb", "see");
        cv263.put("optionc", "see through");
        cv263.put("optiond", "no improvement");
        cv263.put("optione", "none of these");
        cv263.put("correct", "2");

        cv264.put("Id", 14);
        cv264.put("Question", "The greatest THING in style is to have a use of metaphor.");
        cv264.put("optiona", "knowledge");
        cv264.put("optionb", "command");
        cv264.put("optionc", "need");
        cv264.put("optiond", "no improvement");
        cv264.put("optione", "none of these");
        cv264.put("correct", "1");

        cv265.put("Id", 15);
        cv265.put("Question", "While crossing the highway a five year old child was knocked OUT by a passing car.");
        cv265.put("optiona", "away");
        cv265.put("optionb", "up");
        cv265.put("optionc", "down");
        cv265.put("optiond", "no improvement");
        cv265.put("optione", "none of these");
        cv265.put("correct", "3");

        cv266.put("Id", 16);
        cv266.put("Question", "hoping not to be disturbed, I sat down in my easy chair to read the book. I WON AS A PRIZE");
        cv266.put("optiona", "I had won as a prize");
        cv266.put("optionb", "I have won as prize");
        cv266.put("optionc", "I had to win as a prize");
        cv266.put("optiond", "no improvement");
        cv266.put("optione", "none of these");
        cv266.put("correct", "1");

        cv267.put("Id", 17);
        cv267.put("Question", "More than one person WAS KILLED in accident.");
        cv267.put("optiona", "were killed");
        cv267.put("optionb", "have been killed");
        cv267.put("optionc", "are killed");
        cv267.put("optiond", "no improvement");
        cv267.put("optione", "none of these");
        cv267.put("correct", "1");

        cv268.put("Id", 18);
        cv268.put("Question", "No one could explain how a calm and balanced person like him could PENETRATE such a mindless act on his friends.");
        cv268.put("optiona", "perpetuate");
        cv268.put("optionb", "perpetrate");
        cv268.put("optionc", "precipitate");
        cv268.put("optiond", "no improvement");
        cv268.put("optione", "none of these");
        cv268.put("correct", "2");

        cv269.put("Id", 19);
        cv269.put("Question", "Five years ago today, I AM SITTING in a small Japanese car, driving across Poland towards Berlin.");
        cv269.put("optiona", "was sitting");
        cv269.put("optionb", "sat");
        cv269.put("optionc", "have been sitting");
        cv269.put("optiond", "no improvement");
        cv269.put("optione", "none of these");
        cv269.put("correct", "1");

        cv270.put("Id", 20);
        cv270.put("Question", "I took the cycle WHICH HE BOUGHT YESTERDAY.");
        cv270.put("optiona", "I took the cycle which he bought yesterday.");
        cv270.put("optionb", "that which he had bought yesterday");
        cv270.put("optionc", "that he bought yesterday");
        cv270.put("optiond", "no improvement");
        cv270.put("optione", "none of these");
        cv270.put("correct", "3");

        cv271.put("Id", 21);
        cv271.put("Question", "Please make it a point to send you letter AT MY ADDRESS");
        cv271.put("optiona", "on my address");
        cv271.put("optionb", "in my address");
        cv271.put("optionc", "to my address");
        cv271.put("optiond", "no improvement");
        cv271.put("optione", "none of these");
        cv271.put("correct", "3");

        cv272.put("Id", 22);
        cv272.put("Question", "If you are living near a market place you should be ready TO BEAR the disturbances caused by traffic.");
        cv272.put("optiona", "to bear upon");
        cv272.put("optionb", "to bear with");
        cv272.put("optionc", "to bear away");
        cv272.put("optiond", "no improvement");
        cv272.put("optione", "none of these");
        cv272.put("correct", "2");

        cv273.put("Id", 23);
        cv273.put("Question", "I hope you won't object TO ME WATCHING while you work.");
        cv273.put("optiona", "against me watching");
        cv273.put("optionb", "me to watch");
        cv273.put("optionc", "to my watching");
        cv273.put("optiond", "no improvement");
        cv273.put("optione", "none of these");
        cv273.put("correct", "3");

        cv274.put("Id", 24);
        cv274.put("Question", "You cannot forbid HIM LEAVING.");
        cv274.put("optiona", "he leaving");
        cv274.put("optionb", "his leaving");
        cv274.put("optionc", "him to leave");
        cv274.put("optiond", "no improvement");
        cv274.put("optione", "none of these");
        cv274.put("correct", "3");

        cv275.put("Id", 25);
        cv275.put("Question", "You have come here with a view TO INSULT ME.");
        cv275.put("optiona", "to insulting me");
        cv275.put("optionb", "of insulting me");
        cv275.put("optionc", "for insulting me");
        cv275.put("optiond", "no improvement");
        cv275.put("optione", "none of these");
        cv275.put("correct", "1");

        cv276.put("Id", 26);
        cv276.put("Question", "20 kms ARE NOT A GREAT DISTANCE in these days of fast moving vehicles.");
        cv276.put("optiona", "is not a great distance");
        cv276.put("optionb", "is no distance");
        cv276.put("optionc", "aren't a great distance");
        cv276.put("optiond", "no improvement");
        cv276.put("optione", "none of these");
        cv276.put("correct", "1");

        cv277.put("Id", 27);
        cv277.put("Question", "THE MORE THEY EARN, MORE THEY SPEND.");
        cv277.put("optiona", "More they earn, more they spend");
        cv277.put("optionb", "More they earn, the more they spend");
        cv277.put("optionc", "The more they earn, the more they spend");
        cv277.put("optiond", "no improvement");
        cv277.put("optione", "none of these");
        cv277.put("correct", "3");

        cv278.put("Id", 28);
        cv278.put("Question", "It became clear that the strangers were heading INTO a serious disaster.");
        cv278.put("optiona", "along");
        cv278.put("optionb", "towards");
        cv278.put("optionc", "for");
        cv278.put("optiond", "no improvement");
        cv278.put("optione", "none of these");
        cv278.put("correct", "2");

        cv279.put("Id", 29);
        cv279.put("Question", "The dissidents HOLD a great problem in every political party.");
        cv279.put("optiona", "cause");
        cv279.put("optionb", "give");
        cv279.put("optionc", "pose");
        cv279.put("optiond", "no improvement");
        cv279.put("optione", "none of these");
        cv279.put("correct", "1");

        cv280.put("Id", 30);
        cv280.put("Question", "I would have waited for you at the station if I KNEW that you would come.");
        cv280.put("optiona", "had known");
        cv280.put("optionb", "was knowing");
        cv280.put("optionc", "has known");
        cv280.put("optiond", "no improvement");
        cv280.put("optione", "none of these");
        cv280.put("correct", "1");

        cv281.put("Id", 31);
        cv281.put("Question", "They are social insects, LIVING IN COMMUNITIES, regulated by definite laws, each member of society bearing well-defined and separate part in the work of a colony");
        cv281.put("optiona", "who are living in communities");
        cv281.put("optionb", "living among a community");
        cv281.put("optionc", "who lives with a community");
        cv281.put("optiond", "no improvement");
        cv281.put("optione", "none of these");
        cv281.put("correct", "4");

        cv282.put("Id", 32);
        cv282.put("Question", "Practically EVERY PART of the banana tree is used by man");
        cv282.put("optiona", "each part");
        cv282.put("optionb", "any part");
        cv282.put("optionc", "most part");
        cv282.put("optiond", "no improvement");
        cv282.put("optione", "none of these");
        cv282.put("correct", "4");

        cv283.put("Id", 33);
        cv283.put("Question", "My OPINION FOR the film is that it will bag the national ward.");
        cv283.put("optiona", "opinion to");
        cv283.put("optionb", "opinion about");
        cv283.put("optionc", "opinion on");
        cv283.put("optiond", "no improvement");
        cv283.put("optione", "none of these");
        cv283.put("correct", "3");

        cv284.put("Id", 34);
        cv284.put("Question", "The end of the examinations is (an) OPPORTUNITY for celebrating");
        cv284.put("optiona", "chance");
        cv284.put("optionb", "moment");
        cv284.put("optionc", "occasion");
        cv284.put("optiond", "no improvement");
        cv284.put("optione", "none of these");
        cv284.put("correct", "2");

        cv285.put("Id", 35);
        cv285.put("Question", "We were NOT the wiser for all this effort to explain the case to us..");
        cv285.put("optiona", "none");
        cv285.put("optionb", "neither");
        cv285.put("optionc", "nevertheless");
        cv285.put("optiond", "no improvement");
        cv285.put("optione", "none of these");
        cv285.put("correct", "1");

        cv286.put("Id", 36);
        cv286.put("Question", "Whenever my students come across new words, I ask them TO LOOK FOR THEM in the dictionary.");
        cv286.put("optiona", "to look it up");
        cv286.put("optionb", "to look them up");
        cv286.put("optionc", "to look at them");
        cv286.put("optiond", "no improvement");
        cv286.put("optione", "none of these");
        cv286.put("correct", "2");

        cv287.put("Id", 37);
        cv287.put("Question", "We look forward to HEAR from you");
        cv287.put("optiona", "hearing");
        cv287.put("optionb", "have heard");
        cv287.put("optionc", "listen");
        cv287.put("optiond", "no improvement");
        cv287.put("optione", "none of these");
        cv287.put("correct", "1");

        cv288.put("Id", 38);
        cv288.put("Question", "It was indeed a shock for her, but she has LATER recovered from it.");
        cv288.put("optiona", "since");
        cv288.put("optionb", "then");
        cv288.put("optionc", "afterwards");
        cv288.put("optiond", "no improvement");
        cv288.put("optione", "none of these");
        cv288.put("correct", "1");

        cv289.put("Id", 39);
        cv289.put("Question", "Realising is the significance of technical education for developing country, the government LAID ASIDE a large sum on it during the last plan-period.");
        cv289.put("optiona", "laid up");
        cv289.put("optionb", "set aside");
        cv289.put("optionc", "laid down");
        cv289.put("optiond", "no improvement");
        cv289.put("optione", "none of these");
        cv289.put("correct", "2");

        cv290.put("Id", 40);
        cv290.put("Question", "If you are not clear about the meaning of a word, it is wise to LOOK TO a dictionary.");
        cv290.put("optiona", "look for");
        cv290.put("optionb", "look at");
        cv290.put("optionc", "look up");
        cv290.put("optiond", "no improvement");
        cv290.put("optione", "none of these");
        cv290.put("correct", "3");

        cv291.put("Id", 41);
        cv291.put("Question", "No sooner HE HAD RETURNED HOME THEN his mother felt happy.");
        cv291.put("optiona", "had he returned home when");
        cv291.put("optionb", "he had returned home than");
        cv291.put("optionc", "did he return home than");
        cv291.put("optiond", "no improvement");
        cv291.put("optione", "none of these");
        cv291.put("correct", "3");

        cv292.put("Id", 42);
        cv292.put("Question", "He should move on to the next point, and not HARP ONE STING ONLY.");
        cv292.put("optiona", "harp on string only");
        cv292.put("optionb", "harp only one string");
        cv292.put("optionc", "harp upon one string only");
        cv292.put("optiond", "no improvement");
        cv292.put("optione", "none of these");
        cv292.put("correct", "3");

        cv293.put("Id", 43);
        cv293.put("Question", "Either HE OR I AM GOING.");
        cv293.put("optiona", "he or i are going");
        cv293.put("optionb", "he is going or i am");
        cv293.put("optionc", "i or he is going");
        cv293.put("optiond", "no improvement");
        cv293.put("optione", "none of these");
        cv293.put("correct", "4");

        cv294.put("Id", 44);
        cv294.put("Question", "I hope you vividly remember the premier of the film when I, MY WIFE AND YOU were present in the hall.");
        cv294.put("optiona", "my wife, I and you");
        cv294.put("optionb", "you, I and my wife");
        cv294.put("optionc", "my wife, you and I");
        cv294.put("optiond", "no improvement");
        cv294.put("optione", "none of these");
        cv294.put("correct", "3");

        cv295.put("Id", 45);
        cv295.put("Question", "To get one's name in the Rowland Ward's book of hunting records was the HOT ambition of every serious hunter.");
        cv295.put("optiona", "extreme");
        cv295.put("optionb", "burning");
        cv295.put("optionc", "high");
        cv295.put("optiond", "no improvement");
        cv295.put("optione", "none of these");
        cv295.put("correct", "3");

        cv296.put("Id", 46);
        cv296.put("Question", "Taxpayers ARE TO be conscious of their privileges.");
        cv296.put("optiona", "have to");
        cv296.put("optionb", "need");
        cv296.put("optionc", "ought to");
        cv296.put("optiond", "no improvement");
        cv296.put("optione", "none of these");
        cv296.put("correct", "1");

        cv297.put("Id", 47);
        cv297.put("Question", "As she was suffering from high fever, she could not FACE the examination.");
        cv297.put("optiona", "bear");
        cv297.put("optionb", "suffer");
        cv297.put("optionc", "take");
        cv297.put("optiond", "no improvement");
        cv297.put("optione", "none of these");
        cv297.put("correct", "3");

        cv298.put("Id", 48);
        cv298.put("Question", "The demonstration PASSED OFF peacefully");
        cv298.put("optiona", "passed out");
        cv298.put("optionb", "passed away");
        cv298.put("optionc", "passed on");
        cv298.put("optiond", "no improvement");
        cv298.put("optione", "none of these");
        cv298.put("correct", "4");

        cv299.put("Id", 49);
        cv299.put("Question", "Every time I GO IN A LIFT to my sixth floor apartment, I remember the calm and serenity of my ancestral home in the village.");
        cv299.put("optiona", "move in a lift");
        cv299.put("optionb", "ascend in a lift");
        cv299.put("optionc", "take a lift");
        cv299.put("optiond", "no improvement");
        cv299.put("optione", "none of these");
        cv299.put("correct", "3");

        cv300.put("Id", 50);
        cv300.put("Question", "In fact, if it hadn't been for his INVALUABLE ADVICE on so many occasions I wouldn't have achieved anything in life.");
        cv300.put("optiona", "remarkable advice");
        cv300.put("optionb", "valuable advice");
        cv300.put("optionc", "priceless suggestion");
        cv300.put("optiond", "no improvement");
        cv300.put("optione", "none of these");
        cv300.put("correct", "4");

        cv301.put("Id", 1);
        cv301.put("Question", "The attainment of individual and organisational goals is mutually interdependent and linked by a common denominator - employee work motivation. Organisational members are motivated to satisfy their personal goals, and they contribute their efforts to the attainment of organisational objectives as means of achieving these personal goals.The passage best supports the statement that motivation -");
        cv301.put("optiona", "encourages an individual to give priority to personal goals over organisational goals");
        cv301.put("optionb", "is crucial for the survival of an individual and organisation.");
        cv301.put("optionc", "is the product of an individual's physical and mental energy.");
        cv301.put("optiond", "is the external force which induces an individual to contribute his efforts.");
        cv301.put("optione", "makes organisation and society inseparable.");
        cv301.put("correct", "1");

        cv302.put("Id", 2);
        cv302.put("Question", "Due to enormous profits involved in smuggling, hundreds of persons have been attracted towards this anti-national activity. Some of them became millionaires overnight. India has a vast coastline both on the Eastern and Western Coast. It has been a heaven for smugglers who have been carrying on their activities with great impunity. There is no doubt, that from time to time certain seizures were made by the enforcement authorities, during raids and ambush but even allowing these losses the smugglers made huge profits.The passage best supports the statement that");
        cv302.put("optiona", "smuggling hampers the economic development of a nation.");
        cv302.put("optionb", "smuggling ought to be curbed.");
        cv302.put("optionc", "authorities are taking strict measures to curb smuggling.");
        cv302.put("optiond", "smuggling is fast increasing in our country owing to the quick profit it entails");
        cv302.put("optione", "None of these");
        cv302.put("correct", "4");

        cv303.put("Id", 3);
        cv303.put("Question", "Though the waste of time or the expenditure on fashions is very large, yet fashions have come to stay. They will not go, come what may. However, what is now required is that strong efforts should be made to displace the excessive craze for fashion from the minds of these youngsters.The passage best supports the statement that:");
        cv303.put("optiona", "fashion is the need of the day.");
        cv303.put("optionb", "the excessive craze for fashion is detrimental to one's personality.");
        cv303.put("optionc", "the hoard for fashion should be done away with so as not to let down the constructive development.");
        cv303.put("optiond", "work and other activities should be valued more than the outward appearance.");
        cv303.put("optione", "None of these");
        cv303.put("correct", "3");

        cv304.put("Id", 4);
        cv304.put("Question", "One of the important humanitarian by-products of technology is the greater dignity and value that it imparts to human labour. In a highly industrialized society, there is no essential difference between Brahmin and Dalit, Muslim and Hindu; they are equally useful and hence equally valuable for in the industrial society individual productivity fixes the size of the pay cheque and this fixes social status.The passage best supports the statement that:");
        cv304.put("optiona", "technology decides individual's social status.");
        cv304.put("optionb", "castes and religions are man-made.");
        cv304.put("optionc", "human labour has dignity and value.");
        cv304.put("optiond", "all individuals, irrespective of caste and creed, are born equal.");
        cv304.put("optione", "industrial society is a great leveller of men.");
        cv304.put("correct", "3");

        cv305.put("Id", 5);
        cv305.put("Question", "The future of women in India is quite bright and let us hope that they will justify their abilities by rising to the occasion. Napoleon was right when he declared that by educating the women we can educate the whole nation. Because a country can never rise without the contribution of 50% of their population.The passage best supports the statement that:");
        cv305.put("optiona", "India is striving hard for the emancipation of women");
        cv305.put("optionb", "all women should be well educated.");
        cv305.put("optionc", "a nation can progress only when women are given equal rights and opportunities as men.");
        cv305.put("optiond", "women ought to be imparted full freedom to prove their worth and contribute to the progress of the nation");
        cv305.put("optione", "None of these");
        cv305.put("correct", "4");

        cv306.put("Id", 6);
        cv306.put("Question", "The prevention of accidents makes it necessary not only that safety devices be used to guard exposed machinery but also that mechanics be instructed in safety rules which they must follow for their own protection, and that lighting in the plant be adequate.The passage best supports the statement that industrial accidents -");
        cv306.put("optiona", "are always avoidable;");
        cv306.put("optionb", "may be due to ignorance.");
        cv306.put("optionc", "cannot be entirely overcome");
        cv306.put("optiond", "can be eliminated with the help of safety rules.");
        cv306.put("optione", "usually result from inadequate machinery.");
        cv306.put("correct", "4");

        cv307.put("Id", 7);
        cv307.put("Question", "To forgive an injury is often considered to be a sign of weakness; it is really a sign of strength. It is easy to allow oneself to be carried away by resentment and hate into an act of vengeance; but it takes a strong character to restrain those natural passions. The man who forgives an injury proves himself to be the superior of the man who wronged himself and puts the wrong-doer to shame.The passage best supports' the statement that:");
        cv307.put("optiona", "the sufferer alone knows the intensity of his sufferings.");
        cv307.put("optionb", "people tend to forgive the things happened in the past.");
        cv307.put("optionc", "natural passions are difficult to suppress.");
        cv307.put("optiond", "mercy is the noblest form of revenge.");
        cv307.put("optione", "a person with calm and composed nature has depth of thought and vision.");
        cv307.put("correct", "4");

        cv308.put("Id", 8);
        cv308.put("Question", "Industrial exhibitions play a major role in a country's economy. Such exhibitions, now regularly held in Delhi, enable us to measure the extent of our own less advanced industrial progress and the mighty industrial power and progress of countries like the U.K., U.S.A. and Russia whose pavilions are the centres of the greatest attention and attractions.The passage best supports the statement that industrial exhibitions -");
        cv308.put("optiona", "greatly tax the poor economies.");
        cv308.put("optionb", "are more useful for the developed countries like U.S.A. whose products stand out superior to those of the developing countries.");
        cv308.put("optionc", "are not of much use to the countries who are industrially backward");
        cv308.put("optiond", "boost up production qualitatively and quantitatively by analytical comparison of a country's products with those of the developed countries.");
        cv308.put("optione", "None of these");
        cv308.put("correct", "4");

        cv309.put("Id", 9);
        cv309.put("Question", "The school has always been the most important means of transferring the wealth of tradition form one generation to the next. This applies today in an even higher degree than in former times for, through the modern development of economy, the family as bearer of tradition and education has become weakened.This passage best supports the statement that for transferring the wealth of tradition from one generation to the next -");
        cv309.put("optiona", "there are means other than the school.");
        cv309.put("optionb", "several different sources must be tried.");
        cv309.put("optionc", "economic development plays a crucial role");
        cv309.put("optiond", "modern technology must be put to use");
        cv309.put("optione", "family, as ever, is the most potent means");
        cv309.put("correct", "3");

        cv310.put("Id", 10);
        cv310.put("Question", "Emerson said that the poet was landlord, Sealord, airlord. The flight of imagination made the poet master of land, sea and air. But a poet's dream of yesterday becomes today an actual achievement and a reality for all men. Even those who invented, improved and perfected the aeroplane could hardly have dreamt of the possibility of flight into outer space.The passage best supports the statement that:");
        cv310.put("optiona", "seemingly impossible imaginations make one a good poet,");
        cv310.put("optionb", "all imaginations become a reality some day.");
        cv310.put("optionc", "what man imagined has never been impossible; he has always turned it a reality through his conception of ideas and sheer hard labour.");
        cv310.put("optiond", "man has reached the climax of technological development with his exploration into outer space.");
        cv310.put("optione", "None of these");
        cv310.put("correct", "3");

        cv311.put("Id", 11);
        cv311.put("Question", "It is up to our government and planners to devise ways and means for the mobilisation of about ten crore workers whose families total up about forty crore men, women and children. Our agriculture is over-manned. A lesser number of agriculturists would mean more purchasing or spending power to every agriculturist. This will result in the shortage of man-power for many commodities to be produced for which there will be a new demand from a prosperous agrarian class. This shortage will be removed by surplus man-power released from agriculture as suggested above.The passage best supports the statement that:");
        cv311.put("optiona", "employment in production is more fruitful than employment in agriculture.");
        cv311.put("optionb", "Indian economy is in a poor shape basically due to improper mobilisation of man-power.");
        cv311.put("optionc", "a shift of labour from agricultural sector to the industrial sector would uplift the living standard.");
        cv311.put("optiond", "the industrial sector is labour-deficient while the agricultural sector is over-manned in our country.");
        cv311.put("optione", "None of these");
        cv311.put("correct", "2");

        cv312.put("Id", 12);
        cv312.put("Question", "Exports and imports, a swelling favourable balance of trade, investments and bank-balances, are not an index or a balance sheet of national prosperity. Till the beginning of the Second World War, English exports were noticeably greater than what they are today. And yet England has greater national prosperity today than it ever had. Because the income of average Englishmen, working as field and factory labourers, clerks, policemen, petty shopkeepers and shop assistants, domestic workers and other low-paid workers, has gone up.The passage best supports the statement that:");
        cv312.put("optiona", "a country's economic standard can be best adjudged by per capital income");
        cv312.put("optionb", "a country's balance of trade is the main criteria of determining its economic prosperity.");
        cv312.put("optionc", "a nation's economy strengthens with the increase in exports");
        cv312.put("optiond", "English trade has continually increased since the Second World War.");
        cv312.put("optione", "None of these");
        cv312.put("correct", "1");

        cv313.put("Id", 13);
        cv313.put("Question", "Satisfaction with co-workers, promotion opportunities, the nature of work, and pay goes with high performance among those with strong growth needs. Among those with weak growth needs, no such relationship is present - and, in fact, satisfaction with promotion opportunities goes with low performance.This passage best supports the statement that:");
        cv313.put("optiona", "satisfaction is an inevitable organisational variable");
        cv313.put("optionb", "job satisfaction and performance are directly and closely related.");
        cv313.put("optionc", "relationship between job satisfaction and performance is moderated by growth need.");
        cv313.put("optiond", "every organisation has few employees having weak growth need.");
        cv313.put("optione", "high performance is essential for organisational effectiveness");
        cv313.put("correct", "3");

        cv314.put("Id", 14);
        cv314.put("Question", "The only true education comes through the stimulation of the child's powers by the demands of the social situations in which he finds himself. Through these demands he is stimulated to act as a member of a unity, to emerge from his original narrowness of action and feeling, and to conceive himself from the standpoint of the welfare of the group to which he belongs. The passage best supports the statement that real education -");
        cv314.put("optiona", "will take place if the children imbibe action and feeling.");
        cv314.put("optionb", "will take place if the children are physically strong.");
        cv314.put("optionc", "is not provided in our schools today.");
        cv314.put("optiond", "comes through the interaction with social situations.");
        cv314.put("optione", "comes from the self-centred approach of the students.");
        cv314.put("correct", "4");

        cv315.put("Id", 15);
        cv315.put("Question", "The press should not be afraid of upholding and supporting a just and righteous cause. It should not be afraid of criticising the government in a healthy manner. The press has to be eternally vigilant to protect the rights of the workers, backward and suppressed sections of the society. It should also give a balanced view of the things so that people can be helped in the formation of a healthy public opinion.The passage best supports the statement that");
        cv315.put("optiona", "press has a great role to play in a democracy");
        cv315.put("optionb", "the press is the only means to project to the masses the policies of the government.");
        cv315.put("optionc", "the freedom of press is essential for the proper functioning of democracy.");
        cv315.put("optiond", "the press can be used by the governments as an effective media for the upliftment of the backward sections of society.");
        cv315.put("optione", "all the information given by the press should be well-articulated so as to gain a good opinion towards the ruling party.");
        cv315.put("correct", "3");

        cv316.put("Id", 16);
        cv316.put("Question", "Throughout the ages the businessman has helped build civilisation's great cities, provided people with luxuries and artists with patronage, and lift his fellow citizens to understand the standard of living. In the last few centuries the businessman has seeded the Industrial Revolution around the world.The passage best supports the statement that the businessman -");
        cv316.put("optiona", "is accountable to the society");
        cv316.put("optionb", "lives luxurious and comfortable life.");
        cv316.put("optionc", "is the beneficiary of the Industrial Revolution..");
        cv316.put("optiond", "is capable of raising his standard of living.");
        cv316.put("optione", "has contributed to the growth of civilisation.");
        cv316.put("correct", "5");

        cv317.put("Id", 17);
        cv317.put("Question", "There is a shift in our economy from a manufacturing to a service orientation. The increase in service-sector will require the managers to work more with people rather than with objects and things from the assembly line.This passage best supports the statement that:");
        cv317.put("optiona", "managers should have a balanced mind.");
        cv317.put("optionb", "assembly line will exist in service organisations.");
        cv317.put("optionc", "interpersonal skills will become more important in the future work place.");
        cv317.put("optiond", "manufacturing organisations ignore importance of people.");
        cv317.put("optione", "service organisations will not deal with objects and things.");
        cv317.put("correct", "3");

        cv318.put("Id", 18);
        cv318.put("Question", "The virtue of art does not allow the work to be interfered with or immediately ruled by anything other than itself. It insists that it alone shall touch the work in order to bring it into being. Art requires that nothing shall attain the work except through art itself.This passage best supports the statement that:");
        cv318.put("optiona", "art is governed by external rules and conditions");
        cv318.put("optionb", "art is for the sake of art and life.");
        cv318.put("optionc", "art is for the sake of art alone..");
        cv318.put("optiond", "artist realises his dreams through his artistic creation");
        cv318.put("optione", "artist should use his art for the sake of society.");
        cv318.put("correct", "3");

        cv319.put("Id", 19);
        cv319.put("Question", "There is a shift in our economy from a manufacturing to a service orientation. The increase in the service sector will require the manager to work more with people rather than with objects and things from the assembly line.This passage best supports the statement that");
        cv319.put("optiona", " managers should have a balanced mind");
        cv319.put("optionb", "interpersonal skills will become more important in the future work place");
        cv319.put("optionc", "manufacturing organisations ignore importance of people");
        cv319.put("optiond", "service organisation will not deal with objects and things");
        cv319.put("optione", "none of these");
        cv319.put("correct", "3");

        cv320.put("Id", 20);
        cv320.put("Question", "Through advertising, manufacturing exercises a high degree of control over consumer's desires. However the manufacturer assumes enormous risks in attempting to predict what consumers will want and in producing goods in quantity and distributing them in advance of final selection by the consumers. The paragraph best supports the statement that manufacturers ");
        cv320.put("optiona", "distribute goods directly to the consumers ");
        cv320.put("optionb", "can eliminate the risk of overproducing by advertising");
        cv320.put("optionc", " always take moderate and calculated risk ");
        cv320.put("optiond", "None of these");
        cv320.put("optione", "can predict with great accuracy the success of any product they put on the market");
        cv320.put("correct", "2");

        cv321.put("Id", 21);
        cv321.put("Question", "To forgive an injury is often considered to be a sign of weakness; it is really a sign of strength. It is easy to allow oneself to be carried away by resentment and hate into an act of vengeance; but it takes a strong character to restrain those natural passions. The man who forgives an injury proves to be superior to the man who wronged himself and puts the wrong-doer to shame.The passage best supports the statement that");
        cv321.put("optiona", "the sufferer alone knows the intensity of his sufferings");
        cv321.put("optionb", "people tend to forgive the things happened in the past");
        cv321.put("optionc", "natural passions are difficult to suppress.");
        cv321.put("optiond", "mercy is the noblest form of revenge");
        cv321.put("optione", "a person with calm and composed nature has depth of thought and vision");
        cv321.put("correct", "4");

        cv322.put("Id", 22);
        cv322.put("Question", "Satisfaction with co-workers, promotion opportunities, the nature of work, and pay goes with high performance among those with strong growth needs. Among those with weak growth needs, no such relationship is present – and, in fact, satisfaction with promotion opportunities goes with low performance.This passage best supports the statement that ");
        cv322.put("optiona", "satisfaction is an inevitable organisational variable");
        cv322.put("optionb", "job satisfaction and performance are directly and closely related ");
        cv322.put("optionc", "relationship between job satisfaction and performance is moderated by growth need.");
        cv322.put("optiond", " every organisation has few employees having weak growth need");
        cv322.put("optione", " high performance is essential for organisational effectiveness");
        cv322.put("correct", "3");
        /*theme detection till here*/

        cv323.put("Id", 1);
        cv323.put("Question", "Standing on the ______, the preacher greeted the parishioners every Sunday morning.");
        cv323.put("optiona", "steeple");
        cv323.put("optionb", "pillar");
        cv323.put("optionc", "parvis");
        cv323.put("optiond", "manifestation");
        cv323.put("optione", "sensor");
        cv323.put("correct", "3");

        cv324.put("Id", 2);
        cv324.put("Question", "Simona’s ______ with her money caught up with her when she didn’t have the resources to buy a badly needed new car.");
        cv324.put("optiona", "miserliness");
        cv324.put("optionb", "thriftiness");
        cv324.put("optionc", "wantonness");
        cv324.put("optiond", "intuition");
        cv324.put("optione", "predilection");
        cv324.put("correct", "3");

        cv325.put("Id", 3);
        cv325.put("Question", "The architect designed the ceiling using wood ______ that would remain uncovered, creating a rustic ambience in the living room.");
        cv325.put("optiona", "pediments");
        cv325.put("optionb", "joists");
        cv325.put("optionc", "mullions");
        cv325.put("optiond", "banisters");
        cv325.put("optione", "abutments");
        cv325.put("correct", "2");

        cv326.put("Id", 4);
        cv326.put("Question", "When the house on the corner burned down, the entire neighborhood ______ together to help to the victims re-establish their lives.");
        cv326.put("optiona", "rallied");
        cv326.put("optionb", "recited");
        cv326.put("optionc", "skulked");
        cv326.put("optiond", "disintegrated");
        cv326.put("optione", "expedited");
        cv326.put("correct", "1");

        cv327.put("Id", 5);
        cv327.put("Question", "The massage therapist’s ______ fingers quickly eased the tension in Blanche’s back.");
        cv327.put("optiona", "deft");
        cv327.put("optionb", "furtive");
        cv327.put("optionc", "listless");
        cv327.put("optiond", "tentative");
        cv327.put("optione", "blithe");
        cv327.put("correct", "1");

        cv328.put("Id", 6);
        cv328.put("Question", "Jade’s parents were in ______ about the decision not to allow her to drive the family car to the prom; they both agreed that it would be unsafe");
        cv328.put("optiona", "affluence");
        cv328.put("optionb", "redress");
        cv328.put("optionc", "refraction");
        cv328.put("optiond", "discord");
        cv328.put("optione", "unison");
        cv328.put("correct", "5");

        cv329.put("Id", 7);
        cv329.put("Question", "As she walked through the halls of her old grade school, Madeline became ______, remembering her old friends and teachers.");
        cv329.put("optiona", "prolific");
        cv329.put("optionb", "nostalgic");
        cv329.put("optionc", "credulous");
        cv329.put("optiond", "precocious");
        cv329.put("optione", "ambitious");
        cv329.put("correct", "2");

        cv330.put("Id", 8);
        cv330.put("Question", "After being cleared of all charges for slander, the attorney was able to go back to work and ______ his role as a prosecutor.");
        cv330.put("optiona", "inhibit");
        cv330.put("optionb", "reprimand");
        cv330.put("optionc", "remand");
        cv330.put("optiond", "resume");
        cv330.put("optione", "dissipate");
        cv330.put("correct", "4");

        cv331.put("Id", 9);
        cv331.put("Question", "Ignacio’s pain was so ______ that he called 911.");
        cv331.put("optiona", "remiss");
        cv331.put("optionb", "rapacious");
        cv331.put("optionc", "genteel");
        cv331.put("optiond", "resolute");
        cv331.put("optione", "acute");
        cv331.put("correct", "5");

        cv332.put("Id", 10);
        cv332.put("Question", "The captain ______ the cargo to keep his ship afloat.");
        cv332.put("optiona", "rebuked");
        cv332.put("optionb", "listed");
        cv332.put("optionc", "disunited");
        cv332.put("optiond", "flanked");
        cv332.put("optione", "jettisoned");
        cv332.put("correct", "5");

        cv333.put("Id", 11);
        cv333.put("Question", "The teacher tried to ______ her class of their dependence on the number lines pasted to the tops of their desks.");
        cv333.put("optiona", "wane");
        cv333.put("optionb", "wax");
        cv333.put("optionc", "whet");
        cv333.put("optiond", "wean");
        cv333.put("optione", "wield");
        cv333.put("correct", "4");

        cv334.put("Id", 12);
        cv334.put("Question", "The young girl was so full of enthusiasm and ______ that she infected the room with energy.");
        cv334.put("optiona", "languidness");
        cv334.put("optionb", "apathy");
        cv334.put("optionc", "vivacity");
        cv334.put("optiond", "blandness");
        cv334.put("optione", "tenacity");
        cv334.put("correct", "3");

        cv335.put("Id", 13);
        cv335.put("Question", "Ricky is a ______ of the local coffee shop; you can find him there just about every morning.");
        cv335.put("optiona", "diva");
        cv335.put("optionb", "relic");
        cv335.put("optionc", "denizen");
        cv335.put("optiond", "maverick");
        cv335.put("optione", "pariah");
        cv335.put("correct", "3");

        cv336.put("Id", 14);
        cv336.put("Question", "The child danced with ______ joy at hearing the news that her father had arrived home from his lengthy business trip.");
        cv336.put("optiona", "staid");
        cv336.put("optionb", "unbridled");
        cv336.put("optionc", "stealthy");
        cv336.put("optiond", "beneficial");
        cv336.put("optione", "restrained");
        cv336.put("correct", "2");

        cv337.put("Id", 15);
        cv337.put("Question", "Having never left the landlocked Midwest his entire life, Albert found that swimming in the ocean was quite a(n) ______.");
        cv337.put("optiona", "familiarity");
        cv337.put("optionb", "extrovert");
        cv337.put("optionc", "instinct");
        cv337.put("optiond", "novelty");
        cv337.put("optione", "tabernacle");
        cv337.put("correct", "4");

        cv338.put("Id", 16);
        cv338.put("Question", "The rowdy crowd at the music concert ______ Herve, and he spilled his soda on his pants.");
        cv338.put("optiona", "jettisoned");
        cv338.put("optionb", "harrowed");
        cv338.put("optionc", "jostled");
        cv338.put("optiond", "lauded");
        cv338.put("optione", "superceded");
        cv338.put("correct", "3");

        cv339.put("Id", 17);
        cv339.put("Question", "Known for his strong command of the courtroom, it was common knowledge that Judge Disantis considered outbursts from defendants to be ______.");
        cv339.put("optiona", "questionable");
        cv339.put("optionb", "objectionable");
        cv339.put("optionc", "antisocial");
        cv339.put("optiond", "pliable");
        cv339.put("optione", "visionary");
        cv339.put("correct", "2");

        cv340.put("Id", 18);
        cv340.put("Question", "Blinded by ______, Nicholas accepted the job offer with the highest pay but the least possibility of making him happy.");
        cv340.put("optiona", "ennui");
        cv340.put("optionb", "heresy");
        cv340.put("optionc", "infamy");
        cv340.put("optiond", "avarice");
        cv340.put("optione", "temperance");
        cv340.put("correct", "4");

        cv341.put("Id", 19);
        cv341.put("Question", "It was very unprofessional of you to ______ your assistant in front of everyone at the meeting; she deserves more respect, and any criticism of her performance should be done in private.");
        cv341.put("optiona", "placate");
        cv341.put("optionb", "augment");
        cv341.put("optionc", "usurp");
        cv341.put("optiond", "preclude");
        cv341.put("optione", "deride");
        cv341.put("correct", "5");

        cv342.put("Id", 20);
        cv342.put("Question", "The log cabin had a(n) ______ feel, so it was often enjoyed by vacationers from the city throughout the year.");
        cv342.put("optiona", "abstract");
        cv342.put("optionb", "ersatz");
        cv342.put("optionc", "rustic");
        cv342.put("optiond", "raucous");
        cv342.put("optione", "repellent");
        cv342.put("correct", "3");

        cv343.put("Id", 21);
        cv343.put("Question", "We knew Jana had ______ motives for running for class president: She wanted the nearby parking space that came with the office.");
        cv343.put("optiona", "anterior");
        cv343.put("optionb", "interior");
        cv343.put("optionc", "inferior");
        cv343.put("optiond", "posterior");
        cv343.put("optione", "posterior");
        cv343.put("correct", "5");

        cv344.put("Id", 22);
        cv344.put("Question", "The town board heard many outraged and ______ arguments from the citizens against the destruction of some wooded areas in order to build a new mall.");
        cv344.put("optiona", "tenuous");
        cv344.put("optionb", "vociferous");
        cv344.put("optionc", "vacuous");
        cv344.put("optiond", "satisfied");
        cv344.put("optione", "egregious");
        cv344.put("correct", "2");

        cv345.put("Id", 23);
        cv345.put("Question", "The villainous gang’s hideout was a den of ______ that no one would dare to enter.");
        cv345.put("optiona", "innocence");
        cv345.put("optionb", "habitants");
        cv345.put("optionc", "iniquity");
        cv345.put("optiond", "accolades");
        cv345.put("optione", "innovation");
        cv345.put("correct", "3");

        cv346.put("Id", 24);
        cv346.put("Question", "Indigestion is a common ______ of participating in a hot-dog eating contest.");
        cv346.put("optiona", "euphemism");
        cv346.put("optionb", "penchant");
        cv346.put("optionc", "corollary");
        cv346.put("optiond", "juxtaposition");
        cv346.put("optione", "itinerary");
        cv346.put("correct", "3");

        cv347.put("Id", 25);
        cv347.put("Question", "Although it was so ridiculous that no one believed it to be true, the reporter’s ______ still cost the governor his re-election");
        cv347.put("optiona", "hegemony");
        cv347.put("optionb", "sedition");
        cv347.put("optionc", "malaise");
        cv347.put("optiond", "compendium");
        cv347.put("optione", "calumny");
        cv347.put("correct", "5");

        cv348.put("Id", 26);
        cv348.put("Question", "People on the street stopped to ______ over the artist’s rendition of the Eiffel Tower, amazed by his ability to capture the detail.");
        cv348.put("optiona", "bedazzle");
        cv348.put("optionb", "innovate");
        cv348.put("optionc", "gratify");
        cv348.put("optiond", "counteract");
        cv348.put("optione", "objectify");
        cv348.put("correct", "5");

        cv349.put("Id", 27);
        cv349.put("Question", "The veteran lieutenant was not happy with his ______ rank behind the two inexperienced men.");
        cv349.put("optiona", "tertiary");
        cv349.put("optionb", "silly");
        cv349.put("optionc", "unctuous");
        cv349.put("optiond", "superior");
        cv349.put("optione", "fastened");
        cv349.put("correct", "1");

        cv350.put("Id", 28);
        cv350.put("Question", "The prime minister was admired by all, a(n) ______ even in an environment of corruption and disdain.");
        cv350.put("optiona", "admonishment");
        cv350.put("optionb", "alleviation");
        cv350.put("optionc", "nonpareil");
        cv350.put("optiond", "prototype");
        cv350.put("optione", "profanation");
        cv350.put("correct", "3");

        cv351.put("Id", 29);
        cv351.put("Question", "Despite his best efforts to conceal his anger ......");
        cv351.put("optiona", "we could detect that he was very happy");
        cv351.put("optionb", "he failed to give us an impression of his agony");
        cv351.put("optionc", "he succeeded in camouflaging his emotions");
        cv351.put("optiond", "he could succeed in doing it easily");
        cv351.put("optione", "people came to know that he was annoyed");
        cv351.put("correct", "5");

        cv352.put("Id", 30);
        cv352.put("Question", "Even if it rains I shall come means ......");
        cv352.put("optiona", "if I come it will not rain");
        cv352.put("optionb", "if it rains I shall not come");
        cv352.put("optionc", "I will certainly come whether it rains or not");
        cv352.put("optiond", "whenever there is rain I shall come");
        cv352.put("optione", "I am less likely to come if it rains");
        cv352.put("correct", "3");

        cv353.put("Id", 31);
        cv353.put("Question", "His appearance is unsmiling but ......");
        cv353.put("optiona", "his heart is full of compassion for others");
        cv353.put("optionb", "he looks very serious on most occasions");
        cv353.put("optionc", "people are afraid of him");
        cv353.put("optiond", "he is uncompromising on matters of task performance");
        cv353.put("optione", "he is full of jealousy towards his colleagues");
        cv353.put("correct", "1");

        cv354.put("Id", 32);
        cv354.put("Question", "She never visits any zoo because she is strong opponent of the idea of ......");
        cv354.put("optiona", "setting the animals free into forest");
        cv354.put("optionb", "feeding the animals while others are watching");
        cv354.put("optionc", "watching the animals in their natural abode");
        cv354.put("optiond", "going out of the house on a holiday");
        cv354.put("optione", "holding the animals in captivity for our joy");
        cv354.put("correct", "5");

        cv355.put("Id", 33);
        cv355.put("Question", "I felt somewhat more relaxed .....");
        cv355.put("optiona", "but tense as compared to earlier");
        cv355.put("optionb", "and tense as compared to earlier");
        cv355.put("optionc", "as there was already no tension at all");
        cv355.put("optiond", "and tension-free as compared to earlier");
        cv355.put("optione", "because the worry had already captured by mind");
        cv355.put("correct", "4");

        cv356.put("Id", 34);
        cv356.put("Question", "It is not easy to remain tranquil when those around you .....");
        cv356.put("optiona", "behave in a socially acceptable manner");
        cv356.put("optionb", "exhibit pleasant mannerism");
        cv356.put("optionc", "are losing their heads");
        cv356.put("optiond", "agree to whatever you say");
        cv356.put("optione", "exhibit generous and magnanimous gestures");
        cv356.put("correct", "3");

        cv357.put("Id", 35);
        cv357.put("Question", "Although initial investigations pointed towards him ......");
        cv357.put("optiona", "the preceding events corroborated his involvement in the crime");
        cv357.put("optionb", "the additional information confirmed his guilt");
        cv357.put("optionc", "the subsequent events established that he was guilt");
        cv357.put("optiond", "the subsequent events proved that he was innocent");
        cv357.put("optione", "he gave an open confession of his crime");
        cv357.put("correct", "4");

        cv358.put("Id", 36);
        cv358.put("Question", "'The food in this hotel is no match to what were forced at late hours in Hotel Kohinoor' means ......");
        cv358.put("optiona", "The food in this hotel is quite good compared to what we ate at kohinoor");
        cv358.put("optionb", "Hotel kohinoor served us good quality food than what we get here");
        cv358.put("optionc", "Both hotels have maintained good quality of food");
        cv358.put("optiond", "Both hotels serve poor quality of food");
        cv358.put("optione", "it is better to eat food than remain hungry");
        cv358.put("correct", "2");

        cv359.put("Id", 37);
        cv359.put("Question", "The weather outside was extremely pleasant and hence we decided to ......");
        cv359.put("optiona", "utilise our time in watching the television");
        cv359.put("optionb", "refrain from going out for a morning walk");
        cv359.put("optionc", "enjoy a morning ride in the open");
        cv359.put("optiond", "employ this rare opportunity for writing letters");
        cv359.put("optione", "remain seated in our rooms in the bungalow");
        cv359.put("correct", "3");

        cv360.put("Id", 38);
        cv360.put("Question", "'It is an uphill task but you will have to do it' means ......");
        cv360.put("optiona", "The work is above the hill and you will have to do it");
        cv360.put("optionb", "It is a very easy task but you must do it");
        cv360.put("optionc", "It is very difficult task but you have to do it");
        cv360.put("optiond", "This work is not reserved for you but you will have to do it");
        cv360.put("optione", "It is almost impossible for others but you can do it");
        cv360.put("correct", "3");

        cv361.put("Id", 39);
        cv361.put("Question", "'You are thinking very highly about Ravi but he is not so' means ......");
        cv361.put("optiona", "Ravi is as good as you think about him");
        cv361.put("optionb", "You have a good opinion about Ravi but he is not as good as you think");
        cv361.put("optionc", "Your view about Ravi is philosophical, keep it up");
        cv361.put("optiond", "Ravi is much better, than what you think of him");
        cv361.put("optione", "You have a good opinion about Ravi but he does not have a good opinion about you");
        cv361.put("correct", "2");

        cv362.put("Id", 40);
        cv362.put("Question", "'Anand stuck up a friendship with Mahesh in just 2 days' means ......");
        cv362.put("optiona", "Anand friendship with Mahesh came to an end recently");
        cv362.put("optionb", "Anand found out the other friends of Mahesh");
        cv362.put("optionc", "Anand fixed a deal with Mahesh in 2 days");
        cv362.put("optiond", "Anand's friendship with Mahesh lasted for 2 years");
        cv362.put("optione", "Anand became a friend of Mahesh in less than 2 days");
        cv362.put("correct", "5");

        cv363.put("Id", 41);
        cv363.put("Question", "Although, he is reputed for making very candid statements ......");
        cv363.put("optiona", "his today speech was not fairly audible");
        cv363.put("optionb", "his promises had always been realistic");
        cv363.put("optionc", "his speech was very interesting");
        cv363.put("optiond", "people follow whatever he instructs to them");
        cv363.put("optione", "his today's statements were very ambiguous");
        cv363.put("correct", "5");

        cv364.put("Id", 42);
        cv364.put("Question", "The manager would like you to help Dhiraj, means ......");
        cv364.put("optiona", "the manager would like you if you help Dhiraj");
        cv364.put("optionb", "the manager desires you to help Dhiraj");
        cv364.put("optionc", "the manager likes you because you help Dhiraj");
        cv364.put("optiond", "Dhiraj expects the manager to tell you to help him");
        cv364.put("optione", "it will be a help to the manager if you like Dhiraj");
        cv364.put("correct", "2");

        cv365.put("Id", 43);
        cv365.put("Question", "Owing to the acute power shortage, the people of our locality have decided to ......");
        cv365.put("optiona", "dispense with other non-conventional energy sources");
        cv365.put("optionb", "resort to abundant use of electricity for illumination");
        cv365.put("optionc", "off-switch the electrical appliance while not in use");
        cv365.put("optiond", "explore other avenues for utilising the excess power");
        cv365.put("optione", "resort to use of electricity only when it is inevitable");
        cv365.put("correct", "5");

        cv366.put("Id", 44);
        cv366.put("Question", "He has no money now ......");
        cv366.put("optiona", "although he was very poor once");
        cv366.put("optionb", "as he has given up all his wealth");
        cv366.put("optionc", "because he was very rich once");
        cv366.put("optiond", "because he has received huge donation");
        cv366.put("optione", "because he has received huge donation");
        cv366.put("correct", "2");

        cv367.put("Id", 45);
        cv367.put("Question", "He is so lazy that he ......");
        cv367.put("optiona", "cannot depend on others for getting his work done");
        cv367.put("optionb", "cannot delay the schedule of completing the work");
        cv367.put("optionc", "can seldom complete his work on time");
        cv367.put("optiond", "dislike to postpone the work that he undertakes to do");
        cv367.put("optione", "always help others to complete their work");
        cv367.put("correct", "3");

        cv368.put("Id", 46);
        cv368.put("Question", "Dinesh is as stupid as he is lazy means ......");
        cv368.put("optiona", "Dinesh is stupid because he is lazy");
        cv368.put("optionb", "Dinesh is lazy because he is stupid");
        cv368.put("optionc", "Dinesh is either stupid or lazy");
        cv368.put("optiond", "Dinesh is hardly stupid but he is lazy");
        cv368.put("optione", "Dinesh is equally stupid and lazy");
        cv368.put("correct", "5");

        cv369.put("Id", 47);
        cv369.put("Question", "Practically, very little work could be completed in the last week as it was ......");
        cv369.put("optiona", "full of working days");
        cv369.put("optionb", "a very hectic week");
        cv369.put("optionc", "full of holidays");
        cv369.put("optiond", "a very busy week");
        cv369.put("optione", "loaded with work");
        cv369.put("correct", "3");

        cv370.put("Id", 48);
        cv370.put("Question", "Because he believes in democratic principles, he always ......");
        cv370.put("optiona", "decides all the matters himself");
        cv370.put("optionb", "listen to others views and enforces his own");
        cv370.put("optionc", "shown respect to others opinions if they match his own");
        cv370.put("optiond", "reconciles with the majority views and gives us his own");
        cv370.put("optione", "imposes his own views on others");
        cv370.put("correct", "4");

        cv371.put("Id", 49);
        cv371.put("Question", "With great efforts his son succeeded in convincing him not to donate his entire wealth to an orphanage ......");
        cv371.put("optiona", "and lead the life of a wealthy merchant");
        cv371.put("optionb", "but to a home for the forsaken children");
        cv371.put("optionc", "and make an orphan of himself");
        cv371.put("optiond", "as the orphanage needed a lot of donations");
        cv371.put("optione", "as the orphanage had been set up by him");
        cv371.put("correct", "3");

        cv372.put("Id", 50);
        cv372.put("Question", "The employer appeared to be in such an affable mood that Rohit ......");
        cv372.put("optiona", "decided to ask for a raise in his salary");
        cv372.put("optionb", "was scared to talk to him about his leave");
        cv372.put("optionc", "felt very guilty for his inadvertent slip");
        cv372.put("optiond", "promised him that he would not commit mistake again");
        cv372.put("optione", "was pained to press his demand for a new flat");
        cv372.put("correct", "1");

        cv373.put("Id", 51);
        cv373.put("Question", "He always stammers in public meetings, but his today's speech ......");
        cv373.put("optiona", "was fairly audible to everyone present in the hall");
        cv373.put("optionb", "was not received satisfactorily");
        cv373.put("optionc", "could not be understood properly");
        cv373.put("optiond", "was not liked by the audience");
        cv373.put("optione", "was free from that defect");
        cv373.put("correct", "5");

        cv374.put("Id", 52);
        cv374.put("Question", "Even though it is very large house, ......");
        cv374.put("optiona", "there is a lot of space available in it for children");
        cv374.put("optionb", "there is hardly any space available for children");
        cv374.put("optionc", "there is no dearth of space for children");
        cv374.put("optiond", "the servants take a long time to clean it");
        cv374.put("optione", "the municipal taxes on it are very happy");
        cv374.put("correct", "2");

        cv375.put("Id", 53);
        cv375.put("Question", "It was an extremely pleasant surprise for the hutment-dweller when the Government officials told him that ......");
        cv375.put("optiona", "he had to vacate hutment which he had been unauthorisedly occupying");
        cv375.put("optionb", "he had been gifted with a furnished apartment in a multi-storeyed building");
        cv375.put("optionc", "he would be arrested for wrongfully encroaching on the pavement outside his dwelling");
        cv375.put("optiond", "they would not accede to his request");
        cv375.put("optione", "they had received the orders from the court to take possession of all his belongings");
        cv375.put("correct", "2");

        cv376.put("Id", 54);
        cv376.put("Question", "In order to help the company attain its goal of enhancing profit, all the employees ......");
        cv376.put("optiona", "urged the management to grant paid leave");
        cv376.put("optionb", "appealed the management to implement new welfare schemes");
        cv376.put("optionc", "voluntarily offered to work overtime with lucrative compensation");
        cv376.put("optiond", "voluntarily offered to render additional services in lieu of nothing");
        cv376.put("optione", "decided to enhance production at the cost of quality of the product");
        cv376.put("correct", "4");

        cv377.put("Id", 55);
        cv377.put("Question", "'Whatever Dev uttered was without rhyme or reason' means ......");
        cv377.put("optiona", "Dev could not recite any poem or speech");
        cv377.put("optionb", "Dev said something which has no meaning, it was totally baseless");
        cv377.put("optionc", "Dev was talking something which was beyond our experience");
        cv377.put("optiond", "Dev spoke flatly without any emotion or reason");
        cv377.put("optione", "Dev did not refer to any poem to support his statements");
        cv377.put("correct", "4");

        cv378.put("Id", 56);
        cv378.put("Question", "He tames animals because he ......");
        cv378.put("optiona", "is fond of them");
        cv378.put("optionb", "hates them");
        cv378.put("optionc", "is afraid of them");
        cv378.put("optiond", "want to set them free");
        cv378.put("optione", "seldom loves them");
        cv378.put("correct", "1");

        cv379.put("Id", 57);
        cv379.put("Question", "Mahesh need not have purchased the bag, means ......");
        cv379.put("optiona", "it was not necessary for Mahesh to purchase the bag but he has purchased it");
        cv379.put("optionb", "it was necessary for Mahesh to purchase the bag and he has not purchased it");
        cv379.put("optionc", "it was not necessary for Mahesh to purchase the bag and he has not purchased it");
        cv379.put("optiond", "it was necessary for Mahesh to purchase the bag but he has not purchased it");
        cv379.put("optione", "Mahesh already has a bag but still he purchased another one");
        cv379.put("correct", "1");

        cv380.put("Id", 58);
        cv380.put("Question", "In order to raise company's profit, the employees ......");
        cv380.put("optiona", "demanded two additional increments");
        cv380.put("optionb", "decided to go on paid holidays");
        cv380.put("optionc", "requested the management to implement new welfare schemes");
        cv380.put("optiond", "offered to work overtime without any compensation");
        cv380.put("optione", "decided to raise the cost of raw material");
        cv380.put("correct", "4");

        cv381.put("Id", 59);
        cv381.put("Question", "The officer who had neglected to files his income tax returns had to ......");
        cv381.put("optiona", "return the files");
        cv381.put("optionb", "pay a fine");
        cv381.put("optionc", "be rewarded");
        cv381.put("optiond", "play mischief");
        cv381.put("optione", "give warning");
        cv381.put("correct", "2");

        cv382.put("Id", 60);
        cv382.put("Question", "Unless you work harder you will fail, means ......");
        cv382.put("optiona", "if you fail you will work harder");
        cv382.put("optionb", "you must at least plan well than you will not fail");
        cv382.put("optionc", "hardly you will fail if you do not desire so");
        cv382.put("optiond", "if you do not put more efforts, then you will fail");
        cv382.put("optione", "if you only work and work alone, you will fail");
        cv382.put("correct", "4");

        cv383.put("Id", 61);
        cv383.put("Question", "His behaviour is so unpredictable that he ......");
        cv383.put("optiona", "never depends upon others for getting his work done");
        cv383.put("optionb", "is seldom trusted by others");
        cv383.put("optionc", "always finds it difficult to keep his word");
        cv383.put("optiond", "always insists on getting the work completed on time");
        cv383.put("optione", "seldom trusts others as far as the work schedule is concerned");
        cv383.put("correct", "2");

        cv384.put("Id", 62);
        cv384.put("Question", "Wedding ceremonies often include the exchange of ______ rings to symbolize the couple’s promises to each other.");
        cv384.put("optiona", "hirsute");
        cv384.put("optionb", "acrimonious");
        cv384.put("optionc", "plaintive");
        cv384.put("optiond", "deciduous");
        cv384.put("optione", "deciduous");
        cv384.put("correct", "3");

        cv385.put("Id", 63);
        cv385.put("Question", "Kym was ______ in choosing her friends, so her parties were attended by vastly different and sometimes bizarre personalities.");
        cv385.put("optiona", "indispensable");
        cv385.put("optionb", "indiscriminate");
        cv385.put("optionc", "commensurate");
        cv385.put("optiond", "propulsive");
        cv385.put("optione", "indisputable");
        cv385.put("correct", "2");

        cv386.put("Id", 64);
        cv386.put("Question", "With all of the recent negative events in her life, she felt ______forces must be at work.");
        cv386.put("optiona", "resurgent");
        cv386.put("optionb", "premature");
        cv386.put("optionc", "malignant");
        cv386.put("optiond", "punctilious");
        cv386.put("optione", "antecedent");
        cv386.put("correct", "3");

        cv387.put("Id", 65);
        cv387.put("Question", "The ______ rumors did a great deal of damage even though they turned out to be false.");
        cv387.put("optiona", "bemused");
        cv387.put("optionb", "prosaic");
        cv387.put("optionc", "apocryphal");
        cv387.put("optiond", "ebullient");
        cv387.put("optione", "tantamount");
        cv387.put("correct", "3");

        cv388.put("Id", 66);
        cv388.put("Question", "When her schoolwork got to be too much, Pam had a tendency to______, which always put her further behind.");
        cv388.put("optiona", "dedicate");
        cv388.put("optionb", "rejuvenate");
        cv388.put("optionc", "ponder");
        cv388.put("optiond", "excel");
        cv388.put("optione", "procrastinate");
        cv388.put("correct", "3");

        cv389.put("Id", 67);
        cv389.put("Question", "Racha’s glance was a ______ invitation to speak later in private about events of the meeting.");
        cv389.put("optiona", "trecherous");
        cv389.put("optionb", "scintillating");
        cv389.put("optionc", "tactful");
        cv389.put("optiond", "tacit");
        cv389.put("optione", "taboo");
        cv389.put("correct", "3");

        cv390.put("Id", 68);
        cv390.put("Question", "She reached the ______ of her career with her fourth novel, which won the Pulitzer Prize.");
        cv390.put("optiona", "harbinger");
        cv390.put("optionb", "apogee");
        cv390.put("optionc", "metamorphosis");
        cv390.put("optiond", "dictum");
        cv390.put("optione", "synthesis");
        cv390.put("correct", "2");

        cv391.put("Id", 69);
        cv391.put("Question", "The ______ townspeople celebrated the soldier’s return to his home by adorning trees with yellow ribbons and balloons.");
        cv391.put("optiona", "somber");
        cv391.put("optionb", "jubilant");
        cv391.put("optionc", "pitiless");
        cv391.put("optiond", "cunning");
        cv391.put("optione", "unsullied");
        cv391.put("correct", "2");

        cv392.put("Id", 70);
        cv392.put("Question", "The governor-elect was hounded by a group of ______ lobbyists and others hoping to gain favor with her administration.");
        cv392.put("optiona", "facetious");
        cv392.put("optionb", "abstruse");
        cv392.put("optionc", "magnanimous");
        cv392.put("optiond", "fawning");
        cv392.put("optione", "saccharine");
        cv392.put("correct", "4");

        cv393.put("Id", 71);
        cv393.put("Question", "The mock graduation ceremony with a trained skunk posing as the college president was a complete ______ that offended many college officials.");
        cv393.put("optiona", "tempest");
        cv393.put("optionb", "epitome");
        cv393.put("optionc", "quintessence");
        cv393.put("optiond", "travesty");
        cv393.put("optione", "recitative");
        cv393.put("correct", "4");

        cv394.put("Id", 72);
        cv394.put("Question", "The busy, ______ fabric of the clown’s tie matched his oversized jacket, which was equally atrocious.");
        cv394.put("optiona", "mottled");
        cv394.put("optionb", "bleak");
        cv394.put("optionc", "credible");
        cv394.put("optiond", "malleable");
        cv394.put("optione", "communicable");
        cv394.put("correct", "1");

        cv395.put("Id", 73);
        cv395.put("Question", "Kendrick’s talent ______ under the tutelage of Anya Kowalonek,who as a young woman had been the most accomplished pianist in her native Lithuania.");
        cv395.put("optiona", "bantered");
        cv395.put("optionb", "touted");
        cv395.put("optionc", "flourished");
        cv395.put("optiond", "embellished");
        cv395.put("optione", "colluded");
        cv395.put("correct", "3");

        cv396.put("Id", 74);
        cv396.put("Question", "The children were ______ by the seemingly nonsensical clues until Kinan pointed out that the messages were in code.");
        cv396.put("optiona", "censured");
        cv396.put("optionb", "striated");
        cv396.put("optionc", "feigned");
        cv396.put("optiond", "prevaricated");
        cv396.put("optione", "flummoxed");
        cv396.put("correct", "3");

        cv397.put("Id", 75);
        cv397.put("Question", "As the ______ in Romeo and Juliet, Romeo is a hero able to capture the audience’s sympathy by continually professing his love for Juliet.");
        cv397.put("optiona", "protagonist");
        cv397.put("optionb", "enigma");
        cv397.put("optionc", "facade");
        cv397.put("optiond", "activist");
        cv397.put("optione", "catechist");
        cv397.put("correct", "1");

        cv398.put("Id", 76);
        cv398.put("Question", "The chess master promised to ______ havoc upon his opponent’s pawns for taking his bishop");
        cv398.put("optiona", "wreak");
        cv398.put("optionb", "warrant");
        cv398.put("optionc", "ensue");
        cv398.put("optiond", "placate");
        cv398.put("optione", "endow");
        cv398.put("correct", "1");

        cv399.put("Id", 77);
        cv399.put("Question", "I have always admired Seymour’s ______; I’ve never seen him rattled by anything.");
        cv399.put("optiona", "aplomb");
        cv399.put("optionb", "confluence");
        cv399.put("optionc", "propriety");
        cv399.put("optiond", "compunction");
        cv399.put("optione", "nostalgia");
        cv399.put("correct", "1");

        cv400.put("Id", 78);
        cv400.put("Question", "The soldiers received a military ______ to inspect all their vehicles before traveling.");
        cv400.put("optiona", "allotment");
        cv400.put("optionb", "dominion");
        cv400.put("optionc", "affectation");
        cv400.put("optiond", "calculation");
        cv400.put("optione", "mandate");
        cv400.put("correct", "3");

        cv401.put("Id", 1);
        cv401.put("Question", "Fate smiles ...... those who untiringly grapple with stark realities of life.");
        cv401.put("optiona", "with");
        cv401.put("optionb", "over");
        cv401.put("optionc", "on");
        cv401.put("optiond", "round");
        cv401.put("optione", "none of these");
        cv401.put("correct", "3");

        cv402.put("Id", 2);
        cv402.put("Question", "The miser gazed ...... at the pile of gold coins in front of him.");
        cv402.put("optiona", "avidly");
        cv402.put("optionb", "admiringly");
        cv402.put("optionc", "thoughtfully");
        cv402.put("optiond", "earnestly");
        cv402.put("optione", "none of these");
        cv402.put("correct", "1");

        cv403.put("Id", 3);
        cv403.put("Question", "Catching the earlier train will give us the ...... to do some shopping");
        cv403.put("optiona", "chance");
        cv403.put("optionb", "luck");
        cv403.put("optionc", "possibility");
        cv403.put("optiond", "occasion");
        cv403.put("optione", "cannot be determined");
        cv403.put("correct", "1");

        cv404.put("Id", 4);
        cv404.put("Question", "I saw a ...... of cows in the field.");
        cv404.put("optiona", "group");
        cv404.put("optionb", "herd");
        cv404.put("optionc", "swarm");
        cv404.put("optiond", "flock");
        cv404.put("optione", "cannot be determined");
        cv404.put("correct", "2");

        cv405.put("Id", 5);
        cv405.put("Question", "The grapes are now ...... enough to be picked.");
        cv405.put("optiona", "ready");
        cv405.put("optionb", "mature");
        cv405.put("optionc", "ripe");
        cv405.put("optiond", "advanced");
        cv405.put("optione", "cannot be determined");
        cv405.put("correct", "3");

        cv406.put("Id", 6);
        cv406.put("Question", "Success in this examination depends ...... hard work alone.");
        cv406.put("optiona", "at");
        cv406.put("optionb", "over");
        cv406.put("optionc", "for");
        cv406.put("optiond", "on");
        cv406.put("optione", "cannot be determined");
        cv406.put("correct", "4");

        cv407.put("Id", 7);
        cv407.put("Question", "My uncle decided to take ...... and my sister to the market");
        cv407.put("optiona", "i");
        cv407.put("optionb", "mine");
        cv407.put("optionc", "me");
        cv407.put("optiond", "none of these");
        cv407.put("optione", "myself");
        cv407.put("correct", "3");

        cv408.put("Id", 8);
        cv408.put("Question", "If you smuggle goods into the country, they may be ...... by the customs authority.");
        cv408.put("optiona", "possessed");
        cv408.put("optionb", "punished");
        cv408.put("optionc", "confiscated");
        cv408.put("optiond", "fined");
        cv408.put("optione", "cannot be determined");
        cv408.put("correct", "3");

        cv409.put("Id", 9);
        cv409.put("Question", "Man does not live by ...... alone");
        cv409.put("optiona", "food");
        cv409.put("optionb", "bread");
        cv409.put("optionc", "meals");
        cv409.put("optiond", "diet");
        cv409.put("optione", "cannot be determined");
        cv409.put("correct", "2");

        cv410.put("Id", 10);
        cv410.put("Question", "Piyush behaves strangely at times and, therefore, nobody gets ...... with him.");
        cv410.put("optiona", "about");
        cv410.put("optionb", "through");
        cv410.put("optionc", "along");
        cv410.put("optiond", "up");
        cv410.put("optione", "cannot be determined");
        cv410.put("correct", "3");

        cv411.put("Id", 11);
        cv411.put("Question", "Rohan and Rohit are twin brothers, but they do not look ......");
        cv411.put("optiona", "unique");
        cv411.put("optionb", "different");
        cv411.put("optionc", "likely");
        cv411.put("optiond", "alike");
        cv411.put("optione", "cannot be determined");
        cv411.put("correct", "4");

        cv412.put("Id", 12);
        cv412.put("Question", "To err is ...... to forgive divine");
        cv412.put("optiona", "human");
        cv412.put("optionb", "devil");
        cv412.put("optionc", "god");
        cv412.put("optiond", "teacher");
        cv412.put("optione", "cannot be determined");
        cv412.put("correct", "1");

        cv413.put("Id", 13);
        cv413.put("Question", "The ruling party will have to put its own house ...... order.");
        cv413.put("optiona", "in");
        cv413.put("optionb", "on");
        cv413.put("optionc", "to");
        cv413.put("optiond", "none of these");
        cv413.put("optione", "into");
        cv413.put("correct", "1");

        cv414.put("Id", 14);
        cv414.put("Question", "...... of old paintings is a job for experts");
        cv414.put("optiona", "resurrection");
        cv414.put("optionb", "retrieval");
        cv414.put("optionc", "restore");
        cv414.put("optiond", "none of these");
        cv414.put("optione", "resumption");
        cv414.put("correct", "3");

        cv415.put("Id", 15);
        cv415.put("Question", "During Diwali the shops are ...... of people");
        cv415.put("optiona", "busy");
        cv415.put("optionb", "full");
        cv415.put("optionc", "crowded");
        cv415.put("optiond", "bubbly");
        cv415.put("optione", "cannot be determined");
        cv415.put("correct", "2");

        cv416.put("Id", 16);
        cv416.put("Question", "The paths of glory lead ...... to the grave.");
        cv416.put("optiona", "straight");
        cv416.put("optionb", "but");
        cv416.put("optionc", "in");
        cv416.put("optiond", "directly");
        cv416.put("optione", "cannot be determined");
        cv416.put("correct", "2");

        cv417.put("Id", 17);
        cv417.put("Question", "The telephone ...... several times before I answered it.");
        cv417.put("optiona", "was ringing");
        cv417.put("optionb", "has rung");
        cv417.put("optionc", "had rung");
        cv417.put("optiond", "would ring");
        cv417.put("optione", "none of these");
        cv417.put("correct", "3");

        cv418.put("Id", 18);
        cv418.put("Question", "He passed the examination in the first class because he ......");
        cv418.put("optiona", "was hard working for it");
        cv418.put("optionb", "worked hardly for it");
        cv418.put("optionc", "had worked hard for it");
        cv418.put("optiond", "was working hard for it");
        cv418.put("optione", "None of these");
        cv418.put("correct", "3");

        cv419.put("Id", 19);
        cv419.put("Question", "Jawaharlal spent his childhood ...... Anand Bhawan.");
        cv419.put("optiona", "at");
        cv419.put("optionb", "in");
        cv419.put("optionc", "on");
        cv419.put("optiond", "across");
        cv419.put("optione", "none of these");
        cv419.put("correct", "1");

        cv420.put("Id", 20);
        cv420.put("Question", "If negotiations are to prove fruitful, there must not only be sincerity on each side, but there must also be ...... in the sincerity of the other side.");
        cv420.put("optiona", "faith");
        cv420.put("optionb", "belief");
        cv420.put("optionc", "substance");
        cv420.put("optiond", "certainty");
        cv420.put("optione", "none of these");
        cv420.put("correct", "1");

        cv421.put("Id", 21);
        cv421.put("Question", "I hate sitting ...... him as he always smells of garlic.");
        cv421.put("optiona", "besides");
        cv421.put("optionb", "along");
        cv421.put("optionc", "at");
        cv421.put("optiond", "beside");
        cv421.put("optione", "none of these");
        cv421.put("correct", "4");

        cv422.put("Id", 22);
        cv422.put("Question", "Some regions of our country still remain ...... to the average man.");
        cv422.put("optiona", "inaccessible");
        cv422.put("optionb", "impossible");
        cv422.put("optionc", "impermeable");
        cv422.put("optiond", "impenetrable");
        cv422.put("optione", "none of these");
        cv422.put("correct", "1");

        cv423.put("Id", 23);
        cv423.put("Question", "It ...... that Prashant will not be selected for the post");
        cv423.put("optiona", "feels");
        cv423.put("optionb", "looks");
        cv423.put("optionc", "believes");
        cv423.put("optiond", "seems");
        cv423.put("optione", "none of these");
        cv423.put("correct", "4");

        cv424.put("Id", 24);
        cv424.put("Question", "In Bush, Saddam was up ...... more than his match.");
        cv424.put("optiona", "for");
        cv424.put("optionb", "into");
        cv424.put("optionc", "against");
        cv424.put("optiond", "to");
        cv424.put("optione", "none of these");
        cv424.put("correct", "3");

        cv425.put("Id", 25);
        cv425.put("Question", "I haven't seen you ...... a week.");
        cv425.put("optiona", "within");
        cv425.put("optionb", "since");
        cv425.put("optionc", "for");
        cv425.put("optiond", "from");
        cv425.put("optione", "none of these");
        cv425.put("correct", "3");

        cv426.put("Id", 26);
        cv426.put("Question", "I listened, but I had no idea what he was ...... about");
        cv426.put("optiona", "saying");
        cv426.put("optionb", "talking");
        cv426.put("optionc", "telling");
        cv426.put("optiond", "discussing");
        cv426.put("optione", "none of these");
        cv426.put("correct", "2");

        cv427.put("Id", 27);
        cv427.put("Question", "The car in which the minister was traveling ...... with an accident.");
        cv427.put("optiona", "hit");
        cv427.put("optionb", "drove");
        cv427.put("optionc", "crashed");
        cv427.put("optiond", "met");
        cv427.put("optione", "none of these");
        cv427.put("correct", "4");

        cv428.put("Id", 28);
        cv428.put("Question", "The non cooperative attitude of the members can only ...... the image of the society.");
        cv428.put("optiona", "spoil");
        cv428.put("optionb", "improve");
        cv428.put("optionc", "degrade");
        cv428.put("optiond", "deframe");
        cv428.put("optione", "none of these");
        cv428.put("correct", "1");

        cv429.put("Id", 29);
        cv429.put("Question", "Sonika is quite intelligent but rather ......");
        cv429.put("optiona", "idealistic");
        cv429.put("optionb", "optimistic");
        cv429.put("optionc", "lazy");
        cv429.put("optiond", "generous");
        cv429.put("optione", "none of these");
        cv429.put("correct", "3");

        cv430.put("Id", 30);
        cv430.put("Question", "In a little-publicised deal, Pepsi, Cola has ...... the entire soft drink market in Afghanistan.");
        cv430.put("optiona", "occupied");
        cv430.put("optionb", "conquered");
        cv430.put("optionc", "swallowed");
        cv430.put("optiond", "captured");
        cv430.put("optione", "none of these");
        cv430.put("correct", "4");

        cv431.put("Id", 31);
        cv431.put("Question", "He ...... in wearing the old fashioned coat in spite of his wife's disapproval.");
        cv431.put("optiona", "insists");
        cv431.put("optionb", "persists");
        cv431.put("optionc", "desists");
        cv431.put("optiond", "resists");
        cv431.put("optione", "none of these");
        cv431.put("correct", "2");

        cv432.put("Id", 32);
        cv432.put("Question", "She ...... a brief appearance at the end of party.");
        cv432.put("optiona", "put on");
        cv432.put("optionb", "put in");
        cv432.put("optionc", "put across");
        cv432.put("optiond", "put up");
        cv432.put("optione", "none of these");
        cv432.put("correct", "2");

        cv433.put("Id", 33);
        cv433.put("Question", "Life is to death as pleasure is to ......");
        cv433.put("optiona", "poverty");
        cv433.put("optionb", "suffering");
        cv433.put("optionc", "anguish");
        cv433.put("optiond", "pain");
        cv433.put("optione", "none of these");
        cv433.put("correct", "4");

        cv434.put("Id", 34);
        cv434.put("Question", "This, partly, explains how the Mehta family has been able to ...... its lavish lifestyle in recent times, despite the fact that all its assets have been .....");
        cv434.put("optiona", "keep,removed");
        cv434.put("optionb", "afford,attached");
        cv434.put("optionc", "develop,liquidated");
        cv434.put("optiond", "keep up,destroyed");
        cv434.put("optione", "none of these");
        cv434.put("correct", "4");

        cv435.put("Id", 35);
        cv435.put("Question", "The machine is difficult to build ...... easy to maintain.");
        cv435.put("optiona", "but");
        cv435.put("optionb", "and");
        cv435.put("optionc", "for");
        cv435.put("optiond", "if");
        cv435.put("optione", "none of these");
        cv435.put("correct", "1");

        cv436.put("Id", 36);
        cv436.put("Question", "If you persists in telling lies to me I shall sue you ...... slander.");
        cv436.put("optiona", "to ");
        cv436.put("optionb", "on");
        cv436.put("optionc", "for");
        cv436.put("optiond", "with");
        cv436.put("optione", "none of these");
        cv436.put("correct", "3");

        cv437.put("Id", 37);
        cv437.put("Question", "His father-in-law ...... him up in business");
        cv437.put("optiona", "put");
        cv437.put("optionb", "made");
        cv437.put("optionc", "set");
        cv437.put("optiond", "built");
        cv437.put("optione", "none of these");
        cv437.put("correct", "3");

        cv438.put("Id", 38);
        cv438.put("Question", "...... works of reference are valuable as Encyclopedia, Brittanica.");
        cv438.put("optiona", "a few");
        cv438.put("optionb", "few");
        cv438.put("optionc", "the few");
        cv438.put("optiond", "fewer");
        cv438.put("optione", "none of these");
        cv438.put("correct", "2");

        cv439.put("Id", 39);
        cv439.put("Question", "This book is quite similar ......");
        cv439.put("optiona", "with the 'Treasure Island'");
        cv439.put("optionb", "of that film we saw at school");
        cv439.put("optionc", "to the one I read last week");
        cv439.put("optiond", "than a story told by our teacher");
        cv439.put("optione", "none of these");
        cv439.put("correct", "3");

        cv440.put("Id", 40);
        cv440.put("Question", "If our friends are not able to take us in their car, we must make ...... arrangements to go to the airport.");
        cv440.put("optiona", "alternative");
        cv440.put("optionb", "another");
        cv440.put("optionc", "alternate");
        cv440.put("optiond", "possible");
        cv440.put("optione", "none of these");
        cv440.put("correct", "1");

        cv441.put("Id", 41);
        cv441.put("Question", "A crescendo of metallic thuds arose from the market, where the iron-smiths were ...... the pieces of metals.");
        cv441.put("optiona", "flattening");
        cv441.put("optionb", "striking");
        cv441.put("optionc", "hammering");
        cv441.put("optiond", "thrashing");
        cv441.put("optione", "none of these");
        cv441.put("correct", "3");

        cv442.put("Id", 42);
        cv442.put("Question", "I haven't eaten an apple ...... a long while.");
        cv442.put("optiona", "from");
        cv442.put("optionb", "since");
        cv442.put("optionc", "for");
        cv442.put("optiond", "until");
        cv442.put("optione", "none of these");
        cv442.put("correct", "3");

        cv443.put("Id", 43);
        cv443.put("Question", "The parliament invested the new organisation ...... judicial authority.");
        cv443.put("optiona", "by");
        cv443.put("optionb", "with");
        cv443.put("optionc", "from");
        cv443.put("optiond", "through");
        cv443.put("optione", "none of these");
        cv443.put("correct", "2");

        cv444.put("Id", 44);
        cv444.put("Question", "Owing to the power cut in the area, factories are being forced to ...... men");
        cv444.put("optiona", "throw away");
        cv444.put("optionb", "send off");
        cv444.put("optionc", "put off");
        cv444.put("optiond", "lay off");
        cv444.put("optione", "none of these");
        cv444.put("correct", "4");

        cv445.put("Id", 45);
        cv445.put("Question", "Man must ...... to stop pollution.");
        cv445.put("optiona", "act");
        cv445.put("optionb", "perform");
        cv445.put("optionc", "operate");
        cv445.put("optiond", "behave");
        cv445.put("optione", "none of these");
        cv445.put("correct", "1");

        cv446.put("Id", 46);
        cv446.put("Question", "He was sent to the prison for his ......");
        cv446.put("optiona", "sin");
        cv446.put("optionb", "vice");
        cv446.put("optionc", "crime");
        cv446.put("optiond", "guilt");
        cv446.put("optione", "none of these");
        cv446.put("correct", "3");

        cv447.put("Id", 47);
        cv447.put("Question", "The answer was written ...... blue ink.");
        cv447.put("optiona", "with");
        cv447.put("optionb", "by");
        cv447.put("optionc", "in ");
        cv447.put("optiond", "on");
        cv447.put("optione", "none of these");
        cv447.put("correct", "3");

        cv448.put("Id", 48);
        cv448.put("Question", "Many ...... decisions were taken at the meeting.");
        cv448.put("optiona", "hectic");
        cv448.put("optionb", "historic");
        cv448.put("optionc", "historical");
        cv448.put("optiond", "histrionic");
        cv448.put("optione", "none of these");
        cv448.put("correct", "2");

        cv449.put("Id", 49);
        cv449.put("Question", "Those who persist in the endeavor at long last triumph ...... the odds of life.");
        cv449.put("optiona", "over");
        cv449.put("optionb", "on");
        cv449.put("optionc", "upon");
        cv449.put("optiond", "about");
        cv449.put("optione", "none of these");
        cv449.put("correct", "1");

        cv450.put("Id", 50);
        cv450.put("Question", "In the modern materialistic society, the only aim of people appears to be ...... money by fair means or foul.");
        cv450.put("optiona", "print");
        cv450.put("optionb", "produce");
        cv450.put("optionc", "acquire");
        cv450.put("optiond", "extrot");
        cv450.put("optione", "none of these");
        cv450.put("correct", "3");

        db.insert("corsen", null, cv151);
        db.insert("corsen", null, cv152);
        db.insert("corsen", null, cv153);
        db.insert("corsen", null, cv154);
        db.insert("corsen", null, cv155);
        db.insert("corsen", null, cv156);
        db.insert("corsen", null, cv157);
        db.insert("corsen", null, cv158);
        db.insert("corsen", null, cv159);
        db.insert("corsen", null, cv160);
        db.insert("corsen", null, cv161);
        db.insert("corsen", null, cv162);
        db.insert("corsen", null, cv163);
        db.insert("corsen", null, cv164);
        db.insert("corsen", null, cv165);
        db.insert("corsen", null, cv166);
        db.insert("corsen", null, cv167);
        db.insert("corsen", null, cv168);
        db.insert("corsen", null, cv169);
        db.insert("corsen", null, cv170);
        db.insert("corsen", null, cv171);
        db.insert("corsen", null, cv172);
        db.insert("corsen", null, cv173);
        db.insert("corsen", null, cv174);
        db.insert("corsen", null, cv175);
        db.insert("corsen", null, cv176);
        db.insert("corsen", null, cv177);
        db.insert("corsen", null, cv178);
        db.insert("corsen", null, cv179);
        db.insert("corsen", null, cv180);
        db.insert("corsen", null, cv181);
        db.insert("corsen", null, cv182);
        db.insert("corsen", null, cv183);
        db.insert("corsen", null, cv184);
        db.insert("corsen", null, cv185);
        db.insert("corsen", null, cv186);
        db.insert("corsen", null, cv187);
        db.insert("corsen", null, cv188);
        db.insert("corsen", null, cv189);
        db.insert("corsen", null, cv190);
        db.insert("corsen", null, cv191);
        db.insert("corsen", null, cv192);
        db.insert("corsen", null, cv193);
        db.insert("corsen", null, cv194);
        db.insert("corsen", null, cv195);
        db.insert("corsen", null, cv196);
        db.insert("corsen", null, cv197);
        db.insert("corsen", null, cv198);
        db.insert("corsen", null, cv199);
        db.insert("corsen", null, cv200);
        db.insert("impsen", null, cv251);
        db.insert("impsen", null, cv252);
        db.insert("impsen", null, cv253);
        db.insert("impsen", null, cv254);
        db.insert("impsen", null, cv255);
        db.insert("impsen", null, cv256);
        db.insert("impsen", null, cv257);
        db.insert("impsen", null, cv258);
        db.insert("impsen", null, cv259);
        db.insert("impsen", null, cv260);
        db.insert("impsen", null, cv261);
        db.insert("impsen", null, cv262);
        db.insert("impsen", null, cv263);
        db.insert("impsen", null, cv264);
        db.insert("impsen", null, cv265);
        db.insert("impsen", null, cv266);
        db.insert("impsen", null, cv267);
        db.insert("impsen", null, cv268);
        db.insert("impsen", null, cv269);
        db.insert("impsen", null, cv270);
        db.insert("impsen", null, cv271);
        db.insert("impsen", null, cv272);
        db.insert("impsen", null, cv273);
        db.insert("impsen", null, cv274);
        db.insert("impsen", null, cv275);
        db.insert("impsen", null, cv276);
        db.insert("impsen", null, cv277);
        db.insert("impsen", null, cv278);
        db.insert("impsen", null, cv279);
        db.insert("impsen", null, cv280);
        db.insert("impsen", null, cv281);
        db.insert("impsen", null, cv282);
        db.insert("impsen", null, cv283);
        db.insert("impsen", null, cv284);
        db.insert("impsen", null, cv285);
        db.insert("impsen", null, cv286);
        db.insert("impsen", null, cv287);
        db.insert("impsen", null, cv288);
        db.insert("impsen", null, cv289);
        db.insert("impsen", null, cv290);
        db.insert("impsen", null, cv291);
        db.insert("impsen", null, cv292);
        db.insert("impsen", null, cv293);
        db.insert("impsen", null, cv294);
        db.insert("impsen", null, cv295);
        db.insert("impsen", null, cv296);
        db.insert("impsen", null, cv297);
        db.insert("impsen", null, cv298);
        db.insert("impsen", null, cv299);
        db.insert("impsen", null, cv300);
        db.insert("theme", null, cv301);
        db.insert("theme", null, cv302);
        db.insert("theme", null, cv303);
        db.insert("theme", null, cv304);
        db.insert("theme", null, cv305);
        db.insert("theme", null, cv306);
        db.insert("theme", null, cv307);
        db.insert("theme", null, cv308);
        db.insert("theme", null, cv309);
        db.insert("theme", null, cv310);
        db.insert("theme", null, cv311);
        db.insert("theme", null, cv312);
        db.insert("theme", null, cv313);
        db.insert("theme", null, cv314);
        db.insert("theme", null, cv315);
        db.insert("theme", null, cv316);
        db.insert("theme", null, cv317);
        db.insert("theme", null, cv318);
        db.insert("theme", null, cv319);
        db.insert("theme", null, cv320);
        db.insert("theme", null, cv321);
        db.insert("theme", null, cv322);
        db.insert("comsen", null, cv323);
        db.insert("comsen", null, cv324);
        db.insert("comsen", null, cv325);
        db.insert("comsen", null, cv326);
        db.insert("comsen", null, cv327);
        db.insert("comsen", null, cv328);
        db.insert("comsen", null, cv329);
        db.insert("comsen", null, cv330);
        db.insert("comsen", null, cv331);
        db.insert("comsen", null, cv332);
        db.insert("comsen", null, cv333);
        db.insert("comsen", null, cv334);
        db.insert("comsen", null, cv335);
        db.insert("comsen", null, cv336);
        db.insert("comsen", null, cv337);
        db.insert("comsen", null, cv338);
        db.insert("comsen", null, cv339);
        db.insert("comsen", null, cv340);
        db.insert("comsen", null, cv341);
        db.insert("comsen", null, cv342);
        db.insert("comsen", null, cv343);
        db.insert("comsen", null, cv344);
        db.insert("comsen", null, cv345);
        db.insert("comsen", null, cv346);
        db.insert("comsen", null, cv347);
        db.insert("comsen", null, cv348);
        db.insert("comsen", null, cv349);
        db.insert("comsen", null, cv350);
        db.insert("comsen", null, cv351);
        db.insert("comsen", null, cv352);
        db.insert("comsen", null, cv353);
        db.insert("comsen", null, cv354);
        db.insert("comsen", null, cv355);
        db.insert("comsen", null, cv356);
        db.insert("comsen", null, cv357);
        db.insert("comsen", null, cv358);
        db.insert("comsen", null, cv359);
        db.insert("comsen", null, cv360);
        db.insert("comsen", null, cv361);
        db.insert("comsen", null, cv362);
        db.insert("comsen", null, cv363);
        db.insert("comsen", null, cv364);
        db.insert("comsen", null, cv365);
        db.insert("comsen", null, cv366);
        db.insert("comsen", null, cv367);
        db.insert("comsen", null, cv368);
        db.insert("comsen", null, cv369);
        db.insert("comsen", null, cv370);
        db.insert("comsen", null, cv371);
        db.insert("comsen", null, cv372);
        db.insert("comsen", null, cv373);
        db.insert("comsen", null, cv374);
        db.insert("comsen", null, cv375);
        db.insert("comsen", null, cv376);
        db.insert("comsen", null, cv377);
        db.insert("comsen", null, cv378);
        db.insert("comsen", null, cv379);
        db.insert("comsen", null, cv380);
        db.insert("comsen", null, cv381);
        db.insert("comsen", null, cv382);
        db.insert("comsen", null, cv383);
        db.insert("comsen", null, cv384);
        db.insert("comsen", null, cv385);
        db.insert("comsen", null, cv386);
        db.insert("comsen", null, cv387);
        db.insert("comsen", null, cv388);
        db.insert("comsen", null, cv389);
        db.insert("comsen", null, cv390);
        db.insert("comsen", null, cv391);
        db.insert("comsen", null, cv392);
        db.insert("comsen", null, cv393);
        db.insert("comsen", null, cv394);
        db.insert("comsen", null, cv395);
        db.insert("comsen", null, cv396);
        db.insert("comsen", null, cv397);
        db.insert("comsen", null, cv398);
        db.insert("comsen", null, cv399);
        db.insert("comsen", null, cv400);
        db.insert("selword", null, cv401);
        db.insert("selword", null, cv402);
        db.insert("selword", null, cv403);
        db.insert("selword", null, cv404);
        db.insert("selword", null, cv405);
        db.insert("selword", null, cv406);
        db.insert("selword", null, cv407);
        db.insert("selword", null, cv408);
        db.insert("selword", null, cv409);
        db.insert("selword", null, cv410);
        db.insert("selword", null, cv411);
        db.insert("selword", null, cv412);
        db.insert("selword", null, cv413);
        db.insert("selword", null, cv414);
        db.insert("selword", null, cv415);
        db.insert("selword", null, cv416);
        db.insert("selword", null, cv417);
        db.insert("selword", null, cv418);
        db.insert("selword", null, cv419);
        db.insert("selword", null, cv420);
        db.insert("selword", null, cv421);
        db.insert("selword", null, cv422);
        db.insert("selword", null, cv423);
        db.insert("selword", null, cv424);
        db.insert("selword", null, cv425);
        db.insert("selword", null, cv426);
        db.insert("selword", null, cv427);
        db.insert("selword", null, cv428);
        db.insert("selword", null, cv429);
        db.insert("selword", null, cv430);
        db.insert("selword", null, cv431);
        db.insert("selword", null, cv432);
        db.insert("selword", null, cv433);
        db.insert("selword", null, cv434);
        db.insert("selword", null, cv435);
        db.insert("selword", null, cv436);
        db.insert("selword", null, cv437);
        db.insert("selword", null, cv438);
        db.insert("selword", null, cv439);
        db.insert("selword", null, cv440);
        db.insert("selword", null, cv441);
        db.insert("selword", null, cv442);
        db.insert("selword", null, cv443);
        db.insert("selword", null, cv444);
        db.insert("selword", null, cv445);
        db.insert("selword", null, cv446);
        db.insert("selword", null, cv447);
        db.insert("selword", null, cv448);
        db.insert("selword", null, cv449);
        db.insert("selword", null, cv450);
        db.close();
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        if (v == b1) {
            Intent in = new Intent(this, Verbal_Ability.class);
            startActivity(in);
        }


    }
}
