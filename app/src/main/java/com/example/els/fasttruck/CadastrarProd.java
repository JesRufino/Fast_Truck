package com.example.els.fasttruck;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by El's on 08/09/2016.
 */
public class CadastrarProd extends Activity {
    private EditText nome;
    private EditText descricao;
    private EditText preco;
    private EditText imgProd;
    /*
     Devemos verificar como vai ficar a questao da imagem do produto. Aqui eh uma sugestao de imagem via string
      */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrar_prod_layout);
        nome = (EditText)findViewById(R.id.nome_prod);
        descricao = (EditText)findViewById(R.id.desc_prod);
        preco = (EditText)findViewById(R.id.preco_prod);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    /*
    public void onRadioButtonClicked(View view) {
        // Obtem o botao q foi clicado
        boolean checked = ((RadioButton) view).isChecked();

        // Verifica qual botão foi pego, pelo id
        switch(view.getId()) {
            case R.id.Tem:
                if (checked)
                    // Altera o status do ingrediente para 1/tem;
                    //status = true;
                break;
            case R.id.NaoTem:
                if (checked)
                    // Altera o status do ingrediente para 0/não tem;
                    //status = false;
                break;
        }
    }
    */
    public  void clickSalvar(View view){

        if(nome.getText().toString().isEmpty())
            Toast.makeText(CadastrarProd.this, "Informe o ingrediente!", Toast.LENGTH_LONG).show();
        else
        {
            Produto produto = new Produto(nome.getText().toString(), descricao.getText().toString(),
                    imgProd.getText().toString(), Double.parseDouble(preco.getText().toString()));

            // Devemos ver a questão da persistencia.
            // Aqui deve ficar a chamada referente ao armazena do ingrediente.

            Toast.makeText(CadastrarProd.this, produto.getNome()+" cadastrado!", Toast.LENGTH_LONG).show();
        }
    }

}
