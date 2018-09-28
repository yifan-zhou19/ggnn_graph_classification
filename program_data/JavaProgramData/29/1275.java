package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int m;

	  int i;
	  int j;

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
		   m = Integer.parseInt(tempVar2);
	   }
	  int a = 2;
	  int b = 1;
	  double sum = 0;
	   for (j = m;j > 0;j--)
	   {
		 sum += 1.0 * a / b;
		 a = a + b;
		 b = a - b;
	   }
	   System.out.printf("%.3lf\n",sum);
	}

	return 0;

	}
}

