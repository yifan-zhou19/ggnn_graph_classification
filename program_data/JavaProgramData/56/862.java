package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		String a = new String(new char[5]);
		char mid;
		int n = 0;
		int i;
		while ((c = System.in.read()) != '\n')
		{
			a = tangible.StringFunctions.changeCharacter(a, n, c);
			n++;
		}
		for (i = 0;i < (n / 2);i++)
		{
			mid = a.charAt(i);
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(n - 1 - i));
			a = tangible.StringFunctions.changeCharacter(a, n - 1 - i, mid);
		}
		for (i = 0;i <= n - 1;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}


	}
}

