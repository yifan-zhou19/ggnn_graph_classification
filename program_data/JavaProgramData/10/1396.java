package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int s;
		int d;
		int max = 0;
		int m = 1;
	int[] a = new int[26];
	int[] b = new int[26];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= k;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	b[k] = 1;
	for (i = k - 1;i > 0;i--)
	{
	for (j = i + 1;j <= k;j++)
	{
	if (a[i] >= a[j] != 0 && b[j] > max)
	{
	max = b[j];
	}
	}
	b[i] = max + 1;
	max = 0;
	}
	for (d = 1;d <= k;d++)
	{
	if (b[d] >= m)
	{
		m = b[d];
	}
	}
	System.out.printf("%d",m);
	}


}

