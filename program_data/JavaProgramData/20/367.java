package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[10]);
		String strc = new String(new char[13]);
		String substr = new String(new char[3]);
		char max;
		char num;
		int i;
		int n;
		while (scanf("%s%s",str,substr) != EOF)
		{
			n = str.length();
			max = 0;
			for (i = 0;i < n;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					num = i;
				}
			}
			for (i = 0;i <= num;i++)
			{
				strc = tangible.StringFunctions.changeCharacter(strc, i, str.charAt(i));
			}
			for (i = num + 1;i <= num + 3;i++)
			{
				strc = tangible.StringFunctions.changeCharacter(strc, i, substr.charAt(i - num - 1));
			}
			for (i = num + 4;i < n + 3;i++)
			{
				strc = tangible.StringFunctions.changeCharacter(strc, i, str.charAt(i - 3));
			}
			strc = tangible.StringFunctions.changeCharacter(strc, n + 3, '\0');
			System.out.printf("%s\n",strc);
		}
	}

}

