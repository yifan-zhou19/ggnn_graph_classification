package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int g;
		int h;
		int p;
		int q;
		float[] a = new float[40];
		float[] m = new float[40];
		float[] f = new float[40];
		float e;
		String s = new String(new char[7]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		g = 0;
		h = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Float.parseFloat(tempVar3);
			}
			if (s.charAt(0) == 'm')
			{
				m[g] = a[i];
				g++;
			}
			else
			{
				f[h] = a[i];
				h++;
			}
		}

		for (j = 1;j <= g;j++)
		{
			for (k = 0;k < g - j;k++)
			{
				if (m[k] > m[k + 1])
				{
					e = m[k + 1];
					m[k + 1] = m[k];
					m[k] = e;
				}
			}
		}

		for (p = 1;p <= h;p++)
		{
			for (q = 0;q < h - p;q++)
			{
				if (f[q] < f[q + 1])
				{
					e = f[q + 1];
					f[q + 1] = f[q];
					f[q] = e;
				}
			}
		}

		for (j = 0;j < g;j++)
		{
			System.out.printf("%.2f ",m[j]);
		}
		for (q = 0;q < h;q++)
		{
			if (q != h - 1)
			{
				System.out.printf("%.2f ",f[q]);
			}
			else
			{
				System.out.printf("%.2f",f[q]);
			}
		}

		return 0;
	}
}

