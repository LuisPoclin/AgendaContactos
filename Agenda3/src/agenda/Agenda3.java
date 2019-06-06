package agenda;

public class Agenda3 {
	// Atributos
	Contacto3[] lista;

	// Metodo Constructor
	public Agenda3(int tamanio_agenda) {
		this.lista = new Contacto3[tamanio_agenda];

	}

	// Metodos

	// Metodo insertar contactos
	public void setContacto(Contacto3 c) {
		int indice = buscar_indice_vacio();

		if (indice < 0) {
			System.out.println("");
			System.out.println("Importante: Agenda llena!");
		} else {
			this.lista[indice] = c;
		}
	}

	private int buscar_indice_vacio() {
		int indice = 0;
		while (this.lista[indice] != null) {
			indice++;
			if (indice > (this.lista).length - 1) {
				return -1;
			}
		}
		return indice;
	}

	// Metodo listar contactos
	public void listarContactos() {
		System.out.println("");
		System.out.println("Lista de contactos");
		for (int i = 0; i < (this.lista).length; i++) {
			if (this.lista[i] == null) {

			} else {
				System.out.println("");
				System.out.println("Contacto: " + (i + 1));
				(this.lista[i]).DatosContacto();
			}
		}
	}

	// Metodo eliminar contactos
	public void Deletecontact(String c) {
		boolean band = false;
		for (int i = 0; i < (this.lista).length && !band; i++) {
			if (this.lista != null && c.compareToIgnoreCase(this.lista[i].getNombre()) == 0
					|| c.compareToIgnoreCase(this.lista[i].getTelefono()) == 0
					|| c.compareToIgnoreCase(this.lista[i].getEmail()) == 0) {
				this.lista[i] = null;
				band = true;
				System.out.println("Contacto eliminado exitosamente");
			}
			if (!band) {
				System.out.println("Contacto no registrado");
			}
		}
	}

	// Metodo buscar_contacto_por_nombre
	public void Findcontact1(String c) {
		boolean band = false;
		for (int i = 0; i < (this.lista).length && !band; i++) {
			if (this.lista != null && c.compareToIgnoreCase(this.lista[i].getNombre()) == 0) {
				this.lista[i].DatosContacto();
				band = true;
			} else {
				System.out.println("Contacto no registrado");
			}
		}
	}

	// Metodo buscar_contacto_por_telefono
	public void Findcontact2(String c) {
		boolean band = false;
		for (int i = 0; i < (this.lista).length && !band; i++) {
			if (this.lista != null && c.compareToIgnoreCase(this.lista[i].getTelefono()) == 0) {
				this.lista[i].DatosContacto();
				band = true;
			} else {
				System.out.println("Contacto no registrado");
			}
		}

	}

	// Metodo buscar_contacto_por_email
	public void Findcontact3(String c) {
		boolean band = false;
		for (int i = 0; i < (this.lista).length && !band; i++) {
			if (this.lista != null && c.compareToIgnoreCase(this.lista[i].getEmail()) == 0) {
				this.lista[i].DatosContacto();
				band = true;
			} else {
				System.out.println("Contacto no registrado");
			}
		}

	}

	// Metodo editar contactos
	public void Editcontactnom(String c, String nombre) {
		boolean band = false;
		for (int i = 0; i < (this.lista).length && !band; i++) {
			if (this.lista != null && c.compareToIgnoreCase(this.lista[i].getNombre()) == 0
					|| c.compareToIgnoreCase(this.lista[i].getTelefono()) == 0
					|| c.compareToIgnoreCase(this.lista[i].getEmail()) == 0) {
				this.lista[i].setNombre(nombre);
				System.out.println("El nuevo contacto es :");
				this.lista[i].DatosContacto();
				band = true;
			} else {
				System.out.println("Contacto no registrado");
			}
		}

	}

	public void Editcontacttelf(String c, String telefono) {
		boolean band = false;
		for (int i = 0; i < (this.lista).length && !band; i++) {
			if (this.lista != null && c.compareToIgnoreCase(this.lista[i].getNombre()) == 0
					|| c.compareToIgnoreCase(this.lista[i].getTelefono()) == 0
					|| c.compareToIgnoreCase(this.lista[i].getEmail()) == 0) {
				this.lista[i].setTelefono(telefono);
				System.out.println("El nuevo contacto es :");
				this.lista[i].DatosContacto();
				band = true;
			}
			if (!band) {
				System.out.println("Contacto no registrado");
			}
		}

	}

	public void Editcontactemail(String c, String email) {
		boolean band = false;
		for (int i = 0; i < (this.lista).length && !band; i++) {
			if (this.lista != null && c.compareToIgnoreCase(this.lista[i].getNombre()) == 0
					|| c.compareToIgnoreCase(this.lista[i].getTelefono()) == 0
					|| c.compareToIgnoreCase(this.lista[i].getEmail()) == 0) {
				this.lista[i].setEmail(email);
				System.out.println("El nuevo contacto es :");
				this.lista[i].DatosContacto();
				band = true;
			} else {
				System.out.println("Contacto no registrado");
			}
		}

	}

	// metodo para visualizar datos
	public void Mostrar(String c) {
		boolean band = false;
		for (int i = 0; i < (this.lista).length && !band; i++) {
			if (this.lista != null && c.compareToIgnoreCase(this.lista[i].getNombre()) == 0
					|| c.compareToIgnoreCase(this.lista[i].getTelefono()) == 0
					|| c.compareToIgnoreCase(this.lista[i].getEmail()) == 0) {
				this.lista[i].DatosContacto();
				band = true;
			}

		}
	}
}
