package Model;

import java.sql.Timestamp;

public class Flight {
	private static final long serialVersionUID = 1L;

	public Flight() {
		super();
	}
	
	//novi komentar
	private int IdLeta;
	private Timestamp DatumLeta;
	private String PolaznaLokacija;
	private String OdredisnaLokacija;
	private int BrojMjesta;
	private String VrstaLeta;
	private String OpisTereta;
	private String FajlSaSpecifikacijom;
	
	public Flight(int idLeta, Timestamp datumLeta, String polaznaLokacija, String odredisnaLokacija, int brojMjesta,
			String vrstaLeta, String opisTereta, String fajlSaSpecifikacijom) {
		super();
		IdLeta = idLeta;
		DatumLeta = datumLeta;
		PolaznaLokacija = polaznaLokacija;
		OdredisnaLokacija = odredisnaLokacija;
		BrojMjesta = brojMjesta;
		VrstaLeta = vrstaLeta;
		OpisTereta = opisTereta;
		FajlSaSpecifikacijom = fajlSaSpecifikacijom;
	}

	public int getIdLeta() {
		return IdLeta;
	}

	public void setIdLeta(int idLeta) {
		IdLeta = idLeta;
	}

	public Timestamp getDatumLeta() {
		return DatumLeta;
	}

	public void setDatumLeta(Timestamp datumLeta) {
		DatumLeta = datumLeta;
	}

	public String getPolaznaLokacija() {
		return PolaznaLokacija;
	}

	public void setPolaznaLokacija(String polaznaLokacija) {
		PolaznaLokacija = polaznaLokacija;
	}

	public String getOdredisnaLokacija() {
		return OdredisnaLokacija;
	}

	public void setOdredisnaLokacija(String odredisnaLokacija) {
		OdredisnaLokacija = odredisnaLokacija;
	}

	public int getBrojMjesta() {
		return BrojMjesta;
	}

	public void setBrojMjesta(int brojMjesta) {
		BrojMjesta = brojMjesta;
	}

	public String getVrstaLeta() {
		return VrstaLeta;
	}

	public void setVrstaLeta(String vrstaLeta) {
		VrstaLeta = vrstaLeta;
	}

	public String getOpisTereta() {
		return OpisTereta;
	}

	public void setOpisTereta(String opisTereta) {
		OpisTereta = opisTereta;
	}

	public String getFajlSaSpecifikacijom() {
		return FajlSaSpecifikacijom;
	}

	public void setFajlSaSpecifikacijom(String fajlSaSpecifikacijom) {
		FajlSaSpecifikacijom = fajlSaSpecifikacijom;
	}
	
	
	
}
