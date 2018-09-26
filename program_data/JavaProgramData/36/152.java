package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int i;
		int j;
		int len1;
		int len2;
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
		if ((len1 = str1.length()) != (len2 = str2.length()))
		{
			System.out.print("NO\n");
		}
			 else
			 {
		for (i = 0;i < len1;i++)
		{
			for (j = 0;j < len2;j++)
			{
				if (str1.charAt(i) == str2.charAt(j))
				{
					str1 = tangible.StringFunctions.changeCharacter(str1, i, '\0', str2[j] = '\0');
				}
			}
		}
		for (i = 0;i < len1;i++)
		{
			if (str1.charAt(i) != '\0')
			{
				break;
			}
		}
		if (i < len1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.print("YES\n");
		}
			 }
	}
}

