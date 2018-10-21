package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int t;
	int num;
	int a;
	int b;
	int m;
	int max;
	int[][] x = new int[50000][2];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < 2;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[i][j] = Integer.parseInt(tempVar2);
		}
		}
	}
	for (k = 1;k <= n;k++)
	{
		for (t = 0;t < n - k;t++)
		{
			if (x[t][0] > x[t + 1][0])
			{
				a = x[t + 1][0];
				x[t + 1][0] = x[t][0];
				x[t][0] = a;
				b = x[t + 1][1];
				x[t + 1][1] = x[t][1];
				x[t][1] = b;
			}
			if (x[t][0] == x[t + 1][0])
			{
				 if (x[t][1] > x[t + 1][1])
				 {
							  a = x[t + 1][0];
							  x[t + 1][0] = x[t][0];
							  x[t][0] = a;
							  b = x[t + 1][1];
							  x[t + 1][1] = x[t][1];
							  x[t][1] = b;
				 }
			}

		}
	}
	num = 0;
	max = x[0][1];
	for (m = 0;m < n;m++)
	{
		   if (x[m + 1][0] > max)
		   {
			  num++;
			 System.out.print("no");
			 break;
		   }
			if (x[m + 1][1] > max)
			{
			max = x[m + 1][1];
			}
	}
	if (num == 0)
	{
				System.out.printf("%d %d",x[0][0],max);
	}
	  return 0;
	}

}

