package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		if (n > 0)
		{
			System.out.printf("%d", a[0]);
		}
		for (i = 1; i < n; i++)
		{
			for (j = 0; j < i; j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
			}
			if (i == j)
			{
				System.out.printf(",%d", a[i]);
			}
		}
		return 0;
	}

}

