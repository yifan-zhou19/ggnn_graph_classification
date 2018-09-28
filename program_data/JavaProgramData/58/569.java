import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int t;
		String a = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine();
		for (i = 1;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			l = a.length();
			if (a.charAt(0) == '_' || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z'))
			{
				t = 1;
				for (j = 1;j < l;j++)
				{
					if (a.charAt(j) == '_' || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9'))
					{
						t = 1;
					}
					else
					{
						t = 0;
						break;
					}
				}
			}
			else
			{
				t = 0;
			}
			System.out.print(t);
			System.out.print("\n");
		}
		return 0;
	}
}

