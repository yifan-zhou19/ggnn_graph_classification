import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		String c = new String(new char[101]);
		final String str = "";
		c = new Scanner(System.in).nextLine();
		while (c.charAt(i) != '\0')
		{
			if (c.charAt(i) != ' ')
			{
				str.charAt(j)[k] = c.charAt(i);
				k++;
			}
			else
			{
				j++;
				k = 0;
			}
			i++;
		}

		for (k = j;k >= 1;k--)
		{
			System.out.print(str.charAt(k));
			System.out.print(" ");
		}
		System.out.print(str.charAt(0));
		return 0;
	}

}
