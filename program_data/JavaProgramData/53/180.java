package <missing>;

public class GlobalMembers
{
	/*????????1?*/
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int j;
		int i;
		int n;
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
		for (i = 0;i < n - 1;i++)
		{
			if (b[i] == 0)
			{
				for (j = n - 1;j > i;j--)
				{
					if (b[j] == 1)
					{
						continue;
					}
					else if (a[j] == a[i])
					{
						b[j] = 1;
					}
				}
			}

		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			if (b[i] == 0)
			{
				System.out.printf(",%d",a[i]);
			}
		}
	}
}

