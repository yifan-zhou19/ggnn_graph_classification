package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int s = 0;
		int[] a = new int[9];
		int[] b = new int[9];
		float[] c = new float[9];
		float[] d = new float[9];
		float t = 0F;
		float m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (b[i] < 60)
			{
				c[i] = 0F;
			}
			if (b[i] >= 60 && b[i] < 64)
			{
				c[i] = 1.0F;
			}
			if (b[i] >= 64 && b[i] < 68)
			{
				c[i] = 1.5F;
			}
			if (b[i] >= 68 && b[i] < 72)
			{
				c[i] = 2.0F;
			}
			if (b[i] >= 72 && b[i] < 75)
			{
				c[i] = 2.3F;
			}
			if (b[i] >= 75 && b[i] < 78)
			{
				c[i] = 2.7F;
			}
			if (b[i] >= 78 && b[i] < 82)
			{
				c[i] = 3.0F;
			}
			if (b[i] >= 82 && b[i] < 85)
			{
				c[i] = 3.3F;
			}
			if (b[i] >= 85 && b[i] < 90)
			{
				c[i] = 3.7F;
			}
			if (b[i] >= 90)
			{
				c[i] = 4F;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			d[i] = a[i] * c[i];
			t = t + d[i];
			s = s + a[i];
		}
		m = t / s;
		System.out.printf("%.2f",m);
	}
}

