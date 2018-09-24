package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m;
		int k = 0;
		int t;
		int[] a = new int[20001];
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
		for (i = 1;i < n - k;i++)
		{
			for (m = 1;m <= i;m++)
			{
				if (a[i] == a[i - m])
				{
					   t = i;
					   for (i = t;i < n - k;i++)
					   {
						   a[i] = a[i + 1];
					   }
					   i = t - 1;
					   k++;
				}
			}
		}
		for (i = 0;i < n - k - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - k - 1]);
	}
}

