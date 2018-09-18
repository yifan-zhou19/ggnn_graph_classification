package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str = new String(new char[20]);
		String substr = new String(new char[20]);
		String str2 = new String(new char[20]);
		while (scanf("%s%s",str,substr) != EOF)
		{

			int i;
			int j;
			int k;
			int len = str.length();
			int max = str.charAt(0);
			for (i = 0;i < len;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					k = i;
				}
			}
			for (j = k + 1;j < len;j++)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, j - k - 1, str.charAt(j));
			}
			str = tangible.StringFunctions.changeCharacter(str, k + 1, '\0');
			str2 = tangible.StringFunctions.changeCharacter(str2, len - k - 1, '\0');
			str += substr;
			str += str2;
			System.out.printf("%s\n",str);

		}
	}

}

