package <missing>;

public class GlobalMembers
{
	public static int posi(String str)
	{
		int i;
		int k = 0;
		for (i = 1;i < str.length();i++)
		{
								  if (str[i].compareTo(str[k]) > 0)
								  {
									  k = i;
								  }
		}
		return k + 1;
	}
	public static int Main()
	{
		String str = new String(new char[20]);
		String substr = new String(new char[4]);
		while (scanf("%s%s",str,substr) != EOF)
		{
											int k;
											int i;
											int j;
											int l = str.length();
											k = posi(str);
											for (i = l;i >= k;i--)
											{
															 str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
											}
											for (i = 0;i < 3;i++)
											{
															str = tangible.StringFunctions.changeCharacter(str, k + i, substr.charAt(i));
											}
		System.out.printf("%s\n",str);
		}
	}


}

