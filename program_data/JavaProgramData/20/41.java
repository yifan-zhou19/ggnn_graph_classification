package <missing>;

public class GlobalMembers
{
	public static void p_s(String str, String substr)
	{
		int i;
		int n;
		int len;
		final String s = "\0";
		len = str.length();
		for (i = 0,n = 0;i < len;i++)
		{
			if (str[n].compareTo(str[i]) < 0)
			{
				n = i;
			}
		}
		for (i = 0;i < len + 3;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, i <= n != 0? str[i]:(i <= n + 3? substr[i - n - 1]:str[i - 3]));
		}
		System.out.printf("%s\n",s);
	}
	public static void Main()
	{
		int i;
		int j;
		char[][] str = new char[10][10];
		char[][] substr = new char[10][3];
		for (i = 0;scanf("%s %s",str[i],substr[i]) != EOF;i++)
		{
			;
		}
		for (j = 0;j < i;j++)
		{
			p_s(str[j], substr[j]);
		}
	}
}

