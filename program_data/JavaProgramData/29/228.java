package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;

		int f2;
		float b;

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
			   a = Integer.parseInt(tempVar2);
		   }
		   float sum = 0.000F;
		   int f0 = 1;
		   int f1 = 1;
		   for (j = 0;j < a;j++)
		   {
			  f2 = f1 + f0;
			  f0 = f1;
			  f1 = f2;
			  b = (float)f1 / f0;
			  sum += b;
		   }
		   System.out.printf("%.3f\n",sum);
		}
		return 0;
	}
}

