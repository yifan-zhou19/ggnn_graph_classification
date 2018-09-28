package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int k;
	int i;
	int j;
	int sum = 0;
	int[] a = new int[100000];
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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		k = Integer.parseInt(tempVar3);
	}
	for (i = 0;i < n - sum;i++)
	{
		if (a[i] == k)
		{
			for (j = i + 1;j < n - sum;j++)
			{
				a[j - 1] = a[j];
			}
			sum = sum + 1;
			i--;
		}
	}
	for (i = 0;i < n - sum - 1;i++)
	{
		System.out.printf("%d ",a[i]);
	}
	System.out.printf("%d",a[n - sum - 1]);
	}
}

