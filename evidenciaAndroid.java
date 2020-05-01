public class MainActivity extends AppCompatActivity {

//Indicamos que vamos a usar variables de tipo texto
    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1 = (EditText)findViewById(R.id.txt_num1);
        texto2 = (EditText)findViewById(R.id.txt_num2);
        textview1 = (TextView) findViewById(R.id.txt_resultado);
    }

    /*Metodo publico para que se pueda usar desde la vista.
     Hace la suma de los numeros*/
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
}
