import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b;
		a = new Scanner(System.in).nextLine();
		b = a;
		int i;
		int j = 0;
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) != ' ')
			{
				*(b.Substring(j)) = a.charAt(i);
			}
			if (a.charAt(i - 1) != ' ' && a.charAt(i) == ' ')
			{
				*(b.Substring(j)) = ' ';
			}

			if (a.charAt(i - 1) == ' ' && a.charAt(i) == ' ')
			{
				continue;
			}
			j++;

		}
		*(b.Substring(j)) = '\0';
		for (i = 0; * (b.Substring(i)) != '\0'; i++)
		{
			System.out.print((b.Substring(i)));
		}


		return 0;
	}


}
