package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		String str = new String(new char[101]);
		for (i = 0;;i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, System.in.read());
			if (str.charAt(i) == '\n')
			{
				break;
			}
		}
		n = i;
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.print(str.charAt(i));
			}
			else if (str.charAt(i) == ' ' && str.charAt(i - 1) != ' ' || str.charAt(i) != ' ')
			{
				System.out.print(str.charAt(i));
			}
		}
	}

}

