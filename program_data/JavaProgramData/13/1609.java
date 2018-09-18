package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[N];
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

		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",a[i]);
			}

			else
			{
				for (j = 0;j < i;j++)
				{
					if (a[j] == a[i])
					{
						break;
					}
				}
				if (j == i)
				{
					System.out.printf(" %d",a[i]);
				}
				else if (j < i)
				{
					continue;
				}
			}
		}

		return 0;
	}

}

