package <missing>;

public class GlobalMembers
{
	public static void charReverse(String str, int beg, int end)
	{
		int i;
		for (i = 0; i < (end - beg + 1) / 2;i++)
		{
			 char ch = str[beg + i];
			 str[beg + i] = str[end - i];
			 str[end - i] = ch;
		}
	}

	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		int i = 0;
		int j = 0;
		for (; j <= (int)str.length(); j++)
		{
			if (str.charAt(j) == ' ' || str.charAt(j) == '\0')
			{
				 charReverse(str, i, j - 1);
				 i = j + 1;
			}
		}
		charReverse(str, 0, str.length() - 1);
		System.out.printf("%s\n", str);
		return 0;
	}
}
