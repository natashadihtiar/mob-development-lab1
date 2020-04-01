package com.example.calculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        }

        private double convertStringToDouble(EditText str) {// метод перевода вводимой строки в число типа double
        return Double.parseDouble(str.getText().toString());
        }

        public void multiplicationButtonOnClick(View view) // метод нажатия на кнопку умножения
        {
            multiplyNumbers(); //умножения чисел
        }

        public void divisionButtonOnClick(View view)  // метод нажатия на кнопку деления
        {
            divideNumbers();//функция деления чисел
        }


        public void plusButtonOnClick(View view) // метод нажатия на кнопку прибавления
        {
            addNumbers();
        }

        public void minusButtonOnClick(View view) // метод нажатия на кнопку отнимания
        {
            subtractNumbers();
         }


        private void multiplyNumbers() { //метод умножения
            EditText firstString = findViewById(R.id.firstNumberInput);// ввод 1-ого числа
            EditText secondString = findViewById(R.id.secondNumberInput);// ввод 2-ого числа
                double firstNumber = convertStringToDouble(firstString);// перевод введенной строки в число типа double
                double secondNumber = convertStringToDouble(secondString);// перевод введенной строки в число типа double
                displayResult(firstNumber * secondNumber);// умножение и получение результата
        }

        private void divideNumbers() {//метод деления
            EditText firstString = findViewById(R.id.firstNumberInput);// ввод 1-ого числа
            EditText secondString = findViewById(R.id.secondNumberInput);// ввод 2-ого числа
                double firstNumber = convertStringToDouble(firstString);// перевод введенной строки в число типа double
                double secondNumber = convertStringToDouble(secondString);// перевод введенной строки в число типа double
                if(!checkSecondNumber(secondNumber))// проверка не является ли второе число нулем
                    displayResult(firstNumber / secondNumber);// деление и получение результата
            }

        private boolean checkSecondNumber (double secondNumber) {// метод проверки является ли второе число нулем
            if (secondNumber == 0) { // проверка является ли второе число нулем
               showMessage("Нельзя делить на 0!!!"); // сообщение об ошибке
                return  true;
            }
            return false;
        }

        private void showMessage(String string) {// метод вывода сообщений об ошибке
            Toast toast = Toast.makeText(this,string,Toast.LENGTH_LONG); // создание строки с сообщением ошибки
            toast.show(); //вызов
        }

        private void addNumbers() { // метод сложения
            EditText firstString = findViewById(R.id.firstNumberInput);// ввод 1-ого числа
            EditText secondString = findViewById(R.id.secondNumberInput);// ввод 2-ого числа
                double firstNumber = convertStringToDouble(firstString);// перевод введенной строки в число типа double
                double secondNumber = convertStringToDouble(secondString);// перевод введенной строки в число типа double
                displayResult(firstNumber + secondNumber);// умножение и получение результата
            }

        private void subtractNumbers() {// метод вычитания
            EditText firstString = findViewById(R.id.firstNumberInput);// ввод 1-ого числа
            EditText secondString = findViewById(R.id.secondNumberInput);// ввод 2-ого числа
                double firstNumber = convertStringToDouble(firstString);// перевод введенной строки в число типа double
                double secondNumber = convertStringToDouble(secondString);// перевод введенной строки в число типа double
                displayResult(firstNumber - secondNumber);// умножение и получение результата
            }

        private void displayResult(double result) {// метод вывода результата операций калькулятора
            TextView textView = findViewById(R.id.resultView);// форма вывода результата
            textView.setText(Double.toString(result));// перевод результата
        }
    }


