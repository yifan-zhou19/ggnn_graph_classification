package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int h = 0;
		int l = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int time = 0;
		int max = 0;
		for (int i = 0;i < n;i++)
		{
			h = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (h >= 90 && h <= 140 && l >= 60 && l <= 90)
			{
				time++;
				if (time > max)
				{
					max = time;
				}
			}
			else
			{
				time = 0;
			}
		}
		System.out.printf("%d\n",max);
		return 0;
	}
}

