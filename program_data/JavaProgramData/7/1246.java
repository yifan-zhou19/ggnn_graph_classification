package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		String substr = new String(new char[256]);
		String rep = new String(new char[256]);
		int i;
		int j;
		int flag = 1;
		int flag1 = 0;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		substr = ConsoleInput.readToWhiteSpace(true).charAt(0);
		rep = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int nlen = str.length();
		int slen = substr.length();
		int rlen = rep.length();
		if (slen != rlen)
		{
			System.out.print("hehe");
			System.out.print("\n");
		}
		for (i = 0; i < nlen; i++)
		{
			for (j = 0; j < slen; j++)
			{
				if (substr.charAt(j) != str.charAt(i + j))
				{
					flag = 0;
					break;
				}
				else
				{
					flag = 1;
				}
			}
			if (flag != 0)
			{
				for (int k = 0; k < slen; k++)
				{
					str = tangible.StringFunctions.changeCharacter(str, i + k, rep.charAt(k));
				}
				flag1 = 1;
			}
			if (flag1 != 0)
			{
				break;
			}
		}
		System.out.print(str);
		System.out.print('\n');
		return 0;
	}
}

