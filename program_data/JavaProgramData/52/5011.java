package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int tr;
		int[] a = new int[150];
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
		for (i = 1;i <= n;i++)
		{
			if (i == 1)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
			if (i != 1)
			{
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					a[i] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (i = n + 1 - m;i <= n;i++)
		{
			for (j = i;j >= i - (n - m) + 1;j--)
			{
				tr = a[j];
				a[j] = a[j - 1];
				a[j - 1] = tr;
			}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%d",a[i]);
			if (i != n)
			{
				System.out.print(" ");
			}
		}
	}
}

