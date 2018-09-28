package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[100]);
		String a = new String(new char[100]);
		int i;
		int l;
		int j = 0;
		int[] b = new int[100];
		for (i = 0;i < 100;i++)
		{
			c = c.substring(0, i);
			a = a.substring(0, i);
		}
		c = new Scanner(System.in).nextLine();
		l = c.length();
		for (i = 0;i < l - 1;i++)
		{
			b[i] = c.charAt(i) + c.charAt(i + 1);
			a = tangible.StringFunctions.changeCharacter(a, i, b[i]);
		}
		b[l - 1] = c.charAt(0) + c.charAt(l - 1);
		a = tangible.StringFunctions.changeCharacter(a, l - 1, b[l - 1]);
		for (i = 0;i < l;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
	}
}

