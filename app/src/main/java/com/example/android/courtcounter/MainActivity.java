/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava;
 */
package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int score_a=0;
    int score_b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */public void point3b(View view){
        score_b+=3;
        display_b(score_b);
    }
    public void point3a(View view){
        score_a+=3;
        display_a(score_a);
            }
    public void point2a(View view){
        score_a+=2;
        display_a(score_a);

    }
    public void point2b(View view){
        score_b+=2;
        display_b(score_b);

    }
    public void freea(View view){
        score_a+=1;
        display_a(score_a);
    }
    public void freeb(View view){
        score_b+=1;
        display_b(score_b);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display_a(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_a);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void display_b(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.score_b);
        priceTextView.setText("" + number);
    }
    public void reset(View view){
        score_a=0;
        score_b=0;
        display_b(score_b);
        display_a(score_a);
    }
    /*private void displayMessage(String message){
        TextView priceTextView=(TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }*/
}