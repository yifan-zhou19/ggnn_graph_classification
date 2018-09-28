import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] y = new int[1000];
		String a = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < 1000;i++)
		{
			y[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			if (((a.charAt(0) - 'a' < 26) && (a.charAt(0) - 'a' >= 0)) || ((a.charAt(0) - 'A' < 26) && (a.charAt(0) - 'A' >= 0)) || (a.charAt(0) == '_'))
			{
				y[i] = 1;
				for (j = 1;a.charAt(j) != 0;j++)
				{
					if (((a.charAt(j) - 'a' < 26) && (a.charAt(j) - 'a' >= 0)) || ((a.charAt(j) - 'A' < 26) && (a.charAt(j) - 'A' >= 0)) || ((a.charAt(j) - '0' < 10) && (a.charAt(j) - '0' >= 0)) || (a.charAt(j) == '_'))
					{
						y[i] = 1;
					}
					else
					{
						y[i] = 0;
						break;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(y[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

