package <missing>;

public class GlobalMembers
{
	//********************************************************
	//*  ???:3.cpp                                        *
	//*  ??????    1200012948                          *
	//*  ????: 2012 11 10                                *
	//*  ????:??13                                     *
	//********************************************************
	//??
	public static int Main()
	{
		String a = new String(new char[100]);
		int c;
		int d;
		int e;
		int f;
		int g;
		int i;
		int flag = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		//?ascii?????
		if (a.charAt(1) == '\0')
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(a.charAt(0) - '0');
			System.out.print("\n");
		}
		if (a.charAt(1) != '\0')
		{
			c = a.charAt(0) - '0';
			d = a.charAt(1) - '0';
		for (i = 1; a.charAt(i) != '\0'; i++)
		{
			e = c * 10 + d;
			f = e / 13; //??
			g = e % 13;
			//???????0
			if (flag == 0)
			{
				if (f == 0)
				{
					flag = 1;
				}
				else
				{
					System.out.print(f);
					flag = 1;
				}

			}
			else
			{
				System.out.print(f);
			}

			c = g;
			d = a.charAt(i + 1) - '0';
		}
		if (a.charAt(2) == '\0' && (a.charAt(0) - '0') * 10 + a.charAt(1) - '0' < 13)
		{
			System.out.print(0);
		}

		System.out.print("\n");
		System.out.print(g);
		System.out.print("\n");
		}
	//??
		return 0;
	}

}

