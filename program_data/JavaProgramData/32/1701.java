package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String d = new String(new char[101]);
		String c = new String(new char[101]);
		int n;
		int i;
		int j;
		int k;
		int h;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;j < 101;j++)
			{
				if (a.charAt(j) == '\0')
				{
					break;
				}
			}
			for (k = 0;k < 101;k++)
			{
				if (b.charAt(k) == '\0')
				{
					break;
				}
			}
			for (h = 0;k >= 0;k--,j--,h++)
			{
				if (a.charAt(j) - b.charAt(k) < 0)
				{
					c = tangible.StringFunctions.changeCharacter(c, h, a.charAt(j) - b.charAt(k) + '0' + 10);
					a = tangible.StringFunctions.changeCharacter(a, j - 1, a.charAt(j - 1) - 1);
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, h, a.charAt(j) - b.charAt(k) + '0');
				}

			}
			for (;j >= 0;j--,h++)
			{
				c = tangible.StringFunctions.changeCharacter(c, h, a.charAt(j));
			}

		 for (k = h - 1;k > 0;k--)
		 {
			 if (c.charAt(k) != '0')
			 {
				 break;
			 }
		 }
		 for (;k > 0;k--)
		 {
			 System.out.print(c.charAt(k));
		 }
		 System.out.print("\n");
		}
		return 0;
	}
}

