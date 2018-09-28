package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
	   if (n == 1)
	   {
		  return 1;
	   }
	   else if (n == 2)
	   {
		  return 1;
	   }
	   else if (n > 2)
	   {
		  return (f(n - 1) + f(n - 2));
	   }
	}
	public static int Main()
	{
	   int m;
	   int a;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   while (m-- != 0)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = Integer.parseInt(tempVar2);
		  }
		  System.out.printf("%d\n",f(a));
	   }

	}

}

