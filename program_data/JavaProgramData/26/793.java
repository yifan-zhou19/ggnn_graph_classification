import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		String a = new String(new char[10000]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length() - 1;i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				k = 0;
				for (j = i;j < a.length();j++)
				{
					if (a.charAt(j) == ' ')
					{
						k = k + 1;
					}
					else
					{
						i = i + k - 1;
						System.out.print(' ');
						break;
					}
				}
			}
			else
			{
				System.out.print(a.charAt(i));
			}
		}
		System.out.print(a.charAt(a.length() - 1));
		System.out.print("\n");
		return 0;
	}
}
