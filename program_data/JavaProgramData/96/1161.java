import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		int i;
		int j;
		int k;
		int n;
		int[] b = new int[1001];
		int r;
		int s;
		a = new Scanner(System.in).nextLine();
		for (i = 0 ; a.charAt(i) != '\0' ; i++)
		{
			b[i] = a.charAt(i) - '0';
		}
		if (i == 1)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(b[0]);
			System.out.print("\n");
		}
		if (i == 2)
		{
			System.out.print((b[0] * 10 + b[1]) / 13);
			System.out.print("\n");
			System.out.print((b[0] * 10 + b[1]) % 13);
			System.out.print("\n");
		}
		if (i != 1 && i != 2)
		{
			r = b[0] * 10 + b[1];
			for (j = 2 ; j < i ; j++)
			{
				s = r * 10 + b[j];
				if (s >= 13)
				{
					System.out.print(s / 13);
					r = s % 13;
				}
				else
				{
					if (s >= 10 || r == 0)
					{
						System.out.print("0");
					}
					r = s;
				}
				if (j == i - 1)
				{
					System.out.print("\n");
					System.out.print((s % 13));
				}
			}
		}
	}
}
