import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[110]);
		char a;
		char b;
		int i;
		int j;
		x = new Scanner(System.in).nextLine();
		a = x.charAt(0);
		for (i = 1;;i++)
		{
			if (x.charAt(i) != a)
			{
				b = x.charAt(i);
				break;
			}
		}
		for (i = 0;i < x.length();i++)
		{
			if (x.charAt(i) == b)
			{
				for (j = i - 1;;j--)
				{
					if (x.charAt(j) == a)
					{
						break;
					}
				}
				System.out.print(j);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
				x = tangible.StringFunctions.changeCharacter(x, j, x[i] = ' ');
			}
		}
		return 0;
	}
}

