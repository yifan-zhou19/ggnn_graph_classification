package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}

		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int d = 12 + w;
		int i;
		for (i = 1;i <= 12;i++)
		{
			d = d + day[i - 1];
			if (d % 7 == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
	}
}

