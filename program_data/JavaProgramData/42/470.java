package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int m;
		int[] a = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
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
			a[n - 1] = Integer.parseInt(tempVar3);
		}
		System.out.print('\n');
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			k = Integer.parseInt(tempVar4);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				for (m = i;m < n;m++)
				{
					a[m] = a[m + 1];
				}
				i--;
				 n = n - 1;
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
		System.out.printf(" %d",a[i]);
		}
	}
}

