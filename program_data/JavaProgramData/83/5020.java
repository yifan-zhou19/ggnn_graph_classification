package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[10];
	int[] b = new int[10];
	int n;
	int i;
	int j;
	float s;
	float[] c = new float[10];
	float s1 = 0.0F;
	float s2 = 0.0F;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n - 1;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	i = n - 1;
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		b[i] = Integer.parseInt(tempVar4);
	}
	}
	for (i = 0;i < n;i++)
	{
	if (b[i] > 89)
	{
	c[i] = 4.0 * a[i];
	}
	else if (b[i] > 84)
	{
	c[i] = 3.7 * a[i];
	}
	else if (b[i] > 81)
	{
	c[i] = 3.3 * a[i];
	}
	else if (b[i] > 77)
	{
	c[i] = 3.0 * a[i];
	}
	else if (b[i] > 74)
	{
	c[i] = 2.7 * a[i];
	}
	else if (b[i] > 71)
	{
	c[i] = 2.3 * a[i];
	}
	else if (b[i] > 67)
	{
	c[i] = 2.0 * a[i];
	}
	else if (b[i] > 63)
	{
	c[i] = 1.5 * a[i];
	}
	else if (b[i] > 60)
	{
	c[i] = 1.0 * a[i];
	}
	else
	{
		c[i] = 0.0F;
	}
	}
	for (i = 0;i < n;i++)
	{
	s1 = s1 + a[i];
	s2 = s2 + c[i];
	}
	s = s2 / s1;
	System.out.printf("%.2f",s);
	return 0;
	}








}

