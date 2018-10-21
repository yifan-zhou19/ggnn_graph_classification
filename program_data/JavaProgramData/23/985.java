package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int n = 0;
		int i = 0;
		int j;
		a = new Scanner(System.in).nextLine();
		while (a.charAt(i) != '\0')
		{
			n++;
			i++;
		}
		i = n - 1;
		a = tangible.StringFunctions.changeCharacter(a, n, ' ');
		while (i >= 0)
		{
			if (a.charAt(i) == ' ')
			{
				for (j = i + 1;a.charAt(j) != ' ';j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print(" ");
			}
			if (i == 0)
			{
				for (j = 0;a.charAt(j) != ' ';j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
			}
			i--;
		}
		return 0;
	}
}

