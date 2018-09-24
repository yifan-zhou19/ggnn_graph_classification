package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int[] A = new int[2013];
	public static int[] Ans = new int[1222];
	public static char[][] W = new char[2013][28];
	public static double Max(double X,double Y)
	{
		return X > Y != 0 ? X : Y;
	}
	public static int Main()
	{
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int I = 1; I <= N; I++)
		{
			A[I] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			W[I] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (int I = 1; I <= N; I++)
		{
			int L = String.valueOf(W[I]).length();
			for (int J = 0; J < L; J++)
			{
				Ans[W[I][J]]++;
			}
		}
		int Max = 0;
		int T;
		for (int I = 65; I <= 'Z'; I++)
		{
			if (Ans[I] > Max)
			{
				Max = Ans[I];
				T = I;
			}
		}
		System.out.printf("%c\n%d\n",T,Max);
		for (int I = 1; I <= N; I++)
		{
			int L = String.valueOf(W[I]).length();
			for (int J = 0; J < L; J++)
			{
				if (W[I][J] == T)
				{
					System.out.print(A[I]);
					System.out.print("\n");
				}
			}
		}
	}
}

