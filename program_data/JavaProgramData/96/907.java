package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[110]); //????
		final String a = "  ";
		String qq = new String(new char[110]);
		int i = 0;
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int n = num.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(qq,'\0',110); //???
		while (i < n - 1)
		{
			a = tangible.StringFunctions.changeCharacter(a, 0, num.charAt(i));
			a = tangible.StringFunctions.changeCharacter(a, 1, num.charAt(i + 1)); //????????????0??100
			int x = Integer.parseInt(a);
			if (i > 0 && num.charAt(i - 1) > '0')
			{
				x += 100;
			}
			int t = x % 13; //??????
			int q = x / 13;
			qq = tangible.StringFunctions.changeCharacter(qq, i, '0' + q);
			if (t >= 10) //??
			{
				t -= 10;
				num = tangible.StringFunctions.changeCharacter(num, i, '1');
				num = tangible.StringFunctions.changeCharacter(num, i + 1, '0' + t);
			}
			else
			{
				num = tangible.StringFunctions.changeCharacter(num, i, '0');
				num = tangible.StringFunctions.changeCharacter(num, i + 1, '0' + t);
			}
			i++;
		}
		if (n == 1)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(num);
			return 0;
		}
		if (qq.charAt(0) == '0' && n > 2)
		{
			 for (int i = 0;i < n;i++)
			 {
				 qq = tangible.StringFunctions.changeCharacter(qq, i, qq.charAt(i + 1));
			 }
		}
		System.out.print(qq);
		System.out.print("\n");
		if (num.charAt(n - 2) != '0')
		{
			System.out.print(num.charAt(n - 2));
		}
		System.out.print(num.charAt(n - 1));
		return 0;
	}
}

