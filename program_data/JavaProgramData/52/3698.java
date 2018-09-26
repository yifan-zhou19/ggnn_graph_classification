package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[200];
		int n;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			a[m + i] = a[i];
		}
		for (i = 0;i < m;i++)
		{
			a[i] = 0;
		}
		for (j = n;j < n + m;j++)
		{
			a[j - n] = a[j];
		}
		for (j = 0;j < n - 1;j++)
		{
		System.out.printf("%d ",a[j]);
		}
			System.out.printf("%d",a[n - 1]);
	}


}

