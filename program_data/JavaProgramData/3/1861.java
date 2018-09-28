package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int k = 0;
		int[] a = new int[1100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int p = 0;
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				if (a[i] + a[j] == k)
				{
					p = 1;
					System.out.print("yes");
					System.out.print("\n");
					break;
				}

			}
			if (p == 1)
			{
				break;
			}
		}
		if (p == 0)
		{
			System.out.print("no");
			System.out.print("\n");
		}

		return 0;
	}
}

