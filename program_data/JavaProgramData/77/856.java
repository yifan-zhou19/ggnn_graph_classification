package <missing>;

public class GlobalMembers
{
	//****************************************
	//*????????                     **
	//*????? 1100012762                **
	//*???2011.11.22                     **
	//****************************************
	public static int flag = 0;
	public static String str = new String(new char[200]);
	public static char ch;
	public static void f(int i, int j)
	{
		if (flag == 1)
		{
			return;
		}
		if (i < 0)
		{
			f(j, j + 1);
		}
		if (str.charAt(i) == str.charAt(0))
		{
			if (str.charAt(j) == ch)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
				if (str.charAt(j + 1) == '\0')
				{
					flag = 1;
				}
				str = tangible.StringFunctions.changeCharacter(str, i, str[j] = ' ');
				f(i - 1, j + 1);
			}
			else
			{
				f(j, j + 1);
			}
		}
		else
		{
			f(i - 1, j);
		}
	}
	public static int Main()
	{
		int i;
		int a = 0;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; str.charAt(i) != '\0'; i++)
		{
			if (str.charAt(i) != str.charAt(0))
			{
				ch = str.charAt(i);
				f(i - 1, i);
				return 0;
			}
		}
	}
}

