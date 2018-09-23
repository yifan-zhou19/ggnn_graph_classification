package <missing>;

public class GlobalMembers
{
	public static int a(String str)
	{
		int i;
		int k = 0;
		for (i = 1;i <= str.length() - 1;i++)
		{
			if (str[i].compareTo(str[k]) > 0)
			{
				k = i;
			}
		}
		return (k);
	}
	public static void b(String str, String substr, int k)
	{
		String str2 = new String(new char[100]);
		int i;
		for (i = 0;i <= str.length() - 2 - k;i++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, str[i + k + 1]);
		}
		str2 = str2.substring(0, i);
		str[k + 1] = '\0';
		str += substr;
		str += str2;
	}
	public static int Main()
	{
		int k;
		int i = 0;
		String str = new String(new char[100]);
		String substr = new String(new char[100]);
		char[][] str1 = new char[100][100];
		while (scanf("%s%s",str,substr) != EOF)
		{
		k = a(str);
		b(str, substr, k);
		i++;
		str1[i] = str;
		}
		for (k = 1;k <= i;k++)
		{
			System.out.println(str1[k]);
		}
	}



}

