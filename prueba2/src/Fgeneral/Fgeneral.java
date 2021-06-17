package Fgeneral;
import java.awt.event.*;  
import javax.swing.*;   
import java.lang.Math; 
public class Fgeneral {			
	
	public static void main(String[] args)
	{
	}																//Hasta esta linea termina la interfaz grafica

	
	public static String artificio(double A,double B,double C,double D,double E, double F) {
		String r=null;
		double h,k,p,f,d,a,b,c;
		 if(A==0&&B==0&&C!=0){  //Metodo para ecuaciones conicas de parabolas horizontales
			if(E==0){
				k=0;
				D=D/C; F=F/C; C=C/C; // Reducimos el coeficiente del termino cuadrado a 1
				
				D=-D; F=-F; //Pasamos los elemenots al otro lado de la ecuacion
				
				p=D/4;
			
				F=F/D; D=D/D;// Redcudicmos el coeficiente de xlineal a 1
				
				h=-F;// desplazamineto en x
				f=h+p;// coordenada x de el foco
				d=h-p;// ecuacion de la directriz
				p=2*p;// distancia de la directriz al foco
				
				if(p<0) {
					p=-p;  // cambia el signo de p si es negativo para representarlo correctamente
				}
				
				System.out.println("El origen se encuentra en el par ordenado("+h+","+k+")");
				System.out.println("El Foco se encuentra en el par ordenado("+f+","+k+")");
				System.out.println("La ecuacion de la directiz es: X="+d);
				System.out.println("La distancia de la directriz al foco es="+p);
				
				r=("La ecuacion es una Parabola Horizontal"+
				"\nEl origen se encuentra en el par ordenado("+h+","+k+")"+
				"\nEl Foco se encuentra en el par ordenado("+f+","+k+")"+
				"\nLa ecuacion de la directiz es: X="+d+
				"\nLa distancia de la directriz al foco es="+p);
			}
			
			else{
				D=D/C; F=F/C; E=E/C; C=C/C; //el coeficiente del termino cuadrado se reduce a 1
				
				k=E/-2;  					// se obtiene el valor del desplazamineto en y
											
				F=F-(k*k); 					// se suma el valor del tcp completdo
											
				D=-D; F=-F;					 //Pasamos los elemenots al otro lado de la ecuacion
											
				p=D/4;						 //obtenemos el valor de la distancia del foco al vertice.
											
				F=F/D; D=D/D;				// reducimos el coeficiente del facotr lineal a 1
											
				h=-F;// desplazamineto en x
				f=h+p;// coordenada x de el foco
				d=h-p;// ecuacion de la directriz
				p=2*p;// distancia de la directriz al foco
				
				if(p<0) {
					p=-p;  // cambia el signo de p si es negativo para representarlo correctamente
				}
				
				System.out.println("El vertice se encuentra en el par ordenado("+h+","+k+")");
				System.out.println("El Foco se encuentra en el par ordenado("+f+","+k+")");
				System.out.println("La ecuacion de la directiz es: X="+d);
				System.out.println("La distancia de la directriz al foco es="+p);
				
				r=("La ecuacion es una Parabola Horizontal"+
				"\nEl vertice se encuentra en el par ordenado("+h+","+k+")"+
				"\nEl Foco se encuentra en el par ordenado("+f+","+k+")"+
				"\nLa ecuacion de la directiz es: X="+d+
				"\nLa distancia de la directriz al foco es="+p);
			}
			
		}
		else if(A!=0&&B==0&&C==0) {  //Metodo para ecuaciones conicas de parabolas verticales
			if(D==0) {
				h=0;
				E=E/A; F=F/A; A=A/A; // Reducimos el coeficiente del termino cuadrado a 1
			
				E=-E; F=-F; //Pasamos los elemenots al otro lado de la ecuacion
				
				p=E/4;
				
				F=F/E; E=E/E;// Redcudicmos el coeficiente de ylineal a 1
				
				k=-F;// desplazamineto en y
				f=k+p;// coordenada y de el foco
				d=k-p;// ecuacion de la directriz
				p=2*p;// distancia de la directriz al foco
				
				if(p<0) {
					p=-p;  // cambia el signo de p si es negativo para representarlo correctamente
				}
				
				System.out.println("El origen se encuentra en el par ordenado("+h+","+k+")");
				System.out.println("El Foco se encuentra en el par ordenado("+h+","+f+")");
				System.out.println("La ecuacion de la directiz es: y="+d);
				System.out.println("La distancia de la directriz al foco es="+p);
				
				r=("La ecuacion es una Parabola Vertical"+
				"\nEl origen se encuentra en el par ordenado("+h+","+k+")"+
				"\nEl Foco se encuentra en el par ordenado("+h+","+f+")"+
				"\nLa ecuacion de la directiz es: y="+d+
				"\nLa distancia de la directriz al foco es="+p);
			}
			else {
				D=D/A; F=F/A; E=E/A; A=A/A; //el coeficiente del termino cuadrado se reduce a 1
				
				h=D/-2;  					// se obtiene el valor del desplazamineto en y
											
				F=F-(h*h); 					// se suma el valor del tcp completdo
											
				E=-E; F=-F;					 //Pasamos los elemenots al otro lado de la ecuacion
											
				p=E/4;						 //obtenemos el valor de la distancia del foco al vertice.
											
				F=F/E; E=E/E;				// reducimos el coeficiente del facotr lineal a 1
											
				k=-F;// desplazamineto en y
				f=k+p;// coordenada y de el foco
				d=k-p;// ecuacion de la directriz
				p=2*p;// distancia de la directriz al foco
				
				if(p<0) {
					p=-p;  // cambia el signo de p si es negativo para representarlo correctamente
				}
				
				System.out.println("El vertice se encuentra en el par ordenado("+h+","+k+")");
				System.out.println("El Foco se encuentra en el par ordenado("+h+","+f+")");
				System.out.println("La ecuacion de la directiz es: y="+d);
				System.out.println("La distancia de la directriz al foco es="+p);
				
				r=("La ecuacion es una Parabola Vertical"+
				"\nEl vertice se encuentra en el par ordenado("+h+","+k+")"+
				"\nEl Foco se encuentra en el par ordenado("+h+","+f+")"+
				"\nLa ecuacion de la directiz es: y="+d+
				"\nLa distancia de la directriz al foco es="+p);
				
			}
			
		}
		else if(A!=0&&B==0&&C!=0&&A<C&&A>0&&C>0) {//Metodo para ecuaciones conicas de elipses
			if((A>0)&&(C>0)){ //elipse horizontal
				F=-F;
				System.out.println(F);
				if(F<0) {
					F=-F; A=-A; C=-C; D=-D; E=-E;
				}
				a=A; b=C;
				D=D/A; E=E/C; C=C/C; A=A/A;//el coeficiente de los terminos cuadrados se reduce a 1
				
				h=D/-2;  					// se obtiene el valor del desplazamineto en Y y x
				k=E/-2;
											
				F=F+(a*h*h)+(b*k*k); 		// se suma el valor del tcp completdo
				
				a=F/a; b=F/b; F=F/F;		//obtenemos los valores de a, b, c y e
				double e=1-(b/a);
				e=Math.sqrt(e);
				c=Math.sqrt(a-b);
				b=Math.sqrt(b);
				a=Math.sqrt(a);
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
										
				p=2*c;
				if(p<0) {
					p=-p;  }				// cambia el signo de p si es negativo para representarlo correctamente
				
				
				System.out.println("El origen se encuentra en el par ordenado("+h+","+k+")");
				System.out.println("La ecuacion del eje focal es y="+k);
				System.out.println("La ecuacion del eje secundario es x="+h);
				System.out.println("Los Focos se encuentra en los pares ordenadosF("+(h+c)+","+k+") y F'("+(h-c)+","+k+")");
				System.out.println("Los vertices  principales se encuentran en los pares ordenados A("+(h+a)+","+k+") y A'("+(h-a)+","+k+")");
				System.out.println("Los vertices  secundarios se encuentran en los pares ordenados B("+h+","+(k+b)+") y B'("+h+","+(k-b)+")");
				System.out.println("La distancia focal es="+p);
				System.out.println("La excentricidad es="+e);
				
				r=("La ecuacion es una Elipse Horizontal"+
				"\nEl origen se encuentra en el par ordenado("+h+","+k+")"+
				"\nLa ecuacion del eje focal es y="+k+
				"\nLa ecuacion del eje secundario es x="+h+
				"\nLos Focos se encuentra en los pares ordenadosF("+(h+c)+","+k+") y F'("+(h-c)+","+k+")"+
				"\nLos vertices principales se encuentran en los pares ordenados A("+(h+a)+","+k+") y A'("+(h-a)+","+k+")"+
				"\nLos vertices secundarios se encuentran en los pares ordenados B("+h+","+(k+b)+") y B'("+h+","+(k-b)+")"+
				"\nLa distancia focal es="+p+
				"\nLa excentricidad es="+e);
				
			}}
		
			else if(A!=0&&B==0&&C!=0&&A>C&&A>0&&C>0) { //elipse vertical
				F=-F;
				System.out.println(F);
				if(F<0) {
					F=-F; A=-A; C=-C; D=-D; E=-E;
				}
				a=A; b=C;
				D=D/A; E=E/C; C=C/C; A=A/A;//el coeficiente de los terminos cuadrados se reduce a 1
				
				h=D/-2;  					// se obtiene el valor del desplazamineto en Y y x
				k=E/-2;
											
				F=F+(a*h*h)+(b*k*k); 		// se suma el valor del tcp completdo
				
				a=F/a; b=F/b; F=F/F;		//obtenemos los valores de a, b, c y e
				double e=1-(b/a);
				c=Math.sqrt(b-a);
				e=c/b;
				b=Math.sqrt(b);
				a=Math.sqrt(a);
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
											
				p=2*c;
				if(p<0) {
					p=-p;  }				// cambia el signo de p si es negativo para representarlo correctamente
				
				
				System.out.println("El origen se encuentra en el par ordenado("+h+","+k+")");
				System.out.println("La ecuacion del eje focal es x="+h);
				System.out.println("La ecuacion del eje secundario es y="+k);
				System.out.println("Los Focos se encuentra en los pares ordenadosF("+h+","+(k+c)+") y F'("+h+","+(k-c)+")");
				System.out.println("Los vertices  principales se encuentran en los pares ordenadosB("+h+","+(k+b)+") y B'("+h+","+(k-b)+")");
				System.out.println("Los vertices  secundarios se encuentran en los pares ordenadosA("+(h+a)+","+k+") y A'("+(h-a)+","+k+")");
				System.out.println("La distancia focal es="+p);
				System.out.println("La excentricidad es="+e);
				
				r=("La ecuacion es una Elipse Vertical"+
				"\nEl origen se encuentra en el par ordenado("+h+","+k+")"+
				"\nLa ecuacion del eje focal es x="+h+
				"\nLa ecuacion del eje secundario es y="+k+
				"\nLos Focos se encuentra en los pares ordenadosF("+h+","+(k+c)+") y F'("+h+","+(k-c)+")"+
				"\nLos vertices principales se encuentran en los pares ordenados B("+h+","+(k+b)+") y B'("+h+","+(k-b)+")"+
				"\nLos vertices secundarios se encuentran en los pares ordenados A("+(h+a)+","+k+") y A'("+(h-a)+","+k+")"+
				"\nLa distancia focal es="+p+
				"\nLa excentricidad es="+e);
				
			}
			
		
		else if(A==C&&B==0) {//Metodo para ecuaciones conicas de circunferencias
			
			F=-F;
			System.out.println(F);
			if(F<0) {
				F=-F; A=-A; C=-C; D=-D; E=-E;
			}
			a=A; b=C;
			D=D/A; E=E/C; C=C/C; A=A/A;//el coeficiente de los terminos cuadrados se reduce a 1
	
			h=D/-2;  					// se obtiene el valor del desplazamineto en Y y x
			k=E/-2;
										
			F=F+(a*h*h)+(b*k*k); 		// se suma el valor del tcp completdo
			
			a=F/a; b=F/b; F=F/F;		//obtenemos los valores de a, b, c y e
			double e=1-(b/a);
			e=Math.sqrt(e);
			c=Math.sqrt(b-a);
			b=Math.sqrt(b);
			a=Math.sqrt(a);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
										
			System.out.println("El origen se encuentra en el par ordenado("+h+","+k+")");
			System.out.println("La ecuacion de un eje focal es x="+h);
			System.out.println("La ecuacion del otro eje focal es y="+k);
			System.out.println("Los Focos se encuentra en los pares ordenadosF("+h+","+(k+c)+") y F'("+h+","+(k-c)+")");
			System.out.println("Los vertices se encuentran en A("+(h+a)+","+k+") y A'("+(h-a)+","+k+")");
			System.out.println("Los vertices se encuentran en B("+h+","+(k+b)+") y B'("+h+","+(k-b)+")");
			System.out.println("La excentricidad es="+e);
			
			r=("La ecuacion es una Circunferencia"+
			"\nEl origen se encuentra en el par ordenado("+h+","+k+")"+
			"\nLa ecuacion de un eje focal es x="+h+
			"\nLa ecuacion del otro eje focal es y="+k+
			"\nLos Focos se encuentra en los pares ordenadosF("+h+","+(k+c)+") y F'("+h+","+(k-c)+")"+
			"\nLos vertices se encuentran en A("+(h+a)+","+k+") y A'("+(h-a)+","+k+")"+
			"\nLos vertices se encuentran en B("+h+","+(k+b)+") y B'("+h+","+(k-b)+")"+
			"\nLa excentricidad es="+e);
		}
		else if(A!=0&&B==0&&C!=0&&F<0&&C<0) { //metodo para hiperbolas
			if(A>C) {  							// hiperbola horizontal
				if(D==0&&E==0) {
					F=-F;
					System.out.println(F);
					if(F<0) {
						F=-F; A=-A; C=-C;
					}
					h=0;
					k=0;
							a=F/A;	
							b=F/-C;	
						F=F/F;
						System.out.println(a);		//obtenemos los valores de a, b y F
						System.out.println(b);
						System.out.println(F);
						c=Math.sqrt(a+b);
						b=Math.sqrt(b);
						a=Math.sqrt(a);
						p=2*c;						// distancia entre focos
					
					if(p<0) {
						p=-p; 						 // cambia el signo de p si es negativo para representarlo correctamente
					}
					
					System.out.println("El origen se encuentra en el par ordenado("+h+","+k+")");
					System.out.println("La ecuacion del eje focal es y="+k);
					System.out.println("La ecuacion del eje secundario es x="+h);
					System.out.println("Los Focos se encuentra en los pares ordenadosF("+c+","+0+") y F'("+(-c)+","+0+")");
					System.out.println("Los vertices se encuentra en los pares ordenadosA("+a+","+0+") y A'("+(-a)+","+0+")");
					System.out.println("La distancia focal es="+p);
					
					r=("La ecuacion es una Hiperbola Horizontal"+
					"\nEl origen se encuentra en el par ordenado("+h+","+k+")"+
					"\nLa ecuacion del eje focal es y="+k+
					"\nLa ecuacion del eje secundario es x="+h+
					"\nLos Focos se encuentra en los pares ordenados F("+c+","+0+") y F'("+(-c)+","+0+")"+
					"\nLos vertices se encuentra en los pares ordenados A("+a+","+0+") y A'("+(-a)+","+0+")"+
					"\nLa distancia focal es="+p);
				}
				else {							// hiperbola horizontal desplazada
					F=-F;
					System.out.println(F);
					if(F<0) {
						F=-F; A=-A; C=-C; D=-D; E=-E;
					}
					a=A; b=C;
					D=D/A; E=E/C; C=C/C; A=A/A;//el coeficiente de los terminos cuadrados se reduce a 1
					
					h=D/-2;  					// se obtiene el valor del desplazamineto en Y y x
					k=E/-2;
											
					F=F+(a*h*h)+(b*k*k); 		// se suma el valor del tcp completdo
					b=-b;
					
					a=F/a; b=F/b; F=F/F;		//obtenemos los valores de a, b y F
					c=Math.sqrt(a+b);
					b=Math.sqrt(b);
					a=Math.sqrt(a);
					System.out.println(a);
					System.out.println(b);
					System.out.println(c);
												
					p=2*c;
					if(p<0) {
						p=-p;  					// cambia el signo de p si es negativo para representarlo correctamente
					}
					
					System.out.println("El origen se encuentra en el par ordenado("+h+","+k+")");
					System.out.println("La ecuacion del eje focal es y="+k);
					System.out.println("La ecuacion del eje secundario es x="+h);
					System.out.println("Los Focos se encuentra en los pares ordenados F("+(h+c)+","+k+") y F'("+(h-c)+","+k+")");
					System.out.println("Los vertices se encuentra en los pares ordenados A("+(h+a)+","+k+") y A'("+(h-a)+","+k+")");
					System.out.println("La distancia focal es="+p);
					
					r=("La ecuacion es una Hiperbola Horizontal"+
					"\nEl origen se encuentra en el par ordenado("+h+","+k+")"+
					"\nLa ecuacion del eje focal es y="+k+
					"\nLa ecuacion del eje secundario es x="+h+
					"\nLos Focos se encuentra en los pares ordenados F("+(h+c)+","+k+") y F'("+(h-c)+","+k+")"+
					"\nLos vertices se encuentra en los pares ordenados A("+(h+a)+","+k+") y A'("+(h-a)+","+k+")"+
					"\nLa distancia focal es="+p);
				}
				
			}
		}
			else if(A!=0&&B==0&&C!=0&&F<0&&A<0) { //hiperbola vertical
					if(D==0&&E==0) {
						F=-F;
						System.out.println(F);
						if(F<0) {
							F=-F; A=-A; C=-C;
						}
					h=0;
					k=0;
							a=F/-A;	
							b=F/C;	
						F=F/F;
						System.out.println(a);			//obtenemos los valores de a, b y F
						System.out.println(b);
						System.out.println(F);
						c=Math.sqrt(a+b);
						b=Math.sqrt(b);
						a=Math.sqrt(a);
						p=2*c;							// distancia entre focos
					
					if(p<0) {
						p=-p;  							// cambia el signo de p si es negativo para representarlo correctamente
					}
					
					System.out.println("El origen se encuentra en el par ordenado("+h+","+k+")");
					System.out.println("La ecuacion del eje focal es x="+h);
					System.out.println("La ecuacion del eje secundario es y="+k);
					System.out.println("Los Focos se encuentra en los pares ordenadosF("+0+","+c+") y F'("+0+","+(-c)+")");
					System.out.println("Los vertices se encuentra en los pares ordenadosA("+0+","+b+") y A'("+0+","+(-b)+")");
					System.out.println("La distancia focal es="+p);
					
					r=("La ecuacion es una Hiperbola Vertical"+
					"\nEl origen se encuentra en el par ordenado("+h+","+k+")"+
					"\nLa ecuacion del eje focal es x="+h+
					"\nLa ecuacion del eje secundario es y="+k+
					"\nLos Focos se encuentra en los pares ordenados F("+0+","+c+") y F'("+0+","+(-c)+")"+
					"\nLos vertices se encuentra en los pares ordenados A("+0+","+b+") y A'("+0+","+(-b)+")"+
					"\nLa distancia focal es="+p);
				}
				else {						//hiperbola vertical desplazada
					F=-F;
					System.out.println(F);
					if(F<0) {
						F=-F; A=-A; C=-C; D=-D; E=-E;
					}
					a=A; b=C;
					D=D/A; E=E/C; C=C/C; A=A/A;//el coeficiente de los terminos cuadrados se reduce a 1
					
					h=D/-2;  					// se obtiene el valor del desplazamineto en Y y x
					k=E/-2;
										
					F=F+(a*h*h)+(b*k*k); 					// se suma el valor del tcp completdo
					a=-a;
												
					a=F/a; b=F/b; F=F/F;		//obtenemos los valores de a y b
					c=Math.sqrt(a+b);
					b=Math.sqrt(b);
					a=Math.sqrt(a);
					System.out.println(a);
					System.out.println(b);
					System.out.println(c);
											
					p=2*c;
					if(p<0) {
						p=-p;  // cambia el signo de p si es negativo para representarlo correctamente
					}
					
					System.out.println("El origen se encuentra en el par ordenado("+h+","+k+")");
					System.out.println("La ecuacion del eje focal es x="+h);
					System.out.println("La ecuacion del eje secundario es y="+k);
					System.out.println("Los Focos se encuentra en los pares ordenados F("+h+","+(k+c)+") y F'("+h+","+(k-c)+")");
					System.out.println("Los vertices se encuentra en los pares ordenados A("+h+","+(k+b)+") y A'("+h+","+(k-b)+")");
					System.out.println("La distancia focal es="+p);
					
					r=("La ecuacion es una Hiperbola Vertical"+
					"\nEl origen se encuentra en el par ordenado("+h+","+k+")"+
					"\nLa ecuacion del eje focal es x="+h+
					"\nLa ecuacion del eje secundario es y="+k+
					"\nLos Focos se encuentra en los pares ordenados F("+h+","+(k+c)+") y F'("+h+","+(k-c)+")"+
					"\nLos vertices se encuentra en los pares ordenados A("+h+","+(k+b)+") y A'("+h+","+(k-b)+")"+
					"\nLa distancia focal es="+p);
				}
			}
		
		return r;
		}
}