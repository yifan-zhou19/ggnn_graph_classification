import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int q;
	   int i = 0;
	   int j = 0;
	   int w;
	   String s = new String(new char[1000]);
	   String t = new String(new char[1000]);
	   s = new Scanner(System.in).nextLine();
	   while (s.charAt(i) != '\0')
	   {
		if (s.charAt(i) != ' ' || (s.charAt(i) == ' ' && s.charAt(i - 1) != ' '))
		{
			System.out.print(s.charAt(i));
		}
		i++;

	   }

		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

