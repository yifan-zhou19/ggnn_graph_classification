package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
			String str = new String(new char[14]);
			String substr = new String(new char[4]);
			String str1 = new String(new char[14]);
			String str2 = new String(new char[14]);
			int i = 0;
			int n;
			int k;
			char max;
			while (scanf("%s%s",str,substr) != EOF)
			{
			   n = str.length();
			for (i = 0,max = str.charAt(0);i < n;i++)
			{
					max = (max >= str.charAt(i))?max:str.charAt(i);
			}
			for (i = 0;i < n;i++)
			{
					if (str.charAt(i) == max)
					{
						break;
					}
			}
			k = i;
			str1 = str.substring(0, k + 1);
			str1 = tangible.StringFunctions.changeCharacter(str1, k + 1, '\0');
			for (i = 0;i < n - k - 1;i++)
			{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, str.charAt(k + 1 + i));
			}
			str2 = tangible.StringFunctions.changeCharacter(str2, i, '\0');
			str1 += substr;
			str1 += str2;
			System.out.printf("%s\n",str1);
			}
	}
}

