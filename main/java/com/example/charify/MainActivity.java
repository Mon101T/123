package com.example.charify;

public class MainActivity extends AppCompatActivity {

    View rectangle4Black, rectangle4Gradient, rectangle5, charifyLog, charifyWor;
    TextView logInText, welcomeText, createAccountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Reference your XML here

        // Initialize Views with updated unique IDs
        rectangle4Black = findViewById(R.id.rectangle_4_black);         // Solid black background
        rectangle4Gradient = findViewById(R.id.rectangle_4_gradient);   // Drawable rectangle_4 (with gradient)
        rectangle5 = findViewById(R.id.rectangle_5);                    // Button background
        charifyLog = findViewById(R.id.charify_log);
        charifyWor = findViewById(R.id.charify_wor);

        logInText = findViewById(R.id.log_in);
        welcomeText = findViewById(R.id.welcome);
        createAccountText = findViewById(R.id.create_an_a);

        // Example interaction
        welcomeText.setText("Welcome back!");

        logInText.setOnClickListener(v -> {
            Toast.makeText(this, "Log In clicked", Toast.LENGTH_SHORT).show();
        });
    }
}
