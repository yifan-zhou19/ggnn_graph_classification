import java.util.*;

package <missing>;

public class GlobalMembers
{
	// c??????
	public static int Main()
	{
		int n;
		int i;
		int j;
		String str = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < n; i++)
		{
			str = new Scanner(System.in).nextLine();
			for (j = 0; str.charAt(j) != '\0'; j++)
			{
				if (j == 0)
				{
					if (((str.charAt(j) - 'a') < 0 || (str.charAt(j) - 'a') > 26) && ((str.charAt(j) - 'A') < 0 || (str.charAt(j) - 'A') > 26) && (str.charAt(j) != '_'))
					{
						break;
					}
				}
				else if (((str.charAt(j) - '0') < 0 || (str.charAt(j) - '0') > 9) && ((str.charAt(j) - 'a') < 0 || (str.charAt(j) - 'a') > 26) && ((str.charAt(j) - 'A') < 0 || (str.charAt(j) - 'A') > 26) && (str.charAt(j) != '_'))
				{
						break;
				}
			}
			if (str.charAt(j) == '\0')
			{
				System.out.print(1);
				System.out.print("\n");
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

