import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int i;
		int j = 0;
		int b;
		int[] s = new int[100];
		int y;
		a = new Scanner(System.in).nextLine();
		while (a.charAt(j) != '\0')
		{
			j++;
		}
		if (j == 1)
		{
			y = (a.charAt(0) - '0') % 13;
			s[0] = 0;
			System.out.print(s[0]);
			System.out.print('\n');
			System.out.print(y);
			System.out.print("\n");
		}
		else
		{
			y = ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) % 13;
			s[0] = ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) / 13;
			for (i = 1 ; i < j - 1 ; i++)
			{
				b = y * 10 + (a.charAt(i + 1) - '0');
				s[i] = b / 13;
				y = b % 13;
			}
			if (j <= 2)
			{
				System.out.print(s[0]);
				System.out.print("\n");
			}
			if (s[0] != 0)
			{
				if (j > 2)
				{
					System.out.print(s[0]);
				}
			}
			for (i = 1 ; i < j - 1 ; i++)
			{
				if (i == j - 2)
				{
					System.out.print(s[i]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(s[i]);
				}
			}
			System.out.print(y);
			System.out.print("\n");
		}

		return 0;
	}



}
