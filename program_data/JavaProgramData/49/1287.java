package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[600]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l;
		l = a.length();
		int i;
		int j;
		int k;
		int m;
		for (i = 1;i <= l / 2;i++)
		{
			for (j = i;j <= l - i;j++)
			{
				m = 0;
				for (k = i;k > 0;k--)
				{
					if (a.charAt(j + k - 1) == a.charAt(j - k))
					{
						m = m + 1;
					}
				}
				if (m == i)
				{
					for (k = j - i;k <= j + i - 1;k++)
					{
						System.out.print(a.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}


}

