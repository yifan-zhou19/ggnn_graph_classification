package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[10];
	int[] b = new int[10];
	int i;
	int c;
	float[] d = new float[10];
	float s = 0F;
	float l = 0F;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		c = Integer.parseInt(tempVar);
	}
	for (i = 0;i < c;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < c;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < c;i++)
	{
	if (a[i] >= 90 && a[i] <= 100)
	{
	d[i] = 4.0 * b[i];
	}
	if (a[i] >= 85 && a[i] <= 89)
	{
	d[i] = 3.7 * b[i];
	}
	if (a[i] >= 82 && a[i] <= 84)
	{
	d[i] = 3.3 * b[i];
	}
	if (a[i] >= 78 && a[i] <= 81)
	{
	d[i] = 3.0 * b[i];
	}
	if (a[i] >= 75 && a[i] <= 77)
	{
	d[i] = 2.7 * b[i];
	}
	if (a[i] >= 72 && a[i] <= 74)
	{
	d[i] = 2.3 * b[i];
	}
	if (a[i] >= 68 && a[i] <= 71)
	{
	d[i] = 2.0 * b[i];
	}
	if (a[i] >= 64 && a[i] <= 67)
	{
	d[i] = 1.5 * b[i];
	}
	if (a[i] >= 60 && a[i] <= 63)
	{
	d[i] = 1.0 * b[i];
	}
	if (a[i] <= 60)
	{
	d[i] = 0F;
	}
	s = s + d[i];
	l = l + b[i];
	}
	s = s / l;
	System.out.printf("%.2f\n",s);
	}
}

