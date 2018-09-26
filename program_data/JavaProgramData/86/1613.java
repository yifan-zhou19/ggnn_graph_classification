package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 1;
		for (i = 1;i <= n;i++) //????????????
		{
			int m;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[] a = new int[60]; //??????
			if (m == 0)
			{
				System.out.print("60");
				System.out.print("\n");
			}
			else
			{
				int j = 1;
				for (j = 1;j <= m;j++)
				{
					a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if ((a[j] + 3 * j) >= 60 & (a[j] + 3 * j) <= 63)
					{
						num = a[j];
					}
					else if (((a[j - 1] + 3 * (j - 1)) < 60) & (a[j] + 3 * j)>63)
					{
						num = (63 - 3 * j);
					}
					else if ((a[j] + 3 * j) < 60)
					{
						num = (60 - 3 * j);
						continue;
					} //??????????????????????????????????????????????????
				}
				System.out.print(num);
				System.out.print("\n");
			}
		}
	}
}

