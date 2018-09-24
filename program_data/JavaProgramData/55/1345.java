package <missing>;

public class GlobalMembers
{
	//*******************************************************
	//*11.11??  ????                                  *
	//*?????  ?? 1100012844                          *
	//*???2011?11?11?                                 *
	//*******************************************************
	public static int atoDec(int i, String a)
	{
		int Dec = 0;
		int k;
		for (k = 0; !a[k].equals('\0'); k++)
		{
			if (a[k].compareTo('0') >= 0 && a[k].compareTo('9') <= 0)
			{
				Dec = Dec * i + a[k] - '0';
			}
			if (a[k].compareTo('A') >= 0 && a[k].compareTo('Z') <= 0)
			{
				Dec = Dec * i + a[k] - 'A' + 10;
			}
			if (a[k].compareTo('a') >= 0 && a[k].compareTo('z') <= 0)
			{
				Dec = Dec * i + a[k] - 'a' + 10;
			}
		}
		return Dec;
	}
	public static int Main()
	{
		String o = new String(new char[100]);
		String f = new String(new char[100]);
		int a;
		int b;
		int temp;
		int r;
		int j = 99;
		int m;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		o = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		temp = atoDec(a, o);
		if (temp != 0)
		{
			while (temp != 0)
			{
				r = temp % b;
				if (r < 10)
				{
					f = tangible.StringFunctions.changeCharacter(f, j, r + '0');
					j--;
				}
				else
				{
					f = tangible.StringFunctions.changeCharacter(f, j, r - 10 + 'A');
					j--;
				}
				temp = temp / b;
			}
			for (m = j + 1; m <= 99; m++)
			{
				System.out.print(f.charAt(m));
			}
		}
		else
		{
			System.out.print("0");
		}
		return 0;
	}
}

