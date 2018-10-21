package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int max;
	int i;
	int j;
	int k;
	int n;
	int m;
	int[] a = new int[100];
	int[] f = new int[100];
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
	f[n] = 1;
	max = 1;
	for (i = n - 1;i >= 1;i--)
	{
	k = 0;
	for (j = i + 1;j <= n;j++)
	{
	if (a[j] <= a[i])
	{
		k = (f[j] > k)?f[j]:k;
	}
	}
	k++;
	f[i] = k;
	max = (max > f[i])?max:f[i];
	}
	System.out.printf("%d",max);
	}

}

