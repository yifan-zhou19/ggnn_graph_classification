package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int[] a = new int[123];
	int[] c = new int[123];
	int i;
	int j;
	int k;
	int l;
	float[] b = new float[123];
	float o;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	i = 0;
	l = 0;
	while (i < m)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		l = l + a[i];
		i++;
	}
	j = 0;
	while (j < m)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c[j] = Integer.parseInt(tempVar3);
	}
	if (c[j] >= 90 && c[j] <= 100)
	{
		b[j] = 4.0F;
	}
	else if (c[j] <= 89 && c[j] >= 85)
	{
		b[j] = 3.7F;
	}
	else if (c[j] <= 84 && c[j] >= 82)
	{
		b[j] = 3.3F;
	}
	else if (c[j] <= 81 && c[j] >= 78)
	{
		b[j] = 3.0F;
	}
	else if (c[j] <= 77 && c[j] >= 75)
	{
		b[j] = 2.7F;
	}
	else if (c[j] <= 74 && c[j] >= 72)
	{
		b[j] = 2.3F;
	}
	else if (c[j] <= 71 && c[j] >= 68)
	{
		b[j] = 2.0F;
	}
	else if (c[j] <= 67 && c[j] >= 64)
	{
		b[j] = 1.5F;
	}
	else if (c[j] <= 63 && c[j] >= 60)
	{
		b[j] = 1.0F;
	}
	else
	{
		b[j] = 0F;
	}
	j++;
	}
	o = 0F;
	k = 0;
	while (k < m)
	{
	o = o + a[k] * b[k];
	k++;
	}
	o = o / l;
	System.out.printf("%.2f",o);
	return 0;
	}
}

