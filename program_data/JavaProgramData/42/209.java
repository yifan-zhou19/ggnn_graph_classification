package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[100000];
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
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				j = i;
				for (j;j < n;j++)
				{
					a[j] = a[j + 1];
				}
					n = n - 1;
					i = i - 1;
			}
		}
		if (n != 0)
		{
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
			System.out.printf("%d",a[n - 1]);
		}
	}

}

