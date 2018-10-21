package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int N; //????
		int a;
		int[] b = new int[501];
		int[] c = new int[501];
		int j = 0;
		int i;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= N;i++) //????
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= N;i++) //??????
		{
			if (b[i] % 2 != 0)
			{
				j++;
				c[j] = b[i];
			}

		}
		int t = 0;
		for (i = 1;i <= j;i++) //????
		{
			for (int m = 1;m <= j - 1;m++)
			{
				if (c[m] > c[m + 1])
				{
					t = c[m];
					c[m] = c[m + 1];
					c[m + 1] = t;
				}
			}
		}
			for (i = 1;i <= j;i++) //??
			{
				if (i == 1)
				{
					System.out.print(c[1]);
				}
				else
				{
					System.out.print(",");
					System.out.print(c[i]);
				}
			}
			return 0; //??
	}
}

