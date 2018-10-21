package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int[] a = new int[25];
	int[] b = new int[25];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	b[n - 1] = 1;
	for (i = 1;i < n;i++)
	{
	b[i] = 1;
	}
	for (i = n - 2;i >= 0;i--)
	{
	for (j = n - 1;j >= i + 1;j--)
	{
	if (a[i] >= a[j] != 0 && b[j] + 1 >= b[i])
	{
	b[i] = b[j] + 1;
	}
	}
	}
	k = b[0];
	for (i = 1;i < n;i++)
	{
	if (b[i] > k)
	{
	k = b[i];
	}
	}
	System.out.printf("%d",k);
	}
}

