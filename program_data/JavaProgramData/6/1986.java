package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int ii;
		int jj;
		int l;
		int t;
	int[] s = new int[10002];
	int[] k = s;
	int sum = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		jj = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= jj;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
	   t = m * n;
	   for (ii = 1;ii <= t;ii++)
	   {
			 k = k + 1;
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   k = Integer.parseInt(tempVar4);
	   }
		   if (ii <= n != 0 || ii>(m - 1) * n || ii % n == 1 || ii % n == 0)
		   {
			   sum = sum + k[0];
		   }
	   }
	   System.out.printf("%d\n",sum);
	   sum = 0;
	   k = s;

	}
	return 0;
	}

}

