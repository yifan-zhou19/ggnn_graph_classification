package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j;
		int p;
		int q;
	int[][] a = new int[10][3];
	double[] b = new double[50];
	double k;
	double m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	   for (j = 0;j < 3;j++)
	   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i][j] = Integer.parseInt(tempVar2);
			   }
	   }
	}
	i = 0;
	  for (p = 0;p < n - 1;p++)
	  {
			for (q = p + 1;q < n;q++)
			{
				  b[i] = 1.0 * Math.sqrt((a[p][0] - a[q][0]) * (a[p][0] - a[q][0]) + (a[p][1] - a[q][1]) * (a[p][1] - a[q][1]) + (a[p][2] - a[q][2]) * (a[p][2] - a[q][2]));
			  i++;
			}
	  }
	int index = i;
	for (j = index - 1;j > 0;j--)
	{
		for (i = 0;i < j;i++)
		{
				if (b[i] > b[i + 1])
				{
					k = b[i];
				 b[i] = b[i + 1];
				 b[i + 1] = k;
				}
		}
	}

	b[n * (n - 1) / 2] = -1;
	for (i = n * (n - 1) / 2;i >= 0;i--)
	{
		if (b[i] != b[i + 1])
		{
		 for (p = 0;p < n;p++)
		 {
				for (q = p + 1;q < n;q++)
				{
					 m = 1.0 * Math.sqrt((a[p][0] - a[q][0]) * (a[p][0] - a[q][0]) + (a[p][1] - a[q][1]) * (a[p][1] - a[q][1]) + (a[p][2] - a[q][2]) * (a[p][2] - a[q][2]));
					if (m == b[i])
					{
						  System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[p][0],a[p][1],a[p][2],a[q][0],a[q][1],a[q][2],m);
					}
				}
		 }
		}
	}
	return 0;
	}

}

