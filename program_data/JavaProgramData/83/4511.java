package <missing>;

public class GlobalMembers
{
	public static float suan(int[] a, int[] b, int n, float d)
	{
		double[] c = new double[10];
		int i = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] < 60)
			{
				c[i] = 0;
			}
			else if (b[i] < 64)
			{
				c[i] = 1.0 * a[i];
			}
			else if (b[i] < 68)
			{
				c[i] = 1.5 * a[i];
			}
			else if (b[i] < 72)
			{
				c[i] = 2.0 * a[i];
			}
			else if (b[i] < 75)
			{
				c[i] = 2.3 * a[i];
			}
			else if (b[i] < 78)
			{
				c[i] = 2.7 * a[i];
			}
			else if (b[i] < 82)
			{
				c[i] = 3.0 * a[i];
			}
			else if (b[i] < 85)
			{
				c[i] = 3,3 * a[i];
			}
			else if (b[i] < 90)
			{
				c[i] = 3.7 * a[i];
			}
			else
			{
				c[i] = 4.0 * a[i];
			}
		}
		float e = 0F;
		for (i = 0;i < n;i++)
		{
			e = e + a[i];
		}
		for (i = 0;i < n;i++)
		{
			d = d + c[i];
		}
		d = d / e;
		return d;
	}
	public static int Main()
	{
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[j] = Integer.parseInt(tempVar3);
			}
		}
		float GPA = 0F;
		GPA = suan(a, b, n, GPA);
		System.out.printf("%.2f",GPA);
		return 0;
	}
}

