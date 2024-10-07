package com.finix.paywall;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class activity_payment_gateway extends AppCompatActivity {

    private TextView selectedPlanPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_gateway);

        selectedPlanPrice = findViewById(R.id.selectedPlanPrice);

        // Get the plan price from intent
        String planPrice = getIntent().getStringExtra("plan_price");
        selectedPlanPrice.setText("Selected Plan: " + planPrice);

        // Set up click listeners for tabs
        findViewById(R.id.tab_cards).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCardPayment();
            }
        });

        findViewById(R.id.tab_mobile_banking).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMobileBanking();
            }
        });

        findViewById(R.id.tab_net_banking).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNetBanking();
            }
        });
    }

    private void showCardPayment() {
        // Show card logos
        findViewById(R.id.visaLogo).setVisibility(View.VISIBLE);
        findViewById(R.id.mastercardLogo).setVisibility(View.VISIBLE);
        findViewById(R.id.amexLogo).setVisibility(View.VISIBLE);
        // Hide mobile and net banking logos if any
        // Your logic to hide other logos
    }

    private void showMobileBanking() {
        // Show mobile banking logos (Bkash, Nagad, Upay)
        // Your logic to display these logos
    }

    private void showNetBanking() {
        // Show net banking logos (DBL, UCB, PRIME Bank)
        // Your logic to display these logos
    }
}
