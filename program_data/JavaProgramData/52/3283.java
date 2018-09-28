package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int n;
	public static int m;
	public static int Main()
	{
		int i;
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
		for (i = 0;i < n - m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a + m + i = tempVar3;
			}
		}
		for (i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a + i = tempVar4;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",a[i]);
			if (i < n - 1)
			{
				System.out.print(' ');
			}
		}
		System.out.print('\n');
		return 0;
	}

}

