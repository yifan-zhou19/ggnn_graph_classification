package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int n;
		int i;
		int j;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 1;
		if (n == 0)
		{
			System.out.print("1");
			 System.exit(0);
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 0; j < 100;j++)
			{
				a[j] = a[j] * 2;
			}
			for (j = 0; j < 100; j++)
			{
				if (a[j] > 9)
				{
					a[j + 1] += a[j] / 10;
					a[j] = a[j] % 10;
				}
			}
		}
		for (i = 99; i >= 0; i--)
		{
			if (flag == 0)
			{
				if (a[i] != 0)
				{
					flag = 1;
					System.out.print(a[i]);
				}
			}
			else
			{
				System.out.print(a[i]);
			}
		}
		return 0;
	}


}

