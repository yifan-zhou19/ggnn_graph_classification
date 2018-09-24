package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[105];
		int n;
		int i;
		for (i = 0;i < 101;i += 1)
		{
			a[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		a[i] = 1;
		System.out.printf("%d",i);
		while (n-- > 1)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				i = Integer.parseInt(tempVar3);
			}
			if (a[i] != 0)
			{
				continue;
			}
			a[i] = 1;
			System.out.printf(" %d",i);
		}
	}


}

