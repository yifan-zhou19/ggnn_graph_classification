package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int count = n;
		for (int i = 1;i <= n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1;i <= n;i++)
		{
			if (a[i] != 0)
			{
			for (int j = i + 1;j <= n;j++)
			{
				if (a[j] == a[i])
				{
				a[j] = 0;
				count -= 1;
				}
			}
			}
		}
		if (count > 1)
		{
			int i;
			for (i = 1;i <= n;i++)
			{
				if (a[i] != 0)
				{
						System.out.print(a[i]);
						System.out.print(' ');
						count--;
				}
				if (count == 1)
				{
					break;
				}
			}
			for (i = i + 1;i <= n;i++)
			{
				if (a[i] != 0)
				{
					System.out.print(a[i]);
				}
			}
		}
		else
		{
			for (int i = 1;i <= n;i++)
			{
				if (a[i] != 0)
				{
					System.out.print(a[i]);
				}
			}
		}
			return 0;
	}
}

