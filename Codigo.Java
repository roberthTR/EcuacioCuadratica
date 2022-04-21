import javax.swing.JOptionPane;

public class Cuadratica
{
    int a=0;
    int b=0;
    int c=0;

    public Cuadratica()
        {
            a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Valor de A: "));
            b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Valor de B: "));
            c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Valor de C: "));
            double determinante=Math.pow(b,2)-(4*a*c);

            if(determinante>0)
            {
              
                double x1=((b*(-1))+Math.sqrt(determinante))/(2*a);
                double x2= ((b*(-1))-Math.sqrt(determinante))/(2*a);
                System.out.println("El valor de x1= "+x1+" y el valor x2="+x2);
            }
            else System.out.println("El determinante es negativo y no se puede Completar el Operador");
        }
    public static void main(String[] args)
{
    new Cuadratica();
}

}
