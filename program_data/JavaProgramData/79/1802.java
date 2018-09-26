package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int m;
		int n;
		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 1;i <= n;i++)
			{
				a[i] = 1;
			}
			int j = 0;
			int k = n;
			if (n == 0)
			{
				break;
			}
			while (true)
			{
				for (int i = 1;i <= n;i++)
				{
					j += a[i];
					if (j == m)
					{
						a[i] = 0;
						j = 0;
						k--;
						if (k == 0)
						{
							System.out.print(i);
							System.out.print("\n");
							break;
						}
					}
				}
				if (k == 0)
				{
					break;
				}
			}
		}
		return 0;
	}

}

