import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int p = a.length();
		for (int i = 0;i < p;i++)
		{
		if (a.charAt(i) != ' ')
		{
		System.out.print(a.charAt(i));
		}
		if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
		{
		continue;
		}
		if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
		{
		System.out.print(" ");
		}
		}
		return 0;
	}
}
