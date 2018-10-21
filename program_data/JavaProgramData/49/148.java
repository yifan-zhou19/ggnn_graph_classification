package <missing>;

public class GlobalMembers
{
	/*
	 * file    homework 9_5
	 * author  ??
	 * date    2010-11-24
	 * description
	           ???????????????????
	*/



	public static int isHuiwen(String hw)
	{
		int len;
		int i;
		len = hw.length();
		for (i = 0; i <= (len - 1) / 2; i++)
		{
			if (!hw[i].equals(hw[len - 1 - i]))
			{
				break;
			}
		}
		if (i > (len - 1) / 2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		String str = new String(new char[501]);
		String hw = new String(new char[501]);
		int i;
		int j;
		int len;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		for (i = 2; i <= len; i++) // i????????
		{
			for (j = 0; j <= len - i; j++)
			{
				hw = str.substring(j, j + i);
				hw = tangible.StringFunctions.changeCharacter(hw, i, '\0');
				if (isHuiwen(hw) != 0)
				{
					System.out.print(hw);
					System.out.print("\n");
				}
			}
		}

		return 0;
	}


}

