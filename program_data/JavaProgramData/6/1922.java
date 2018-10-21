package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int jvzhen = 0;
	   int n;
	   int i;
	   int a;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
	   {
		   a = jvzhen();
		   System.out.printf("%d\n",a);
	   }



	return 0;
	}
	public static int jvzhen()
	{
		int m;
		int n;
		int i;
		int j;
		int sum;
		sum = 0;
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
		int[][] b = new int[100][100];
		for (i = 1;i <= m;i++)
		{
		  for (j = 1;j <= n;j++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  *(b + i) + j = tempVar3;
			  }
		  }
		}

		for (i = 1;i <= n;i++)
		{
			sum = sum + *(*(b + 1) + i);
		}
		if (m > 1)
		{
			for (i = 1;i <= n;i++)
			{
			sum = sum + *(*(b + m) + i);
			}
		}
		if (m > 2)
		{
			for (j = 2;j < m;j++)
			{
			sum = sum + *(*(b + j) + 1) + *(*(b + j) + n);
			}
		}
		return (sum);
	}

}

