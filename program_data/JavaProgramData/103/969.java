package <missing>;

public class GlobalMembers
{
	// 2011???.cpp : ??????????????
	//
	public static int Main()
	{
		String str = new String(new char[10000]);
		char now;
		int len;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		int num = 1;
		int time = 0;
		for (int j = 0;j < len;j++)
		{
			if (str.charAt(j) < 'z' + 1 && str.charAt(j)>'a' - 1)
			{
				str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j) + 'A'-'a');
			}
		}
		now = str.charAt(0);
		System.out.print('(');
		System.out.print(now);
		System.out.print(',');
		for (int i = 1;i < len;i++)
		{
			if (str.charAt(i) == str.charAt(i - 1))
			{
				num = num + 1;
			}
			else
			{
				System.out.print(num);
				System.out.print(')');
				now = str.charAt(i);
				num = 1;
				System.out.print('(');
				System.out.print(now);
				System.out.print(',');
			}
		}
		System.out.print(num);
		System.out.print(')');
		System.out.print("\n");
		return 0;
	}
}

