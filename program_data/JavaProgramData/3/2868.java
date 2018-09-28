package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int[] a = new int[1010];
	int s;
	int i;
	int u = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (i = 0;i <= n - 1;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		s = Integer.parseInt(tempVar3);
	}
	if (s < k)
	{
	a[u] = s;
	u++;
	}
	}
	for (i = u - 1;i >= 1;i--)
	{
	for (s = 0;s <= i - 1;s++)
	{
	if (a[s] == k - a[i])
	{
	System.out.print("yes\n");
	return 0;
	}
	}
	}
	System.out.print("no\n");
	return 0;
	}
}

