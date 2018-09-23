import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		String b = new String(new char[1001]);
		int[] c = new int[1001];
		int i;
		int t = 0;
		a = new Scanner(System.in).nextLine();

		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == a.charAt(i - 1) || a.charAt(i) - a.charAt(i - 1) == 32 || a.charAt(i - 1) - a.charAt(i) == 32)
			{
				c[t]++;
			}
			else
			{
				t++;
				b = tangible.StringFunctions.changeCharacter(b, t, a.charAt(i));
				c[t]++;


			}
		}
		for (i = 0;i <= 1000;i++)
		{
			if (c[i] != 0)
			{
				if (b.charAt(i) - 'a' >= 0)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
				}
				System.out.print("(");
				System.out.print(b.charAt(i));
				System.out.print(",");
				System.out.print(c[i]);
				System.out.print(")");
			}
		}
		return 0;
	}

}

