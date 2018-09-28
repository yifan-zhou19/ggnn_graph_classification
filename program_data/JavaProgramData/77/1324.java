import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[1000]);
	public static int[] a = new int[1000];
	public static int l;
	public static char x;
	public static char y;

	public static void f(int i,int k)
	{
		if (k == l - 1)
		{
			return;
		}
		if (s.charAt(k + 1) == x)
		{
			a[i + 1] = k + 1;
			f(i + 1, k + 1);
		}
		else
		{
			System.out.print(a[i]);
			System.out.print(" ");
			System.out.print(k + 1);
			System.out.print("\n");
			i--;
			f(i, k + 1);
		}
	}

	public static int Main()
	{
		s = new Scanner(System.in).nextLine();
		l = s.length();
		x = s.charAt(0);
		f(0, 0);
		return 0;
	}

}
