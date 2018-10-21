import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[105]);
		String b = new String(new char[105]);
		int n;
		int i;
		int[] c = new int[105];
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0 ; i <= n - 2 ; i++)
		{
			c[i] = (int)(a.charAt(i) + a.charAt(i + 1));
		}
		c[n - 1] = (int)(a.charAt(0) + a.charAt(n - 1));
		for (i = 0 ; i <= n - 1 ; i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, (char)c[i]);
			System.out.print(b.charAt(i));
		}
		return 0;
	}
}

