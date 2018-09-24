package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int k = 0;
		int l = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x == y)
		{
			System.out.print(x);
			System.out.print("\n");
		}
		else
		{
			while (true)
			{
				a[k] = x;
				x = x / 2;
				b[l] = y;
				y = y / 2;
				if (a[k] == 0 && b[l] == 0)
				{
					break;
				}
				k++;
				l++;
			}
			for (int i = 0;i <= k;i++)
			{
				for (int j = 0;j <= l;j++)
				{
					if (a[i] == b[j])
					{
						System.out.print(a[i]);
						System.out.print("\n");
						return 0;
					}
				}
			}
		}
		return 0;
	}
}

