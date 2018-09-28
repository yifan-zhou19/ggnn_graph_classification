package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch1 = new String(new char[100]);
		String ch2 = new String(new char[100]);
		ch1 = new Scanner(System.in).nextLine();
		ch2 = new Scanner(System.in).nextLine();
		int i;
		int len1 = ch1.length();
		int len2 = ch2.length();
		int len = len1;

		if (len1 > len2)
		{
			len = len2;
		}
		for (i = 0;i < len1;i++)
		{
			if (ch1.charAt(i) >= 65 && ch1.charAt(i) <= 90)
			{
				ch1 = tangible.StringFunctions.changeCharacter(ch1, i, ch1.charAt(i) + 32);
			}
		}
		for (i = 0;i < len2;i++)
		{
			if (ch2.charAt(i) >= 65 && ch2.charAt(i) <= 90)
			{
				ch2 = tangible.StringFunctions.changeCharacter(ch2, i, ch2.charAt(i) + 32);
			}
		}
		for (i = 0;i < len;i++)
		{
			if (ch1.charAt(i) != ch2.charAt(i))
			{
				if (ch1.charAt(i) > ch2.charAt(i))
				{
					System.out.print(">");
					System.out.print("\n");
					return 0;
				}
				else
				{
					System.out.print("<");
					System.out.print("\n");
					return 0;
				}

			}
		}
		if (len1 > len2)
		{
			System.out.print(">");
			System.out.print("\n");
			return 0;
		}
		if (len1 < len2)
		{
				   System.out.print("<");
				   System.out.print("\n");
					return 0;
		}
		if (len1 == len2)
		{
			System.out.print("=");
			System.out.print("\n");
			 return 0;
		}
	}






}

