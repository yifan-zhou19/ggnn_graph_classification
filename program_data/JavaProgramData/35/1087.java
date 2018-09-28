package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int e;
		int f;
		int g;
		char c;
		g = 0;
		f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		int[][] a = new int[8][8];
		int i;
		int k;
		for (i = 0;i < m;i++)
		{
			for (k = 0;k < n;k++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					(a[i][k]) = Integer.parseInt(tempVar4);
				}
			}
		}
		int b;
		int d;
		d = 0;
		for (i = 0;i < m;i++)
		{
		b = a[i][0];
		for (k = 0;k < n - 1;k++)
		{
			if (b < a[0][k + 1])
			{
				b = a[0][k + 1];
				d = k + 1;
			}
		}

		for (e = 0;e < m;e++)
		{
			if (b > a[e][d])
			{
				f++;
			}
		}
		if (f == 0)
		{
		System.out.printf("%d+%d\n",i,d);
		break;
		}
		else
		{
		   g++;
		}
		}
		if (g - m == 0)
		{
			System.out.print("No");
		}

		return 0;
	}

}

