package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int p = 0;
		int k;
		String s = new String(new char[10000]);
		String ch = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
		for (j = 0;(s.charAt(i) != ' ' && s.charAt(i) != '\0');i++, j++)
		{
				ch = tangible.StringFunctions.changeCharacter(ch, j, s.charAt(i));
		}
		ch = tangible.StringFunctions.changeCharacter(ch, j, '\0');
		if (strcmp(ch,a) == 0)
		{
			ch = b;
		}
		if (p > 0)
		{
			System.out.print(" ");
		}
		System.out.printf("%s",ch);
		for (k = 0;k <= j;k++)
		{
			ch = tangible.StringFunctions.changeCharacter(ch, k, '\0');
		}
		p++;
		}
	}

}

