import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String c = "\0";
		String[] a = {"\0"};
		int i = 0;
		int j = 1;
		int k = 0;
		c = new Scanner(System.in).nextLine();
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if (c.charAt(i) != ' ')
			{
				k++;
				a[j][k] = c.charAt(i);
			}
			else
			{
				j++;
				k = 0;
			}
		}

		for (i = j;i > 1;i--)
		{
			for (k = 1;a[i][k] != '\0';k++)
			{
			System.out.print(a[i][k]);
			}
			System.out.print(' ');
		}
		while (a[1][i] != '\0')
		{
			System.out.print(a[1][i]);
		i++;
		}

		return 0;

	}

}
