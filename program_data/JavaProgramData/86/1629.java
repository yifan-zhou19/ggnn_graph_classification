package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			int m;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int time = 60;
			int temp;
			for (int i = 0;i < m;i++)
			{
				temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (time-3 >= temp)
				{
					time -= 3;
				}
				else if (time-3 < temp && time> temp)
				{
					time = temp;
				}
			}
			System.out.print(time);
			System.out.print("\n");
		}
		return 0;
	}

}

