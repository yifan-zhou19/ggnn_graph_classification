package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int a;
	   int b;
	   int c;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1,a = 0,b = 0;i <= n;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   c = Integer.parseInt(tempVar2);
	   }
	   if (c > a)
	   {
		  b = a,a = c;
	   }
	   else if (c > b)
	   {
		  b = c;
	   }
	   }
	   System.out.printf("%d\n", a);
	   System.out.printf("%d", b);
	   return 0;
	}


}

