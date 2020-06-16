package util;

public class Conversao {
	public static double IOF =0.06;
	
	public static double conv(double dolar,double tax) {
		return dolar*tax*(1+IOF);
	}
}
