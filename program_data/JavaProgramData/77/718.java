package <missing>;

public class GlobalMembers
{
	public static int flag = 0;
	public static void f(int i, int j, String str, char ch)
	{
		if (flag == 1)
		{
			return;
		}
		if (i < 0)
		{
			f(j, j + 1, str, ch);
		}
		if (str[i].equals(str[0]))
		{
			if (str[j].equals(ch))
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
				if (str[j + 1].equals('\0'))
				{
					flag = 1;
				}
				str[i] = str[j] = ' ';
				f(i - 1, j + 1, str, ch);
			}
			else
			{
				f(j, j + 1, str, ch);
			}
		}
		else
		{
			f(i - 1, j, str, ch);
		}
	}
	public static int Main()
	{
		String str = new String(new char[200]);
		char ch;
		int i;
		int a = 0;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; str.charAt(i) != '\0'; i++)
		{
			if (str.charAt(i) != str.charAt(0))
			{
				ch = str.charAt(i);
				f(i - 1, i, str, ch);
				return 0;
			}
		}
	}
}

