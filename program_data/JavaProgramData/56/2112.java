package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[6]);
		char c;
		int j;
		int k;
		int n = 0;
		do
		{
			 n++;
			 ch = tangible.StringFunctions.changeCharacter(ch, n - 1, System.in.read());
		}while (ch.charAt(n - 1) != '\n');
		n--;
		for (j = 0;j < n / 2;j++)
		{
			c = ch.charAt(j);
			ch = tangible.StringFunctions.changeCharacter(ch, j, ch.charAt(n - 1 - j));
			ch = tangible.StringFunctions.changeCharacter(ch, n - 1 - j, c);
		}
		for (k = 0;k < n;k++)
		{
		   System.out.print(ch.charAt(k));
		}
		return 0;
	}
}

