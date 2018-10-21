package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int x;
		int y;
		int z;
		int j;
		int s;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		x = 0;
		y = 0;
		z = 0;
		x = (a - 1) + (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400;
		for (j = 1;j < b;j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
			{
				y += 31;
			}
			else if (j == 4 || j == 6 || j == 9 || j == 11)
			{
					y += 30;
			}
			else if (j == 2)
			{
						if (a % 4 == 0)
						{
							y += 29;
						}
						else
						{
							y += 28;
						}
			}
		}
				z = (x + y + c);
				s = z % 7;

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

			return 0;
	}
}

