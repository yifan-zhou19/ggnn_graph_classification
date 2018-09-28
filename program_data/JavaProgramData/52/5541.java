package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int k;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[k] = Integer.parseInt(tempVar3);
			}
		}
		for (i = n - m;i < n;i++)
		{
			if (i == n - m)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
			System.out.printf(" %d",a[i]);
			}
		}
		for (i = 0;i < n - m;i++)
		{
			System.out.printf(" %d",a[i]);
		}

		return 0;
	}
}

