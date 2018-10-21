import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int i;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();

		b = new Scanner(System.in).nextLine();
		for (i = 0;i < 80;i++)
		{
			if (a.charAt(i) > 96 && a.charAt(i) < 123)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			if (b.charAt(i) > 96 && b.charAt(i) < 123)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}

		}
		c = strcmp(a,b);
			if (c > 0)
			{
				System.out.print(">");
			}
			if (c < 0)
			{
				System.out.print("<");
			}
			if (c == 0)
			{
				System.out.print("=");
			}
		 return 0;
	}

}

