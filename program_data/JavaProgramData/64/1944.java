package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][3];
		int i;
		int j;
		int k;
		int n;
		int t = 0;
		int[] b = new int[45];
		int[] c = new int[45];
		int q;
		int m;
		float[] d = new float[45];
		float p;
		float s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][j] = Integer.parseInt(tempVar2);
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = i + 1;k < n;k++)
			{
				s = (a[i][0] - a[k][0]) * (a[i][0] - a[k][0]) + (a[i][1] - a[k][1]) * (a[i][1] - a[k][1]) + (a[i][2] - a[k][2]) * (a[i][2] - a[k][2]);
				d[t] = Math.sqrt(s);
				b[t] = i;
				c[t] = k;
				t++;
			}
		}
		for (i = t - 1;i > 0;i--)
		{
			for (j = t - 1;j > t - i - 1;j--)
			{
					if (d[j] > d[j - 1])
					{
					p = d[j];
					d[j] = d[j - 1];
					d[j - 1] = p;
					q = b[j];
					b[j] = b[j - 1];
					b[j - 1] = q;
					q = c[j];
					c[j] = c[j - 1];
					c[j - 1] = q;
					}
				else
				{
					;
				}
			}
		}
		for (m = 0;m < t;m++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a[b[m]][0],a[b[m]][1],a[b[m]][2],a[c[m]][0],a[c[m]][1],a[c[m]][2],d[m]);
		}


		return 0;
	}
}

