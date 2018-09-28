package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int sum = 0;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= 11;i++)
		{
			switch (i)
			{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
				sum += 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				sum += 30;
				break;
			case 2:
				sum += 28;
				break;
			default:
				sum += 0;
				break;
			}
			if ((sum + 13 + w - 1) % 7 == 5)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
		}
		return 0;
	}


}

