package <missing>;

public class GlobalMembers
{
	//****************************************************
	//*  ? ? ?: homework.cpp                          *
	//*  ?    ?: ???                                *
	//*  ????: 2012?10?22?                        *
	//*  ????: ???                                *
	//****************************************************

	public static int Main()
	{
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //??????(???)
		int[] c = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //??????(??)
		int i;
		int j;
		int n;
		int l;
		int sd1;
		int sd2;
		int y;
		int m1;
		int m2;
		int[][] b = new int[2][145]; //???????,b[0]????,b[1]???
		for (i = 1; i <= 144; i++)
		{
			b[0][i] = 0;
			b[1][i] = 0;
		} //???
		for (i = 1; i <= 11; i++)
		{
			j = i;
			sd1 = 0;
			sd2 = 0;
			while (j < 12)
			{
				sd1 = sd1 + a[j];
				sd2 = sd2 + c[j];
				j++;
				b[0][(i - 1) * 12 + j] = b[0][(j - 1) * 12 + i] = (sd1 % 7 == 0);
				b[1][(i - 1) * 12 + j] = b[1][(j - 1) * 12 + i] = (sd2 % 7 == 0);
				//?????????????? 

			}
		}

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			l = (y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)); //??????
			if (b[l][(m1 - 1) * 12 + m2] != 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
				else
				{
					System.out.print("NO");
					System.out.print("\n");
				}
		}

		return 0;
	}

}

