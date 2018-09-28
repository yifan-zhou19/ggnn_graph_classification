package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m; //m?????????i?j????m???????k?p??????s?????
		int i;
		int j;
		int k;
		int p;
		int s = 1;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m / 2 - 2;i++)
		{
			i = i + 3;
			j = m - i;
			if (i % 2 != 0)
			{
				s = s * 1;
			}
			else
			{
				s = s * 0;
			}
			for (k = 0;k < i - 2;k++)
			{
				if (i % (k + 2) != 0)
				{
					s = s * 1;
				}
				else
				{
					s = s * 0;
				}
			}
			for (p = 0;p < j - 2;p++)
			{
				if (j % (p + 2) != 0)
				{
					s = s * 1;
				}
				else
				{
					s = s * 0;
				}
			}
			if (s == 1)
			{
				System.out.print(i);
				System.out.print(' ');
				System.out.print(j);
				System.out.print("\n");
			}
			s = 1;
			i = i - 3;
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

