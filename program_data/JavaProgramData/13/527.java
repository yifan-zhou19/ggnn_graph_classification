package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[20000];
		int[] a = new int[20000];
		int i;
		int n;
		int j;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = n - 1;j >= i + 1;j--)
			{
				if (a[i] == a[j])
				{
					b[j] = 1;
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (b[i] == 0)
			{
				if (flag == 0)
				{
					System.out.print(a[i]);
					flag = 1;
					continue;

				}
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}
		return 0;
	}

}

