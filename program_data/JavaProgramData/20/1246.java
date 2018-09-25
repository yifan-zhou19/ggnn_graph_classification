package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		int len;
		int max;
		int i;
		while (scanf("%s%s",str,substr) != EOF)
		{
			len = str.length();
			max = 0;
			for (i = 0;i < len;i++)
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
			for (i = 0;i < 3;i++)
			{
			System.out.printf("%c",substr.charAt(i));
			}
			if (max != len - 1)
			{
			for (i = max + 1;i < len;i++)
			{
			System.out.printf("%c",str.charAt(i));
			}
			}
			System.out.print("\n");
		}
		return 0;
	}
}
