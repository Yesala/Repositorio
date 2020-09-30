package salazar.yensy.bl;

import salazar.yensy.entidades.CitaVet;
import salazar.yensy.entidades.Mascota;
import salazar.yensy.entidades.Persona;
import salazar.yensy.entidades.ReservaHotel;
import salazar.yensy.entidades.Duenno;

import java.io.PrintStream;
import java.util.Scanner;

public class logica {

    private static Scanner input= new Scanner(System.in);
    private static PrintStream output = new PrintStream(System.out);

    private static Mascota[] arregloDeMascotas = new Mascota[100];
    private static Persona[] arregloDePersonas = new Persona [100];
    private static CitaVet[] arregloCitasVeterinaria = new CitaVet[50];
    private static ReservaHotel[] arregloReservasHotel = new ReservaHotel [50];

    private static int nextPosicion = 0;

    public static void procesarOpcion(int opcion) {
        switch (opcion){
            case 1:
                output.println("Nombre de la mascota: ");
                String nombrePet = input.next();
                for (int i = 0; i < arregloDeMascotas.length; i++){
                        if (arregloDeMascotas[i].getNombrePet().equals(nombrePet)){
                            System.out.println("El nombre ya existe, ingrese otro");
                        }else{
                            System.out.println("El nombre se ingresó correctamente");
                        }

                }
                output.println("Nombre del dueño de la mascota: ");
                String nombreDuenno = input.nextLine();
                output.println("Ranking de estrellas de la mascota: */**/*** estrellas");
                String ranking = input.next();
                output.println("Observaciones: ");
                String observaciones = input.next();
                output.println("Foto de la mascota: ");
                String foto = input.next();
                Mascota nuevaMascota = new Mascota(nombrePet, nombreDuenno, ranking, observaciones, foto);
                arregloDeMascotas[nextPosicion++]=nuevaMascota;
                break;
            case 2:
                output.println("Nombre y apellidos de la persona: ");
                String nombre = input.nextLine();
                output.println("Número de cédula: ");
                int cedula = input.nextInt();
                for (int i = 0; i < arregloDePersonas.length; i++){
                        if (arregloDePersonas[i].getCedula() == cedula){
                            System.out.println("La cédula ya existe, intenté de nuevo");
                        }else{
                            System.out.println("La cédula se ingresó correctamente");
                        }
                }
                output.println("Número de teléfono: ");
                int telefono = input.nextInt();
                output.println("Dirección: ");
                String direccion = input.next();
                output.println("Ingrese el rol de la persona: Doctor, Secretaria, Dueño");
                String roll = input.next();
                output.println("Estado del usuario: Activo o Inactivo ");
                String estado = input.next();
                Persona nuevaPersona = new Persona(nombre, cedula, telefono, direccion, roll, estado);
                arregloDePersonas[nextPosicion++]=nuevaPersona;
                break;
            case 3:
                output.println("Lista de mascotas de la veterinaria: ");
                for ( int i =0; i < arregloDeMascotas.length; i++){
                    output.println("#" + (i+1) + " " + arregloDeMascotas[i]);
                }
                break;
            case 4:
                output.println("Nombre de la mascota ");
                nombrePet = input.next();
                output.println("Fecha de la cita: ");
                String fechaCita = input.next();
                output.println("Hora de la cita: ");
                String horaCita = input.next();
                output.println("Asunto de la cita: ");
                String observacionesCita = input.next();
                CitaVet nuevaCita = new CitaVet(nombrePet, fechaCita, horaCita, observacionesCita);
                arregloCitasVeterinaria[nextPosicion++]=nuevaCita;
                break;
            case 5:
                output.println("Nombre de la mascota ");
                nombrePet = input.next();
                output.println("Fecha de entrada / Check in: ");
                String fechaEntrada = input.next();
                output.println("Fecha de salida / Check out: ");
                String fechaSalida = input.next();
                ReservaHotel nuevaReserva = new ReservaHotel(nombrePet, fechaEntrada, fechaSalida);
                arregloReservasHotel[nextPosicion++]=nuevaReserva;
                break;
            case 6:
                output.println("Ha finalizado el registro");
                break;
            default:
                output.println("Opción desconocida");
        }

    }

}
