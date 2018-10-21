package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8]; //m b is hang, n c is lie.
		int m;
		int n;
		int b;
		int c;
		int p = 0;
		int q = 0;
		int o;
		int temp;
		int r = 0; //ji shu
		int s = 0;
		int t = 0;
		int hang;
		int lie;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (b = 0;b <= m - 1;b++)
		{
			for (c = 0;c <= n - 2;c++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[b][c] = Integer.parseInt(tempVar3);
				}
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[b][n - 1] = Integer.parseInt(tempVar4);
			}
		} //du ru shu zu
		for (p = 0;p <= m - 1;p++)
		{
			temp = a[p][0];
			for (q = 0;q <= n - 2;q++)
			{
				if (temp <= a[p][q + 1])
				{
					temp = a[p][q + 1];
					r = q + 1;
				}
			}
			for (o = 0;o <= m - 1;o++)
			{
				if (a[p][r] <= a[o][r])
				{
					s++;
				}
			}
			if (s == m)
			{
				t++;
				hang = p,lie = r;
			}
			r = 0,s = 0;
		}
		if (t == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d+%d",hang,lie);
		}
		return 0;
	}


}

