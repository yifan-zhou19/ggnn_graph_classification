package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n = 1;
	int[] a = new int[300];
	int i = 1;
	int j;
	int k = 1;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[0] = Integer.parseInt(tempVar);
	}
	while (scanf(",%d", a[i]))
	{
		n++;
	i++;
	}
	if (n == 1)
	{
		System.out.print("No");
	}
	else
	{
		for (i = 0;i < n - 1;i++)
		{
	for (j = i + 1;j < n;j++)
	{
	if (a[i] < a[j])
	{
		t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	}
		}
	for (k = 1;k <= n - 1;)
	{
		if (a[k] != a[0])
		{
			System.out.printf("%d",a[k]);
			break;
		}
	else
	{
		k++;
	}
	}
	if (a[n - 1] == a[0])
	{
		System.out.print("No");
	}
	}
	}
}

