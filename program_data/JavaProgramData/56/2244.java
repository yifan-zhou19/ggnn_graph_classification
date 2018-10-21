package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10]);

		int i;
		int j;
		int k;
		int n;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i <= (n - 1) / 2;i++)
		{
		k = a.charAt(i);
		a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(n - 1 - i));
		a = tangible.StringFunctions.changeCharacter(a, n - 1 - i, k);
		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%d",a.charAt(i) - '0');
		}
	}
}

