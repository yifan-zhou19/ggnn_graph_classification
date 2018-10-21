package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int i;
		int b;
		double[] a = new double[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
		a[0] = 1.0 * y / x;
		a[0] = a[0] * 100;
		for (i = 1;i < n;i++)
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
		  a[i] = 1.0 * y / x;
		  a[i] = a[i] * 100;
		  b = (int)(a[i] - a[0]);
		  if (b >= 5)
		  {
			  System.out.print("better\n");
		  }
		  else if (b <= -5)
		  {
			  System.out.print("worse\n");
		  }
			   else
			   {
			  System.out.print("same\n");
			   }




		}










		return 0;
	}
}

