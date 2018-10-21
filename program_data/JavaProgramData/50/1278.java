package <missing>;

public class GlobalMembers
{
	// ?????
	// ??? 1100012820
	// 20111102
	//******************
	public static int Main()
	{
		int w;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int days = 0;
		for (; i <= 11; i++)
		{
			switch (i)
			{
			case 0:
				days += 12;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
				days += 31;
				break;
			case 6:
			case 9:
			case 11:
			case 4:
				days += 30;
				break;
			case 2:
				days += 28;
				break;
			}
			if ((days % 7 + w) % 7 == 5)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

