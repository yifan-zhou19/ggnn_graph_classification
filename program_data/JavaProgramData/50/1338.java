package <missing>;

public class GlobalMembers
{
	//****************************************
	//*   ?????                         *
	//*   ??????                       *
	//*   ?????2011?12?18?           *
	//****************************************


	public static int Main()
	{
		int w;
		int i;
		int j;
		int day;
		int a;
		int b;
		int c;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= 12; i++) //i???i??
		{
			a = 0;
			b = 0;
			c = 0; //abc?????28?30?31????
			for (j = 0; j < i; j++) //j??????
			{
				if (j == 2)
				{
					a++;
				}
				else if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					b++;
				}
				else if (j != 0)
				{
					c++;
				}
			}
			day = (28 * a + 30 * b + 31 * c + 12 + w) % 7; //????13?????
			if (day == 5)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

