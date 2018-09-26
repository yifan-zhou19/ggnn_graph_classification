import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int length;
		String a = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine();
		for (i = 1;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			length = a.length();
			for (j = 0;j < length;j++)
			{
				if (!((a.charAt(0) == '_') || ((a.charAt(0) >= 'a') && (a.charAt(0) <= 'z')) || ((a.charAt(0) >= 'A') && (a.charAt(0) <= 'Z'))))
				{
					System.out.print(0);
					System.out.print("\n");
					break;
				}
				else
				{
					for (j = 1;j < length;j++)
					{
						if (!(((a.charAt(j) == '_')) || ((a.charAt(j) >= '0') && (a.charAt(j) <= '9')) || ((a.charAt(j) >= 'a') && (a.charAt(j) <= 'z')) || ((a.charAt(j) >= 'A') && (a.charAt(j) <= 'Z'))))
						{
							System.out.print(0);
							System.out.print("\n");
							break;
						}
					}
					if (j == length)
					{
						System.out.print(1);
						System.out.print("\n");
					}
					break;
				}


			}
		}
		return 0;

	}
}

