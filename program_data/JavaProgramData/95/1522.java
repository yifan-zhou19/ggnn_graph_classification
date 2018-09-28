package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i = 1;
		 int c = 0;
		String a = new String(new char[82]);
		String b = new String(new char[82]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i <= 81;i++)
		{
			if (b.charAt(i) == '\0')
			{
				break;
			}
			else
			{
				if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
				}

			}
		}
		 for (i = 0;i <= 81;i++)
		 {
			if (a.charAt(i) == '\0')
			{
				break;
			}
			else
			{
				if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
				}

			}
		 }
		for (i = 0;i <= 81;i++)
		{
		if (a.charAt(i) == '\0')
		{
				break;
		}
		else
		{
			c += a.charAt(i) - b.charAt(i);
		}
		}
		if (c == 0)
		{
		System.out.print("=");
		}
	   if (c >= 1)
	   {
			  System.out.print(">");
	   }
	   if (c <= -1)
	   {
	System.out.print("<");
	   }
		 return 0;

	}

}

