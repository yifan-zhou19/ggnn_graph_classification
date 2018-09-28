package <missing>;

public class GlobalMembers
{
	public static int f(char n) //???????????????????
	{
		int t;
		if (n > 47 && n < 58)
		{
			t = n - 48;
		}
		else
		{
			if (n > 64 && n < 91)
			{
				t = n - 55;
			}
		else
		{
		if (n > 96 && n < 123)
		{
			t = n - 87;
		}
		}
		}
		return t;
	}

	public static int Main()
	{
		int a;
		int i;
		int s = 0;
		int k;
		int b;
		int g = 1;
		String n = new String(new char[32]); //??????????????????
		String m = new String(new char[32]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n.length();i++) //????????????s
		{
			for (k = 0;k < n.length() - i - 1;k++)
			{
			g = g * a;
			}
			s = s + f(n.charAt(i)) * g;
			g = 1;
		}
		i = 0; //?i???0?????????
		if (s == 0)
		{
			System.out.print(s);
		}
		while (s != 0)
		{
			k = s % b; //?b???????????????
			if (k >= 10)
			{
				m = tangible.StringFunctions.changeCharacter(m, i, k + 55); //?????10??????
			}
			else
			{
				m = tangible.StringFunctions.changeCharacter(m, i, k + 48); //?????10????????????
			}
			s = s / b; //??s????????????
			i++; //??m[i]
		}
		k = i;
		for (i = k - 1;i >= 0;i--)
		{
			System.out.print(m.charAt(i));
		} //??????????
		return 0;
	}


}

