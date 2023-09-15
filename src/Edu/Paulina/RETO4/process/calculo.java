package edu.Paulina.RETO4.process;

public class calculo {
    public static void trimestreVendeMasPorSabor(int[]trimestre1,int[]trimestre2,int[]trimestre3,int[]trimestre4,String[]sabores,int tamañoCajas) {
        String[] trimestres;
        int[] Ventas;
        trimestres = new String[tamañoCajas];
        Ventas= new int[tamañoCajas];
        int numeroMayor;
        for(int i = 0; i<tamañoCajas;i++){
            numeroMayor = trimestre1[i];
            if(numeroMayor == trimestre1[i]){
                trimestres[i]="Trimestre1";

            }
            if(numeroMayor<trimestre2[i]){
                numeroMayor = trimestre2[i];
                trimestres[i]="Trimestre2";

            }
            if(numeroMayor<trimestre3[i]){
                numeroMayor=trimestre3[i];
                trimestres[i]="Trimestre3";

            }
            if(numeroMayor<trimestre4[i]){
                numeroMayor=trimestre4[i];
                trimestres[i]="Trimestre4";

            }
            Ventas[i]=numeroMayor;

        }
        for(int h = 0; h<tamañoCajas;h++){
            System.out.print("Trimestre mas alto de:"+sabores[h] + "Trimestre:" +trimestres[h]+"Valor:"+Ventas[h]+"\n");

        }


    }

    public static void trimestreVendeMasPorAnno(int[]trimestre1,int[]trimestre2,int[]trimestre3,int[]trimestre4,int tamañoCajas){
       int totaltrimestre1=0;
       int totaltrimestre2=0;
       int totaltrimestre3=0;
       int totaltrimestre4=0;


        for (int i=0; i<tamañoCajas;i++){
            totaltrimestre1 += trimestre1[i];
            totaltrimestre2 +=trimestre2[i];
            totaltrimestre3 +=trimestre3[i];
            totaltrimestre4 +=trimestre4[i];
        }

        if(totaltrimestre1>totaltrimestre2 && totaltrimestre1 > totaltrimestre3 && totaltrimestre1 > totaltrimestre4){
            System.out.print("El trimestre que mas vende es 1 y su valor :"+ totaltrimestre1  );
        } else if (totaltrimestre2>totaltrimestre1 && totaltrimestre2>totaltrimestre3 && totaltrimestre2>totaltrimestre4) {
            System.out.print("El trimestre que mas vende es 2 y su valor:"+ totaltrimestre2  );

        } else if (totaltrimestre3>totaltrimestre1 && totaltrimestre3>totaltrimestre2 && totaltrimestre3>totaltrimestre4) {
            System.out.print("El trimestre que mas vende es 3 y su valor:"+ totaltrimestre3  );
        } else if (totaltrimestre4>totaltrimestre1 && totaltrimestre4>totaltrimestre2 && totaltrimestre4>totaltrimestre3){
            System.out.print("El trimestre que mas vende es 4 y su valor:"+ totaltrimestre4  );
        }


    }

}
