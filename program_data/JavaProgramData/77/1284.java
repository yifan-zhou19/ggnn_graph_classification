import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1000]); //?????

	public static int xx(int k)
	{
		 int x = k; //???????
		 int y = k + 1;
		 while (a.charAt(y) == a.charAt(x)) //?????????
		 {
		 y = xx(y);
		 }
		 System.out.print(x);
		 System.out.print(" ");
		 System.out.print(y);
		 System.out.print("\n");
		 return y + 1;
	}

	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		xx(0);
		return 0;
	}

}
