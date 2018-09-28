package <missing>;

public class GlobalMembers
{
	//*******************************
	//????l10.cpp               *
	//????? 1? 1200012895     *
	//???2012?10?11?          *
	//??????                  *
	//*******************************
	public static int Main()
	{
		String m = new String(new char[4]); //?????????
		int a;
		int b;
		int c;
		int d;
		int[] p = new int[5];
		int i;
		int j;
		int k;
		int n;
		for (a = 10; a <= 50; a = a + 10)
		{
			for (b = 10; b <= 50; b = b + 10)
			{
				for (c = 10; c <= 50; c = c + 10)
				{
					for (d = 10; d <= 50; d = d + 10)
					{
						if (((a + b) == (c + d)) && ((a + d) > (b + c)) && ((a + c) < b))
						{
							  p[1] = a; //?????????????
							  p[2] = b;
							  p[3] = c;
							  p[4] = d;
							  break;
						}
					}
				}
			}
		}
		m = tangible.StringFunctions.changeCharacter(m, 1, 'z'); //???????
		m = tangible.StringFunctions.changeCharacter(m, 2, 'q');
		m = tangible.StringFunctions.changeCharacter(m, 3, 's');
		m = tangible.StringFunctions.changeCharacter(m, 4, 'l');
		for (j = 1; j <= 3; j++) //??????????
		{
			for (i = 1; i <= 4 - j; i++)
			{
				if (p[i] < p[i + 1])
				{
					k = p[i];
					p[i] = p[i + 1];
					p[i + 1] = k;
					n = m.charAt(i);
					m = tangible.StringFunctions.changeCharacter(m, i, m.charAt(i + 1));
					m = tangible.StringFunctions.changeCharacter(m, i + 1, n);
				}
			}
		}
		System.out.print(m.charAt(1));
		System.out.print(" ");
		System.out.print(p[1]);
		System.out.print("\n");
		System.out.print(m.charAt(2));
		System.out.print(" ");
		System.out.print(p[2]);
		System.out.print("\n");
		System.out.print(m.charAt(3));
		System.out.print(" ");
		System.out.print(p[3]);
		System.out.print("\n");
		System.out.print(m.charAt(4));
		System.out.print(" ");
		System.out.print(p[4]);
		System.out.print("\n");
		return 0;
	}
}

