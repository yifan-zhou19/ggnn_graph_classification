import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		int a0 = (int) a.charAt(0);
		for (int i = 0;i < a.length() - 1;i++)
		{
			System.out.print((char)(a.charAt(i) + a.charAt(i + 1)));
		}

		System.out.print((char)(a.charAt(a.length() - 1) + a0));
		return 0;
	}

}
