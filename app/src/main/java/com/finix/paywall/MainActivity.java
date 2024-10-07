package com.finix.paywall;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnOneMonth, btnSixMonths, btnTwelveMonths, btnPriceOneMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOneMonth = findViewById(R.id.btnOneMonth);
        btnSixMonths = findViewById(R.id.btnSixMonths);
        btnTwelveMonths = findViewById(R.id.btnTwelveMonths);
        btnPriceOneMonth = findViewById(R.id.subscriptionprice); // The 60 Taka price button

        // 1 Month Plan (MainActivity)
        btnOneMonth.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        });

        // 6 Months Plan (Paywall2Activity)
        btnSixMonths.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Paywall2Activity.class);
            startActivity(intent);
        });

        // 12 Months Plan (Paywall3Activity)
        btnTwelveMonths.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Paywall3Activity.class);
            startActivity(intent);
        });

        // Redirect to Payment Gateway on Price Click (60 Taka)
        btnPriceOneMonth.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, activity_payment_gateway.class);
            intent.putExtra("plan_price", "60 Taka");  // Pass the plan price to the next activity
            startActivity(intent);
        });
    }
}
