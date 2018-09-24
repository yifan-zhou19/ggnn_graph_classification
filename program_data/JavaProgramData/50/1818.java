package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= 12;j++)
		{
			int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				int a = 0;
			for (i = 0;i < j;i++)
			{
				a += days[i];
			}
			a = a + 12;
			if ((a + w) % 7 == 5)
			{
				System.out.printf("%d\n",j);
			}
		}
		return 0;
	}
}

