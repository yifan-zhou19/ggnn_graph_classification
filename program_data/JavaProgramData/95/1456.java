import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char i;
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		for (i = 0;s1.charAt(i) != '\0';i++)
		{
			if (s1.charAt(i) >= 65 && s1.charAt(i) <= 90)
			{
				s1.charAt(i) += 32;
			}
		}
		for (i = 0;s2.charAt(i) != '\0';i++)
		{
			if (s2.charAt(i) >= 65 && s2.charAt(i) <= 90)
			{
				s2.charAt(i) += 32;
			}
		}
		if (strcmp(s1,s2) > 0)
		{
			System.out.print('>');
		}
		if (strcmp(s1,s2) == 0)
		{
			System.out.print('=');
		}
		if (strcmp(s1,s2) < 0)
		{
			System.out.print('<');
		}
		return 0;


	}

}
