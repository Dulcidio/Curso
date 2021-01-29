package entidades;

public enum Estados {
 
	ACRE (1,"AC"),
	ALAGOAS (2,"AL"),
	AMAPÁ (3,"AP"),
	AMAZONAS (4,"AM"),
	BAHIA (5,"BA"),
	CEARÁ (6,"CE"),
	DISTRITO_FEDERAL (7,"DF"),
	ESPÍRITO_SANTO (8,"ES"),
	GOIÁS (9,"GO"),
	MARANHÃO (10,"MA"),
	MATO_GROSSO (11,"MT"),
	MATO_GROSSO_DO_SUL (12,"MS"),
	MINAS_GERAIS (13,"MG"),
	PARÁ (14,"PA"),
	PARAÍBA (15,"PB"),
	PARANÁ (16,"PR"),
	PERNAMBUCO (17,"PE"),
	PIAUÍ (18,"PI"),
	RIO_DE_JANEIRO (19,"RJ"),
	RIO_GRANDE_DO_NORTE (20,"RN"),
	RIO_GRANDE_DO_SUL (21,"RS"),
	RONDÔNIA (22,"RO"),
	RORAIMA (23,"RR"),
	SANTA_CATARINA (24,"SC"),
	SÃO_PAULO (25,"SP"),
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
		}throw new IllegalAccessError("Informado um codigo de UF inválido");
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
