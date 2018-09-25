import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		String c1 = new String(new char[80]);
		String c2 = new String(new char[80]);
		c1 = new Scanner(System.in).nextLine();
		c2 = new Scanner(System.in).nextLine();
		i = 0;
		while (c1.charAt(i) != '\0')
		{
			if (c1.charAt(i) >= 65 && c1.charAt(i) <= 90)
			{
				c1.charAt(i) += 32;
			}
				i++;
		}
		i = 0;
		while (c2.charAt(i) != '\0')
		{
			if (c2.charAt(i) >= 65 && c2.charAt(i) <= 90)
			{
				c2.charAt(i) += 32;
			}
				i++;
		}
			if (strcmp(c1, c2) > 0)
			{
			System.out.print(">");
			}
		if (strcmp(c1, c2) < 0)
		{
			System.out.print("<");
		}
		if (strcmp(c1, c2) == 0)
		{
			System.out.print("=");
		}




		return 0;
	}


}
