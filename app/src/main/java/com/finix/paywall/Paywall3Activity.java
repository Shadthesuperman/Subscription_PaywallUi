package com.finix.paywall;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Paywall3Activity extends AppCompatActivity {

    private Button btnOneMonth, btnSixMonths, btnTwelveMonths, btnPriceTwelveMonths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paywall3);

        btnOneMonth = findViewById(R.id.btnOneMonth3);
        btnSixMonths = findViewById(R.id.btnSixMonths3);
        btnTwelveMonths = findViewById(R.id.btnTwelveMonths3);
        btnPriceTwelveMonths = findViewById(R.id.subscriptionprice3); // The 150 Taka price button

        // 1 Month Plan (MainActivity)
        btnOneMonth.setOnClickListener(v -> {
            Intent intent = new Intent(Paywall3Activity.this, MainActivity.class);
            startActivity(intent);
        });

        // 6 Months Plan (Paywall2Activity)
        btnSixMonths.setOnClickListener(v -> {
            Intent intent = new Intent(Paywall3Activity.this, Paywall2Activity.class);
            startActivity(intent);
        });

        // 12 Months Plan (Paywall3Activity)
        btnTwelveMonths.setOnClickListener(v -> {
            Intent intent = new Intent(Paywall3Activity.this, Paywall3Activity.class);
            startActivity(intent);
        });

        // Redirect to Payment Gateway on Price Click (150 Taka)
        btnPriceTwelveMonths.setOnClickListener(v -> {
            Intent intent = new Intent(Paywall3Activity.this, activity_payment_gateway.class);
            intent.putExtra("plan_price", "150 Taka");  // Pass the plan price to the next activity
            startActivity(intent);
        });
    }
}
