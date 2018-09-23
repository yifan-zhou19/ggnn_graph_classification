package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str = new String(new char[20]);
		String substr = new String(new char[4]);
		String temp = new String(new char[20]);
		while (scanf("%s%s",str,substr) != EOF)
		{
		int len = str.length();
		char max = str.charAt(0);
		int a;
		int i;
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) > max)
			{
				max = str.charAt(i);
				a = i;
			}
		}

		int num = 0;
		for (i = a + 1;i < len;i++)
		{
		temp = tangible.StringFunctions.changeCharacter(temp, num, str.charAt(i));
		num++;
		}
		temp = tangible.StringFunctions.changeCharacter(temp, num, '\0');
		str = tangible.StringFunctions.changeCharacter(str, a + 1, '\0');

		str += substr;
		str += temp;
		System.out.printf("%s\n",str);
		}

	}


}

