package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int count = 0;
		int p = 0;
		int n;
		int[] a = new int[20002];
		int[] b = new int[20002];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j < i;j++)
			{
				if (a[i] == a[j])
				{
					b[i] = 1;
				}
			}
			if (b[i] == 0)
			{
				count = count + 1;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (b[i] != 1)
			{
				p = p + 1;
				if (p != count)
				{
					System.out.print(a[i]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(a[i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}


}

