import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[2000]);
		char t;
		int i;
		int cnt = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i + 1) - a.charAt(i) == 0 || a.charAt(i + 1) - a.charAt(i) == 'a'-'A' || a.charAt(i + 1) - a.charAt(i) == 'A'-'a')
			{
				cnt++;
			}
			else
			{
				if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
				{
					t = a.charAt(i) - 32;
					System.out.print("(");
					System.out.print(t);
					System.out.print(",");
					System.out.print(cnt + 1);
					System.out.print(")");
				}
				else
				{
					t = a.charAt(i);
					System.out.print("(");
					System.out.print(t);
					System.out.print(",");
					System.out.print(cnt + 1);
					System.out.print(")");
				}
				cnt = 0;
			}
		}
		return 0;
	}
}
