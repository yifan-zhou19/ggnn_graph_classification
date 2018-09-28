package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100001];
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
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				m = i;
				for (j = i + 1;j < n + 1;j++,i++)
				{
					a[i] = a[j];
				}
				i = m - 1;
				num = num + 1;
			}
		}
		for (i = 0;i < (n - num - 1);i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - num - 1]);
		return 0;
	}
}

