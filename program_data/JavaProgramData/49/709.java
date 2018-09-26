package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		int t = 0;
		int p = 0;
		int[] a = new int[500];
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;;i++)
		{
			if (s.charAt(i) == '\0')
			{
				break;
			}
			l++;
		}
		for (i = 0;i < l - 1;i++)
		{
			if (s.charAt(i) == s.charAt(i + 1))
			{
				a[j++] = i;
				System.out.print(s.charAt(i));
				System.out.print(s.charAt(i + 1));
				System.out.print("\n");
			}
		}
		for (k = 1;k < l / 2;k++)
		{
			for (i = 0;i < j;i++)
			{
				int m = 0;
				for (t = 1;t <= k;t++)
				{
					if (a[i] - t < 0 || a[i] + 1 + t> l - 1)
					{
						break;
					}
					else
					{
						if (s.charAt(a[i] - t) == s.charAt(a[i] + 1 + t))
						{
						   m++;
						}
					}
				}
				if (m == k)
				{
					for (p = a[i] - k;p <= a[i] + 1 + k;p++)
					{
						System.out.print(s.charAt(p));
					}
						System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

