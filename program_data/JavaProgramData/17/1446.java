import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		while (a = new Scanner(System.in).nextLine())
		{
			System.out.print(a);
			System.out.print("\n");
			final String a1 = " ";
			int len = a.length();
			int i = 0;
			int lnum = 0;
			int rnum = 0;
			for (i = 0; i < len; i++)
			{
				if (a.charAt(i) == '(')
				{
					b[lnum] = i;
					lnum++;
				}
				if (a.charAt(i) == ')')
				{
					rnum++;
					if (rnum > lnum)
					{
						a1 = tangible.StringFunctions.changeCharacter(a1, i, '?');
						rnum--;
					}
					else
					{
						lnum--;
						rnum--;
					}
				}
			}
			for (i = 0; i < lnum; i++)
			{
				a1 = tangible.StringFunctions.changeCharacter(a1, b[i], '$');
			}
			for (i = 0; i < len; i++)
			{
				if ((a1.charAt(i) == '$') || (a1.charAt(i) == '?'))
				{
					System.out.print(a1.charAt(i));
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.print("\n");
		}
		return 0;
	}
}

