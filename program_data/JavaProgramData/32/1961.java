package <missing>;

public class GlobalMembers
{
	public static int minus(String str2)
	{
		int len1;
		int len2;
		int i;
		final String str = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tangible.StringFunctions.changeCharacter(str, 0, tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tangible.StringFunctions.changeCharacter(str, 1, tempVar2);
		}
		len1 = String.valueOf(str.charAt(0)).length();
		len2 = String.valueOf(str.charAt(1)).length();
		for (i = len1 - 1;i >= len1 - len2;i--)
		{
			if (str.charAt(0)[i] >= str.charAt(1)[i - len1 + len2])
			{
				str.charAt(0)[i] = str.charAt(0)[i] - str.charAt(1)[i - len1 + len2] + 48;

			}
			else
			{
				str.charAt(0)[i - 1] = str.charAt(0)[i - 1] - 1;
				str.charAt(0)[i] = str.charAt(0)[i] - str.charAt(1)[i - len1 + len2] + 58;
			}
		}
		for (i = 0;i < len1;i++)
		{
			str2[i] = str.charAt(0)[i];
		}
		return 0;


	}
	public static int Main()
	{
		int n;
		int k;
		final String str2 = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			minus(str2.charAt(k));
		}
		for (k = 0;k < n;k++)
		{
			System.out.printf("%s\n",str2.charAt(k));
		}



	return 0;
	}


}

