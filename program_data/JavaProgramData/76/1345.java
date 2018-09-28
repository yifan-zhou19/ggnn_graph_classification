package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int[] x = new int[60000];
		int[] y = new int[60000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (b = 1;b <= a;b++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(x[b]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(y[b]) = Integer.parseInt(tempVar3);
			}
		}
		for (e = 1;e < a;e++)
		{
		  for (b = 1;b <= a - e;b++)
		  {
			if (x[b] > x[b + 1])
			{
				c = x[b];
				d = y[b];
				x[b] = x[b + 1];
				y[b] = y[b + 1];
				x[b + 1] = c;
				y[b + 1] = d;
			}
		  }
		}
		for (b = 1;b < a;b++)
		{
		  if (y[b] < x[b + 1])
		  {
		   System.out.print("no");
		   break;
		  }
		else if (b == a - 1)
		{
			  if (y[b] > y[b + 1])
			  {
			  d = y[b];
			 y[b] = y[b + 1];
			 y[b + 1] = d;
			  }
		  System.out.printf("%d %d",x[1],y[a]);
		}
		   else if (y[b] > y[b + 1])
		   {
			  d = y[b];
			 y[b] = y[b + 1];
			 y[b + 1] = d;
		   }
		}
		return 0;
	}


}

