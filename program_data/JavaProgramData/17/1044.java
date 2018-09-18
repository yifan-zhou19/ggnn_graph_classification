package <missing>;

public class GlobalMembers
{
	public static int a;
	public static String str = new String(new char[100]);
	public static void find()
	{ //?????????????
		int i = 0;
		int p = -1;
		int q = -1;
		for (i = 0;i < a;i++)
		{
			if (str.charAt(i) != '(' && str.charAt(i) != ')')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, '\0'); //???????
			}
			if (str.charAt(i) == '(')
			{
				p = i; //????????????
			}
			if (p != -1 && str.charAt(i) == ')')
			{
				q = i;
				break;
			} //???????????
		}
		if (p != -1 && q != -1)
		{
			str = tangible.StringFunctions.changeCharacter(str, p, '\0');
			str = tangible.StringFunctions.changeCharacter(str, q, '\0');
			find();
		} //??????????????
	}
	public static int Main()
	{
		int i;
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{ //?????
			System.out.print(str);
			System.out.print("\n");
			a = str.length(); //????????
			find();
			for (i = 0;i < a;i++)
			{
				if (str.charAt(i) == '(')
				{
					System.out.print("$");
				}
				else
				{
					if (str.charAt(i) == ')')
					{
						System.out.print("?");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

