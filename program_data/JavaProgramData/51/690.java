package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int k;
		int n;
		int m = 0;
		int flag = 1;
		String str = new String(new char[500]);
		String p;
		int[] a = new int[500];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		k = str.length();
		for (i = 0 ; i < k - n ; i++)
		{
			for (t = 0 ; t <= k - i - n ; t++)
			{
				for (j = i ; j < n + i ; j++)
				{
					if (str.charAt(j) != str.charAt(j + t))
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					a[i]++;
				}
				flag = 1;
			}
		}
		for (i = 0 ; i < k - n ; i++)
		{
			if (a[i] > m)
			{
				m = a[i];
			}
		}
		if (m == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(m);
			System.out.print("\n");
			for (i = 0 ; i < k - n ; i++)
			{
				if (a[i] == m)
				{
					p = str.charAt(i - 1);
					for (j = i ; j < i + n ; j++)
					{
						System.out.print(++p);
					}
					System.out.print("\n");
				}
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

