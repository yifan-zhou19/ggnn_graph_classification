package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
		int l1;
		int l2;
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l1 = str1.length();
		l2 = str2.length();
		if (l1 != l2)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
				for (int i = 0;i < l1;i++)
				{
				   for (int j = 1;j < l1 - i;j++)
				   {
					   if (str1.charAt(j) < str1.charAt(j - 1))
					   {
						   char temp;
						   temp = str1.charAt(j);
						   str1 = tangible.StringFunctions.changeCharacter(str1, j, str1.charAt(j - 1));
						   str1 = tangible.StringFunctions.changeCharacter(str1, j - 1, temp);
					   }
					   if (str2.charAt(j) < str2.charAt(j - 1))
					   {
						   char temp;
						   temp = str2.charAt(j);
						   str2 = tangible.StringFunctions.changeCharacter(str2, j, str2.charAt(j - 1));
						   str2 = tangible.StringFunctions.changeCharacter(str2, j - 1, temp);
					   }
				   }
				}
				if (strcmp(str1,str2) == 0)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else
				{
					System.out.print("NO");
					System.out.print("\n");
				}
		}
		return 0;
	}


}

