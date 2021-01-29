package entidades;

public enum Estados {
 
	ACRE (1,"AC"),
	ALAGOAS (2,"AL"),
	AMAP� (3,"AP"),
	AMAZONAS (4,"AM"),
	BAHIA (5,"BA"),
	CEAR� (6,"CE"),
	DISTRITO_FEDERAL (7,"DF"),
	ESP�RITO_SANTO (8,"ES"),
	GOI�S (9,"GO"),
	MARANH�O (10,"MA"),
	MATO_GROSSO (11,"MT"),
	MATO_GROSSO_DO_SUL (12,"MS"),
	MINAS_GERAIS (13,"MG"),
	PAR� (14,"PA"),
	PARA�BA (15,"PB"),
	PARAN� (16,"PR"),
	PERNAMBUCO (17,"PE"),
	PIAU� (18,"PI"),
	RIO_DE_JANEIRO (19,"RJ"),
	RIO_GRANDE_DO_NORTE (20,"RN"),
	RIO_GRANDE_DO_SUL (21,"RS"),
	ROND�NIA (22,"RO"),
	RORAIMA (23,"RR"),
	SANTA_CATARINA (24,"SC"),
	S�O_PAULO (25,"SP"),
	SERGIPE (26,"SE"),
	TOCANTINS (27,"TO");
	
	private int cod;
	private String uf;
	
	private Estados(int cod, String uf) {
		this.cod=cod;
		this.uf=uf;
		
	}
	
	
	public static Estados valueOf(int cod) {
		for(Estados c : Estados.values()) {
			if(c.getCod()==cod) {
				return c;
			}
		}throw new IllegalAccessError("Informado um codigo de UF inv�lido");
	}


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	
}
