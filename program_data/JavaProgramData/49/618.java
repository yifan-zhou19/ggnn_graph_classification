import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[500]);
		int i;
		int j;
		int k;
		int s;
		int length;
		str = new Scanner(System.in).nextLine();
		length = str.length();
		for (i = 2; i <= length; i++)
		{
			for (j = 0; j <= length - i; j++)
			{
				for (k = j; k < j + i / 2; k++)
				{
					if (str.charAt(k) != str.charAt(2 * j + i - k - 1))
					{
						break;
					}
				}
				if (k == j + i / 2)
				{
					for (s = j; s < j + i; s++)
					{
						System.out.print(str.charAt(s));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
