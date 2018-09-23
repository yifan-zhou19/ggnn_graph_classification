package <missing>;

public class GlobalMembers
{
	public static void change(String str)
	{
		int n;
		int i;
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (str[i].equals('('))
			{
				str[i] = '$';
			}
			else if (str[i].equals(')'))
			{
				str[i] = '?';
			}
			else
			{
				str[i] = ' ';
			}
		}
	}
	public static void match(String str)
	{
		int n;
		int i;
		int k;
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (str[i].equals(')'))
			{
				for (k = i;k >= 0;k--)
				{
					if (str[k].equals('('))
					{
						str[k] = ' ';
						str[i] = ' ';
						k = -1;
					}
				}
			}
		}
	}
	public static int Main()
	{
		char a;
		String string = new String(new char[100]);
		while (gets(String))
		{
			System.out.println(String);
			match(String);
			change(String);
			System.out.println(String);
		}
		return 0;
	}
}
