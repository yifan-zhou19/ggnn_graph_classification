package <missing>;

public class GlobalMembers
{
	public static int[] x = new int[100];
	public static int[] y = new int[100];
	public static int[] c = new int[200];
	public static int m;
	public static int n;
	public static void scanf()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int i;
		for (i = 0;i < m - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i] = Integer.parseInt(tempVar3);
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x[m - 1] = Integer.parseInt(tempVar4);
		}

		for (i = 0;i < n - 1;i++)
		{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				y[i] = Integer.parseInt(tempVar5);
			}
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			y[n - 1] = Integer.parseInt(tempVar6);
		}

	}

	public static void order()
	{
		int j;
		int i;
		int b;
		for (j = 0;j < m;j++)
		{
		  for (i = j;i < m;i++)
		  {
		  if (x[j] > x[i])
		  {
			  b = x[j];
			  x[j] = x[i];
			  x[i] = b;
		  }
		  }
		}

		 for (j = 0;j < n;j++)
		 {
		  for (i = j;i < n;i++)
		  {
		  if (y[j] > y[i])
		  {
			  b = y[j];
			  y[j] = y[i];
			  y[i] = b;
		  }
		  }
		 }

	}

	public static void together()
	{
		int s;

		for (s = 0;s < m;s++)
		{
			c[s] = x[s];
		}

		for (s = m;s < m + n;s++)
		{
			c[s] = y[s - m];
		}

	}

	public static void print()
	{
		int i;
		for (i = 0;i < m + n - 1;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[m + n - 1]);
	}

	public static int Main()
	{
		scanf();
		order();
		together();
		print();


	}
}

