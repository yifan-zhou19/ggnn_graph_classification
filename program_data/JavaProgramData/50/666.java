package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int m;
		int j;
		int w1;
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		if (w == 7)
		{
			System.out.print("1\n");
		}
		for (m = 2;m <= 12;m++)
		{
			int sum = 0;
			for (j = 0;j < m - 1;j++)
			{
				sum += days[j];
			}
			sum += 12;
			w1 = (w + sum % 7 <= 7)?(w + sum % 7):(w - 7 + sum % 7);
			if (w1 == 5)
			{
				System.out.printf("%d\n",m);
			}
		}
		return 0;
	}
}

