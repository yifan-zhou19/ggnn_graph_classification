package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[80000];
		int[] b = new int[80000];
		int n;
		int i;
		int j;
		int k;
		int[] c = new int[80000];
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			c[i] = i;
		}
		for (i = 0; ;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == 0 && b[i] == 0)
			{
				break;
			}
		}
		for (j = 0;j < i;j++)
		{
			c[a[j]] = -1;
		}
		for (j = 0;j < n;j++)
		{
			if (c[j] != -1)
			{
				int num = 0;
				for (k = 0;k < i;k++)
				{
					if (b[k] == j)
					{
						num++;
					}
				}
				if (num == n - 1)
				{
					System.out.print(j);
					System.out.print("\n");
					flag = 1;
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

