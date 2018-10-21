package <missing>;

public class GlobalMembers
{
	public static float juli(float x1,float y1,float z1,float x2,float y2,float z2)
	{
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2));
	}
	public static int Main()
	{
		int n;
		int u = 0;
		int i;
		int j;
		int t;
		float[] x = new float[10];
		float[] y = new float[10];
		float[] z = new float[10];
		float[] d = new float[50];
		float m;
		int[] a = new int[50];
		int[] b = new int[50];
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
				x[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				z[i] = Float.parseFloat(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[u] = juli(x[i], y[i], z[i], x[j], y[j], z[j]);
				a[u] = i;
				b[u] = j;
				u++;
			}
		}
		for (i = 0;i < u;i++)
		{
			for (j = u - 1;j > i;j--)
			{
				if (d[j] > d[j - 1])
				{
					m = d[j];
					d[j] = d[j - 1];
					d[j - 1] = m;
					t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
					t = b[j];
					b[j] = b[j - 1];
					b[j - 1] = t;
				}
			}
		}
		for (i = 0;i < u;i++)
		{
			System.out.printf("(%.0f,%.0f,%.0f)-(%.0f,%.0f,%.0f)=%.2f\n",x[a[i]],y[a[i]],z[a[i]],x[b[i]],y[b[i]],z[b[i]],d[i]);
		}
		return 0;
	}

}

