package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int y;
	int m1;
	int m2;
	int b;
	int t;
	int s;
	int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		b = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		y = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m1 = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		m2 = Integer.parseInt(tempVar4);
	}
	if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
	{
		b = 1;
	}
	if (m1 > m2)
	{
		t = m1;
	m1 = m2;
	m2 = t;
	}
	s = 0;
	for (j = m1;j <= m2 - 1;j++)
	{
		s += a[j];
	if (j == 2 && b == 1)
	{
		s++;
	}
	}
	if (s % 7 == 0)
	{
		System.out.print("YES\n");
	}
	else
	{
		System.out.print("NO\n");
	}
	}
	return 0;
	}
}

