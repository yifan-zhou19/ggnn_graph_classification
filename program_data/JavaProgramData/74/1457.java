package <missing>;

public class GlobalMembers
{
	public static int ss(int x)
	{
		int i;
	for (i = 2;i < x;i++)
	{
		if (x % i == 0)
		{
			return (0);
		}
	}
	return (1);
	}
	public static int hw(int y)
	{
		int i = 0;
		int[] a = new int[6];
	while (y != 0)
	{
			a[i] = y % 10;
		i++;
		y = y / 10;
	}
	y = i;
	for (i = 0;i < y;i++)
	{
			if (a[i] != a[y - 1 - i])
			{
		return (0);
			}
	}
	return (1);
	}
	public static void Main()
	{
		int i;
		int j = 0;
		int m;
		int n;
		int[] a = new int[1001];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = m;i <= n;i++)
	{
			if (ss(i) * hw(i) != 0)
			{
			a[j] = i;
		j++;
			}
	}
	if (a[0] == 0)
	{
		System.out.print("no");
	}
	else
	{
	for (i = 0;i < j - 1;i++)
	{
		System.out.printf("%d,",a[i]);
	}
	System.out.printf("%d",a[j - 1]);
	}
	}
}

