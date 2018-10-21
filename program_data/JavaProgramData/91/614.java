import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		char temp;
		int i;

		str = new Scanner(System.in).nextLine();

		temp = str.charAt(0);
		for (i = 0; str.charAt(i + 1) != 0; i++)
		{
			str.charAt(i) += str.charAt(i + 1);
		}

		str.charAt(i) += temp;

		System.out.print(str);
		System.out.print("\n");
		return 0;
	}
}
