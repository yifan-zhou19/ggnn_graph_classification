package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			int m;
			int[] a = new int[20];
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 1;j <= m;j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (a[m] + 3 * m < 60)
			{
				System.out.print(60 - 3 * m);
				System.out.print("\n");
			}
			else //??
			{
				for (int j = 1;j <= m;j++) //?j=1??
				{
					if (a[j] + 3 * (j - 1) > 60) //??a[j]+3*(j-1)>60
					{
						System.out.print(60 - 3 * (j - 1));
						System.out.print("\n");
						break;
					}
					else if (a[j] + 3 * j > 60) //??a[j]+3*j>60
					{
						System.out.print(a[j]);
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}
}

