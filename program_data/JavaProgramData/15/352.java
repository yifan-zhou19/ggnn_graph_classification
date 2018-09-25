package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int d1;
		int d2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		/*for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				scanf("%d",&a[i][j]);
		}*/

		int sx = 0;
		int sy;
		int tx;
		int ty;
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d1 = Integer.parseInt(tempVar2);
			}
			for (j = 1; j < n; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					d2 = Integer.parseInt(tempVar3);
				}
				if ((d1 == 0) && (d2 == 0))
				{
					if (sx == 0)
					{
						sx = i;
						sy = j;
					}
					tx = i;
					ty = j + 1;
				}
				d1 = d2;
			}
		}

		System.out.printf("%ld", (int)(ty - sy - 1) * (int)(tx - sx - 1));

		return 0;
	}


}

