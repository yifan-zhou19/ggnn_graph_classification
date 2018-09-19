package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i = 0;
	   int a;
	   int sum = 0;
	   int m;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   while (i <= n * n)
	   {

		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = Integer.parseInt(tempVar2);
		   }
		   i = i + 1;
	   if (a == 0)
	   {
		   sum = sum + 1;
	   }
	   }
	   m = sum * sum / 16 + 1 - sum / 2;
	   System.out.printf("%d\n",m);
	   return 0;
	}
}

