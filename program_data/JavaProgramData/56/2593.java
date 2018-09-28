package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	int n;
	int i;
	if (a >= 10000)
	{
		n = 5;
	}
	else if (a >= 1000)
	{
		n = 4;
	}
	else if (a >= 100)
	{
		n = 3;
	}
	else if (a >= 10)
	{
		n = 2;
	}
	else
	{
		n = 1;
	}
	int[] c = new int[5];
	b = a;
	for (i = 1;i <= n;i++)
	{
		c[i] = b % 10;
		b = (b - c[i]) / 10;
	}
	b = 0;
	for (i = 1;i <= n;i++)
	{
		b = b * 10 + c[i];
	}
	System.out.printf("%d",b);
	}
}

