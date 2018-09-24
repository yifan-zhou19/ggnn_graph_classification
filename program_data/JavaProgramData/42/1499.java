package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n;
		int j;
		int x;
		int[] a = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		i = 0;
		System.out.print("\n");
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x = Integer.parseInt(tempVar3);
		}
		while (i < n)
		{
			if (a[i] == x)
			{
				n = n - 1;
				for (j = i;j < n;j++)
				{
					a[j] = a[j + 1];
				}
				i = i - 1;
			}
			i++;
		}
		System.out.printf("%ld",a[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %ld",a[i]);
		}
		return 0;
	}
}

