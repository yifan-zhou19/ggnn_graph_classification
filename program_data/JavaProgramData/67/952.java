package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int j;
		int k;
		int i;
		double c;
		double d;
		double e;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		c = b * 1.0 / a;
		for (i = 0;i < n - 1;i++)
		{
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  j = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  k = Integer.parseInt(tempVar5);
		  }
		  d = k * 1.0 / j;
		  e = d - c;
		  if (e > 0.05)
		  {
			System.out.print("better\n");
		  }
		  else if (e < -0.05)
		  {
			 System.out.print("worse\n");
		  }
		  else if (e >= -0.05 && e <= 0.05)
		  {
			 System.out.print("same\n");
		  }
		}
	  return 0;
	}
}

