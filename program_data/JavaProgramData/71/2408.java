package <missing>;

public class GlobalMembers
{
	public static int day(int y,int m)
	{
	int i;
	int x = 0;
	int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	if (y % 4 == 0 && y % 100 != 0)
	{
	mon[1] = 29;
	}
	else if (y % 400 == 0)
	{
	mon[1] = 29;
	}
	else
	{
	mon[1] = 28;
	}
	for (i = 0;i < m - 1;i++)
	{
			x += mon[i];
	}
	return x;
	}
	public static int Main()
	{
	int a;
	int b;
	int c;
	int[] s = new int[1000];
	int p = 0;
	int q = 0;
	int n;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 0;j < n;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		c = Integer.parseInt(tempVar4);
	}
			p = day(a, b);
			q = day(a, c);
	s[j] = (q - p) % 7;
	}
	for (j = 0;j < n;j++)
	{
	if (s[j] == 0)
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

