import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();
		for (int i = 0;i < a.length();i++)
		{
			if (a.charAt(i) <= '9' && a.charAt(i) >= '0')
			{
				if (a.charAt(i + 1) > '9' || a.charAt(i + 1) < '0')
				{
					System.out.print(a.charAt(i));
					System.out.print("\n");
				}
				else
				{
					System.out.print(a.charAt(i));
				}
			}
		}
		return 0;
	}

}
