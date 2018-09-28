package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w; //w????????????
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int w13 = (w + 12) % 7; //??w13???????????
		int[] monthD = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 0};

		for (int month = 1;month <= 12;month++)
		{
			if (w13 == 5)
			{
				System.out.print(month);
				System.out.print("\n");
			}
			w13 += monthD[month];
			w13 = w13 % 7;
		}

		System.in.read();
		System.in.read();
		return 0;
	}

}

