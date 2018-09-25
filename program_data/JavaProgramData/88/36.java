package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30]);
		String b = new String(new char[30]);
		int i;
		int n;
		int z;
		int x = 1;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if ((a.charAt(i) > 47) && (a.charAt(i) < 58))
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i));
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '\n');
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b.charAt(i) != '\n')
			{
				z = i;
				break;
			}
		}
		System.out.printf("%c",b.charAt(z));
		for (i = z + 1;i < n;i++)
		{
			if ((b.charAt(i) != '\n') || (b.charAt(i - 1) != '\n'))
			{
				System.out.printf("%c",b.charAt(i));
			}
		}
	}
}

