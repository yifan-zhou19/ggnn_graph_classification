package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int N;
	int i;
	int j;
	int a;
	int num;
	int[] x = new int[500];
	int[] y = new int[500];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	for (i = 0;i < N;i++)
	{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   x[i] = Integer.parseInt(tempVar2);
		   }
	}
	for (j = 0;j < N;j++)
	{
	   for (int k = 0;k < N - j;k++)
	   {
			   if (x[k] > x[k + 1])
			   {
				a = x[k + 1];
				x[k + 1] = x[k];
				x[k] = a;
			   }
	   }
	}
	for (int t = 0;t < N;t++)
	{
		if (x[t] % 2 == 1)
		{
					   num = 0;
		   for (int m = 0;m < t;m++)
		   {
			   if (x[m] % 2 == 1)
			   {
					num++;
			   }
		   }
			if (num == 0)
			{
			System.out.printf("%d",x[t]);
			}
		  else
		  {
			   System.out.printf(",%d",x[t]);
		  }
		}
	}
	 return 0;
	}
}

