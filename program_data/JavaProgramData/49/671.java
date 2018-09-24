import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]); //????
		a = new Scanner(System.in).nextLine(); // ??
		int length = a.length();
		int p = 1;
		for (int i = 2; i < length; i++) //?????
		{
			for (int j = 0; j < length - i + 1; j++) //??????
			{
				p = 1;
				for (int x = 0; x < i; x++) // ??????
				{
					if (a.charAt(j + x) != a.charAt(j + i - x - 1))
					{
						p = 0;
						break;
					}
				}
				if (p == 1)
				{
					for (int y = 0; y < i; y++) //????
					{
						System.out.print(a.charAt(j + y));
						if (y == i - 1)
						{
							System.out.print("\n");
						}
					}
				}
			}
		}

		return 0;
	}
}
