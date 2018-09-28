package <missing>;

public class GlobalMembers
{
	public static int s(int a,int b)
	{
		int i;
	i = 0;
	i = (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400;
	if (((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) && b > 2)
	{
		i += 1;
	}
	return i;
	}
	public static int l(int c,int d)
	{
	int i;
	int sum = 0;
	int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	for (i = 0;i <= c - 2;i++)
	{
		sum += a[i];
	}
	sum += d;
	return sum;
	}
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
	int sum;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		y1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m1 = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		d1 = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		y2 = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		m2 = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		d2 = Integer.parseInt(tempVar6);
	}
	sum = s(y2, m2) - s(y1, m1) + l(m2, d2) - l(m1, d1) + 365 * (y2 - y1);
	System.out.printf("%d",sum);
	return 0;
	}
}

