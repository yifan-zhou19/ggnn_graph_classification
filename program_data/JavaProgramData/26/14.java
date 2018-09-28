package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char i; //??????????
		char c;
		char t = 0;
		String str = new String(new char[100]);
		for (i = 0;i <= t;i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, System.in.read());
			t = t + 1;
			if (str.charAt(i) == '\n') //?????????????
			{
				break;
			}
		}
		for (i = 0;i < t;i++)
		{
			if (str.charAt(i) != ' ')
			{
				System.out.print(str.charAt(i));
			}
			if (str.charAt(i) == ' ')
			{
				if (str.charAt(i - 1) != ' ') //???????????????
				{
					System.out.print(str.charAt(i));
				}
				if (str.charAt(i - 1) == ' ') //??????????
				{
					continue;
				}
			}
		}

		return 0;
	}
}

