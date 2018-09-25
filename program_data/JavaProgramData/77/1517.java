import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int x = 0;
	public static int Main()
	{
		String a = new String(new char[100]);
		int N = new int(char a.charAt(),char f);
		a = new Scanner(System.in).nextLine();
		char m1;
		m1 = a.charAt(0);
		N(a, m1);
	}
	public static int N(String a, char f)
	{
		char m = f;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		lop:
		if (a[x].equals(m))
		{
			int l = x;
			x++;
			System.out.print(l);
			System.out.print(" ");
			System.out.print(N(a, m));
			System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto lop;
		}
		if (!a[x].equals(m) && !a[x].equals('\0'))
		{
			x++;
			return x - 1;
		}

		if (a[x].equals('\0'))
		{
		return 0;
		}
	}
}
