package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int[] d = new int[100];
		int i = 0;
		int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 0};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		for (i = 0;i < b;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d[i] = Integer.parseInt(tempVar2);
			}
		}
		i = 0;
		for (i = 0;i < b;i++)
		{
			System.out.printf("%d\n",a[d[i] - 1]);
		}
		return 0;
	}
}

