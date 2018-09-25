import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String f = new String(new char[10000]);
		f = new Scanner(System.in).nextLine();
		for (int i = 0;i < f.length();i++)
		{
			if (f.charAt(i) - '0' >= 0 && f.charAt(i) - '0' <= 9)
			{
				System.out.print(f.charAt(i));
			}
			if ((f.charAt(i) - '0' >= 0 && f.charAt(i) - '0' <= 9) == 0 && (f.charAt(i + 1) - '0' >= 0 && f.charAt(i + 1) - '0' <= 9) == 1)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}
