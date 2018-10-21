package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int outnum = 0;
		int m = 1;
		int n;
		int i;
		int[] a = new int[300];

		while (m != 0)
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
				if (m == 0)
				{
					break;
				}
				else
				{
					for (i = 0;i < 300;i++)
					{
						a[i] = 0;
					}
				outnum = 0;
				c = 0;
				while (outnum < n - 1)
				{
			for (i = 0;i <= n - 1;i++)
			{
				if (a[i] == 0)
				{
						c++;
				if (c == m)
				{
					a[i] = 1;
					outnum++;
					c = 0;
				}
				}
			}
				}
		for (i = 0;i <= n;i++)
		{
			if (a[i] == 0)
			{
				if (m == 1)
				{
					System.out.printf("%d\n",i);
				}
				else
				{
					System.out.printf("%d\n",i + 1);
				}
				break;
			}
		}
				}
		}

		return 0;
	}
}

