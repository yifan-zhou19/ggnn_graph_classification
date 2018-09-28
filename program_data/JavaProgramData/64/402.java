package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x1 = 0;
		int x2 = 0;
		int q = 0;
		int w1;
		int w2;
		int w3;
		int w4;
		int w5;
		int w6;
		int t;
		int k;
		int m = 1;
		int p = 1;
		int l = 0;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] a = new int[10][3];
		int[] c = new int[1000];
		int[] d = new int[1000];
		int[] e = new int[1000];
		int[] c1 = new int[1000];
		int[] d1 = new int[1000];
		int[] e1 = new int[1000];
		int[] c2 = new int[1000];
		float[] b = new float[1000];
		float x;
		float y;
		for (int i1 = 0;i1 <= n - 1;i1++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i1][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i1][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i1][2] = Integer.parseInt(tempVar4);
			}
		}
		for (x1 = 0;x1 <= n - 2;x1++)
		{
			for (x2 = x1 + 1;x2 <= n - 1;x2++)
			{
				  b[q] = Math.sqrt((float)((a[x2][0] - a[x1][0]) * (a[x2][0] - a[x1][0]) + (a[x2][1] - a[x1][1]) * (a[x2][1] - a[x1][1]) + (a[x2][2] - a[x1][2]) * (a[x2][2] - a[x1][2])));
				  c[q] = a[x1][0];
				  d[q] = a[x1][1];
				  e[q] = a[x1][2];
				  c1[q] = a[x2][0];
				  d1[q] = a[x2][1];
				  e1[q] = a[x2][2];

				  q++;
			}
		}
		for (i = q - 1;i >= 1;i--)
		{
			for (j = i - 1;j >= 0;j--)
			{
				if (b[i] >= b[j])
				{
					x = b[i];
					b[i] = b[j];
					b[j] = x;
					w1 = c[i];
					w2 = d[i];
					w3 = e[i];
					w4 = c1[i];
					w5 = d1[i];
					w6 = e1[i];
					c[i] = c[j];
					d[i] = d[j];
					e[i] = e[j];
					c1[i] = c1[j];
					d1[i] = d1[j];
					e1[i] = e1[j];
					c[j] = w1;
					d[j] = w2;
					e[j] = w3;
					c1[j] = w4;
					d1[j] = w5;
					e1[j] = w6;

				}
			}
		}
		for (int h = 0;h <= q - 1;h++)
		{
			if (b[h] != b[h + 1])
			{
				c2[p] = h;
				p++;
			}
		}
		for (int h1 = 999;h1 >= 0;h1--)
		{
			if (c2[h1] > 0)
			{
				g = h1;
				break;
			}
		}
		if (g < 1)
		{
			g = 1;
		}
		c2[0] = -1;
		for (int x4 = 0;x4 <= g - 1;x4++)
		{
			for (int x5 = c2[x4] + 1;x5 <= c2[x4 + 1];x5++)
			{
				k = c2[x4] + 1 + c2[x4 + 1] - x5;
				System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",c[k],d[k],e[k],c1[k],d1[k],e1[k],b[k]);
			}
		}


		return 0;
	}
}

