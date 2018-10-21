import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[5000]);
		int n = 0;
		s = new Scanner(System.in).nextLine();
		for (int i = 0;i < s.length();i++)
		{
			if (i == 0)
			{
				System.out.print("(");
				if (s.charAt(i) >= 'a')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a'+'A');
				}
				System.out.print(s.charAt(i));
				System.out.print(",");
				n++;
			}
			else
			{
				if (s.charAt(i) >= 'a')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a'+'A');
				}
				if (s.charAt(i) == s.charAt(i - 1))
				{
					n++;
				}
				else
				{
					System.out.print(n);
					System.out.print(")(");
					System.out.print(s.charAt(i));
					System.out.print(",");
					n = 1;
				}
			}
		}
		System.out.print(n);
		System.out.print(")");
		return 0;
	}
}

