package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 100;i++)
		{
			if (a.charAt(i) != '\0')
			{
				n++;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i != n - 1)
			{
				 b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
				 System.out.printf("%c",b.charAt(i));
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(0));
				System.out.printf("%c\n",b.charAt(i));
			}
		}
		return 0;
	}
}

