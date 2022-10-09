package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Spinner spCounter;
    private EditText edEnteredText;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.spCounter = findViewById(R.id.spCounter);
        this.edEnteredText = findViewById(R.id.etEnteredText);
        this.tvResult = findViewById(R.id.tvResult);
        this.button = findViewById(R.id.button);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spCounter.setAdapter(adapter);

    }

    public void onButtonClick(View view) {
        //Toast.makeText(this, this.spCounter.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

        String spSelectedOption = this.spCounter.getSelectedItem().toString(); // to know which option was chosen
        String charString = getString(R.string.selection_chars);
        if (TextUtils.isEmpty(edEnteredText.getText().toString())) {
            Toast.makeText(MainActivity.this, "Empty field not allowed!",
                    Toast.LENGTH_SHORT).show();
        }else {
            if (spSelectedOption.equalsIgnoreCase(charString)) {
                String enteredUserText = this.edEnteredText.getText().toString();
                int charsCount = TextCounter.getCharsCount(enteredUserText);

                this.tvResult.setText(String.valueOf(charsCount));


            } else {
                String enteredUserText = this.edEnteredText.getText().toString();
                int wordCount = word_counter.getWordsCount(enteredUserText);
                this.tvResult.setText(String.valueOf(wordCount));
            }
        }
    }
}
