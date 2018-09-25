package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int j;
		String str = new String(new char[10]);
		String substr = new String(new char[3]);
		char d = 0;
		for (j = 0;;j++)
		{
			d = '\0';
			if (scanf("%s %s", str, substr) == EOF)
			{
				break;
			}
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) > d)
			{
			k = i;
			d = str.charAt(i);
			}
		}
		for (i = 0;i < k + 1;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.printf("%s",substr);
		for (;i < str.length() - 1;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.printf("%c\n",str.charAt(i));
		}

	}
}
