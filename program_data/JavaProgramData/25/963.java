package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		a[0] = 1;
		int i;
		int j;
		for (i = 1;i <= n; i++)
		{
			for (j = 0;j <= 99;j++)
			{
				a[j] = a[j] * 2;
			}
			for (j = 0; j <= 99;j++)
			{
				if (a[j] >= 10)
				{
					a[j + 1] = a[j + 1] + (a[j] - a[j] % 10) / 10;
					a[j] = a[j] % 10;
				}
			}
		}
		for (i = 99; i >= 0;i--)
		{
			if (a[i] != 0 || flag != 0)
			{
				flag = 1;
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

