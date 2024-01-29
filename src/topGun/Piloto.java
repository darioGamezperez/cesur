package topGun;

public class Piloto {
// Atributos
	private String nomPiloto;
	private int idPiloto;
	private int horasVueloPiloto;
	private String rangoPiloto;

//constructor
	public Piloto(String nomPiloto, int idPiloto, int horasVueloPiloto, String rangoPiloto) {
		this.nomPiloto = nomPiloto;
		this.idPiloto = idPiloto;
		this.rangoPiloto = rangoPiloto;
		this.horasVueloPiloto = horasVueloPiloto;

	}

	// getters y setters
	public String getnomPiloto() {
		return nomPiloto;
	}

	public void setnomPiloto(String nomPiloto) {
		this.nomPiloto = nomPiloto;
	}

	public void getPiloto() {
		String idPiloto;
	}

	public void setidPiloto(int idPiloto) {
		this.idPiloto=idPiloto;
	}
	public void horasVueloPiloto() {
		String horasVueloPiloto;
	}


	public void sethorasVueloPiloto(int horasVueloPiloto ) {
		this.horasVueloPiloto=horasVueloPiloto;
}
	
}
