import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]); //???????
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine(); //????
		int n; //????
		int m;
		n = a.length();
		m = b.length();
		int i; //????
		for (i = 0;(i < m) || (i < n);i++)
		{
			if (a.charAt(i) > 90)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			if (b.charAt(i) > 90)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
		}

			if (strcmp(a,b) == 0)
			{
				System.out.print("=");
			}
			if (strcmp(a,b) < 0)
			{
				System.out.print("<");
			}

			if (strcmp(a,b) > 0)
			{
				System.out.print(">");
			}



			return 0;
	}

}

