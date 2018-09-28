import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String dui = new String(new char[1000]);
	public static void rankgame(int left, int right, char male, char female)
	{
		if (left == -1)
		{
			return;
		}
		if (dui.charAt(right) == male)
		{
			left = right;
			right++;
			rankgame(left, right, male, female);
		}
		if (dui.charAt(left) == 0)
		{
			left--;
			rankgame(left, right, male, female);
		}
		if (dui.charAt(left) == male && dui.charAt(right) == female)
		{
			System.out.printf("%d", ' ');
			System.out.printf("%d", "\n");
			dui = dui.substring(0, left);
			dui = dui.substring(0, right);
			left--;
			right++;
			rankgame(left, right, male, female);
		}
	}
	public static int Main()
	{
		dui = new Scanner(System.in).nextLine();
		char male = dui.charAt(0);
		char female = dui.charAt(dui.length() - 1);
		rankgame(0, 1, male, female);
		return 0;
	}

}
