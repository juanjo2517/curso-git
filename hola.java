    public void Sumar(View view){
        String valor1 = texto1.getText().toString();
        String valor2 = texto2.getText().toString();

        //Parseando de string a entero
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        //Haciedo la suma de los numeros
        int suma = num1 + num2;

        //Pasando el resultado de int a String
        String result = String.valueOf(suma);
        tv1.setText(result);
    }
