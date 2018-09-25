package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String dividend = new String(new char[102]);
		String p = new String(new char[100]);
		dividend = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int q = dividend.charAt(0) - '0';
		int i;
		int len;
		len = dividend.length(); //len?????????
		for (int i = 1;i < len;i++)
		{
		   q = 10 * q + dividend.charAt(i) - '0'; //?????
		   p = tangible.StringFunctions.changeCharacter(p, i - 1, q / 13 + '0'); //???????
		   q = q % 13; //??
		}
		p = tangible.StringFunctions.changeCharacter(p, len - 1, '\0');
		if (len == 1)
		{
			p = tangible.StringFunctions.changeCharacter(p, 0, '0');
		}
		if (p.charAt(0) == '0')
		{
			if (len == 2 || len == 1)
			{
				System.out.print(0);
			}
			else
			{
			for (int i = 1;i < len - 1;i++)
			{
			 System.out.print(p.charAt(i));
			}
			}
		}
		else
		{
			System.out.print(p);
		}
		System.out.print("\n");
		System.out.print(q);
		System.out.print("\n");
		return 0;
	}
}

