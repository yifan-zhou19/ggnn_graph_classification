import java.util.*;

package <missing>;

public class GlobalMembers
{
	// ??4.cpp : Defines the entry point for the console application.
	//


	public static int Main()
	{
		int n = 0;
		String num = new String(new char[81]);
		int i = 0;
		int len = 0;
		int t = 0;
		int m = 0;
		int[] d = new int[3];
		int[] e = new int[80];
		int[] k = new int[80];
		int[] f = new int[80];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.ignore();

		for (i = 1;i <= n;i++)
		{
			num = new Scanner(System.in).nextLine();

			d[1] = num.charAt(0) - 'a';
			d[2] = num.charAt(0) - 'A';
			len = num.length();

			if (num.charAt(0) == '_' || (d[1] >= 0 && d[1] <= 25) || (d[2] >= 0 && d[2] <= 25))
			{
				len = num.length();

				if (len == 1)
				{
					System.out.print(1);
					System.out.print("\n");
					continue;
				}
				else

				{
				for (t = 1;t <= len - 1;t++)
				{
					e[t] = num.charAt(t) - 'a';
					k[t] = num.charAt(t) - 'A';
					f[t] = num.charAt(t) - '0';

				}


				for (t = 1;t <= len - 1;t++)
				{
					if ((e[t] >= 0 && e[t] <= 25) || (k[t] >= 0 && k[t] <= 25) || (f[t] >= 0 && f[t] <= 9) || num.charAt(t) == '_')
					{
							m = 0;
					}
					else
					{
						m = 1;
						break;
					}

				}
				}

			}

			else
			{
				System.out.print(0);
				System.out.print("\n");
				continue;
			}


				if (m == 1)
				{
					System.out.print(0);
					System.out.print("\n");
				}
				else
				{
					System.out.print(1);
					System.out.print("\n");
				}

		}


		return 0;
	}

}

