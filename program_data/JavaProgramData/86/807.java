package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int i = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (e = 1;e <= a;e++)
		{
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (b == 0)
			{
				System.out.print("60");
				System.out.print("\n");
			}
			else
			{
				for (c = 1;c <= b;c++)
				{
					d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if ((d + 3 * c) <= 60) //???1??????
					{
						i = d - ((d + 3 * c) - 60); //????1????????????
						f = 60 - 3 * c;
					}
					else if (((d + 3 * (c - 1)) <= 60) && ((d + 3 * c)>60)) //???????????????1??????
					{
						i = d; //????1????????????
						f = d;
					}
					else //??1??????
					{
						f = i; //????????
					}
				}
				System.out.print(f);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

