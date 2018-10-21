package <missing>;

public class GlobalMembers
{
	public static int fun(int m, int n, int j)
	{
		int i;
		int s = 0;
	if (n == 1)
	{
		return m >= j;
	}
	for (i = j;i < m;i++)
	{
		s += fun(m - i, n - 1, i);
	}
	return s;
	}
	public static int Main()
	{
		int a;
		int n;
		int m;
	int[] s = new int[20];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < a;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	if (n > m)
	{
		n = m;
	}
	s[i] = fun(m, n, 0);
	}
	for (int i = 0;i < a;i++)
	{
	System.out.printf("%d\n",s[i]);
	}
	}
}

