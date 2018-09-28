package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int m = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int sum = 0;
		int s = 0;
		int[] a = new int[1000000];
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
			s = 0;
				if (a[i] == m)
				{
					for (k = 1;k < 1000;k++)
					{
						s++;
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
		System.in.read();
		System.in.read();
		return 0;
	}

}

