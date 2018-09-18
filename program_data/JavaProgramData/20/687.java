package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l1;
		int max;
		int l2;
		int i;
		int l;
		String str = new String(new char[100]);
		String substr = new String(new char[100]);
		while (scanf("%s%s",str,substr) != EOF)
		{
			l1 = str.length();
			max = 0;
			for (i = 0;i < l1;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					l = i;
				}
			}
			l2 = substr.length();
			for (i = l1 - 1;i > l;i--)
			{
				str = tangible.StringFunctions.changeCharacter(str, i + l2, str.charAt(i));
			}
			for (i = 0;i < l2;i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, l + i + 1, substr.charAt(i));
			}
			for (i = 0;i < l1 + l2;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\n");
		}
	}
}

