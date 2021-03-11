package unidade5;

public class Calculadorav2 {

	public static void main(String[] args) {

		Calculadorav2 objeto = new Calculadorav2();
		IMath somar = (a,b) -> a+b;
	    IMath subtrair = (a,b) -> a-b;
		IMath multiplicar = (a,b) -> a*b;
		IMath dividir = (a,b) -> a/b;
		IMath exponeciacao = (a,b) -> Math.pow(a,b);
		IMath radiciacao = (a,b) ->  Math.pow(a,1/b);

		/*******CHAMADA DAS EXPRESSÕES LAMBDAS**************/
	System.out.println(objeto.execOperacao(5, 3, somar));
	System.out.println(objeto.execOperacao(5, 1, subtrair));
	System.out.println(objeto.execOperacao(5, 3, multiplicar));
	System.out.println(objeto.execOperacao(5, 3, dividir));
	System.out.println(objeto.execOperacao(5, 3, exponeciacao));
	System.out.println(objeto.execOperacao(5, 3, radiciacao));

	}
    public double execOperacao(double a, double b, IMath op)
    {
    	return op.operacao(a, b);
    }
}
