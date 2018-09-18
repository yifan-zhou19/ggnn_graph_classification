package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[15]);
		String substr = new String(new char[4]);
		int i;
		int maxi;
		int L;
		while (scanf("%s%s",str,substr) != EOF)
		{
			maxi = 0;
			i = 1;
			while (str.charAt(i) != null)
			{
				if (str.charAt(i) > str.charAt(maxi))
				{
					maxi = i;
				}
				i++;
			}
			L = str.length();
			i = L;
			while (i != maxi)
			{
				str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
				i--;
			}
			i = 0;
			while (i < 3)
			{
				str = tangible.StringFunctions.changeCharacter(str, maxi + 1 + i, substr.charAt(i));
				i++;
			}
			System.out.printf("%s\n",str);
		}
		return 0;
	}
}

