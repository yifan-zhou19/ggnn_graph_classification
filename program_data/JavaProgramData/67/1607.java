package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int b;
	  int c;
	  int i;
	  int n;
	  int j;
	  int m;
	  double x;
	  double y;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  b = Integer.parseInt(tempVar3);
	  }
	  x = 1.0 * b / a;
	  for (i = 1;i <= n - 1;i++)
	  {
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   c = Integer.parseInt(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ");
	   if (tempVar5 != null)
	   {
		   j = Integer.parseInt(tempVar5);
	   }
	   y = 1.0 * j / c;
	   if (x - y >= 0.05)
	   {
		   System.out.print("worse\n");
	   }
	   else if (y - x >= 0.05)
	   {
		   System.out.print("better\n");
	   }
	   else
	   {
		   System.out.print("same\n");
	   }
	  }
	   return 0;
	}
}

