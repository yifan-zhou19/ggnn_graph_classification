package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		int i;
		int j;
		int k;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		k = a.length();
		for (i = 0;i < k;i++)
		{
			j = 0;
			while (a.charAt(i) != ' ' && a.charAt(i) != '\0')
			{
			d = tangible.StringFunctions.changeCharacter(d, j++, a.charAt(i++));
			}
			d = tangible.StringFunctions.changeCharacter(d, j, '\0');
			if (strcmp(b,d) == 0)
			{
				System.out.printf("%s",c);
			}
			else
			{
				System.out.printf("%s",d);
			}
			if (i == k)
			{
				System.out.print("\0");
			}
			else
			{
				System.out.print(" ");
			}
		}
		return 0;
	}

}

