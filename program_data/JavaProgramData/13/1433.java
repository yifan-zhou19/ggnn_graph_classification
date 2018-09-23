package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[20000];
		int[] b = new int[20000];
		for (i = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a[i] = Integer.parseInt(tempVar2);
						}
		}
		System.out.printf("%d", a[0]);

		for (i = 1;i < n;i++)
		{
						y = 0;
						for (j = 0;j <= i - 1;j++)
						{
							  if (a[i] == a[j])
							  {
									y++;
							  }
						}
						if (y == 0)
						{
						System.out.printf(" %d", a[i]);
						}
		}

		return 0;
	}


}

