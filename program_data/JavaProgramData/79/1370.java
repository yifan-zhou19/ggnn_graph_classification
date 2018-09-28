package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[N];
		int i;
		int j;
		int r;
		int t;

		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}

			if (n == 0)
			{
				break;
			}

			for (i = 1;i <= n;i++)
			{
				a[i] = i;
			}

			for (r = 0;r < n - 1;r++)
			{
				if (r == 0)
				{
					i = 0;
				}
				else
				{
					i--;
				}

				for (j = 1;j <= m;j++)
				{
					if (i == n - r)
					{
						i = 1;
					}
					else
					{
						i++;
					}
				}

				//printf("%d %d\n",i,a[i]);

				for (j = i;j < n - r;j++)
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}

			}

			System.out.printf("%d\n",a[1]);
		}

		return 0;
	}
}

