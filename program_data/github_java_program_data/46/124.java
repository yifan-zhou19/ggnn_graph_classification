//problem 34
import java.util.Scanner;

public class Problems {
    public static void main(String args[]) { //the input
        Scanner stdin = new Scanner(System.in);
        System.out.println("enter values: ");
        int indicesCount = Integer.parseInt(stdin.nextLine());
        //double bc they're more precise than floats
        double[] variables = new double[4];

        System.out.print("\n");

        for(int i=0; i<indicesCount; i++){
            String variableLine = stdin.nextLine();
            String[] splitLine = variableLine.split(" ");
            variables[i] = Double.parseDouble(splitLine[i]);

            System.out.print(searchSolution(variables[0], variables[1], variables[2], variables[3]) + " ");
        }

    }
    private static double searchSolution(double a, double b, double c, double d) { //find f(l), f(m), f(r) until solved==true
        double[] parameters = new double[2];
        parameters[0] = 0;
        parameters[1] = 100;

        while(!(solveExpression(a, b, c, (parameters[0]+parameters[1])/2)==d)) {
            //adjust parameters
            parameters[0] = parameterCheck(a, b, c, d, parameters)[0];
            parameters[1] = parameterCheck(a, b, c, d, parameters)[1];
        }

        return (parameters[0]+parameters[1])/2;
    }
    private static double[] parameterCheck(double a, double b, double c, double d, double[] parameters) { //check f(m) against d, change l/r values
        double m = (parameters[0]+parameters[1])/2;
        double tempResult = solveExpression(a, b, c, m);

        if(d<tempResult) {
            parameters[1] = m;
        } else if(d>tempResult) {
            parameters[0] = m;
        }
        return parameters;
    }
    private static double solveExpression(double a, double b, double c, double x) { //solve expression
        return (a*x)+(b*Math.sqrt(x*x*x))-c*Math.exp(-x/50);
    }
}
