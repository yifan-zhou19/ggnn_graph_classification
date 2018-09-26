import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int b;
		int c;
		int flag = 0;
		String a = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();

		for (j = 1; j <= n; j++)
		{

			a = new Scanner(System.in).nextLine();
			b = (a.charAt(0) <= 'z' && a.charAt(0) >= 'a') || (a.charAt(0) <= 'Z' && a.charAt(0) >= 'A') || (a.charAt(0) == '_');
			c = (a.charAt(0) <= '9' && a.charAt(0) >= '0');
			if (b != 0)
			{
				flag = 1;
				for (i = 0; a.charAt(i) != '\0'; i++)
				{
					b = (a.charAt(i) <= 'z' && a.charAt(i) >= 'a') || (a.charAt(i) <= 'Z' && a.charAt(i) >= 'A') || (a.charAt(i) == '_');
					c = (a.charAt(i) <= '9' && a.charAt(i) >= '0');

					if (!(b != 0 || c != 0))
					{
						System.out.print("0");
						System.out.print("\n");
						flag = 0;
						break;
					}

				}

				if (flag != 0)
				{
					System.out.print("1");
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print("0");
				System.out.print("\n");
			}
		}

		return 0;
	}
}

