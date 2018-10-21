import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		int[] na = new int[251];
		int[] nb = new int[251];
		int[] s = new int[251];
		int i;
		int flag = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int la = a.length();
		int lb = b.length();
		int lm = (la > lb)?la:lb;
		for (i = 0; i < la; i++)
		{
			na[i] = a.charAt(la - i - 1) - '0';
			s[i] += na[i];
		}
		for (i = 0; i < lb; i++)
		{
			nb[i] = b.charAt(lb - i - 1) - '0';
			s[i] += nb[i];
		}
		for (i = 0;;i++)
		{
			if (i > lm)
			{
				break;
			}
			if (s[i] > 9)
			{
				s[i] -= 10;
				s[i + 1] += 1;
			}
		}
		for (i = lm; i >= 0; i--)
		{
			if (flag == 0)
			{
				if (s[i] == 0)
				{
					continue;
				}
				else
				{
					flag = 1;
				}
			}
			System.out.print(s[i]);
		}
		if (flag == 0)
		{
			System.out.print("0");
		}
		System.out.print("\n");
		return 0;
	}
}
