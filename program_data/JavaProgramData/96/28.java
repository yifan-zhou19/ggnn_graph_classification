package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 2;
		int t;
		int w = 0;
		String str = new String(new char[101]);
		String ans = new String(new char[100]);
		str = tangible.StringFunctions.changeCharacter(str, 0, '0');
		(str.Substring(1)) = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (str.charAt(2) == 0 || ((str.charAt(1) - '0') * 10 + str.charAt(2) - '0' < 13 && str.charAt(3) == 0))
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print((str.Substring(1)));
			System.out.print("\n");
		}
		else
		{
		if ((str.charAt(1) - '0') * 10 + str.charAt(2) - '0' < 13)
		{
			i = 3;
		}
		while (str.charAt(i) != 0)
		{
			ans = tangible.StringFunctions.changeCharacter(ans, w, '0');
			t = (str.charAt(i - 2) - '0') * 100 + (str.charAt(i - 1) - '0') * 10 + str.charAt(i) - '0';
			while (t >= 13)
			{
				t -= 13;
				str = tangible.StringFunctions.changeCharacter(str, i - 2, t / 100 + '0');
				str = tangible.StringFunctions.changeCharacter(str, i - 1, t / 10 + '0');
				str = tangible.StringFunctions.changeCharacter(str, i, t % 10 + '0');
				ans.charAt(w)++;
			}
			w++;
			i++;
		}
		ans = ans.substring(0, w);
		System.out.print(ans);
		System.out.print("\n");
		if (str.charAt(i - 2) != '0')
		{
			System.out.print(str.charAt(i - 2));
		}
		System.out.print(str.charAt(i - 1));
		System.out.print("\n");
		}
		return 0;
	}
}

