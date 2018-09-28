import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int number = 0;
		String string = new String(new char[31]);
		String = new Scanner(System.in).nextLine();
		for (i = 0;string.charAt(i) != 0;i++)
		{
			if (String[i] >= '0' && string.charAt(i) <= '9')
			{
				System.out.print(String[i]);
			}
			else if (i != 0)
			{
				if (String[i - 1] >= '0' && string.charAt(i - 1) <= '9')
				{
					System.out.print("\n");
					number++;
				}
			}
		}
		number++;
		System.out.print("\n");
		return 0;
	}

}
