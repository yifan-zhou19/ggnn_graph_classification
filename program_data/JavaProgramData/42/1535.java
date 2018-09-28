package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int[] a = new int[100000];
		int m;
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
			m = Integer.parseInt(tempVar3);
		}
		i = 0;
		j = n;
		while (i < j)
		{
			if (a[i] == m)
			{
				j--;

				for (k = i;k < j;k++)
				{
					a[k] = a[k + 1];
				}
	i--;
			}
			i++;
		}
		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
			System.out.printf("%d",a[j - 1]);
		return 0;
	}
}

