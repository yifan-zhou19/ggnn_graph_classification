import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String dui = new String(new char[1000]);
	public static char male;
	public static char female;
	public static void rankgame(int left, int right)
	{
		if (left == -1)
		{
			return;
		}
		if (dui.charAt(right) == male)
		{
			left = right;
			right++;
			rankgame(left, right);
		}
		if (dui.charAt(left) == 0)
		{
			left--;
			rankgame(left, right);
		}
		if (dui.charAt(left) == male && dui.charAt(right) == female)
		{
			System.out.printf("%d", ' ');
			System.out.printf("%d", "\n");
			dui = dui.substring(0, left);
			dui = dui.substring(0, right);
			left--;
			right++;
			rankgame(left, right);
		}
	}
	public static int Main()
	{
		dui = new Scanner(System.in).nextLine();
		male = dui.charAt(0), female = dui.charAt(dui.length() - 1);
		rankgame(0, 1);
		return 0;
	}

}
