package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int f = 0;
		int isSuShu = int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i < n - 1;i++)
		{
			if (isSuShu(i) != 0)
			{
				if (isSuShu(i + 2) != 0)
				{
				System.out.printf("%d %d\n",i,i + 2),f = 1;
				}
				else
				{
					continue;
				}
			}
			else
			{
				continue;
			}
		}
			if (f == 0)
			{
				System.out.print("empty");
			}
			return 0;
	}

	public static int isSuShu(int i)
	{
			int j;
			int k = 1;

			for (j = 2;j < i;j++)
			{
			if (i % j == 0)
			{
				return 0;
			}
			else
			{
				k++;
				if (k == i - 2 || k == i - 1)
				{
					return 1;
				}
			}
			}
	}


}

