import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		int length = a.length();
		int i = 0;
		for (i = 0;i < length;i++)
		{
			if (i > 0)
			{
				if (a.charAt(i) == 32 && a.charAt(i - 1) == 32)
				{
					continue;
				}
				else
				{
					System.out.print(a.charAt(i));
				}
			}
			else
			{
				System.out.print(a.charAt(i));
			}
		}
		System.out.print("\n");
		return 0;
	}

}
