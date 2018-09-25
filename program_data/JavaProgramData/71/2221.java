package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int year;
		int m1;
		int m2;
		int x = 0;
		int m;
		int i;
		int a;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			{
				if (m1 < m2)
				{
					a = m1,b = m2;
				}
				else if (m2 < m1)
				{
					a = m2,b = m1;
				}
			}
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				for (m = a;m < b;m++)
				{
					switch (m)
					{
					case 1:
				case 3:
			case 5:
		case 7:
					case 8:
				case 10:
			case 12:
				x += 31;
				break;
					case 2:
						x += 29;
						break;
					default :
						x += 30;
					}
				}
				if (x % 7 == 0)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else
				{
					System.out.print("NO");
					System.out.print("\n");
				}
				x = 0;

			}
			else
			{
				for (m = a;m < b;m++)
				{
					switch (m)
					{
					case 1:
				case 3:
			case 5:
		case 7:
					case 8:
				case 10:
			case 12:
				x += 31;
				break;
					case 2:
						x += 28;
						break;
					default :
						x += 30;
					}
				}
				if (x % 7 == 0)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else
				{
					System.out.print("NO");
					System.out.print("\n");
				}
				x = 0;

			}
		}
		return 0;
	}
}

