package <missing>;

public class GlobalMembers
{
	public static int f(int[] a, int k, int m)
	{
	int ans = 1;
	int tag = 1;
	int i;
	if (m < k - 1)
	{
		for (i = m + 1;i < k;i++)
		{
	if (a[i] <= a[m] != 0 && tag <= f(a, k, i))
	{
	ans = 1 + f(a, k, i);
	tag = f(a, k, i);
	}
		}
	}
	return ans;
	}
	public static int Main()
	{
	int[] a = new int[25];
	int k;
	int i;
	int max;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a + i = tempVar2;
	}
	}
	max = f(a, k, 0);
	for (i = 1;i < k;i++)
	{
	if (f(a, k, i) > max)
	{
	max = f(a, k, i);
	}
	}
	System.out.printf("%d",max);
	return 0;
	}
}

