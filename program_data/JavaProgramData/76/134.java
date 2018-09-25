package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[50000][2];
		int[][] b = new int[50000][2];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i][0] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 a[i][1] = Integer.parseInt(tempVar3);
		 }
		}
		int min;
		int max;
		int p;
		int q;
		for (q = 1;q <= n;q++)
		{
			for (i = 0;i < (n - q);i++)
			{
			if (a[i][1] > a[i + 1][1])
			{
				p = a[i + 1][1];
				a[i + 1][1] = a[i][1];
				a[i][1] = p;
			}
			}
		}
			max = a[n - 1][1];
		int e;
		int f;
		int s;
		for (f = 1;f <= n;f++)
		{
			for (i = 0;i < (n - f);i++)
			{
			if (a[i][0] > a[i + 1][0])
			{
				e = a[i + 1][0];
				a[i + 1][0] = a[i][0];
				a[i][0] = e;
			}
			}
		}
			min = a[0][0];
		for (s = 1;s <= n;s++)
		{
			for (i = 0;i < n - s;i++)
			{
			if (a[i][0] > a[i + 1][0])
			{
				e = a[i + 1][0];
				f = a[i + 1][1];
				a[i + 1][0] = a[i][0];
				a[i + 1][1] = a[i][1];

				a[i][0] = e;
				a[i][1] = f;
			}
			}
		}
		int t;
		for (i = 0;i < n;i++)
		{
						  if ((a[0][1]) >= (a[i + 1][0]) && (a[i + 1][1]) > (a[0][1]))
						  {
							a[0][1] = a[i + 1][1];
							continue;
						  }
						 if ((a[0][0] == min) && (a[0][1] == max))
						 {
											  System.out.printf("%d %d",min,max);
											break;
						 }
		}
		 if (a[i][1] == max)
		 {
		 i = 1;
		 }
		 else
		 {
		 System.out.print("no");
		 }
		return 0;
	}
}

