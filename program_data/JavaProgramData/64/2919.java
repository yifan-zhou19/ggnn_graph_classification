package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] d = new int[n][3];
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					d[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		int c = n * (n - 1) / 2;
		double[] len = new double[c];
		for (int i = 0;i < c;i++)
		{
			len[i] = 0;
		}
		int b = 0;
		int[] o = new int[c];
		int[] p = new int[c];
		int[] q = new int[c];
		int[] r = new int[c];
		int[] s = new int[c];
		int[] t = new int[c];
		for (int i = 0;i < (n - 1);i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				double tmp = 0;
				tmp = 1.0 * Math.sqrt((d[i][0] - d[j][0]) * (d[i][0] - d[j][0]) + (d[i][1] - d[j][1]) * (d[i][1] - d[j][1]) + (d[i][2] - d[j][2]) * (d[i][2] - d[j][2]));
				len[b] = tmp;
				o[b] = d[i][0];
				p[b] = d[i][1];
				q[b] = d[i][2];
				r[b] = d[j][0];
				s[b] = d[j][1];
				t[b] = d[j][2];
				b = b + 1;
			}
		}
		for (int i = 0;i < c;i++)
		{
			for (int j = c - 1;j > i;j--)
			{
				if (len[j] > len[j - 1])
				{
					double tmp = 0;
					tmp = len[j - 1];
					len[j - 1] = len[j];
					len[j] = tmp;
					int y = 0;
					y = o[j - 1];
					o[j - 1] = o[j];
					o[j] = y;
					y = 0;
					y = p[j - 1];
					p[j - 1] = p[j];
					p[j] = y;
					y = 0;
					y = q[j - 1];
					q[j - 1] = q[j];
					q[j] = y;
					y = 0;
					y = r[j - 1];
					r[j - 1] = r[j];
					r[j] = y;
					y = 0;
					y = s[j - 1];
					s[j - 1] = s[j];
					s[j] = y;
					y = 0;
					y = t[j - 1];
					t[j - 1] = t[j];
					t[j] = y;
				}
			}
		}
		for (int i = 0;i < c;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",o[i], p[i], q[i], r[i], s[i], t[i], len[i]);
		}
		return 0;
	}



}

