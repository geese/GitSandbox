package com.example.sixgeese.gitsandbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // new comment made in master, to merge into new-branch
    // comment successfully merged FROM master INTO new-branch by first checking
    // out new-branch and then selecting master->merge in the branch menu.

    // testing what happens now when I make this comment in new-branch,
    // then first check out master and then select new-branch->merge
}
