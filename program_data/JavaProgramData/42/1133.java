package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i = 1;
		int j = 1;
		int k = 1;
		int sum = 0;
		int[] a = new int[200000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (a[i] == m)
			{
				sum++;
			}
		}
		for (i = 1;i <= n;i++)
		{
				if (a[i] == m)
				{
					for (k = 1;k < 1000;k++)
					{
						if (a[i + k] != m)
						{
							break;
						}
					}
					for (j = i;j <= n - k;j++)
					{
										 a[j] = a[j + k];
					}
				}
		}
		for (i = 1;i <= n - sum - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - sum]);
		return 0;
	}


}

