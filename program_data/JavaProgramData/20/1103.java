package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[14]);
		String substr = new String(new char[4]);
		int l;
		int max;
		int n;
		int i;
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (substr = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			l = str.length();
			max = str.charAt(0);
			n = 0;
			for (i = 0;i < l;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					//cout<<i<<" ";
					n = i;
				}
			}
			for (i = l + 3;i >= n + 4;i--)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i - 3));
			}
			str = tangible.StringFunctions.changeCharacter(str, n + 1, substr.charAt(0));
			str = tangible.StringFunctions.changeCharacter(str, n + 2, substr.charAt(1));
			str = tangible.StringFunctions.changeCharacter(str, n + 3, substr.charAt(2));
			System.out.print(str);
			System.out.print("\n");

		}
		return 0;
	}
}

