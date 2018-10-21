package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int x;
		int y;
		int max;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[26];
	int[] b = new int[26];
	for (i = n - 1;i >= 0;i--)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	b[0] = 1;
	i = 0;
	while (i <= n - 1)
	{
		j = 0;
	x = 0;
	while (j < i)
	{
		if (a[j] <= a[i])
		{
	if (b[j] >= x)
	{
	x = b[j];
	}
		}
	j++;
	}
	b[i] = x + 1;
	i++;
	}
	max = 1;
	for (i = 0;i <= n - 1;i++)
	{
	if (b[i] >= max)
	{
	max = b[i];
	}
	}
	System.out.printf("%d",max);
	}
}

