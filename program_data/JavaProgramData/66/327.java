package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = int year;
		int run = new int(int y,int m,int d);
		int count = new int(int y,int m,int d);
		int day = int s;
		void print(int s);

		int m;
		int d;
		int y;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}

		int sum = count(y, m, d);
		int s = day(sum);

		print(s);
	}


	public static int n(int year)
	{
		int n;
		n = year / 4 - year / 100 + year / 400;
		return n;
	}

	public static int run(int y,int m,int d)
	{
		if ((y % 4 == 0 && y % 400 != 0) || y % 400 == 0)
		{
			if (m > 2)
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
		else
		{
			return 0;
		}
	}

	public static int count(int y,int m,int d)
	{
		int sum;
		sum = (y - 1) + n(y) - run(y, m, d);
		if (m == 1)
		{
			sum += d;
		}
		else if (m == 2)
		{
			sum += 31 + d;
		}
		else if (m == 3)
		{
			sum += 31 + 28 + d;
		}
		else if (m == 4)
		{
			sum += 31 + 28 + 31 + d;
		}
		else if (m == 5)
		{
			sum += 31 + 28 + 31 + 30 + d;
		}
		else if (m == 6)
		{
			sum += 31 + 28 + 31 + 30 + 31 + d;
		}
		else if (m == 7)
		{
			sum += 31 + 28 + 31 + 30 + 31 + 30 + d;
		}
		else if (m == 8)
		{
			sum += 31 + 28 + 31 + 30 + 31 + 30 + 31 + d;
		}
		else if (m == 9)
		{
			sum += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d;
		}
		else if (m == 10)
		{
			sum += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d;
		}
		else if (m == 11)
		{
			sum += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;
		}
		else if (m == 12)
		{
			sum += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d;
		}

		return sum;
	}

	public static int day(int s)
	{
		int day;
		day = s % 7;
		return day;
	}

	public static void print(int s)
	{
		switch (s)
		{
		case 0:
			System.out.print("Sun.");
			break;
			case 1:
				System.out.print("Mon.");
				break;
				case 2:
					System.out.print("Tue.");
					break;
					case 3:
						System.out.print("Wed.");
						break;
						case 4:
							System.out.print("Thu.");
							break;
							case 5:
								System.out.print("Fri.");
								break;
								case 6:
									System.out.print("Sat.");
									break;
		}
	}
}

