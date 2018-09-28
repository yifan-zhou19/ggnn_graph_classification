package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int t = 0;
		int a;
		int[] month_days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= 12;i++)
		{
			t += month_days[i - 1];
			a = t + w + 12;
			if (a % 7 == 5)
			{
				System.out.printf("%d\n",i);
			}

		}
		return 0;

	}

}

