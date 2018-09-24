package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i = 1;
		int j;
		int m;
		int k;
		int x = 0;
		while ((a[i] = System.in.read()) != '\n')
		{
			i++;
		}
		m = i - 1;
		for (j = 2; j <= m; j++) //????????
		{
			for (i = 1; i <= m - j + 1; i++) //??????
			{
				for (k = 0; k <= j / 2 - 1; k++) //??
				{
					x = 0;
					if (a.charAt(i + k) != a.charAt(i + j - 1 - k))
					{
						x = 1;
						break;
					}
				}
				if (x == 0)
				{
					for (k = 0; k <= j - 1; k++)
					{
						System.out.print(a.charAt(i + k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}
