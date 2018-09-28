package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int p;
		int q;
		int max;
		int m;
		int n;
		int h;
		int l;
		for (i = 0;i <= 4;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				a[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][2] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i][3] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				a[i][4] = Integer.parseInt(tempVar5);
			}
		}
		n = 0;
		for (p = 0;p <= 4;p++)
		{
			max = a[p][0];
			for (j = 1;j <= 4;j++)
			{
				if (max <= a[p][j])
				{
				max = a[p][j];
				}
			}
			for (j = 0;j <= 4;j++)
			{
				if (a[p][j] == max)
				{
				break;
				}
			}
			m = 0;
			for (q = 0;q <= 4;q++)
			{
				if (a[p][j] <= a[q][j])
				{
				m++;
				}
			}
			if (m == 5)
			{
				h = p + 1;
				l = j + 1;
				System.out.printf("%d %d %d\n",h,l,a[p][j]);
				n++;
			}
		}
		if (n == 0)
		{
		System.out.print("not found\n");
		}
		return 0;
	}

}

