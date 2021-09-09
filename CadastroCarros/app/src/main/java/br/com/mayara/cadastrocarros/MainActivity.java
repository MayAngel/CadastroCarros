package br.com.mayara.cadastrocarros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import br.com.mayara.cadastrocarros.R;

public class MainActivity extends AppCompatActivity {

    Button btnCadastrar;
    EditText txtModelo;
    EditText txtMarca;
    EditText txtAnoFabricacao;
    EditText txtCor;
    EditText txtMotor;
    EditText txtTipoCombustivel;
    EditText txtTabelaFipe;
    Button btnVerCarro;

    String modelo= "";
    String marca= "";
    String cor= "";
    String motor= "";
    String tipocombustivel= "";
    String anoFabricacao= "";
    String tabelafipe= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCadastrar = findViewById(R.id.btnCadastrar);
        txtModelo = findViewById(R.id.txtModelo);
        txtMarca = findViewById(R.id.txtMarca);
        txtAnoFabricacao = findViewById(R.id.txtAnoFabricacao);
        txtCor = findViewById(R.id.txtCor);
        txtMotor = findViewById(R.id.txtMotor);
        txtTipoCombustivel = findViewById(R.id.txtTipoCombustivel);
        txtTabelaFipe = findViewById(R.id.txtTabelaFipe);
        btnVerCarro = findViewById(R.id.btnVerCarro);



        btnCadastrar.setOnClickListener(v -> {
            btnVerCarro.setVisibility(1);

            modelo= txtModelo.getText().toString();
            marca= txtMarca.getText().toString();
            cor= txtCor.getText().toString();
            motor= txtMotor.getText().toString();
            tipocombustivel= txtTipoCombustivel.getText().toString();
            anoFabricacao= txtAnoFabricacao.getText().toString();
            tabelafipe= txtTabelaFipe.getText().toString();


            txtModelo.setText("");
            txtMarca.setText("");
            txtAnoFabricacao.setText("");
            txtMotor.setText("");
            txtCor.setText("");
            txtTipoCombustivel.setText("");
            txtTabelaFipe.setText("");
        });

        btnVerCarro.setOnClickListener(v -> {

           Intent intent = new Intent(this, DetalhesActivity.class);
            intent.putExtra("MODELO", modelo);
            intent.putExtra("MARCA", marca);
            intent.putExtra("COR", cor);
            intent.putExtra("MOTOR", motor);
            intent.putExtra("TIPO_COMBUSTIVEL", tipocombustivel);
            intent.putExtra("TABELA_FIPE", tabelafipe);
            intent.putExtra("ANO_FABRICACAO", anoFabricacao);

            startActivity(intent);
        });


    }
}