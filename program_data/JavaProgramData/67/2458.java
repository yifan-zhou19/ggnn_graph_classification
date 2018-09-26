package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  double a;
	  double b;
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
		  a = Double.parseDouble(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b = Double.parseDouble(tempVar3);
	  }
	  while (--n != 0)
	  {
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			y = Double.parseDouble(tempVar5);
		}
		if (b / a - y / x > 0.05)
		{
			System.out.print("worse\n");
		}
		else if (b / a - y / x < -0.05)
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

