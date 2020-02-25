package llenado_piscinas;

import java.util.Scanner;

public class Llenado_de_piscinas {

	
	public static void main(String args[]) {
		
		int capacidad_piscina1;
		int capacidad_balde1;
		int perdida_piscina1;
		int viajes1;	
		
		int  capacidad_piscina2;
		int capacidad_balde2;
		int perdida_piscina2;
		int viajes2;
		
		int resultado = 0;
		String ganador = "";
		
		Scanner entrada = new Scanner(System.in);

// TOMA DATOS
	do {
		capacidad_piscina1 = entrada.nextInt();
		capacidad_balde1 = entrada.nextInt();
		perdida_piscina1 = entrada.nextInt();
		
		capacidad_piscina2 = entrada.nextInt();
		capacidad_balde2 = entrada.nextInt();
		perdida_piscina2 = entrada.nextInt();
		
		viajes1 = 0;
		viajes2 = 0;
		
// REALIZA LOS CÁLCULOS PARA AMBOS CASOS

		for(int i = 0; capacidad_piscina1>0; i++) {
			capacidad_piscina1 = (capacidad_piscina1-capacidad_balde1)+perdida_piscina1;
			viajes1++;
		}
		
		for(int i = 0; capacidad_piscina2>0; i++) {
			capacidad_piscina2 = (capacidad_piscina2-capacidad_balde2)+perdida_piscina2;
			viajes2++;
		}
		
		if (capacidad_piscina1 == 0 && capacidad_balde1 == 0 && perdida_piscina1 == 0 && capacidad_piscina2 == 0 && capacidad_balde2 == 0 && perdida_piscina2 == 0) {
			
		}else {

			
// COMPARA LOS CÁLCULOS Y DETERMINA RESULTADOS
			
			if(viajes1<viajes2) {
				resultado=viajes1;
				ganador="YO";
			}
			if(viajes2<viajes1){
				resultado=viajes2;
				ganador="VECINO";
			}
			if(viajes1==viajes2) {
				resultado=viajes1;
				ganador="EMPATE";
			}
			System.out.println(ganador + " " + resultado);
		}
		
	}while(capacidad_balde1 !=0 && capacidad_balde2 !=0);

		entrada.close();
		
	}
}
