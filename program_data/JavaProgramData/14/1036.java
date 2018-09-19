package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] x;
		int[] y;
		int[] s;
		int[] z;
		int i;
		int j;
		int o = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = new int[n];
		y = new int[n];
		s = new int[n];
		z = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s[i] = Integer.parseInt(tempVar4);
			}
			z[i] = y[i] + s[i];
		}
		for (j = 0;j < 3;j++)
		{
		for (i = 0;i < n - 1;i++)
		{
		 if (z[i] >= z[i + 1])
		 {
		   o = z[i];
		   z[i] = z[i + 1];
		   z[i + 1] = o;
		   t = x[i];
		   x[i] = x[i + 1];
		   x[i + 1] = t;
		 }
		}
		}
		System.out.printf("%d %d\n",x[n - 1],z[n - 1]);
		System.out.printf("%d %d\n",x[n - 2],z[n - 2]);
		System.out.printf("%d %d\n",x[n - 3],z[n - 3]);
	}

}

