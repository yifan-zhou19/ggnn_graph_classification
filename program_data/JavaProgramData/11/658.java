package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
		int num;
		int leap;
				leap = 0;
				y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (m == 1 || m == 2)
				{
					if (m == 1)
					{
						num = d;
					}
					else
					{
						num = 31 + d;
					}
					System.out.print(num);
					System.out.print("\n");
				}
				else
				{
					num = (m - 1) * 30 + d;
					if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
					{
						leap = 1;
					}
					if (leap == 1)
					{
						num = num - 1;
					}
					else
					{
						num = num - 2;
					}
					switch (m)
					{
					case 3:
						num = num + 1;
						break;
					case 4:
					case 5:
						num = num + 2;
						break;
					case 6:
					case 7:
						num = num + 3;
						break;
					case 8:
					case 9:
						num = num + 4;
						break;
					case 10:
						num = num + 5;
						break;
					case 11:
					case 12:
						num = num + 6;
						break;
					default :
						break;

					}
					System.out.print(num);
					System.out.print("\n");
				}
		return 0;
	}




}

