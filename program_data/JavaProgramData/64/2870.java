package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[][] a = new int[1000][3];
		int n;
		int e;
		int j;
		int k = 0;
		int h;
		double[][] m = new double[3000][3];
		double r;
		double p;
		double q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		h = n * (n - 1) / 2;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][2] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				m[k][0] = i;
				m[k][1] = j;
				m[k][2] = Math.sqrt((double)((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2])));
				k++;
			}
		}
		for (i = 0;i < h;i++)
		{
		  for (k = 0;k < h - 1 - i;k++)
		  {
			if (m[k][2] < m[k + 1][2])
			{
				r = m[k][0];
				m[k][0] = m[k + 1][0];
				m[k + 1][0] = r;
				p = m[k][1];
				m[k][1] = m[k + 1][1];
				m[k + 1][1] = p;
				q = m[k][2];
				m[k][2] = m[k + 1][2];
				m[k + 1][2] = q;
			}
		  }
		}
		for (i = 0;i < h;i++)
		{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[(int)m[i][0]][0],a[(int)m[i][0]][1],a[(int)m[i][0]][2],a[(int)m[i][1]][0],a[(int)m[i][1]][1],a[(int)m[i][1]][2],m[i][2]);
		}
		return 0;
	}

}

