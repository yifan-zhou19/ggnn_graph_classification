package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int m;
		int k = 0;
		int sum = 0;
		int result;
		int[] x = new int[10000];
		int[] y = new int[10000];
		int[] z = new int[50000];
		for (i = 0;i < 50000;i++)
		{
		z[i] = 0;
		}
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
			(x[i]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			(y[i]) = Integer.parseInt(tempVar3);
		}
		}
	 for (i = 0;i < n;i++)
	 {
	 for (j = x[i];j < y[i];j++)
	 {
		  z[j] = 1;
	 }
	 }
	 while (k <= n)
	 {
		  for (i = 0;i < n - 1;i++)
		  {
		  m = i + 1;
		  if (x[i] > x[m])
		  {
			  j = x[i];
			  x[i] = x[m];
			  x[m] = j;
		  }
		  }
		 k++;
	 }
		k = 0;
	while (k <= n)
	{
		  for (i = 0;i < n;i++)
		  {
		  m = i + 1;
		  if (y[i] < y[m])
		  {
			  j = y[i];
			  y[i] = y[m];
			  y[m] = j;
		  }
		  }
		 k++;
	}
		result = y[0] - x[0];
	for (i = x[0];i <= y[0];i++)
	{
		sum += z[i];
	}
	 if (result == sum)
	 {
			System.out.printf("%d %d",x[0],y[0]);
	 }
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

