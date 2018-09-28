import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10001]);
		int n;
		int i;
		int j;
		int k;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n + 1 ; i++)
		{
			a = new Scanner(System.in).nextLine();
			for (j = 0 ; a.charAt(j) != '\0' ; j++)
			{
				t = 0;
				for (k = 0 ; a.charAt(k) != '\0' ; k++)
				{
					if (a.charAt(k) == a.charAt(j))
					{
						t++;
					}
				}
				if (t == 1)
				{
					System.out.print(a.charAt(j));
					System.out.print("\n");
					break;
				}
				else if (a.charAt(j + 1) == '\0')
				{
					System.out.print("no");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

