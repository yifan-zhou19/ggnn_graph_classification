package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[10]);
		String substr = new String(new char[10]);
		int i;
		int max;
		while (scanf("%s%s",str,substr) != EOF)
		{
		max = 0;
			for (i = 0;i < str.length();i++)
			{
				if (str.charAt(i) > str.charAt(max))
				{
					max = i;
				}
			}
			for (i = 0;i <= max;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			for (i = 0;i < substr.length();i++)
			{
				System.out.printf("%c",substr.charAt(i));
			}
			for (i = max + 1;i < str.length();i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}
}
