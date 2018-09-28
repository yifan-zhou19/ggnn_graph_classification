package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int M;
		double[] A = new double[2013];
		double S;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int I = 1; I <= N; I++)
		{
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int J = 1; J <= M; J++)
			{
				A[J] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			double[] P = A;
			S = 0;
			for (int J = 1; J <= M; J++)
			{
				S += P[J];
			}
			S /= M;
			double Ans = 0;
			for (int J = 1; J <= M; J++)
			{
				Ans = Ans + (P[J] - S) * (P[J] - S);
			}
			System.out.printf("%.5lf\n",Math.sqrt(Ans / M));
		}
	}
}

