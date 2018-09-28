package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float f = int a;
	int n;
	int i;
	int[] a = new int[10];
	int[] b = new int[10];
	float x = 0.00F;
	float y = 0.00F;
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
		x = x + (a[i]) * (f(b[i]));
	y = y + a[i];
	}
	x = x / y;
	System.out.printf("%.2f",x);
	}
	public static float f(int a)
	{
		float z;
	if (101 > a && a > 89)
	{
	z = 4.0F;
	}
	else if (90 > a && a > 84)
	{
	z = 3.7F;
	}
	else if (85 > a && a > 81)
	{
	z = 3.3F;
	}
	else if (82 > a && a > 77)
	{
	z = 3.0F;
	}
	else if (78 > a && a > 74)
	{
	z = 2.7F;
	}
	else if (75 > a && a > 71)
	{
	z = 2.3F;
	}
	else if (72 > a && a > 67)
	{
	z = 2.0F;
	}
	else if (68 > a && a > 63)
	{
	z = 1.5F;
	}
	else if (64 > a && a > 59)
	{
	z = 1.0F;
	}
	else
	{
		z = 0F;
	}
	return (z);
	}
}

