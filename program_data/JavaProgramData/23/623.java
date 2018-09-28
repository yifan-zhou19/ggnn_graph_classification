import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[5000]);
		a = new Scanner(System.in).nextLine();
		int i = 0;
		int j = 0;
		int m;
		m = a.length();
		for (i = m - 1;i >= 0;i--)
		{
			if (a.charAt(i) == ' ')
			{
				j = i + 1;
				while ((a.charAt(j) != ' ') && (j < m))
				{
					System.out.print(a.charAt(j));
					j++;
				}
				System.out.print(" ");
			}
			if (i == 0)
			{
						j = i;
						while ((a.charAt(j) != ' ') && (j < m))
						{
							System.out.print(a.charAt(j));
							j++;
						}

			}
		}

		return 0;
	}

}
