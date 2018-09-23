package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] N = new int[20000];
		int[] M = new int[90];
		for (i = 0;i < n;i++)
		{
			N[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n;j++)
		{
			for (k = 0;k < j;k++)
			{
				if (N[j] == N[k])
				{
					break;
				}
			}
			if (k == j)
			{
				M[t] = N[j];
				t++;
			}
		}
		for (m = 0;m < t - 1;m++)
		{
		System.out.print(M[m]);
		System.out.print(" ");
		}
			System.out.print(M[t - 1]);
			System.out.print("\n");

		return 0;
	}
}

