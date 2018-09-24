package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[3];
		int n;
		int c;
		int b;
		int d;
		int[] g = new int[3];
		int i;
		int temp;

		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < 3; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			g[i] = d;
			a[i] = b + c;
		}

		for (i = 0; i < 3 - 1; i++)
		{
			for (j = 0; j < 3 - 1 - i; j++)
			{
				if (a[j] < a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					temp = g[j];
					g[j] = g[j + 1];
					g[j + 1] = temp;
				}
			}
		}

		for (i = 3;i < n;i++)
		{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				d = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				b = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				c = Integer.parseInt(tempVar7);
			}
			temp = b + c;


			if (temp <= a[2])
			{
				continue;
			}
			else
			{
				if (a[1] >= temp)
				{
					a[2] = temp;
				g[2] = d;
				}
				else
				{
					a[2] = a[1];
					g[2] = g[1];
					if (a[0] >= temp)
					{
						a[1] = temp;
						g[1] = d;
					}
					else
					{
						a[1] = a[0];
						g[1] = g[0];
							a[0] = temp;
							g[0] = d;
					}
				}
			}
		}

				System.out.printf("%d %d\n%d %d\n%d %d\n",g[0],a[0],g[1],a[1],g[2],a[2]);
	}
}

