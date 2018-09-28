package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		int i;
		int j;
		int k;
		int n;
		int flag = 1;
		for (i = 0; ; i++)
		{
			cin.get(a.charAt(i));
			if (a.charAt(i) == '\n')
			{
				break;
			}
		}
		n = --i;
		for (j = 1; j <= n; j++)
		{
			for (i = 0; i <= n; i++)
			{
				if ((i + j) > n)
				{
					continue;
				}
				flag = 1;
				for (k = 0; k <= (j / 2) ; k++)
				{
					if (a.charAt(i + k) != a.charAt(i + j - k))
					{
						flag = 0;
					}
				}
				if (flag == 1)
				{
					for (k = i; k <= (i + j); k++)
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
