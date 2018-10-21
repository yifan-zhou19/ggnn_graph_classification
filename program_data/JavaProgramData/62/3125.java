import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len;
		String str = new String(new char[200]);
		str = new Scanner(System.in).nextLine();
		len = str.length();
		System.out.print(str.charAt(0));
		for (i = 1;i <= len - 1;i++)
		{
			if (str.charAt(i) != ' ' && str.charAt(i - 1) == ' ')
			{
				System.out.print(" ");
				System.out.print(str.charAt(i));
			}
			else if (str.charAt(i) != ' ' && str.charAt(i - 1) != ' ')
			{
				System.out.print(str.charAt(i));
			}
		}
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;




	}

}

