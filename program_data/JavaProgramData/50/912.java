package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] imon = new int[12];
		int w;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j = 0;
		int d;
		int id = 0;
		int s = 0;
		switch (w)
		{
			case 7:
				s = 5;
				break;
			case 6:
				s = 6;
				break;
			case 5:
				s = 0;
				break;
			case 4:
				s = 1;
				break;
			case 3:
				s = 2;
				break;
			case 2:
				s = 3;
				break;
			default:
				s = 4;
				break;
		}
		for (i = 0;i < 12;i++)
		{
			id += mon[i];
			d = id + 13 - 1;
			if ((d % 7) == s)
			{
				imon[j] = i + 1;
				j++;
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.print(imon[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

