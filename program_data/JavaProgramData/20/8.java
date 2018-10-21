package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l1;
		String str1 = new String(new char[15]);
		String str2 = new String(new char[4]);
		char c;
		char d;
		while (scanf("%s",str1) != EOF)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str2 = tempVar.charAt(0);
			}
			c = 0;
			l1 = str1.length();
			for (i = 0;i < l1;i++)
			{
				d = (int)str1.charAt(i);
				if (d > c)
				{
					c = d;
					j = i;
				}
			}
			for (k = l1 + 2,str1[k + 1] = '\0';k > j;k--)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, k, str1.charAt(k - 3));
			}
			str1 = tangible.StringFunctions.changeCharacter(str1, j + 3, str2.charAt(2));
			str1 = tangible.StringFunctions.changeCharacter(str1, j + 2, str2.charAt(1));
			str1 = tangible.StringFunctions.changeCharacter(str1, j + 1, str2.charAt(0));
			System.out.println(str1);
		}
	}
}

