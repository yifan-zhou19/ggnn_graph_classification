package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100000];
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int k = 0;
		int b = 0;
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
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			k = Integer.parseInt(tempVar4);
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] != k)
			{
				if (b == 0)
				{
				  System.out.printf("%d",a[i]);
				  b += 1;
				}
				else
				{
					System.out.printf(" %d",a[i]);
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}

