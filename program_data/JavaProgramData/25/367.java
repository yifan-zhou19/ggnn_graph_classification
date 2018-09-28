package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] b = new int[15];
		int t = 100000000;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(1);
		}
		else
		{
		b[0] = 2;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < 15;j++)
			{
				b[j] *= 2;
			}
			for (j = 0;j < 14;j++)
			{
				if (b[j] >= t)
				{
				b[j + 1]++;
				b[j] -= t;
				}
			}
		}
		for (i = 14;b[i] == 0;i--)
		{
			;
		}
		for (j = i;j >= 0;j--)
		{
			if (i != j && b[j] < t / 10)
			{
				System.out.print('0');
			}
			System.out.print(b[j]);
		}
		}
		return 0;
	}
}

