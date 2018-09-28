package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int[] a = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i >= 0 && i <= (n - k - 1))
			{
				a[i + 100] = a[i];
			}
			else if (i >= (n - k) && i <= (n - 1))
			{
				a[i - n + k] = a[i];
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		for (i = 100;i <= n - k + 98;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - k + 99]);
	}

}

