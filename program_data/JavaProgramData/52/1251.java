package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[101];
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
		i = 0;
		while (i != m)
		{
			for (j = n;j > 0;j--)
			{
				a[j] = a[j - 1];
			}
			a[0] = a[n];
			i++;
		}
		for (i = 0;i < n - 1;i++)
		{
		System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - 1]);
	}


}

