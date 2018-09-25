package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20002];
		int[] b = new int[20001];
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n + 1;i++)
		{
			b[i] = 0;
		}
		a[n + 1] = 0;
		for (i = 2;i <= n;i++)
		{
			for (j = 1;j < i;j++)
			{
				if (a[i] == a[j])
				{
					a[i] = 0;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = i + 1;j <= n + 1;j++)
			{
				b[i] += a[j];
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] != 0 && b[i] != 0)
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
			else if (a[i] != 0 && b[i] == 0)
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

