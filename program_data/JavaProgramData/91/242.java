import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ori = new String(new char[120]);
		String aft = new String(new char[120]);
		ori = new Scanner(System.in).nextLine();
		String p_1 = ori;
		String p_2 = aft;
		for (int i = 0; i < ori.length() - 1; i++)
		{
			*(p_2.Substring(i)) = (char)((int) * (p_1.Substring(i)) + (int) * (p_1.Substring(i) + 1));
		}
		*(p_2 + ori.length() - 1) = (char)((int) * (p_1 + ori.length() - 1) + (int)(p_1));
		for (int i = 0; i < ori.length(); i++)
		{
			System.out.print((p_2.Substring(i)));
		}
	}
}
