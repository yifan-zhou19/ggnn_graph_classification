package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "";
		final String temp = "";
		final String temp1 = "";
		int i = 0;
		int j = 0;
		int r = 0;
		int p = 0;
		int q = 0;
		int num;

		s = new Scanner(System.in).nextLine();
		num = s.length();

		for (i = 2;i <= num;i++)
		{
			for (j = 0;j <= s.length() - i;j++)
			{
				p = j;
				for (r = 0;r < i;r++)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, r, s.charAt(p));
					p++;
				}
			   for (q = 0;q < i;q++)
			   {
				   temp1 = tangible.StringFunctions.changeCharacter(temp1, q, temp.charAt(i - q - 1));
			   }
				if (strcmp(temp1,temp) == 0)
				{
			   System.out.printf("%s\n",temp);
				}

			}
		}
	}
}

