import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int i = 0;
		int yushu = 0;
		int[] b = new int[101];
		int k = 0;
		a = new Scanner(System.in).nextLine();
		while (a.charAt(i) != '\0')
		{
			b[i] = (yushu * 10 + a.charAt(i) - '0') / 13;
			yushu = (yushu * 10 + a.charAt(i) - '0') % 13;
			i++;
		}
		k = i - 1;
		if (k == 0)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(a.charAt(0));
			System.out.print("\n");
		}
		else
		{
			if ((a.charAt(0) - '0') * 10 + a.charAt(1) - '0' < 13 && k == 1)
			{
				System.out.print(((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') / 13);
				System.out.print("\n");
				System.out.print(((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') % 13);
				System.out.print("\n");
			}
			else
			{
				if ((a.charAt(0) - '0') * 10 + a.charAt(1) - '0' < 13 && k > 1)
				{
					i = 2;
				}
				else
				{
					i = 1;
				}
				for (i; i <= k; i++)
				{
					System.out.print(b[i]);
				}
				System.out.print("\n");
				System.out.print(yushu);
				System.out.print("\n");
			}
		}
		return 0;
	}
}
