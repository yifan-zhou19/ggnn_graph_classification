package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int[] b = new int[20000];
		int j = 0;
		int i = 0;
		int n = 0;
		int e = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[j] = a[i];
			j = i + 1;
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n - 1;j++)
			{
				if (a[i] == b[j])
				{
				   b[j] = 0;
				}
			}
		}
		System.out.print(b[0]);
		for (j = 1;j <= n - 1;j++)
		{
			if (b[j] != 0)
			{
			System.out.print(" ");
			System.out.print(b[j]);
			}
		}
		return 0;
	}

}

