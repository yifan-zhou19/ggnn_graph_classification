import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j = 0;
		int l = 0;
		int m = 0;
		int t = 0;
		int k;
		String str = new String(new char[10000]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		str = new Scanner(System.in).nextLine();
		k = str.length();
		for (i = 0 ; i < k ; i++)
		{
			t++;
			if (str.charAt(i) != ' ')
			{
				m++;
			}
			else
			{
				if (t > 81)
				{
					if (l != 0)
					{
						for (j = l ; j < i - m - 1 ; j++)
						{
							System.out.print(str.charAt(j));
						}
						l = l + t - m - 1;
						i = i - m - 1;
						System.out.print("\n");
						t = 0;
					}
					else
					{
						for (j = l; j < i - m - 1 ; j++)
						{
							System.out.print(str.charAt(j));
						}
						l = l + t - m - 1;
						i = i - m - 1;
						System.out.print("\n");
						t = 0;
					}
				}
				if (t == 81)
				{
					if (l != 0)
					{
						for (j = l ; j < i ; j++)
						{
							System.out.print(str.charAt(j));
						}
						l = l + t;
						System.out.print("\n");
						t = 0;
					}
					else
					{
						for (j = l ; j < i ; j++)
						{
							System.out.print(str.charAt(j));
						}
						l = l + t;
						System.out.print("\n");
						t = 0;
					}
				}
				m = 0;
			}
		}
		for (j = l ; j < k ; j++)
		{
			System.out.print(str.charAt(j));
		}
		return 0;
	}
}

