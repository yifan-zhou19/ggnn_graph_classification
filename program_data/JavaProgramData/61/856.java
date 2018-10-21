package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
	   if (a == 1 || a == 2)
	   {
		   return 1;
	   }
	   return f(a - 1) + f(a - 2);
	}
	public static int Main()
	{
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  System.out.print("\n");
	  int i;
	  for (i = 0;i < n;i++)
	  {
		 int a;
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a = Integer.parseInt(tempVar2);
		 }
		 System.out.printf("%d\n",f(a));
		 System.out.print("\n");
	  }
	}

}

