package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int m1;
		int m2;
		int n;
		int i;
		int j;
		int que;
		int f;
		String ch = new String(new char[50]);
		float[] b = new float[41];
		float[] g = new float[41];
		float height;
		float temp;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m1 = -1;
		m2 = -1;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ch = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				height = Float.parseFloat(tempVar3);
			}
			if (ch.charAt(0) == 'm')
			{
				m1++;
				b[m1] = height;
			}
			else
			{
				m2++;
				g[m2] = height;
			}
		}

		for (i = 0;i < m1;i++)
		{
			f = i;
			for (j = i + 1;j <= m1;j++)
			{
				if (b[f] > b[j])
				{
					f = j;
				}
			}
			if (f != i)
			{
				temp = b[i];
				b[i] = b[f];
				b[f] = temp;
			}
		}

		for (i = 0;i < m2;i++)
		{
			f = i;
			for (j = i + 1;j <= m2;j++)
			{
				if (g[f] < g[j])
				{
					f = j;
				}
			}
			if (f != i)
			{
				temp = g[i];
				g[i] = g[f];
				g[f] = temp;
			}
		}

		System.out.printf("%.2f",b[0]);
		for (i = 1;i <= m1;i++)
		{
			System.out.printf(" %.2f",b[i]);
		}
		for (i = 0;i <= m2;i++)
		{
			System.out.printf(" %.2f",g[i]);
		}

		return 0;
	}
}

