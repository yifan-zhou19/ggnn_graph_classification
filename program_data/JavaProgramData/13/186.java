package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[20001];
	int i;
	int k;
	int j = 0;
	int n;
	int fil = 101;
	int m = 0;
	int g = 0;
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
	k = 0;
	a[n] = 101;

	while (k < n)
	{

	for (i = 0;i < k;i++)
	{
		if (a[i] == a[k])
		{
		k++;
		}
	}
	for (i = 0;i < k;i++)
	{
		if (a[i] == a[k])
		{
		k++;
		}
	}
	if (k == 0)
	{
	System.out.printf("%d",a[k]),k++;
	}

	else
	{
	if (k < n && k>0)
	{
	System.out.printf(" %d",a[k]),k++,m++;
	}
	}
	}

	}
}

