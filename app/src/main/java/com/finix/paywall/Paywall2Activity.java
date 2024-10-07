package com.finix.paywall;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Paywall2Activity extends AppCompatActivity {

    private Button btnOneMonth, btnSixMonths, btnTwelveMonths, btnPriceSixMonths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paywall2);

        btnOneMonth = findViewById(R.id.btnOneMonth2);
        btnSixMonths = findViewById(R.id.btnSixMonths2);
        btnTwelveMonths = findViewById(R.id.btnTwelveMonths2);
        btnPriceSixMonths = findViewById(R.id.subscriptionprice2); // The 110 Taka price button

        // 1 Month Plan (MainActivity)
        btnOneMonth.setOnClickListener(v -> {
            Intent intent = new Intent(Paywall2Activity.this, MainActivity.class);
            startActivity(intent);
        });

        // 6 Months Plan (Paywall2Activity)
        btnSixMonths.setOnClickListener(v -> {
            Intent intent = new Intent(Paywall2Activity.this, Paywall2Activity.class);
            startActivity(intent);
        });

        // 12 Months Plan (Paywall3Activity)
        btnTwelveMonths.setOnClickListener(v -> {
            Intent intent = new Intent(Paywall2Activity.this, Paywall3Activity.class);
            startActivity(intent);
        });

        // Redirect to Payment Gateway on Price Click (110 Taka)
        btnPriceSixMonths.setOnClickListener(v -> {
            Intent intent = new Intent(Paywall2Activity.this, activity_payment_gateway.class);
            intent.putExtra("plan_price", "110 Taka");  // Pass the plan price to the next activity
            startActivity(intent);
        });
    }
}
