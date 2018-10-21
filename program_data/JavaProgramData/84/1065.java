package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int max;
		int lmax;
		int b;
		int i;
		int[] x = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[0] = Integer.parseInt(tempVar2);
		}
		max = x[0];
		lmax = x[0];
		for (i = 2;i <= n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x[i - 1] = Integer.parseInt(tempVar3);
		}
		b = x[i - 1];
		if (b > max)
		{
			 if (max > lmax)
			 {
			   lmax = max;
			 }
			 max = b;
		}
		else if (b > lmax)
		{
			 lmax = b;
		}
		}
	   System.out.printf("%d\n%d\n",max,lmax);
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  n = Integer.parseInt(tempVar4);
		  }
		  return 0;
	}
}

