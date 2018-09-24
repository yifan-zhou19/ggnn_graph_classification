import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[100]);
		int i;
		int[] flag = new int[100];
		int length;
		input = new Scanner(System.in).nextLine();
		length = input.length();
		System.out.print(input.charAt(0));
		for (i = 1; i < length; i++)
		{
			if (input.charAt(i) == ' ' && input.charAt(i - 1) == ' ')
			{
					continue;
			}
			System.out.print(input.charAt(i));
		}
		return 0;
	}
}
