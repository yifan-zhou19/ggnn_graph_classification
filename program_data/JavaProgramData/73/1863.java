package <missing>;

public class GlobalMembers
{
	public static int max(int A,int B,int C,int D,int E)
	{
	if (A > B && A > C && A > D && A > E)
	{
		return A;
	}
	else if (B > A && B > C && B > D && B > E)
	{
		return B;
	}
	else if (C > A && C > B && C > D && C > E)
	{
		return C;
	}
	else if (D > A && D > B && D > C && D > E)
	{
		return D;
	}
	else
	{
		return E;
	}

	}
	public static int min(int L,int M,int N,int O,int P)
	{
	if (L < M && L < N && L < O && L < P)
	{
		return L;
	}
	else if (M < L && M < N && M < O && M < P)
	{
		return M;
	}
	else if (N < L && N < M && N < O && N < P)
	{
		return N;
	}
	else if (O < M && O < N && O < L && O < P)
	{
		return O;
	}
	else
	{
		return P;
	}
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k = 0;
		for (i = 0;i < 5;i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][3] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][4] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] == max(a[i][0], a[i][1], a[i][2], a[i][3], a[i][4]) && a[i][j] == min(a[0][j], a[1][j], a[2][j], a[3][j], a[4][j]))
				{
			System.out.print(i + 1);
			System.out.print(' ');
			System.out.print(j + 1);
			System.out.print(' ');
			System.out.print(a[i][j]);
			System.out.print("\n");
			k++;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

