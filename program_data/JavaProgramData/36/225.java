package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		String str1 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		int i;
		int j;
		int len = str.length();
		int len1 = str1.length();
		if (len != len1)
		{
			System.out.print("NO\n");
		}
		else
		{
			for (i = 0;i < len - 1;i++)
			{
				for (j = i + 1;j < len;j++)
				{
					if (str.charAt(i) > str.charAt(j))
					{
						char temp = str.charAt(i);
						str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(j));
						str = tangible.StringFunctions.changeCharacter(str, j, temp);
					}
				}
			}
			for (i = 0;i < len1 - 1;i++)
			{
				for (j = i + 1;j < len1;j++)
				{
					if (str1.charAt(i) > str1.charAt(j))
					{
						char temp = str1.charAt(i);
						str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(j));
						str1 = tangible.StringFunctions.changeCharacter(str1, j, temp);
					}
				}
			}
			if (strcmp(str,str1) == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}
}

