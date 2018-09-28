import java.util.*;

package <missing>;

public class GlobalMembers
{
	//2013.11.19
	//zwb

	public static int Main()
	{
		String a = new String(new char[102]);
		int[] b = new int[102];
		int[] ans = new int[102];
		int i;
		int j;
		int r;
		int len;
		int flag = 0;
		a = new Scanner(System.in).nextLine();
		len = a.length();

		for (i = 0; i < len; i++)
		{
			b[i + 1] = a.charAt(i) - '0';
		}

		if (a.charAt(1) == '\0')
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(b[1]);
			System.out.print("\n");
		}
		else if (a.charAt(1) != '\0' && a.charAt(2) == '\0' && b[1] * 10 + b[2] < 13)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(b[1] * 10 + b[2]);
			System.out.print("\n");
		}
		else
		{
			ans[1] = (b[1] * 10 + b[2]) / 13;
			r = (b[1] * 10 + b[2]) % 13;

			for (i = 2; i < len; i++)
			{
				ans[i] = (r * 10 + b[i + 1]) / 13;
				r = (r * 10 + b[i + 1]) % 13;
			}

			for (i = 1; i < len; i++)
			{
				if (ans[1] == 0 && flag == 0)
				{
					flag = 1;
					continue;
				}
				System.out.print(ans[i]);
			}
			System.out.print("\n");
			System.out.print(r);
			System.out.print("\n");
		}
		return 0;
	}

}
