package <missing>;

public class GlobalMembers
{
	//********************************
	//*???n-gram????   **
	//*????? 1300012707 **
	//*???2013.12.10**
	//********************************
	public static int Main()
	{
		String c = new String(new char[502]);
		int[] a = new int[502];
		int n;
		int max;
		int i;
		int t;
		int j;
		String p = c;
		String p1 = c;
		int[] q = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		max = 0;
		for (q = a; q <= a[501]; q++)
		{
			q[0] = 0;
		}
		for (p = c; p != '\0'; p++)
		{
			q = a;
			for (p1 = c; p1 <= p; p1++)
			{
				t = 1;
				for (i = 0; i < n; i = i + 1)
				{
					if (*(p.Substring(i)) != *(p1.Substring(i)))
					{
						t = 0;
						break;
					}
				}
				if (t == 1)
				{
					q[0] = q + 1;
					break;
				}
				q++;
			}
		}
		for (q = a; q <= a[501]; q++)
		{
			if (q[0] > max)
			{
				max = q;
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(max);
			System.out.print("\n");
			for (i = 0; i < 502; i = i + 1)
			{
				if (a[i] == max)
				{
					p = c;
					for (j = 0; j < n; j = j + 1)
					{
						System.out.print((p.Substring(i) + j));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

