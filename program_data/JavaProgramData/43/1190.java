package <missing>;

public class GlobalMembers
{
	//********************************************
	//*?????????                        *
	//*??????                              *
	//*???1300012888                          *
	//*???2013.10.23                          *
	//********************************************

	public static int Main()
	{
		int m;
		int a;
		int b;
		int i;
		int j;

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 3;a <= m / 2;a = a + 2) //?3????2??
		{ //??m?????
			for (i = 2;i <= Math.sqrt(a);)
			{
				if (a % i != 0)
				{
					i++;
				}
				else
				{
					break;
				}
			}
			if (i > Math.sqrt(a)) //??a???
			{
				b = m - a;
				for (j = 2;j <= Math.sqrt(b);)
				{
					if (b % j != 0)
					{
						j++;
					}
					else
					{
						break;
					}
				}
				if (j > Math.sqrt(b)) //??b???
				{
					System.out.print(a);
					System.out.print(" ");
					System.out.print(b);
					System.out.print("\n");
				}
			}
		}

		return 0;
	}
}

