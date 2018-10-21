package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] b = new int[100];
	float[] d = new float[100];
	float s = 0F;
	float[] a = new float[100];
	float c = 0F;
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
			a[i] = Float.parseFloat(tempVar2);
		}
	}
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	}
	for (i = 0;i < n;i++)
	{
		if (b[i] <= 100 && b[i] >= 90)
		{
			d[i] = (float)(4.0 * a[i]);
		}
	else if (b[i] <= 89 && b[i] >= 85)
	{
		d[i] = (float)(3.7 * a[i]);
	}
	else if (b[i] <= 84 && b[i] >= 82)
	{
		d[i] = (float)(3.3 * a[i]);
	}
	else if (b[i] <= 81 && b[i] >= 78)
	{
		d[i] = (float)(3.0 * a[i]);
	}
	else if (b[i] <= 77 && b[i] >= 75)
	{
		d[i] = (float)(2.7 * a[i]);
	}
	else if (b[i] <= 74 && b[i] >= 72)
	{
		d[i] = (float)(2.3 * a[i]);
	}
	else if (b[i] <= 71 && b[i] >= 68)
	{
		d[i] = (float)(2.0 * a[i]);
	}
	else if (b[i] <= 67 && b[i] >= 64)
	{
		d[i] = (float)(1.5 * a[i]);
	}
	else if (b[i] <= 63 && b[i] >= 60)
	{
		d[i] = (float)(1.0 * a[i]);
	}
	else if (b[i] < 60)
	{
		d[i] = 0F;
	}
	}
	for (i = 0;i < n;i++)
	{
		s = (float)(s + d[i]);
		c = (float)(c + a[i]);
	}
	s = (float)(s / c);
	System.out.printf("%.2f",s);
	}
}

