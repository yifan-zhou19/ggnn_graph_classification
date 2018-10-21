package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n - 1;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] == a[i])
				{
					break;
				}
				if (j == i - 1)
				{
					System.out.printf(",%d",a[i]);
				}
			}
		}

		for (j = 0;j < n - 1;j++)
		{
			if (a[j] == a[n - 1])
			{
				break;
			}
			if (j == n - 2)
			{
				System.out.printf(",%d",a[n - 1]);
			}
		}

		return 0;
	}
}

