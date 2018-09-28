package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		String num = new String(new char[4]);
		num = new Scanner(System.in).nextLine();
		n = Integer.parseInt(num);
		for (i = 0;i < n;i++)
		{
			String yl = new String(new char[256]);
			String bl = new String(new char[256]);
			yl = new Scanner(System.in).nextLine();
			a = yl.length();
			for (j = 0;j < a;j++)
			{
				if (yl.charAt(j) == 65)
				{
					bl = tangible.StringFunctions.changeCharacter(bl, j, 'T');
				}
				else if (yl.charAt(j) == 67)
				{
					bl = tangible.StringFunctions.changeCharacter(bl, j, 'G');
				}
				else if (yl.charAt(j) == 71)
				{
					bl = tangible.StringFunctions.changeCharacter(bl, j, 'C');
				}
				else
				{
					bl = tangible.StringFunctions.changeCharacter(bl, j, 'A');
				}
				System.out.printf("%c",bl.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}








}

