package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] x = new int[10];
	int[] y = new int[10];
	int[] z = new int[10];
	int q = 0;
	int[] a = new int[100];
	int[] b = new int[100];
	int[] c = new int[100];
	int[] d = new int[100];
	int[] e = new int[100];
	int[] f = new int[100];
	float t;
	float[] m = new float[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int h = 0;h < n;h++)
	{

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[h] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y[h] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			z[h] = Integer.parseInt(tempVar4);
		}
	}
	for (int i = 0;i < n;i++)
	{
		for (int u = i + 1;u < n;u++)
		{
		m[q] = (float)Math.sqrt((x[i] - x[u]) * (x[i] - x[u]) + (y[i] - y[u]) * (y[i] - y[u]) + (z[i] - z[u]) * (z[i] - z[u]));
		a[q] = x[i];
		b[q] = y[i];
		c[q] = z[i];
		d[q] = x[u];
		e[q] = y[u];
		f[q] = z[u];
		q++;
		}
	}

	for (int r = 0;r < q;r++)
	{
		for (int k = 0;k < q - r;k++)
		{
			if (m[k] < m[k + 1])
			{
			t = m[k + 1];
			m[k + 1] = m[k];
			m[k] = t;
			t = a[k + 1];
			a[k + 1] = a[k];
			a[k] = t;
			t = b[k + 1];
			b[k + 1] = b[k];
			b[k] = t;
			t = c[k + 1];
			c[k + 1] = c[k];
			c[k] = t;
			t = d[k + 1];
			d[k + 1] = d[k];
			d[k] = t;
			t = e[k + 1];
			e[k + 1] = e[k];
			e[k] = t;
			t = f[k + 1];
			f[k + 1] = f[k];
			f[k] = t;


			}
		}
	}
	for (int w = 0;w < q;w++)
	{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a[w],b[w],c[w],d[w],e[w],f[w],m[w]);
	}
	return 0;
	}
}

