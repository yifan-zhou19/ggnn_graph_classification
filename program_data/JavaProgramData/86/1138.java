package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int suspend;
		int number;
		int times;
		//n???????suspend??????number??????times??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;n > 0;n--)
		{
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			times = 60;
			for (;number > 0;number--)
			{
				suspend = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (suspend < times - 2)
				{
					times -= 3;
				}
				else if (suspend >= times)
				{
					;
				}
				else
				{
					times = suspend;
				}
			}
			System.out.print(times);
			System.out.print("\n");
		}
		return 0;
	}
}

