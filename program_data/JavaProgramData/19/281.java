package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i;
		int k;
		int x;
		int h = 0;
		String a = new String(new char[100]);
		String b = new String(new char[10]);
		String c = new String(new char[10]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		x = b.length();




		for (i = 0;i < x;i++)
		{
			if (a.charAt(i) != b.charAt(i))
			{
				break;
			}
			h++;
		}
		if (h == x)
		{
			for (i = 0;i < x;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '0');
			}
			n = 1;
		}




		h = 0;
		for (i = 1;a.charAt(i + 2) != '\0';i++)
		{
			h = 0;
			if (a.charAt(i) == ' ')
			{
				for (k = 0;k < x;k++)
				{
					if (a.charAt(i + k + 1) != b.charAt(k))
					{
						break;
					}
					h++;
				}
			}
			if (h == x)
			{
				for (k = 0;k < x;k++)
				{
					a = tangible.StringFunctions.changeCharacter(a, i + k + 1, '0');
				}
			}
		}



		if (n != 0)
		{
			System.out.printf("%s",c);
			for (i = x;a.charAt(i) != '\0';i++)
			{
			   if (a.charAt(i) >= 'A' && a.charAt(i) <= 'z')
			   {
				   System.out.printf("%c",a.charAt(i));
			   }
			   else if (a.charAt(i) == '0')
			   {
				   continue;
			   }
			   else
			   {
				if (a.charAt(i) == ' ' && a.charAt(i + 1) == '0')
				{
					System.out.printf(" %s",c);
				}
				else
				{
					System.out.print(" ");
				}
			   }
			}
		}



		else
		{
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'z')
			{
				System.out.printf("%c",a.charAt(i));
			}
			else if (a.charAt(i) == '0')
			{
				continue;
			}
			else
			{
				if (a.charAt(i) == ' ' && a.charAt(i + 1) == '0')
				{
					System.out.printf(" %s",c);
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
		}
		return 0;
	}

}

