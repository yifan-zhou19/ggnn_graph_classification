import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int n;
		int i;
		int j;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			String a = new String(new char[100]);
			a = new Scanner(System.in).nextLine();
			len = a.length();
			if ((a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || a.charAt(0) == '_')
			{
				count = 0;
				for (j = 1;j < len;j++)
				{
					if ((a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || a.charAt(j) == '_' || (a.charAt(j) >= '0' && a.charAt(j) <= '9'))
					{
						count++;
					}
				}
				if (count == len - 1)
				{
					System.out.print("1");
					System.out.print("\n");
				}
				else if (count < len - 1)
				{
					System.out.print("0");
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

