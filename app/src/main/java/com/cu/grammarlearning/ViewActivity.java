package com.cu.grammarlearning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Collections;

public class ViewActivity extends AppCompatActivity {

    WebView webView;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        webView=findViewById(R.id.webView);
        WebSettings webSettings=webView.getSettings();
        //webSettings.setBuiltInZoomControls(true);
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        String title=getIntent().getStringExtra("Learn");
        getSupportActionBar().setTitle("Learn");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String url="";
        switch (title){
            case "Phrase, Clause, and Sentence":
                url="Phrase Clause and Sentence.html";
                break;
            case "Causative Verbs":
                url="Causative Verbs.html";
                break;
            case "Active ... Passive":
                url="Active Passive.html";
                break;
            case "Although ... In spite of":
                url="Although In spite of.html";
                break;
            case "After":
                url="After.html";
                break;
            case "Adverb Clauses":
                url="Adverb Clauses.html";
                break;
            case "Action Verbs":
                url="Action Verbs.html";
                break;
            case "Auxiliary Verbs":
                url="Auxiliary Verbs.html";
                break;
            case "Without":
                url="Without.html";
                break;
            case "When ... V-ing":
                url="When Ving.html";
                break;
            case "Finite and Non-finite Verbs":
                url="Finite and Non finite Verbs.html";
                break;
            case "Regular and Irregular Verbs":
                url="Regular and Irregular Verbs.html";
                break;
            case "If ... Unless":
                url="If Unless.html";
                break;
            case "too to ... so that":
                url="too to so that.html";
                break;
            case "Tenses":
                url="Tenses.html";
                break;
            case "Stative Verbs":
                url="Stative Verbs.html";
                break;
            case "So that ... too to":
                url="So that too to.html";
                break;
            case "Subject, Object and Complement":
                url="Subject Object and Complement.html";
                break;
            case "So .. that":
                url="So that.html";
                break;
            case "So that ... such that":
                url="So that such that.html";
                break;
            case "Relative Clauses":
                url="Relative Clauses.html";
                break;
            case "Parallel Structure":
                url="Parallel Structure.html";
                break;
            case "Prepositions":
                url="Prepositions.html";
                break;
            case "Phrasal Verbs":
                url="Phrasal Verbs.html";
                break;
            case "Passives":
                url="Passives.html";
                break;
            case "Participles":
                url="Participles.html";
                break;
            case "No sooner ... than":
                url="No sooner than.html";
                break;
            case "Noun Clauses":
                url="Noun Clauses.html";
                break;
            case "Not only .... but also":
                url="Not only but also.html";
                break;
            case "Neither ... nor":
                url="Neither nor.html";
                break;
            case "Neither of":
                url="Neither of.html";
                break;
            case "too to not enough to":
                url="too to not enough to.html";
                break;
            case "Nouns in Apposition":
                url="Nouns in Apposition.html";
                break;
            case "Linking Verbs":
                url="Linking Verbs.html";
                break;
            case "Inversion":
                url="Inversion.html";
                break;
            case "It is/ was":
                url="it.html";
                break;
            case "Idioms":
                url="Idioms.html";
                break;
            case "Infinitives":
                url="Infinitives.html";
                break;
            case "Gerunds":
                url="Gerunds.html";
                break;
            case "So that enough to":
                url="So that enough to.html";
                break;
            case "Enough to ... so that":
                url="Enough to so that.html";
                break;
            case "Ergative Verbs":
                url="Ergative Verbs.html";
                break;
            case "Either or":
                url="Either or.html";
                break;
            case "Double Negative Pattern":
                url="Double Negative Pattern.html";
                break;
            case "Direct Indirect":
                url="Direct Indirect.html";
                break;
            case "Degrees of Comparison":
                url="Degrees of Comparison.html";
                break;
            case "Correlative Conjunctions":
                url="Correlative Conjunctions.html";
                break;
            case "Conditionals":
                url="Conditionals.html";
                break;
            case "Comparison":
                url="Comparison.html";
                break;
            case "Collocations":
                url="Collocations.html";
                break;
            case "Cleft Sentences":
                url="Cleft Sentences.html";
                break;
        }

        webView.loadUrl("file:///android_asset/"+url);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}