import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String array = new String(new char[501]);
		array = new Scanner(System.in).nextLine();
		int k;
		int l;
		int i;
		int s = 0;
		for (i = 0;i < array.length() - 1;i++)
		{
			if (array.charAt(i) == array.charAt(i + 1))
			{
				System.out.print(array.charAt(i));
				System.out.print(array.charAt(i + 1));
				System.out.print("\n");
			}
		}
		for (l = 3;l < array.length();l++)
		{
			for (k = 0;k < array.length() - l;k++)
			{
				for (i = 0;i <= l / 2;i++)
				{
					if (array.charAt(k + i) != array.charAt(k + l - i))
					{
						s++;
						break;
					}
				}
				if (s == 0)
				{
					for (i = 0;i <= l;i++)
					{
						System.out.print(array.charAt(k + i));
					}
					System.out.print("");
					System.out.print("\n");
				}
				s = 0;
			}
		}
		return 0;
	}
}
