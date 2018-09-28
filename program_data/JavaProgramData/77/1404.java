import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int x = 0;
	public static int[] a = new int[50];
	public static String str = new String(new char[100]);
	public static char b;
	public static char g;
	public static int l;
	public static int Main()
	{
		str = new Scanner(System.in).nextLine();
		l = str.length();
		b = str.charAt(0);
		g = str.charAt(l - 1);
		game(0, 0, 1);
		return 0;
	}
	public static void game(int k, int i, int j)
	{
		if (j == l - 1)
		{
			System.out.print("0 ");
			System.out.print(l - 1);
		}
		else
		{
			if (str.charAt(j) == g)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
				x = x - 1;
				game(a[x], i - k, j + 1);
			}
			else
			{
				a[x] = k;
				x = x + 1;
				game(j - i, j, j + 1);
			}
		}
	}
}
