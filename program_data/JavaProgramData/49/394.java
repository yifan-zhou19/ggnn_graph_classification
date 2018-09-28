package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int[] k = new int[500];
		int times = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int t = a.length();
		for (int x = 0; x < t; x++)
		{
			if (a.charAt(x) - 'a' == a.charAt(x + 1) - 'a')
			{
				k[x] = 1;
				System.out.print(a.charAt(x));
				System.out.print(a.charAt(x + 1));
				System.out.print("\n");
			}
		}
		for (int m = 1; m < t / 2; m++)
		{
			for (int i = 0; i < t; i++)
			{
				if (k[i] == 1)
				{
					int flag = 0;
					int l = 1;
					for (; l <= m; l++)
					{
						if (a.charAt(i - l) - 'a' != a.charAt(i + l + 1) - 'a')
						{
							flag = 1;
						}
					}
					if (flag == 0 && l == m + 1)
					{
						for (int q = i - m; q <= i + m + 1; q++)
						{
							System.out.print(a.charAt(q));
						}
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

