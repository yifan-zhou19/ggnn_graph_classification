package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[10][3];
		int i;
		int j;
		int[][] b = new int[100][2];
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i][0]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(a[i][1]) = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(a[i][2]) = Integer.parseInt(tempVar4);
			}
		}
		int k = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				s[k] = Math.sqrt(Math.pow(a[i][0] - a[j][0],2) + Math.pow(a[i][1] - a[j][1],2) + Math.pow(a[i][2] - a[j][2],2));
				b[k][0] = i;
				b[k][1] = j;
				k++;
			}
		}
		for (i = 1; i < k; i++)
		{
			for (j = 0;j < k - i;j++)
			{
				if (s[j] < s[j + 1])
				{
					double t = s[j];
					s[j] = s[j + 1];
					s[j + 1] = t;

					int tt = b[j][0];
					b[j][0] = b[j + 1][0];
					b[j + 1][0] = tt;

					tt = b[j][1];
					b[j][1] = b[j + 1][1];
					b[j + 1][1] = tt;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n", a[b[i][0]][0], a[b[i][0]][1], a[b[i][0]][2], a[b[i][1]][0], a[b[i][1]][1], a[b[i][1]][2], s[i]);
		}

		return 0;
	}
}

