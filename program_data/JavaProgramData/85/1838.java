import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[21]);
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (j = 0;j < n;j++)
		{
			a = new Scanner(System.in).nextLine();
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (i == 0)
				{
					if (a.charAt(i) < 65 || (a.charAt(i)>90 && a.charAt(i) < 95) || a.charAt(i) == 96 || a.charAt(i)>122)
					{
						System.out.print("no");
						System.out.print("\n");
						break;
					}
				}
				else
				{
					if (a.charAt(i) < 48 || (a.charAt(i)>57 && a.charAt(i) < 65) || (a.charAt(i)>90 && a.charAt(i) < 95) || a.charAt(i) == 96 || a.charAt(i)>122)
					{
						System.out.print("no");
						System.out.print("\n");
						break;
					}
				}
				if (i == a.length() - 1)
				{
					System.out.print("yes");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

