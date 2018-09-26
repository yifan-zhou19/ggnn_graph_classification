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
		int a;
		int b;
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
		double x = (double)b / a;
		for (int i = 1;i < n;i++)
		{
		  int c;
		  int d;

		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  c = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  d = Integer.parseInt(tempVar5);
		  }
		  double y = (double)d / c;
		  if ((y - x) > 0.05)
		  {
		  System.out.print("better\n");
		  }
		  if ((x - y) > 0.05)
		  {
		  System.out.print("worse\n");
		  }
		  if (Math.abs(y - x) <= 0.05)
		  {
		  System.out.print("same\n");
		  }
		}
		System.in.read();
		System.in.read();
	}


}

