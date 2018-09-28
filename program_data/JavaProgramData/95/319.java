package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String c1 = new String(new char[80]);
		c1 = new Scanner(System.in).nextLine();
		String c2 = new String(new char[80]);
		c2 = new Scanner(System.in).nextLine();
		int i;
		int j;
		int a = 0;
		int b = 0;
		for (i = 0;c1.charAt(i) != '\0';i++)
		{
			if (c1.charAt(i) <= 'Z' && c1.charAt(i) >= 'A')
			{
				c1 = tangible.StringFunctions.changeCharacter(c1, i, c1.charAt(i) + 32);
			}
			a++;
		}
		for (j = 0;c2.charAt(j) != '\0';j++)
		{
			if (c2.charAt(j) <= 'Z' && c2.charAt(j) >= 'A')
			{
				c2 = tangible.StringFunctions.changeCharacter(c2, j, c2.charAt(j) + 32);
			}
			b++;
		}
		int m = 0;
		for (i = 0;c1.charAt(i) != '\0' && c2.charAt(i) != '\0';i++)
		{
			if (c1.charAt(i) > c2.charAt(i))
			{
				System.out.print(">\n");
				break;
			}
			else if (c1.charAt(i) < c2.charAt(i))
			{
				System.out.print("<\n");
				break;
			}
			else
			{
				m++;
			}
		}
		if (a == b && a == m)
		{
			System.out.print("=\n");
		}
	}


}

