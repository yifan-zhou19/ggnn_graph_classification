package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int sum = 0;
		int[] a = new int[20000];
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
		for (i = 0;i < n - sum;i++)
		{
		for (j = i + 1;j < n - sum;j++)
		{
			if (a[j] == a[i])
			{
				for (k = j;k < n - sum - 1;k++)
				{
				a[k] = a[k + 1];
				}
				sum++;
				j--;
			}
		}
		}
	for (i = 0;i < n - sum - 1;i++)
	{
		System.out.printf("%d ",a[i]);
	}
	System.out.printf("%d",a[n - sum - 1]);
	}
}

