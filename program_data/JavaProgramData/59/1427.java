package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int M;
		int L = 0;
		int Op;
		int[][] Q = new int[200013][2];
		char[][] C = new char[213][213];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (int I = 1; I <= N; I++)
		{
			for (int J = 1; J <= N; J++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					C[I][J] = tempVar2.charAt(0);
				}
			}
			scanf("\n");
		}
		M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int I = 1; I <= N; I++)
		{
			for (int J = 1; J <= N; J++)
			{
				if (C[I][J] == '@')
				{
					L++;
					Q[L][0] = I;
					Q[L][1] = J;
				}
			}
		}
		Op = 1;
		for (int I = 1; I < M; I++)
		{
			int Cl = L;
			for (int J = Op; J <= Cl; J++)
			{
				int X = Q[J][0];
				int Y = Q[J][1];
				if ((X + 1 <= N) && (C[X + 1][Y] == '.'))
				{
					L++;
					Q[L][0] = X + 1;
					Q[L][1] = Y;
					C[X + 1][Y] = '@';
				}
				if ((X - 1 >= 1) && (C[X - 1][Y] == '.'))
				{
					L++;
					Q[L][0] = X - 1;
					Q[L][1] = Y;
					C[X - 1][Y] = '@';
				}
				if ((Y + 1 <= N) && (C[X][Y + 1] == '.'))
				{
					L++;
					Q[L][0] = X;
					Q[L][1] = Y + 1;
					C[X][Y + 1] = '@';
				}
				if ((Y - 1 >= 1) && (C[X][Y - 1] == '.'))
				{
					L++;
					Q[L][0] = X;
					Q[L][1] = Y - 1;
					C[X][Y - 1] = '@';
				}
			}
			Op = Cl + 1;
		}
		int Ans = 0;
		for (int I = 1; I <= N; I++)
		{
			for (int J = 1; J <= N; J++)
			{
				if (C[I][J] == '@')
				{
					Ans++;
				}
			}
		}
		System.out.print(Ans);
		System.out.print("\n");
	}

}

