package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int k;
	int i;
	int j;
	int a;
	int b;
	int c;
	int d;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	b = 1;
	c = 1;
	for (j = 1;j <= n;j++)
	{
		b = b * (n - 1);
	 c = c * n;
	}
	for (i = n - 1;;i++)
	{
		a = i;
	d = a + (n - 1) * k;
	if (d % b == 0)
	{
		break;
	}
	}
	m = d / b * c - k * (n - 1);
	System.out.printf("%d",m);

	}

}

