package <missing>;

public class GlobalMembers
{
	public static int N;
	public static double[] X = new double[21003];
	public static double[] Y = new double[20113];
	public static double Ans = 0;
	public static double Max(double X,double Y)
	{
		return X > Y != 0 ? X : Y;
	}
	public static int Main()
	{
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int K = 1;
		for (int I = 1; I <= N; I++)
		{
			X[I] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			Y[I] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int I = 1; I <= N; I++)
		{
			for (int J = I + 1; J <= N; J++)
			{
				Ans = Max(Ans, (X[I] - X[J]) * (X[I] - X[J]) + (Y[I] - Y[J]) * (Y[I] - Y[J]));
			}
		}
		System.out.printf("%.4f\n",Math.sqrt(Ans));
	}
}

