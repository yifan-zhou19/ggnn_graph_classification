package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1002]);
		a = new Scanner(System.in).nextLine();
		int suma;
		int i;
		suma = a.length();
		for (i = 0;i < suma;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			}
		}
		char b;
		b = a.charAt(0);
		int c = 0;
		for (i = 0;i < suma;i++)
		{
			if (a.charAt(i) == b)
			{
				c++;
			}
			else
			{
				System.out.printf("(%c,%d)",b,c);
				b = a.charAt(i);
				c = 1;
			}
		}
		System.out.printf("(%c,%d)",b,c);
	}
}

