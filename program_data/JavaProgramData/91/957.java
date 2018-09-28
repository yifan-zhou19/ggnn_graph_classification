import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void f(String a)
	{
		int i = 0;
		for (i = 0; !a[i + 1].equals('\0'); i++)
		{
			System.out.print((char)(a[i] + a[i + 1]));
		}
		System.out.print((char)(a[i] + a[0]));
		System.out.print("\n");
		return;
	}
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		f(a);
		return 0;
	}

}
