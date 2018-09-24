package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int count = 0;
		int fx;
		int fy;
		int lx;
		int ly;
		int start = 0;
		int[][] a = new int[1002][1002];
	//	double e,x,t,sum,a,b,c,d;
	//	scanf("%lf%lf%lf%lf%lf",&a,&b,&c,&d,&e);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (start == 0 && a[i][j] == 0)
				{
					start = 1;
					fx = i;
					fy = j;
				}
				if (a[i][j] == 0)
				{
					lx = i;
					ly = j;
				}

			}
		}

		System.out.printf("%d\n",(fx - lx + 1) * (fy - ly + 1));

		System.in.read();
		System.in.read();
		return 0;
	}
}

