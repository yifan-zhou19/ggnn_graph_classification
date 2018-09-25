import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		int i;
		int len;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) >= 48 && a.charAt(i) <= 57)
			{
				System.out.print(a.charAt(i));
				if (a.charAt(i + 1) < 48 || a.charAt(i + 1)>57)
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}


}
