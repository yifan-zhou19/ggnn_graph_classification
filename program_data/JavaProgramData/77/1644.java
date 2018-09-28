import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[109]);
	public static char boy;
	public static char girl;
	public static int l;
	public static void Match()
	{
		if (a.charAt(0) != boy)
		{
			return;
		}
		int i = 0;
		while (a.charAt(i) != girl)
		{
			i++;
		}
		int j = i - 1;
		while (a.charAt(j) == '0')
		{
			j--;
		}
		System.out.print(j);
		System.out.print(' ');
		System.out.print(i);
		System.out.print("\n");
		a = tangible.StringFunctions.changeCharacter(a, i, a[j] = '0');
		Match();
	}
	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		l = a.length();
		boy = a.charAt(0);
		girl = a.charAt(l - 1);
		Match();
		return 0;
	}
}

