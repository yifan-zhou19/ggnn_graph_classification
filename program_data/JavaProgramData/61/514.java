package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int[] A = new int[20];
		A[0] = 1;
		A[1] = 1;
		for (i = 2;i < 20;i++)
		{
			A[i] = A[i - 1] + A[i - 2];
		}

		int j;
		int a;
		for (j = 0;j < N;j++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a >= 1 && a <= 20)
			{
			  System.out.print(A[a - 1]);
			  System.out.print("\n");
			}

		}

		return 0;
	}
}

