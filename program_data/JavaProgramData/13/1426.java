package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int i;
		int k = 0;
		int[] a = new int[90];
		int[] b = new int[20000];

		for (i = 0;i <= 89;i++)
		{
			a[i] = i + 10;
		}

		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i <= n - 1;i++)
		{
			int j;
			for (j = 0;j <= 89;j++)
			{
				if (b[i] == a[j])
				{
					if (k == 0)
					{
						System.out.printf("%d",a[j]);
					}
					else
					{
						System.out.printf(" %d",a[j]);
					}
					a[j] = 0;
					k++;
					break;
				}
			}
		}

		System.out.print("\n");
	}
}

