package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]); //????????
		String b = new String(new char[250]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int ia = a.length(); //??????????
		int ib = b.length();
		int i; //??i?????k?????j?????sum??????????s
		int k = 0;
		int j;
		int sum;
		int[] s = new int[250];
		int com;
		if (ia == ib) //????????????
		{
			com = ia; //?????com????
			for (i = com - 1;i >= 0;i--)
			{
				sum = a.charAt(i) + b.charAt(i) + k - 96; //?????????48????????
				k = sum / 10; //?????
				j = sum - k * 10; //?????
				s[i + 1] = j;
			}
			if (k != 0)
			{
				s[0] = k;
			}
		}
		else //???????
		{
			int max;
			if (ia > ib)
			{
				max = ia;
			}
			else
			{
				max = ib;
			}
			com = max;
			for (;ia != 0 && ib != 0;ia--, ib--, max--)
			{
				sum = a.charAt(ia - 1) + b.charAt(ib - 1) + k - 96; //??????
				k = sum / 10;
				j = sum - k * 10;
				s[max] = j;
			}
			a = tangible.StringFunctions.changeCharacter(a, -1, '0');
			b = tangible.StringFunctions.changeCharacter(b, -1, '0');
			if (ia > ib)
			{
				for (;max >= 0;max--)
				{
					sum = a.charAt(ia - 1) + k - 48; //??????
					k = sum / 10;
					j = sum - k * 10;
					s[max] = j;
					ia--;
				}
			}
			else
			{
				for (;max >= 0;max--)
				{
					sum = b.charAt(ib - 1) + k - 48; //??????
					k = sum / 10;
					j = sum - k * 10;
					s[max] = j;
					ib--;
				}
			}
			if (k != 0)
			{
				s[0] = k;
			}
		}
		if (a.charAt(0) == '0' && b.charAt(0) == '0' && ia == 1 && ib == 1)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
			int t;
			for (t = 0;s[t] == 0;t++)
			{
				;
			}
			for (i = t;i <= com;i++)
			{
				System.out.print(s[i]);
			}
			System.out.print("\n");
		}
	}


}

