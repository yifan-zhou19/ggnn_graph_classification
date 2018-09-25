package <missing>;

public class GlobalMembers
{
	public static int num = 0;
	public static int sol(int M,int N)
	{
		 if (N == 1 || M == 0 || M == 1)
		 {
			 return 1;
		 }
		 else if (M >= N)
		 {
			 return sol(M, N - 1) + sol(M - N, N);
		 }
		 else
		 {
			 return sol(M, N - 1);
		 }
	}
	public static int Main()
	{
		 int t;
		 int i;
		 int M;
		 int N;
		 t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 1;i <= t;i++)
		 {
			 M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 System.out.print(sol(M, N));
			 System.out.print("\n");
		 }
		 return 0;
	}

}

