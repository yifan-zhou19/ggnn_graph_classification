package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int a;
		int c;
		int b;
		int d;
		int n;
		int m;
		int i;
		int[] x = new int[1000];
		int[] y = new int[1000];
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
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n - m;i++)
		{
			y[i + m] = x[i];
		}

		for (i = n - m + 1;i <= n;i++)
		{
			y[i - n + m] = x[i];
		}
		for (i = 1;i <= n;i++)
		{
			if (i == 1)
			{
				System.out.printf("%d",y[i]);
			}
			else
			{
				System.out.printf(" %d",y[i]);
			}
		}



	}

}

