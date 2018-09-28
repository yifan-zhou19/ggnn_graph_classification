import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p = new String(new char[31]);
		p = new Scanner(System.in).nextLine();
		int i;
		for (i = 0;1;i++)
		{
			if ((p.charAt(i) >= '0') && (p.charAt(i) <= '9'))
			{
				System.out.print((p.Substring(i)));
			}
			else if (p.charAt(i) == '\0')
			{
				break;
			}
			else
			{
				System.out.print("\n");
			}
		}
		return 0;
	}

}
