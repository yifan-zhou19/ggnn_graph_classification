package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[11];
		int[] b = new int[11];
		int i = 0;
		int j = 0;
		int t = 0;
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < 11;i++)
		{
			if (a[i - 1] % 2 == 0)
			{
				a[i] = a[i - 1] / 2;
			}
			else
			{
				a[i] = (a[i - 1] - 1) / 2;
			}
		}
		for (i = 1;i < 11;i++)
		{
			if (b[i - 1] % 2 == 0)
			{
				b[i] = b[i - 1] / 2;
			}
			else
			{
				b[i] = (b[i - 1] - 1) / 2;
			}
		}
		for (i = 0;i < 11;i++)
		{
			for (j = 0;j < 11;j++)
			{
				if (a[i] == b[j])
				{
					System.out.print(a[i]);
					System.out.print("\n");
					t = 1;
					break;
				}
			}
			if (t == 1)
			{
				break;
			}
		}
		return 0;
	}
}

