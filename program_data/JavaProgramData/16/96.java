package <missing>;

public class GlobalMembers
{
	//??????????
	public static int Main()
	{
		String num = new String(new char[5]);
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int nl = num.length();

		int i;
		for (i = 0; i < (int)(nl / 2); i++)
		{
			char k;
			k = num.charAt(i);
			num = tangible.StringFunctions.changeCharacter(num, i, num.charAt(nl - 1 - i));
			num = tangible.StringFunctions.changeCharacter(num, nl - 1 - i, k);
		}

		System.out.print(num);
		System.out.print("\n");


		return 0;
	}



}

