package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[13]);
		String substr = new String(new char[3]);
		int i = 0;
		int max;
		int j;
		int n;
		int k;


	for (k = 0;k < 100;k++)
	{
		for (i = 0;i < 13;i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, '\0');
		}

		for (i = 0;i < 3;i++)
		{
		substr = tangible.StringFunctions.changeCharacter(substr, i, '\0');
		}

		max = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			substr = tempVar2.charAt(0);
		}

		n = str.length();

		for (i = 0;i < n;i++)
		{
			max = (max > str.charAt(i))?max:str.charAt(i);
		}

		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) == max)
			{
				for (j = n - 1;j > i;j--)
				{
					str = tangible.StringFunctions.changeCharacter(str, j + 3, str.charAt(j));
				}
				str = tangible.StringFunctions.changeCharacter(str, i + 1, substr.charAt(0));
				str = tangible.StringFunctions.changeCharacter(str, i + 2, substr.charAt(1));
				str = tangible.StringFunctions.changeCharacter(str, i + 3, substr.charAt(2));
				break;
			}
		}


			System.out.printf("%s\n",str);

	}



	}
}

