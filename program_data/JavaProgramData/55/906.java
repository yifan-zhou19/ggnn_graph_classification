package <missing>;

public class GlobalMembers
{
	/*
	 * ???: 1000010191_30_6.cpp
	 * ??: ???
	 * ????: 2010-11-5
	 * ??: ????
	 */


	public static int Main()
	{
		int a;
		int b;
		String n = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		//?????
		int t = 0;
		for (int i = 0;n.charAt(i);i++)
		{
			if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
			{
				t = t * a + n.charAt(i) - '0';
			}
			if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			{
				t = t * a + n.charAt(i) - 'a' + 10;
			}
			if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
				t = t * a + n.charAt(i) - 'A' + 10;
			}
		}
		//??b??
		int len = 0;
		String r = new String(new char[100]);
		while (t != 0)
		{
			int temp = t % b;
			if (temp < 10)
			{
				r = tangible.StringFunctions.changeCharacter(r, len, '0' + temp);
			}
			else
			{
				r = tangible.StringFunctions.changeCharacter(r, len, 'A' + temp - 10);
			}
			len++;
			t = t / b;
		}
		for (int i = len - 1;i >= 0;i--)
		{
			System.out.print(r.charAt(i));
		}
		if (len == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		System.out.print("\n");
		return 0;
	}

}

