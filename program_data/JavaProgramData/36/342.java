package <missing>;

public class GlobalMembers
{
	public static int pd(String str)
	{
		int i;
		int z = 0;
		for (i = 0;i < 10;i++)
		{
			if (!str[i].equals('\0'))
			{
				z = 1;
				break;

			}
		}

	return (z);
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int return1;
		int return2;
		final String str1 = "";
		final String str2 = "";
		for (i = 0;i < 10;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, tempVar);
			}
			if (str1.charAt(i) == ' ')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, '\0');
				break;
			}

		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		n = str1.length();
		m = str2.length();
		if (m != n)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (str1.charAt(i) == str2.charAt(j))
					{
						str1 = tangible.StringFunctions.changeCharacter(str1, i, '\0');
						str2 = tangible.StringFunctions.changeCharacter(str2, j, '\0');
						j = n;

					}
				}

			}
			return1 = pd(str1);
			return2 = pd(str2);
			if (return1 == 0 && return2 == 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}

		}

		return 0;
	}
}

