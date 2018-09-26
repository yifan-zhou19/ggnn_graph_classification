import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		char t = 0;
		char j;
		int i;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) > 47 && a.charAt(i) < 58)
			{
				System.out.print(a.charAt(i));
			}
			else
			{
				t = 0;
				for (j = i;j < a.length();j++)
				{
					if (a.charAt(j) < 48 || a.charAt(j)>57)
					{
						t = t + 1;
					}
					else
					{
						i = i + t - 1;
						System.out.print('\n');
						break;
					}
				}
			}
		}
		System.out.print("\n");
		return 0;
	}

}
