package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int initialday;
		int month;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			initialday = Integer.parseInt(tempVar);
		}
		for (month = 1;month <= 12;month++)
		{
			switch (month)
			{
				case 1:
					if ((initialday + 7) % 7 == 0)
					{
						System.out.print("1\n");
					}
					break;
				case 2:
					if ((initialday + 38) % 7 == 0)
					{
						System.out.print("2\n");
					}
					break;
				case 3:
					if ((initialday + 66) % 7 == 0)
					{
						System.out.print("3\n");
					}
					break;
				case 4:
					if ((initialday + 97) % 7 == 0)
					{
						System.out.print("4\n");
					}
					break;
				case 5:
					if ((initialday + 127) % 7 == 0)
					{
						System.out.print("5\n");
					}
					break;
				case 6:
					if ((initialday + 158) % 7 == 0)
					{
						System.out.print("6\n");
					}
					break;
				case 7:
					if ((initialday + 188) % 7 == 0)
					{
						System.out.print("7\n");
					}
					break;
				case 8:
					if ((initialday + 219) % 7 == 0)
					{
						System.out.print("8\n");
					}
					break;
				case 9:
					if ((initialday + 250) % 7 == 0)
					{
						System.out.print("9\n");
					}
					break;
				case 10:
					if ((initialday + 280) % 7 == 0)
					{
						System.out.print("10\n");
					}
					break;
				case 11:
					if ((initialday + 311) % 7 == 0)
					{
						System.out.print("11\n");
					}
					break;
				case 12:
					if ((initialday + 341) % 7 == 0)
					{
						System.out.print("12\n");
					}
					break;
			}
		}

		return 0;
	}

}

