package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int num = 0;
	int k = 0;
	int n;
	int i;
	int j;
	int[] a = new int[50];
	int max = 0;
	int[] f = new int[50];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 1;i <= n;i++)
	{
	for (j = 1;j <= i;j++)
	{
	if (a[i] <= a[j] != 0 && f[i] < f[j])
	{
	f[i] = f[j];
	}
	}
	f[i]++;
	if (max < f[i])
	{
	max = f[i];
	}
	}
	System.out.printf("%d",max);
	return 0;
	}
}

