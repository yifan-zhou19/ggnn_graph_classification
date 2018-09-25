package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[11];
	int[] b = new int[11];
	int n;
	int i;
	int m = 0;
	float[] c = new float[11];
	float g;
	float d = 0F;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 1;i <= n;i++)
	{
	if (b[i] <= 100 && b[i] >= 90)
	{
	c[i] = 4.0F;
	}
	if (b[i] <= 89 && b[i] >= 85)
	{
	c[i] = 3.7F;
	}
	if (b[i] <= 84 && b[i] >= 82)
	{
	c[i] = 3.3F;
	}
	if (b[i] <= 81 && b[i] >= 78)
	{
	c[i] = 3.0F;
	}
	if (b[i] <= 77 && b[i] >= 75)
	{
	c[i] = 2.7F;
	}
	if (b[i] <= 74 && b[i] >= 72)
	{
	c[i] = 2.3F;
	}
	if (b[i] <= 71 && b[i] >= 68)
	{
	c[i] = 2.0F;
	}
	if (b[i] <= 67 && b[i] >= 64)
	{
	c[i] = 1.5F;
	}
	if (b[i] <= 63 && b[i] >= 60)
	{
	c[i] = 1.0F;
	}
	if (b[i] < 60)
	{
	c[i] = 0.0F;
	}

	}
	for (i = 1;i <= n;i++)
	{
	c[i] = c[i] * a[i];
	}
	for (i = 1;i <= n;i++)
	{
	d = d + c[i];
	m = m + a[i];
	}
	g = d / m;
	System.out.printf("%.2f",g);

	return 0;
	}
}

