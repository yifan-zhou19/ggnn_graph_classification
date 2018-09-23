package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int i;
		int[] b = new int[101];
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			if (b[a[i]] == 0)
			{
				if (flag == 0)
				{
					System.out.print(a[i]);
					flag = 1;
				}
				else
				{
					System.out.print(' ');
					System.out.print(a[i]);
				}
				b[a[i]] = 1;
			}
			else
			{
				continue;
			}
		}
		System.out.print("\n");
		return 0;
	}
}

