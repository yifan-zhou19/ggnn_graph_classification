package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int i;
		int[] a = new int[100000];
		int k;
		int x;
		int b = 0;
		int m = 0;
		int c = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = 0;
		for (k = 3;k < n + 1;k++)
		{
			b = 0;
			for (i = 2;i < k;i++)
			{
				if (k % i == 0)
				{
					b++;
				}
			}
			if (b == 0)
			{
				a[m] = k;
					 m++;
			}
		}


		for (j = 0;j < m - 1;j++)
		{
	if (a[j + 1] - a[j] == 2)
	{
	System.out.printf("%d %d\n",a[j],a[j + 1]);
	c++;
	}
		}
	if (c == 0)
	{
		System.out.print("empty\n");
	}



		return 0;
	}
}

