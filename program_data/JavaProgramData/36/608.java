package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		String str1 = new String(new char[10]);
		String str2 = new String(new char[10]);
		char temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		n = str1.length();
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (str1.charAt(i) < str1.charAt(i + 1))
				{
					temp = str1.charAt(i);
					str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i + 1));
					str1 = tangible.StringFunctions.changeCharacter(str1, i + 1, temp);
				}
			}
		}
			n = str2.length();
			for (j = 1;j < n;j++)
			{
				for (i = 0;i < n - j;i++)
				{
					if (str2.charAt(i) < str2.charAt(i + 1))
					{
						temp = str2.charAt(i);
						str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i + 1));
						str2 = tangible.StringFunctions.changeCharacter(str2, i + 1, temp);
					}
				}
			}
				if (strcmp(str1,str2) == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}

	}
}

