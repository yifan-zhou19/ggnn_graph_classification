import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String line = "";
		final String out = "";
		int i;
		int n = 0;
		int[] num = new int[110];
		line = new Scanner(System.in).nextLine();
		for (i = 0;i < line.length();i++)
		{
			if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z')
			{
				line = tangible.StringFunctions.changeCharacter(line, i, line.charAt(i) - 'a'+'A');
			}
		}
		out = tangible.StringFunctions.changeCharacter(out, 0, line.charAt(0));
		num[0] = 1;
		for (i = 1;i < line.length();i++)
		{
			if (out.charAt(n) == line.charAt(i))
			{
				num[n]++;
			}
			else
			{
				n++;
				out = tangible.StringFunctions.changeCharacter(out, n, line.charAt(i));
				num[n]++;
			}
		}
		for (i = 0;i <= n;i++)
		{
			System.out.print("(");
			System.out.print(out.charAt(i));
			System.out.print(",");
			System.out.print(num[i]);
			System.out.print(")");
		}
			return 0;
	}
}

