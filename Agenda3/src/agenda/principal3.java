package agenda;

import java.util.Scanner;

public class principal3 {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int opcion, opcion2, tamanio;
		Contacto3 mi_contacto;
		String nombre, telefono, email, c, aux;
		boolean band = true;

		System.out.print("Tamaño de la agenda: ");
		tamanio = reader.nextInt();
		Agenda3 mi_agenda = new Agenda3(tamanio);

		while (band == true) {
			menu();
			System.out.print("> Elegir opcion: ");
			opcion = reader.nextInt();

			switch (opcion) {
			case 1: // insertar contacto
				System.out.print("Ingresar nombre contacto: ");
				nombre = reader.next();
				System.out.print("Ingresar telefono contacto: ");
				telefono = reader.next();
				System.out.print("Ingresar email contacto: ");
				email = reader.next();

				mi_contacto = new Contacto3(nombre, telefono, email);
				mi_agenda.setContacto(mi_contacto);
				break;

			case 2: // Editar contacto
				System.out.print("Ingrese algún dato del contacto a editar: ");
				c = reader.next();
				mi_agenda.Mostrar(c.trim());
				System.out.println("Elija una opción");
				System.out.println("1) Editar nombre");
				System.out.println("2) Editarr teléfono");
				System.out.println("3) Editar email");
				opcion2 = reader.nextInt();
				switch (opcion2) {
				case 1: // editar_nombre
					System.out.print("Ingrese el nuevo nombre: ");
					aux = reader.next();
					mi_agenda.Editcontactnom(c.trim(), aux);
					break;
				case 2: // editar_telefono
					System.out.print("Ingrese el nuevo teléfono: ");
					aux = reader.next();
					mi_agenda.Editcontacttelf(c.trim(), aux);

					break;
				case 3: // editar_email
					System.out.print("Ingrese el nuevo email: ");
					aux = reader.next();
					mi_agenda.Editcontactemail(c.trim(), aux);

					break;
				default:
					System.out.print("Opción Inválida");
				}

				break;
			case 3: // Buscar contacto
				System.out.println("Elija una opción");
				System.out.println("1) Buscar por nombre");
				System.out.println("2) Buscar por teléfono");
				System.out.println("3) Buscar por email");
				opcion2 = reader.nextInt();
				switch (opcion2) {
				case 1: // buscar_por_nombre
					System.out.print("Ingrese el nombre: ");
					c = reader.next();
					mi_agenda.Findcontact1(c.trim());
					break;
				case 2: // buscar_por_telefono
					System.out.print("Ingrese el teléfono: ");
					c = reader.next();
					mi_agenda.Findcontact2(c.trim());
					break;
				case 3: // buscar_por_email
					System.out.print("Ingrese el email: ");
					c = reader.next();
					mi_agenda.Findcontact2(c.trim());
					break;
				default:
					System.out.print("Opción Inválida");
				}

				break;
			case 4: // Eliminar Contacto
				System.out.print("Ingrese algún dato del contacto a eliminar: ");
				c = reader.next();
				mi_agenda.Deletecontact(c.trim());
				break;
			case 5:// Listar Contactos
				mi_agenda.listarContactos();
				break;
			case 0:// Finalizar programa
				band = false;
				break;
			default:
				break;
			}
		}
	}

	// Metodo de menu de opciones del proyecto
	public static void menu() {
		System.out.println("");
		System.out.println("========= Menu Agenda Telefonica =========");
		System.out.println("[1] Añadir Contacto");
		System.out.println("[2] Editar Contacto");
		System.out.println("[3] Buscar Contacto");
		System.out.println("[4] Eliminar Contacto"); // por nombre
		System.out.println("[5] Listar Contacto");
		System.out.println("[0] Finalizar Programa");
	}
}
