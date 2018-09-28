package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int b;
		int m;
		int[] a = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i = i + 1)
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
			b = Integer.parseInt(tempVar3);
		}

		for (i = 0,m = 0;i < n;i = i + 1)
		{
			if (a[i] == b)
			{
			m = m + 1;
			{
				for (j = i + 1;a[j] != b;j = j + 1)
				{
				a[j - m] = a[j];
				}
			}
			}
		}


		for (i = 0;i < (n - m - 1);i = i + 1)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - m - 1]);
	}
}

