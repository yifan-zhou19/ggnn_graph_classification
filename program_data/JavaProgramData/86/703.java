package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int Total;
	public static int Time;
	public static int PNum;
	public static int Stop;
	public static int Max(int x, int y)
	{
		return (x > y != 0 ? x : y);
	}
	public static int Main()
	{
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < N; i++)
		{
			Stop = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (Stop == 0)
			{
				System.out.print("60");
				System.out.print("\n");
				continue;
			}
			Total = 0;
			Time = 60;
			for (int j = 0; j < Stop; j++)
			{
				PNum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (Time - PNum - 3 * j >= 0)
				{
					Total = PNum;
					if (Time - PNum - 3 * j > 3)
					{
					Total += Time - PNum - 3 * (j + 1);
					}
				}
			}
			System.out.print(Total);
			System.out.print("\n");
		}
		return 0;
	}


}

