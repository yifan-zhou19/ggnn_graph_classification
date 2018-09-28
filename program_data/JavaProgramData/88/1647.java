import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		int i;
		a = new Scanner(System.in).nextLine();
		for (i = 0; i < a.length(); i++)
		{
			if (Character.isDigit(a.charAt(i)))
			{
				if (!Character.isDigit(a.charAt(i + 1)))
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
