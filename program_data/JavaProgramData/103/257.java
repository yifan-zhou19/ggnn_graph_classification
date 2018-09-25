import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		int len = s.length();
		int i;
		int n = 1;
		for (i = 1; i < len;i++)
		{
			if (s.charAt(i) == s.charAt(i - 1) || s.charAt(i) - s.charAt(i - 1) == 'A'-'a' || s.charAt(i) - s.charAt(i - 1) == 'a'-'A')
			{
				n++;
			}
			else
			{
				System.out.print("(");
				System.out.print((char)Character.toUpperCase(s.charAt(i - 1)));
				System.out.print(",");
				System.out.print(n);
				System.out.print(")");
				n = 1;
			}
		}
		System.out.print("(");
		System.out.print((char)Character.toUpperCase(s.charAt(len - 1)));
		System.out.print(",");
		System.out.print(n);
		System.out.print(")");
		return 0;
	}
}
