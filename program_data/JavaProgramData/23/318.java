import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine(); //?????
		int l;
		int i;
		int j;
		l = a.length();
		for (i = a.length() - 1;i >= 0;i--) //???????
		{
			if (a.charAt(i) == ' ')
			{
				for (j = i + 1;j < l;j++)
				{
					System.out.print(a.charAt(j));
				}
				System.out.print(' ');
				l = i;
			}
		}
		for (i = 0;i < l;i++)
		{
			System.out.print(a.charAt(i));
		}
		return 0;
	}
}
