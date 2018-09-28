package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[500];
		int i;
		int j;
		int m = 0;
		int[] c = new int[500];
		float s = 0F;
		float[] b = new float[500];
		float t = 0F;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			s += a[i];
		}
		s = s / n;
		for (i = 0;i < n;i++)
		{
			b[i] = (a[i] - s > 0F)?(a[i] - s):(s - a[i]);
			if (t < b[i])
			{
				t = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == t)
			{
				c[m] = a[i];
				m++;
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (c[j] > c[j + 1])
				{
					t = c[j];
					c[j] = c[j + 1];
					c[j + 1] = t;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d%c",c[i],(i == m - 1)?'\n':',');
		}
	}






}

