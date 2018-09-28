import java.util.*;

package <missing>;

public class GlobalMembers
{
	// ???? ?? 1000062708
	public static int Main()
	{
		String s = new String(new char[1000001]);
		int n;
		int i;
		int j;
		char a;
		char b;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		a = s.charAt(0);
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) != a)
			{
				b = s.charAt(i);
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
				if (s.charAt(i) == b)
				{
					j = i - 1;
					while (s.charAt(j) != a)
					{
						j--;
					}
					s = tangible.StringFunctions.changeCharacter(s, i, ' ');
					s = tangible.StringFunctions.changeCharacter(s, j, ' ');
					System.out.print(j);
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
				}
		}
		return 0;
	}



}

