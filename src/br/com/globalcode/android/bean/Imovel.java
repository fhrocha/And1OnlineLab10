package br.com.globalcode.android.bean;

import java.io.Serializable;

public class Imovel implements Serializable {

	private static final long serialVersionUID = 6380391657133800239L;

	private int id;
	private String descricao;
	private int dormitorios;
	private int suites;
	private int garagem;
	private float areaTotal;
	private float areaUtil;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	
	public final static Imovel newInstance() {
		return new Imovel();
	}

	private Imovel() {
		
	}
	
	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getDescricao() {
		return descricao;
	}

	public final void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public final int getDormitorios() {
		return dormitorios;
	}

	public final void setDormitorios(int dormitorios) {
		this.dormitorios = dormitorios;
	}

	public final int getSuites() {
		return suites;
	}

	public final void setSuites(int suites) {
		this.suites = suites;
	}

	public final int getGaragem() {
		return garagem;
	}

	public final void setGaragem(int garagem) {
		this.garagem = garagem;
	}

	public final float getAreaTotal() {
		return areaTotal;
	}

	public final void setAreaTotal(float areaTotal) {
		this.areaTotal = areaTotal;
	}

	public final float getAreaUtil() {
		return areaUtil;
	}

	public final void setAreaUtil(float areaUtil) {
		this.areaUtil = areaUtil;
	}

	public final String getEndereco() {
		return endereco;
	}

	public final void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public final String getBairro() {
		return bairro;
	}

	public final void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public final String getCidade() {
		return cidade;
	}

	public final void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public final String getUf() {
		return uf;
	}

	public final void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return this.descricao;
	}
	
}
