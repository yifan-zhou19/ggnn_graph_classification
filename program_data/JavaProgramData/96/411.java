import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int i = 0;
		int[] b = new int[101];
		int p;
		int y;
		int[] s = new int[101];
		for (i = 0;i < a.length();i++)
		{
			b[i] = a.charAt(i) - '0';
		}
		if (a.length() == 1)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(b[0]);
			System.out.print("\n");
		}
		else
		{
			if (a.length() == 2 && b[0] * 10 + b[1] < 13)
			{
				System.out.print("0");
				System.out.print("\n");
				System.out.print(b[0] * 10 + b[1]);
				System.out.print("\n");
			}
			else
			{
				if (a.length() == 2 && b[0] * 10 + b[1] == 13)
				{
					System.out.print("1");
					System.out.print("\n");
					System.out.print("0");
					System.out.print("\n");
				}
				else
				{
					y = b[0];
					for (i = 0;i < a.length() - 1;i++)
					{
						p = y * 10 + b[i + 1];
						s[i] = p / 13;
						y = p % 13;
					}
					if (s[0] != 0)
					{
						for (i = 0;i < a.length() - 2;i++)
						{
						System.out.print(s[i]);
						}
					}
					else
					{
						for (i = 1;i < a.length() - 2;i++)
						{
						System.out.print(s[i]);
						}
					}
					System.out.print(s[a.length() - 2]);
					System.out.print("\n");
					System.out.print(y);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
