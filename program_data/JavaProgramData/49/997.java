package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int check = char str[];
		String string = new String(new char[1000]);
		String = new Scanner(System.in).nextLine();
		int n;
		int i;
		n = String.length();
		int j;
		int k;
		int m;
		int w = 0;
		int r;
		String str2 = new String(new char[1000]);
		for (j = 2;j < n;j++)
		{
					 for (m = 0;m <= n - j;m++)
					 {
									 for (k = m;k < m + j;k++)
									 {
													 str2 = tangible.StringFunctions.changeCharacter(str2, w, string.charAt(k));
													 w++;
													 str2 = tangible.StringFunctions.changeCharacter(str2, w, '\0');
													 if (k == n)
													 {
													 break;
													 }
									 }
									 r = check(str2);
									 if (r == 1)
									 {
									 System.out.printf("%s\n", str2);
									 }
									 w = 0;
					 }
		}
		return 0;
	}

			  public static int check(String str)
			  {
			int n;
			String str1 = new String(new char[1000]);
			str1 = str;
			n = str.length();
			int i;
			char c;
			for (i = 0;i <= (n - 1) / 2;i++)
			{
				   c = str[i];
				   str[i] = str[n - 1 - i];
				   str[n - 1 - i] = c;
			}
			if (strcmp(str,str1) == 0)
			{
			return 1;
			}
			else
			{
			return 0;
			}
			  }


}

