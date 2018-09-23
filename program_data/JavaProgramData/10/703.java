package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int k;
	int m;
	int i;
	int j;
	int t;
	int[] a = new int[26];
	int[] b = new int[26];
	int[] c = new int[26];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0; i < k; i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	b[0] = 1;
	for (i = 1; i < k; i++)
	{
	for (j = 0; j < i; j++)
	{
	if (a[i] <= a[j])
	{
	c[j] = b[j] + 1;
	}
	else
	{
	c[j] = 1;
	}
	for (m = j; m > 0; m--)
	{
	if (c[m] >= c[m - 1])
	{
	t = c[m - 1];
	c[m - 1] = c[m];
	c[m] = t;
	}
	}
	b[i] = c[0];
	}
	}

	for (i = k - 1; i > 0; i--)
	{
	if (b[i] >= b[i - 1])
	{
	t = b[i - 1];
	b[i - 1] = b[i];
	b[i] = t;
	}
	}
	System.out.printf("%d",b[0]);
	}


}

