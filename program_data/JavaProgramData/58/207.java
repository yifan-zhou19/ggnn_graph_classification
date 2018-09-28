import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 0; i < n; i++)
		{
			a = new Scanner(System.in).nextLine();
			int l;
			l = a.length();
			int t = (int)a.charAt(0);
			if ((t <= 90 && t >= 65) || (t <= 122 && t >= 97) || t == 95)
			{
				int j;
				for (j = 1; j < l; j++)
				{
					if ((a.charAt(j) > 90 || a.charAt(j) < 65) && (a.charAt(j) > 122 || a.charAt(j) < 97) && a.charAt(j) != 95 && (a.charAt(j) < 48 || a.charAt(j) > 57))
					{
						System.out.print(0);
						System.out.print("\n");
						break;
					}
					else
					{
						continue;
					}
				}
				if (j == l)
				{
					System.out.print(1);
					System.out.print("\n");
				}

			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
		}
	return 0;
	}
}

