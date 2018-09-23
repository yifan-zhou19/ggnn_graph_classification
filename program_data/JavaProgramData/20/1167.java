package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		String str3 = new String(new char[100]);
		int temp1;
		int temp2;
		int l1;
		int l2;
		int max;
		while (scanf("%s%s",str1,str2) != EOF)
		{
			l1 = str1.length();
			l2 = str2.length();
			max = 0;
			for (temp1 = 1;temp1 <= l1 - 1;temp1++)
			{
				if (str1.charAt(temp1) > str1.charAt(max))
				{
					max = temp1;
				}
			}
			for (temp1 = max + 1,temp2 = 0;temp1 <= l1 - 1;temp1++,temp2++)
			{
				str3 = tangible.StringFunctions.changeCharacter(str3, temp2, str1.charAt(temp1));
				str1 = tangible.StringFunctions.changeCharacter(str1, temp1, '\0');
			}
			str3 = tangible.StringFunctions.changeCharacter(str3, temp2, '\0');
			str1 += str2;
			str1 += str3;
			System.out.println(str1);
		}
		return 0;
	}
}

