package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int j;
		String a = new String(new char[100]);
		char[] b = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String c = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		k = a.length();
		for (j = 0;j < k - 1;j++)
		{
			b[j] = a.charAt(j + 1) + a.charAt(j);
		}
		b[k - 1] = a.charAt(k - 1) + a.charAt(0);
		for (j = 0;j < k;j++)
		{
			c = tangible.StringFunctions.changeCharacter(c, j, (char)b[j]);
			System.out.printf("%c",c.charAt(j));
		}
		return 0;
	}
}

