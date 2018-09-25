package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int x1;
	int x2;
	int n;
	int d;
	int n2;
	int s;
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a = 1;
	i = 0;
	while (a != 0)
	{
	i++;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	}
	x1 = i;
	n2 = n * n;
	x2 = i;
	d = 0;
	for (j = i;j <= n2;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a = Integer.parseInt(tempVar3);
	}
	if (a == 255)
	{
		d++;
	}
	if (a == 0)
	{
	x2++;
	x2 = x2 + d;
	d = 0;
	}
	}
	s = ((x2 - x2 % n) / n - (x1 - x1 % n) / n - 1) * (Math.abs(x1 % n - x2 % n) - 1);
	System.out.printf("%ld",s);
	}
}

