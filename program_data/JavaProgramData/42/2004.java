package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
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
			m = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;)
		{
			if (a[i] == m)
			{
				for (j = i;j < n;j++)
				{
					a[j] = a[j + 1];
				}
				k++;
			}
			else
			{
				i++;
			}

		}
		for (i = 0;i < n - k - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - k - 1]);
		return 0;
	}
}

