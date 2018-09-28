import java.util.*;

package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : ?????.cpp
	// Author      :
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================



	public static int Main()
	{
		char[] ta = {0};
		char[] tb = {0};
		int[] a = new int[N];
		int[] b = new int[N];
		int[] r = new int[N + 1];
		int la;
		int lb;
		int si = 0;

		ta = new Scanner(System.in).nextLine();
		tb = new Scanner(System.in).nextLine();
		la = ta.length();
		lb = tb.length();

		for (int i = 0;i < la;i++)
		{
			a[i] = ta[la - i - 1] - '0';
		}
		for (int i = 0;i < lb;i++)
		{
			b[i] = tb[lb - i - 1] - '0';
		}

		for (int i = 0;i < N;i++)
		{
			r[i] += a[i] + b[i];
			r[i + 1] += r[i] / 10;
			r[i] %= 10;
		}

		for (int i = N;i >= 0;i--)
		{
			if (r[i] != 0)
			{
				si = i;
				break;
			}
		}

		if (si == 0)
		{
			System.out.print('0');
			System.out.print("\n");
		}
		else
		{
			for (int i = si;i >= 0;i--)
			{
				System.out.print(r[i]);
			}
			System.out.print("\n");
		}

		return 0;
	}

}
