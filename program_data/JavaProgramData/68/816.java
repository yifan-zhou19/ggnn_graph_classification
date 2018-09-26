package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int tag;
		int i;
		int j;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6; i <= n; i = i + 2)
		{
			for (j = 3; j < i; ++j)
			{
				tag = 0;
				for (k = 2; k * k <= j; k++)
				{
					if (j % k == 0)
					{
						tag = 1;
						break;
					}
				}
				if (tag == 1)
				{
					continue;
				}
				for (k = 2; k * k <= i - j; k++)
				{
					if ((i - j) % k == 0)
					{
						tag = 1;
						break;
					}
				}
				if (tag == 1)
				{
					continue;
				}
				System.out.printf("%d=%d+%d\n", i, j, i - j);
				break;
			}
		}
	}
}

