package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100001];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		l = 0;
		for (j = 0;j < n;j++)
		{
			if (a[j] == d)
			{
				for (int k = j;k < n;k++)
				{
					a[k] = a[k + 1];
				}
				l++;
			}
			if (a[j] == d)
			{
				j--;
			}
		}
		for (int m = 0;m < n - l - 1;m++)
		{
			System.out.printf("%d ",a[m]);
		}
		System.out.printf("%d",a[n - l - 1]);
		return 0;
	}
}

