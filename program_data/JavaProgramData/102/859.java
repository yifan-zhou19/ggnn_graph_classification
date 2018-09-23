package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[45][10];
		float[] b = new float[45];
		float[] f = new float[45];
		float[] m = new float[45];
		float e;
		int n;
		int k;
		int i;
		int x = 0;
		int y = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
			if (a[i][0] == 'm')
			{
				m[y] = b[i];
				y++;
			}
			if (a[i][0] == 'f')
			{
				f[x] = b[i];
				x++;
			}
		}
		for (k = 1;k <= y;k++)
		{
			for (i = 0;i < y - k;i++)
			{
				if (m[i] > m[i + 1])
				{
					e = m[i + 1];
					m[i + 1] = m[i];
					m[i] = e;
				}
			}
		}
		for (i = 0;i < y;i++)
		{
			System.out.printf("%.2f ",m[i]);
		}
		for (k = 1;k <= x;k++)
		{
			for (i = 0;i < x - k;i++)
			{
				if (f[i] < f[i + 1])
				{
					e = f[i + 1];
					f[i + 1] = f[i];
					f[i] = e;
				}
			}
		}
		for (i = 0;i < x - 1;i++)
		{
			System.out.printf("%.2f ",f[i]);
		}
		System.out.printf("%.2f",f[x - 1]);
		return 0;
	}
}

