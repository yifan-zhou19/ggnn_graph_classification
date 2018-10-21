package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
			int[] sz = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (int i = 0;i < 12;i++)
		{
			m = 0;
			for (int j = 0;j < i;j++)
			{
				m += sz[j];
			}
			if ((m + n + 12) % 7 == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
		return 0;
	}










}

