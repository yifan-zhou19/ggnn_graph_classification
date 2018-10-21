package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int a;
		int b;
		int sum;
		int[] sz = new int[300];
		for (i = 0;;i++)
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
			if (n == 0 && m == 0)
			{
				break;
			}
			else
			{
				sum = 0;
				for (j = 0;j < n;j++)
				{
					sz[j] = j + 1;
				}
				for (a = 0,b = 1;sum != n - 1;)
				{
					if (b == m)
					{
						sz[a] = 0;
						sum++;
						b = 0;
					}
					if (a != n - 1)
					{
						a++;
					}
					else
					{
						a = 0;
					}
					if (b != m && sz[a] != 0)
					{
						b++;
					}
				}
				for (a = 0;a < n;a++)
				{
					if (sz[a] != 0)
					{
						System.out.printf("%d\n",sz[a]);
					}
				}
			}
		}
		return 0;
	}

}

