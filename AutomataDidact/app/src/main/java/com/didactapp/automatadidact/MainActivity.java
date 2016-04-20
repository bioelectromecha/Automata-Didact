package com.didactapp.automatadidact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.kexanie.library.MathView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MathView mathView = (MathView) findViewById(R.id.formula_two);
        String tex = "This come from string. You can insert inline formula:" +
                " \\(ax^2 + bx + c = 0\\) " +
                "or displayed formula: $$\\sum_{i=0}^n i^2 = \\frac{(n^2+n)(2n+1)}{6}$$ "+
                "another formula from java "+
                "$$L=\\{w|w\\in\\{w,x,y,z\\}^*\\quad\\text{and}\\quad\\frac{|w|}{2}\\in\\mathbb{N}$$ ";
        mathView.setText(tex);
    }
}
