package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		String substr = new String(new char[256]);
		String replace = new String(new char[256]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		substr = ConsoleInput.readToWhiteSpace(true).charAt(0);
		replace = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int lenstr = str.length();
		int lensubstr = substr.length();
		int lenreplace = replace.length();
		int i;
		int j;
		int flag = 0; //flag=1????
		int pos; //???????????pos
		for (i = 0; i <= lenstr - lensubstr; i++)
		{
			for (j = 0; j < lensubstr; j++)
			{
				if (str.charAt(i + j) != substr.charAt(j)) //???????
				{
					break; //????
				}
			}
			if (j == lensubstr) //????
			{
				pos = i;
				flag = 1;
				break;
			}
		}
		if (flag != 0) //????
		{
			for (i = 0; i < pos; i++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.print(replace);
			System.out.print((str.Substring(pos) + lensubstr));
			System.out.print("\n");
		}
		else
		{
			System.out.print(str);
			System.out.print("\n");
		}
		return 0;
	}

}

