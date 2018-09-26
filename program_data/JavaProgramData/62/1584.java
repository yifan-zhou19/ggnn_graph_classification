import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		String p;
		String a = new String(new char[200]);
		p = a;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < len - 1;i++)
		{
			if (*(p.Substring(i)) != ' ' && *(p.Substring(i) + 1) == ' ')
			{
			System.out.print((p.Substring(i)));
			System.out.print(" ");
			}
			else if (*(p.Substring(i)) != ' ' && *(p.Substring(i) + 1) != ' ')
			{
			System.out.print((p.Substring(i)));
			}
		}
		System.out.print((p.Substring(len) - 1));
		int y;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;

	}

}

