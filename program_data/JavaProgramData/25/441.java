package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int t;
		int[] sum = new int[100];
		sum[99] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 99;j >= 0;j--)
			{
			t = sum[j] * 2 + k;
			if (t < 10)
			{
				sum[j] = t;
				k = 0;
			}
			else
			{
				sum[j] = t - 10;
				k = 1;
			}
			}
		}
		for (i = 0;sum[i] == 0;i++)
		{
			;
		}
		for (j = i;j <= 99;j++)
		{
			System.out.print(sum[j]);
		}
		System.out.print("\n");
		return 0;
	}

}

