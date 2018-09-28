package <missing>;

public class GlobalMembers
{
	public static int fbnq(int n)
	{
		if (n == 0)
		{
		return 0;
		}
		 if (n == 1)
		 {
	   return 1;
		 }
		 return fbnq(n - 1) + fbnq(n - 2);
	}
	public static int Main()
	{
	  int m;
	  int n;
	  int i;
	  int j;
	  double sum;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (j = 0;j < m;j++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   sum = 0;
	   for (i = 1;i <= n;i++)
	   {
		sum += (double)fbnq(i + 2) / fbnq(i + 1);
	   }
	   System.out.printf("%.3lf\n",sum);
	  }
	   return 0;
	}

}

