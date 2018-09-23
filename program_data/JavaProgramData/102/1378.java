package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void sx(float p[],int n);
		void jx(float p[],int n);
		float[] f = new float[45];
		float[] m = new float[45];
		float[] w = new float[45];
		char[][] a = new char[45][10];
		int n;
		int i;
		int j = 0;
		int k = 0;
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
			a[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			w[i] = Float.parseFloat(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][0] == 'm')
			{
				m[j] = w[i];
				j++;
			}
			if (a[i][0] == 'f')
			{
				f[k] = w[i];
				k++;
			}
		}
		sx(m, j);
		jx(f, k);
		for (i = 0;i < j;i++)
		{
		System.out.printf("%.2f ",m[i]);
		}
		for (i = 0;i < k - 1;i++)
		{
		System.out.printf("%.2f ",f[i]);
		}
		System.out.printf("%.2f",f[k - 1]);

	}
	public static void sx(float[] p, int n)
	{
		int i;
		int j;
		float t;
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < i;j++)
		{
		if (p[i] < p[j])
		{
			t = p[i];
			p[i] = p[j];
			p[j] = t;
		}
		}
		}
	}
	public static void jx(float[] p, int n)
	{
		int i;
		int j;
		float t;
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < i;j++)
		{
		if (p[i] > p[j])
		{
			t = p[i];
			p[i] = p[j];
			p[j] = t;
		}
		}
		}
	}
}

