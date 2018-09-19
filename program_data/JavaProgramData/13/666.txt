package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t = 1;
		int sum;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] x = new int[20000];
		int[] y = new int[20000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[i] = Integer.parseInt(tempVar2);
			}
		}
		x[0] = y[0];
		int k = 0;
		for (i = 1;i < n;i++)
		{
			sum = 1;
			for (j = 0;j <= k;j++)
			{
				sum = sum * (y[i] - x[j]);
			}
			if (sum != 0)
			{
				x[k + 1] = y[i];
				k++;
			}
		}
			 System.out.printf("%d",x[0]);
		for (i = 1;i <= k;i++)
		{
			System.out.printf(" %d",x[i]);
		}
		System.out.print("\n");
		return 0;
	}


}

