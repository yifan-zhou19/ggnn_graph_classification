package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String str1 = "a";
		final String str2 = "a";
		final String str3 = "a";
		final String str = "a";
		int i;
		int n;
		int k;
		int p;
		char max;
		while (scanf("%s%s",str1,str2) != EOF)
		{
			str3 = tangible.StringFunctions.changeCharacter(str3, 0, '\0');
			str = tangible.StringFunctions.changeCharacter(str, 0, '\0');
			p = 0;
			n = str1.length();
			max = str1.charAt(0);
			for (i = 0;i < n;i++)
			{
				if (str1.charAt(i) > max)
				{
					max = str1.charAt(i);
					k = i;
				}
			}
			for (i = k + 1;i < n;i++)
			{
				str3 = tangible.StringFunctions.changeCharacter(str3, p, str1.charAt(i));
				p++;
			}
			str3 = tangible.StringFunctions.changeCharacter(str3, p, '\0');
			str = str1.substring(0, k + 1);
			str = tangible.StringFunctions.changeCharacter(str, k + 1, '\0');
			str += str2;
			str += str3;
			System.out.println(str);
			System.out.print("\n");
		}
	}
}

