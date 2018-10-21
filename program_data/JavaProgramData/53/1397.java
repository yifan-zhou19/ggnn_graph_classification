package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[10000];
		for (i = 1;i <= 10000;i++)
		{
			a[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				j = Integer.parseInt(tempVar2);
			}
			if (a[j] == 0)
			{
				a[j] = 1;
				if (i == 1)
				{
					System.out.printf("%d",j);
				}
				else
				{
					System.out.printf(",%d",j);
				}
			}
		}

		return 0;
	}
}

