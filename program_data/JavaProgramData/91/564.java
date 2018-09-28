import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*              ?????
	??????              2010.12.15      */
	public static int Main()
	{
		int i;
		String a = new String(new char[110]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length() - 1;i++)
		{
			System.out.print((char)(a.charAt(i) + a.charAt(i + 1)));
		}
		System.out.print((char)(a.charAt(a.length() - 1) + a.charAt(0)));
		System.out.print("\n");
		return 0;
	}
}
