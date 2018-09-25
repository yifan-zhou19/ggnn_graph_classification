package <missing>;

public class GlobalMembers
{
	public static int OK(int a, int b)
	{
		return a >= 90 && a <= 140 && b >= 60 && b <= 90;
	}
	public static int max(int[] a, int n)
	{
	int i;
	int max;
	max = a[0];
	for (i = 1;i < n;i++)
	{
	if (max < a[i])
	{
	max = a[i];
	}
	}
	return max;
	}
	public static int n;
	public static int[] high = new int[100];
	public static int[] low = new int[100];
	public static int[] length = new int[100];
	public static int Main()
	{
	int i;
	int t = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 100;i++)
	{
	length[i] = 0;
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		high[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		low[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	if (OK(high[i], low[i]) == 1)
	{
	switch (OK(high[i + 1], low[i + 1]))
	{
	case 1:
		length[t] += 1;
		break;
	case 0:
		length[t++] += 1;
	}
	}
	}
	System.out.printf("%d",max(length, t));
	return 0;
	}
}

