package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int i;
	  int x;
	  int y;
	  double a;
	  double b;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  x = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  y = Integer.parseInt(tempVar3);
	  }
		a = 1.0 * y / x;
	  for (i = 2;i <= n;i++)
	  {
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			y = Integer.parseInt(tempVar5);
		}
		b = 1.0 * y / x;
		  if ((a - b) > 0.05)
		  {
			System.out.print("worse\n");
		  }
		  else if ((b - a) > 0.05)
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

