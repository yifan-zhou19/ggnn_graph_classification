package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 3 || n == 2 || n == 4 || n == 1)
		{
			System.out.print("empty");
		}
		else
		{
		for (i = 2;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == i)
			{
				h = i - 2;
				for (k = 2;k < h;k++)
				{
					if (h % k == 0)
					{
						break;
					}
				}
				if (k == h)
				{
					System.out.printf("%d %d\n",h,i);
				}
			}
		}
		}
		return 0;
	}
}

