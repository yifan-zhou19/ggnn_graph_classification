package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int j;
		int x = 1;
		int y = 1;
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
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
				if (j == (i - 1))
				{
					x++;
				}
			}

		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
				if ((j == (i - 1)) && (y < (x - 1)))
				{
					System.out.printf("%d,",a[i]);
					y++;
				}
				else if ((j == (i - 1)) && (y == (x - 1)))
				{
					System.out.printf("%d",a[i]);
				}
			}
			if (i == 0)
			{
				System.out.printf("%d,",a[0]);
			}
		}

		return 0;
	}
}

