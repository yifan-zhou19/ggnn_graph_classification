package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0)
			{
				break;
			}

			int[] a = new int[301];
			int[] b = new int[301];
			int i;
			int j;
			int r;
			for (i = 1;i <= n;i++)
			{
				a[i] = b[i] = i;
			}
			for (i = 1;i <= n - 1;i++)
			{
				r = m % (n + 1 - i);
				if (r != 0)
				{
					for (j = 1;j <= n - i;j++)
					{
						if (j != n + 1 - i - r)
						{
							a[j] = b[(j + r) % (n + 1 - i)];
						}
						else
						{
							a[j] = b[n + 1 - i];
						}
					}
					for (j = 1;j <= n - i;j++)
					{
						b[j] = a[j];
					}
				}
			}

			System.out.printf("%d\n",a[1]);
		} while (n != 0);

		return 0;
	}
}

