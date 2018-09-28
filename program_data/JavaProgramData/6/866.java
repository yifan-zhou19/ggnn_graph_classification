package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int i;
	  int t;
	  int j;
	  int sum;
	  int m;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  t = Integer.parseInt(tempVar);
	  }
	  for (j = 0;j < t;j++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   n = Integer.parseInt(tempVar3);
	   }
	   sum = 0;
	   for (i = 1;i <= m * n;i++)
	   {
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a = Integer.parseInt(tempVar4);
		}
		if ((i <= n) || (i>(m * n - n)) || (i % n == 1) || (i % n == 0))
		{
			sum += a;
		}
	   }
	   System.out.printf("%d\n",sum);
	  }
	   return 0;
	}
}

