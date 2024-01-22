package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerDato = new Scanner(System.in);
        Integer idDeudor;
        String tipoDocumento;
        String documento;
        String nombres;
        String apellidos;
        String telefonoMovil;
        String telefonoFijo;
        String direccion;
        Integer idFiador;
        String nombresFiador;
        String docuamentoFiador;
        Double valorBuroMoto;
        Double valorTotalMoto;

        boolean tieneLicenciaElConductor;
        String tipoCompra;


        //proceso
        System.out.println("************");
        System.out.println("MUNDO YAMAHA");
        System.out.println("**************");

        System.out.println("Apreciado cliente, usted actualmente cuenta con licencia?: ");
        tieneLicenciaElConductor = leerDato.nextBoolean();

        //PRIMERA PREGUNTA O DECISION
        if (tieneLicenciaElConductor == true) {
            //Si TIENE LICENCIA
            System.out.println("Nombres del cliente: ");
            nombres = leerDato.nextLine();

            System.out.println("Apellidos del cliente: ");
            apellidos = leerDato.nextLine();

            System.out.println("Tipo de documento: ");
            tipoDocumento = leerDato.nextLine();

            System.out.println("Numero de documento: ");
            documento = leerDato.nextLine();

            System.out.print("Telefono celular: ");
            telefonoMovil = leerDato.nextLine();

            System.out.print("Telefono FIjo: ");
            telefonoFijo = leerDato.nextLine();

            System.out.print("Direccion del cliente: ");
            direccion = leerDato.nextLine();

            System.out.println("Documento Fiador: ");
            docuamentoFiador = leerDato.nextLine();

            System.out.println("Nombres fiador: ");
            nombresFiador = leerDato.nextLine();

            System.out.println("Nuestras motocicletas: ");
            System.out.println("1. Yamaha SZR-125---$9000000");
            System.out.println("2. Yamaha crypton FI---$8400000");
            System.out.println("3. Yamaha XTZ125---$10500000");
            System.out.println("4. Yamaha MT10---$72000000");
            System.out.println("5. Yamaha NMAX300---$34000000");

            Integer motoSeleccionada;
            System.out.print("Digite la motocicleta deseada: ");
            motoSeleccionada = leerDato.nextInt();
            Double valorMoto=0.0;
            if(motoSeleccionada==1){
                valorMoto=9000000.0;
            }else if(motoSeleccionada==2) {
                valorMoto=8000000.0;
            }else if(motoSeleccionada==3) {
                valorMoto=10500000.0;
            }else if(motoSeleccionada==4) {
                valorMoto=72000000.0;
            }else if(motoSeleccionada==5) {
                valorMoto=34000000.0;
            }else{
                System.out.println("moto invalida");
        }





            //2. PREGUNTA: LO QUIERE A CREDITO?
            System.out.println("usuario digite por favor el credito o el contado para continuar su compra: ");
            leerDato.nextLine();
            tipoCompra = leerDato.nextLine().toLowerCase();
            if (tipoCompra.equals("credito")) {
                //Le pregunto por el % a financiar
                double porcentajecredito;
                System.out.println("Ingrese el porcentaje a financiar: ");
                porcentajecredito = leerDato.nextDouble();

                if (porcentajecredito == 1.0) {
                 Double valorIntereses=0.25;
                 valorMoto=valorMoto+(valorMoto*valorIntereses);


                } else if (porcentajecredito == 0.7) {
                Double valorIntereses=0.15;
                valorMoto=valorMoto+(valorMoto*valorIntereses);


                } else if (porcentajecredito == 0.5) {
                    Double valorIntereses=0.07;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);


                } else {
                    System.out.println("Opcion invalida");
                }
            }else{
                System.out.println("excelente le daremos un descuento del 10%");
            }





        }else{
            //NO TIENE LICENCIA
            System.out.println("apreciado usuario, no podemos seguir con la transaccion");
            System.out.println("lo invitamos a tramitar su licencia, vuelva pronto...");
        }


    }
}