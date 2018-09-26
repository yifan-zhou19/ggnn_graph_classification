import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String shuru = new String(new char[500]);
		shuru = new Scanner(System.in).nextLine();
		int a = 0;
		int i = 0;
		a = shuru.length();
		if (shuru.charAt(0) >= '0' && shuru.charAt(0) <= '9')
		{
			System.out.print(shuru.charAt(0));
		}
		for (i = 0; i <= a - 1; i++)
		{
			if (i != 0)
			{
				if (shuru.charAt(i) >= '0' && shuru.charAt(i) <= '9')
				{
					System.out.print(shuru.charAt(i));
				}
				if ((shuru.charAt(i) < '0' || shuru.charAt(i) > '9') && (shuru.charAt(i - 1) >= '0' && shuru.charAt(i - 1) <= '9'))
				{
					System.out.print("\n");
				}
			}
		}
		System.out.print("\n");
		return 0;
	}

}
