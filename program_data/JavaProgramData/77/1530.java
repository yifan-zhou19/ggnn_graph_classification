import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int leave(int a)
	{
		int b;

		if (str.charAt(a) == str.charAt(0))
		{
			b = leave(a + 1);
			System.out.print(a);
			System.out.print(" ");
			System.out.print(b);
			System.out.print("\n");
			return leave(b + 1);
		}
		else
		{
			return a;
		}
	}

		public static String str = new String(new char[101]);
			public static int i = 1;

	public static int Main()
	{

		str = new Scanner(System.in).nextLine();
		leave(0);
		return 0;
	}



}
