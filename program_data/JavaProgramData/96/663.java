package <missing>;

public class GlobalMembers
{
	//3.cpp
	//?????13
	//?????
	//???11?12?


	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int m;
		int l;
		int yu;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = a.length();
		yu = 0;
		for (i = 0; i < l; i++)
		{
			m = yu * 10 + (a.charAt(i) - '0');
			b = tangible.StringFunctions.changeCharacter(b, i, m / 13 + '0');
			yu = m % 13;
		}
		j = 0;
		while (b.charAt(j) == 48)
		{
			j++;
		}
		if (j == l)
		{
			System.out.print('0');
		}
		else
		{
			for (i = j; i < l; i++)
			{
				System.out.print(b.charAt(i));
			}
		}
		System.out.print("\n");
		System.out.print(yu);
		return 0;
	}

}

