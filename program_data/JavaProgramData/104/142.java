package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int i;
		int k;
		int j;
		int n = 0;
		int m = 0;
		int[] a = new int[10];
		int[] b = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		if (x % 2 == 0)
		{
			a[0] = x;
			for (i = 1;a[i - 1] != 1;i++)
			{
				if (a[i - 1] % 2 == 0)
				{
					a[i] = a[i - 1] / 2;
				}
				else
				{
					a[i] = (a[i - 1] - 1) / 2;
				}
				n++;
			}
		}
		else
		{
			a[0] = x;
			  for (i = 1;a[i - 1] != 1;i++)
			  {
				if (a[i - 1] % 2 == 0)
				{
					a[i] = a[i - 1] / 2;
				}
				else
				{
					a[i] = (a[i - 1] - 1) / 2;
				}
				n++;
			  }
		}
		if (y % 2 == 0)
		{
			b[0] = y;
			for (i = 1;b[i - 1] != 1;i++)
			{
				if (b[i - 1] % 2 == 0)
				{
					b[i] = b[i - 1] / 2;
				}
				else
				{
					b[i] = (b[i - 1] - 1) / 2;
				}
				m++;
			}
		}
		else
		{
			b[0] = y;
			  for (i = 1;b[i - 1] != 1;i++)
			  {
				if (b[i - 1] % 2 == 0)
				{
					b[i] = b[i - 1] / 2;
				}
				else
				{
					b[i] = (b[i - 1] - 1) / 2;
				}
				m++;
			  }
		}


		for (j = 0;j <= n;j++)
		{
			for (k = 0;k <= m;k++)
			{
				if (a[j] == b[k])
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto label;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		 label:
		System.out.printf("%d\n",b[k]);

	}

}

