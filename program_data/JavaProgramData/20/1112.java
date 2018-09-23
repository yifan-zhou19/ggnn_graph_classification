package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[10]);
	public static String substr = new String(new char[3]);
	public static int pan()
	{
		int j;
		int i;
		int x;
		int qq = str.length() - 1;
		for (i = 0;i < str.length();i++)
		{
			x = 0;
			for (j = 0;j < str.length();j++)
			{
				if (str.charAt(i) < str.charAt(j))
				{
					x = 0;
					break;
				}
				x = 1;
			}
			if (x == 1)
			{
				qq = i;
				break;
			}
		}
		return qq;
	}




	public static int Main()
	{
		while (scanf("%s %s",str,substr) != EOF)
		{
			int i;
			for (i = 0;i <= pan();i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			for (i = 0;i < 3;i++)
			{
				System.out.printf("%c",substr.charAt(i));
			}
			for (i = pan() + 1;i < str.length();i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}
}
