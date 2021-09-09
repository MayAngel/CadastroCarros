package br.com.mayara.cadastrocarros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import br.com.mayara.cadastrocarros.R;

public class DetalhesActivity extends AppCompatActivity {


    TextView txtModeloResult;
    TextView txtMarcaResult;
    TextView txtAnoFabricacaoResult;
    TextView txtCorResult;
    TextView txtMotorResult;
    TextView txtTipoCombustivelResult;
    TextView txtTabelaFipeResult;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);


        Intent intent = getIntent();

        String modelo = intent.getStringExtra("MODELO");
        String marca = intent.getStringExtra("MARCA");
        String cor = intent.getStringExtra("COR");
        String motor =intent.getStringExtra("MOTOR");
        String tipoCombustivel = intent.getStringExtra("TIPO_COMBUSTIVEL");
        String anoFabricacao = intent.getStringExtra("ANO_FABRICACAO");
        String tabelaFipe = intent.getStringExtra("TABELA_FIPE");


        txtModeloResult = findViewById(R.id.txtModeloResult);
        txtModeloResult.setText(modelo);

        txtMarcaResult = findViewById(R.id.txtMarcaResult);
        txtMarcaResult.setText(marca);

        txtAnoFabricacaoResult = findViewById(R.id.txtAnoFabricacaoResult);
        txtAnoFabricacaoResult.setText(anoFabricacao);

        txtCorResult = findViewById(R.id.txtCorResult);
        txtCorResult.setText(cor);

        txtMotorResult = findViewById(R.id.txtMotorResult);
        txtMotorResult.setText(motor);

        txtTipoCombustivelResult = findViewById(R.id.txtTipoCombustivelResult);
        txtTipoCombustivelResult.setText(tipoCombustivel);

        txtTabelaFipeResult = findViewById(R.id.txtTabelaFipeResult);
        txtTabelaFipeResult.setText(tabelaFipe);

        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(v -> {
            Intent intentMain = new Intent(this, MainActivity.class);
            startActivity(intentMain);
        });

    }
}