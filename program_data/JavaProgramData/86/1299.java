package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int bre;
		int i;
		int bPoint;
		int times;
		int time;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			bre = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			times = 0;
			bPoint = 0;
			time = 0;
			for (i = 0;i < bre;i++)
			{
				bPoint = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (bPoint + 3 * i <= 60)
				{
					time = bPoint + 3 * (i + 1);
					times = bPoint;
				}
			}
			if (time <= 60)
			{
				times += 60 - time;
			}
			System.out.print(times);
			System.out.print("\n");
		}
		return 0;
	}

}

