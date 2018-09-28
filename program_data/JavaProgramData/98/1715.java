package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] A = new char[2013][100];
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (int I = 1; I <= N; I++)
		{
			A[I] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		int S = 0;
		for (int I = 1; I <= N; I++)
		{
			if (S == 0)
			{
				System.out.print(A[I]);
				S = String.valueOf(A[I]).length();
			}
			else if (S + String.valueOf(A[I]).length() + 1 <= 80)
			{
					System.out.print(" ");
					System.out.print(A[I]);
					S = S + String.valueOf(A[I]).length() + 1;
			}
				else
				{
					S = 0;
					System.out.print("\n");
					I--;
				}
		}
	}
}

