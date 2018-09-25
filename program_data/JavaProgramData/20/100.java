package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[10]); //??result????????????????????
		String str1 = new String(new char[10]);
		String substr = new String(new char[4]);
		char letter;
		String result = new String(new char[13]);
		final String b = "";
		String string = new String(new char[13]);
		int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int m;
		int l;
		int i;
		int j;
		int time;
		for (time = 1;time < 100;time++)
		{
		for (i = 0;i < 10;i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, '\0');
		}
		for (i = 0;i < 13;i++)
		{
			result = tangible.StringFunctions.changeCharacter(result, i, '\0');
		}
		for (i = 0;i < 4;i++)
		{
			substr = tangible.StringFunctions.changeCharacter(substr, i, '\0');
		}
		for (i = 0;i < 10;i++)
		{
			a[i] = i;
		}
		for (i = 0;i < 10;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
		}
		for (i = 0;i < 13;i++)
		{
			String[i] = '\0';
		}

		String = new Scanner(System.in).nextLine();
		if (String.length() == 0)
		{
			break; //??????????????
		}
			for (i = 0;string.charAt(i) != ' ';i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, string.charAt(i));
			}
		//scanf("%s",str);
		//getchar ();//??????????????.
		//scanf("%s",substr);
		l = str.length();
		for (i = l + 1,j = 0;i < l + 4,j < 3;i++,j++)
		{
			substr = tangible.StringFunctions.changeCharacter(substr, j, string.charAt(i));
		}
		substr = tangible.StringFunctions.changeCharacter(substr, 3, '\0'); //???????????????????'\0'????????
		str1 = str;
		for (i = 0;i < l - 1;i++)
		{
			for (j = 0;j < l - i - 1;j++)
			{
				if (str1.charAt(j) < str1.charAt(j + 1))
				{
					letter = str1.charAt(j),m = a[j];
					str1 = tangible.StringFunctions.changeCharacter(str1, j, str1.charAt(j + 1),a[j] = a[j + 1]);
					str1 = tangible.StringFunctions.changeCharacter(str1, j + 1, letter,a[j + 1] = m);
				} //a[j]????str1[j]?????.
			}
		}
		m = a[0];
		result = str.substring(0, m + 1);
		result += substr; //??strcat,???strcpy!!
		for (i = 0;i < l - m - 1;i++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, str.charAt(i + m + 1));
		}
		b = str1.substring(0, l - m - 1); //???????????????.
		result += b;
		System.out.printf("%s\n",result);
		}
	}


}

