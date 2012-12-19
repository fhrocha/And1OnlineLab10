package br.com.globalcode.android.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import br.com.globalcode.android.R;
import br.com.globalcode.android.bean.Imovel;
import br.com.globalcode.android.utils.Constants;

public class MainActivity extends ListActivity {
	
	private List<Imovel> imoveis;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
		imoveis = new ArrayList<Imovel>();
		
		Imovel imovel = Imovel.newInstance();
		imovel.setAreaTotal(80);
        imovel.setAreaUtil(60);
        imovel.setBairro("Morada do Sol");
        imovel.setDescricao("Linda casa com churrasqueira!");
        imovel.setDormitorios(3);
        imovel.setSuites(1);
        imovel.setEndereco("Rua blabla, 123");
        imovel.setGaragem(3);
        imovel.setUf("SP");
        imovel.setCidade("Americana");
        imoveis.add(imovel);
        
        imovel = Imovel.newInstance();
        imovel.setAreaTotal(90);
        imovel.setAreaUtil(80);
        imovel.setBairro("São Vito");
        imovel.setDescricao("Apto novo, pronto para morar!");
        imovel.setDormitorios(3);
        imovel.setSuites(1);
        imovel.setEndereco("Rua lalalala, 90");
        imovel.setGaragem(2);
        imovel.setCidade("Americana");
        imovel.setUf("SP");
        imoveis.add(imovel);
        
        setListAdapter(new ArrayAdapter<Imovel>(this, android.R.layout.simple_list_item_1, android.R.id.text1, imoveis));
        getListView().setOnItemClickListener(new OnItemClickListener() {
    		@Override
    		public void onItemClick(AdapterView<?> parent, View view, int position,
    				long id) {
    			Imovel imovel = imoveis.get(position);
    			Intent i = new Intent(MainActivity.this, DetalheImovelActivity.class);
    			i.putExtra(Constants.IMOVEL_EXTRAS_NAME, imovel);
    			startActivity(i);
    		}
    	});
	}
	
}
