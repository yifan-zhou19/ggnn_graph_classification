package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String a = new String(new char[103]);
		String b = new String(new char[103]);
		for (i = 0;i < 103;i++)
		{
			b = b.substring(0, i);
			a = a.substring(0, i);
		}
		a = new Scanner(System.in).nextLine();
		n = 0;
		for (i = 0;;i++)
		{
			if (a.charAt(i) != 0)
			{
				n++;
			}
			else if (a.charAt(i + 1) == 0)
			{
				break;
			}
			else
			{
				n++;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
		}
		b = tangible.StringFunctions.changeCharacter(b, n - 1, a.charAt(n - 1) + a.charAt(0));
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
		//printf("%s",b);
		return 0;
	}
}

