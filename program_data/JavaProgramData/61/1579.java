package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		if (a == 1 || a == 2)
		{
		   return 1;
		}
		int b;
		int c;
		int d;
		int k;
		c = 1;
		d = 1;
		for (k = 3;k <= a;k++)
		{
			b = c;
			c = d;
			d = b + c;
		}
		return d;
	}
	public static int Main()
	{
	   int n;
	   int a;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = Integer.parseInt(tempVar2);
		   }
		   System.out.printf("%d\n",f(a));
	   }
	   return 0;
	}

}

