package br.com.globalcode.android.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import br.com.globalcode.android.R;
import br.com.globalcode.android.bean.Imovel;
import br.com.globalcode.android.utils.Constants;

public class DetalheImovelActivity extends Activity {

	private Imovel imovel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detalhe_imovel_activity);

		this.imovel = (Imovel) getIntent().getSerializableExtra(
				Constants.IMOVEL_EXTRAS_NAME);

		((TextView) findViewById(R.id.descricao))
				.setText(imovel.getDescricao());
		((TextView) findViewById(R.id.dormitorios)).setText(imovel
				.getDormitorios() + " dormitórios");
		((TextView) findViewById(R.id.suites)).setText(imovel.getSuites()
				+ " suites");
		((TextView) findViewById(R.id.garagem)).setText(imovel.getGaragem()
				+ " vagas de garagem");
		((TextView) findViewById(R.id.areaTotal)).setText(imovel.getAreaTotal()
				+ " m2 de Área Total");
		((TextView) findViewById(R.id.areaUtil)).setText(imovel.getAreaUtil()
				+ " m2 de Área Util");
		((TextView) findViewById(R.id.endereco)).setText(imovel.getEndereco());
		((TextView) findViewById(R.id.cidade)).setText(imovel.getCidade());
		((TextView) findViewById(R.id.bairro)).setText(imovel.getBairro());
		((TextView) findViewById(R.id.uf)).setText(imovel.getUf());

		findViewById(R.id.site).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(Constants.IMOBILIARIA_HOME_SITE));
				startActivity(i);
			}
		});

		findViewById(R.id.telefone).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Intent.ACTION_CALL);
				i.setData(Uri.parse("tel:" + Constants.IMOBILIARIA_FONE));
				startActivity(i);
			}
		});

		findViewById(R.id.maisInfo).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(Intent.ACTION_SEND);
				//intent.setType("message/rfc822");
				intent.setType("plain/text");
				intent.addFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
				intent.putExtra(Intent.EXTRA_EMAIL, new String[] { Constants.IMOBILIARIA_EMAIL });
				intent.putExtra(Intent.EXTRA_SUBJECT, "Mais Informações");
				intent.putExtra(Intent.EXTRA_TEXT, "Mais informações sobre o imóvel: " + imovel.toString());
				startActivity(Intent.createChooser(intent, "Enviar e-mail utilizando"));
			}
		});

	}

}
