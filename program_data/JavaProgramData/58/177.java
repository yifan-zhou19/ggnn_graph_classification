import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = new Scanner(System.in).nextLine();
		for (i = 1;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			p = 1;
			for (j = 0;j < a.length();j++)
			{
				if ((a.charAt(0) >= 'a' && a.charAt(0) <= 'z' || a.charAt(0) >= 'A' && a.charAt(0) <= 'Z' || a.charAt(0) == '_') == 0)
				{
					System.out.print(0);
					System.out.print("\n");
					p = 0;
					break;
				}
				else if ((a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z' || a.charAt(j) == '_' || a.charAt(j) >= '0' && a.charAt(j) <= '9') == 0)
				{
					System.out.print(0);
					System.out.print("\n");
					p = 0;
					break;
				}
			}
			if (p == 1)
			{
				System.out.print(1);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

