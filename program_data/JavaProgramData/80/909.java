package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[13][32];
		int[] b = new int[373];
		int i;
		int j;
		int k;
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int q;
		int x1;
		int x2;
		int q1;
		int q2;
		int fuhao;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		for (i = 1;i < 13;i++)
		{
			for (j = 1;j < 32;j++)
			{
				a[i][j] = 1;
			}
		}
		a[2][29] = 0;
		a[2][30] = 0;
		a[2][31] = 0;
		a[4][31] = 0;
		a[6][31] = 0;
		a[9][31] = 0;
		a[11][31] = 0;
		for (i = 1,k = 1;i < 13;i++)
		{
			for (j = 1;j < 32;j++)
			{
				b[k] = a[i][j];
				k = k + 1;
			}
		}
		x1 = (m1 - 1) * 31 + d1;
		x2 = (m2 - 1) * 31 + d2;
		fuhao = 1;
		if (x1 > x2)
		{
			fuhao = x1;
			x1 = x2;
			x2 = fuhao;
			fuhao = -1;
		}
		for (q = 0,k = x1;k < x2;k++)
		{
			q = (q + b[k]);
		}
		q = 365 * (y2 - y1) + q * fuhao;

		for (i = y1 + 1,q1 = 0;i < y2;i++)
		{
			if (i % 4 == 0 && i % 100 != 0)
			{
				q1 = q1 + 1;
			}
			if (i % 400 == 0)
			{
				q1 = q1 + 1;
			}
		}
		if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
		{
			if (m1 == 1)
			{
				q1 = q1 + 1;
			}
			if (m1 == 2 && d1 <= 29)
			{
				q1 = q1 + 1;
			}
		}
		if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
		{
			if (m2 >= 3)
			{
				q1 = q1 + 1;
			}
			if (m2 == 2 && d2 == 29)
			{
				q1 = q1 + 1;
			}
		}
		q = q + q1;
		System.out.printf("%d",q);
		return 0;





	}
}

