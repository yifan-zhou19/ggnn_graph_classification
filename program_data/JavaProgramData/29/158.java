package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int a;
		if (n == 1)
		{
			a = 1;
		}
		if (n == 2)
		{
			a = 2;
		}
		if (n > 2)
		{
			a = f(n - 1) + f(n - 2);
		}
		return a;
	}

	public static int Main()
	{
	   int m;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < m;i++)
	   {
		   int l;
		   int j;
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   l = Integer.parseInt(tempVar2);
		   }
		   float sum = 0F;
		   for (j = 2;j <= l + 1;j++)
		   {
			   sum += (float)f(j) / (float)f(j - 1);
		   }
		   System.out.printf("%.3f\n",sum);
	   }
	   return 0;
	}

}

