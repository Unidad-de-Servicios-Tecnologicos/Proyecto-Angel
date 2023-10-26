package com.example.angel;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import java.util.Calendar;

public class registro2 extends AppCompatActivity {

    private EditText editTextDate;
    private ImageView imageViewCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro2);

        editTextDate = findViewById(R.id.editTextDate);
        imageViewCalendar = findViewById(R.id.imageViewCalendar);

        // Configurar el clic del icono del calendario
        imageViewCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });
    }

    public void btnRegistro2(View v){
        Intent intent = new Intent(this, bienvenida.class);
        startActivity(intent);
    }

    private void showDatePickerDialog() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // Crea una instancia de DatePickerDialog y muestra el diálogo
        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        // Aquí obtienes la fecha seleccionada y puedes hacer algo con ella
                        String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                        editTextDate.setText(selectedDate);
                        editTextDate.setTextColor(getResources().getColor(android.R.color.darker_gray));
                    }
                }, year, month, day);
        datePickerDialog.show();
    }
}
