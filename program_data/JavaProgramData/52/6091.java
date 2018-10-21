package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] A = new int[100];
		int[] B = new int[100];
		for (int i = 0;i < n - m;++i)
		{
			A[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < m;++i)
		{
			B[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < m;++i)
		{
			System.out.print(B[i]);
			System.out.print(" ");
		}
		for (int i = 0;i < n - m;++i)
		{
			if (i == n - m - 1)
			{
				System.out.print(A[i]);
			}
			else
			{
				System.out.print(A[i]);
				System.out.print(" ");
			}
		}
		return 0;
	}

}

