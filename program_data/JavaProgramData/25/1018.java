package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[50]); //?????????2?100???????50??
	public static int i;
	public static int j;
	public static int k;
	public static int flag = 0;
	public static void f(int n) //?????????2?n??????
	{
		if (n == 0)
		{
			return;
		}
		else if (n == 1)
		{
			for (i = 48; i >= 0; i--)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, (s.charAt(i) - '0') * 2 + flag); //???????????????2???
				if (s.charAt(i) >= 10) //??????????10?????
				{
					flag = s.charAt(i) / 10;
					s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) % 10 + '0');

				}
				else
				{
					flag = 0; //???????
					s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + '0');
				}
			}
			return;
		}
		else if (n == 2)
		{
			for (i = 48; i >= 0; i--)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, (s.charAt(i) - '0') * 4 + flag); //???????????????4???
				if (s.charAt(i) >= 10) //??????????10?????
				{
					flag = s.charAt(i) / 10;
					s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) % 10 + '0');

				}
				else
				{
					flag = 0; //???????
					s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + '0');
				}
			}
			return;
		}
		else
		{
			for (i = 48; i >= 0; i--)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, (s.charAt(i) - '0') * 8 + flag); //???????????????8???
				if (s.charAt(i) >= 10) //??????????10?????
				{
					flag = s.charAt(i) / 10;
					s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) % 10 + '0');

				}
				else
				{
					flag = 0; //???????
					s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + '0');
				}
			}
			f(n - 3); //??????n-3???
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s,'0',(Character.SIZE / Byte.SIZE)); //??????????0
		s = tangible.StringFunctions.changeCharacter(s, 48, '1'); //???s[48]?1
		f(n); //????
		i = 0;
		while (s.charAt(i) == '0') //??????0?????
		{
			i++;
		}
		for (j = i; j <= 48; j++) //???????????????s[48]
		{
			System.out.print(s.charAt(j));
		}
		return 0;
	}

}

