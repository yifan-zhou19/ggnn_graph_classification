package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = 1;
		}

		for (int i = n - 1; i > 0; i--)
		{
			for (int j = i - 1; j >= 0; j--)
			{
				if (a[j] >= a[i] != 0 && b[j] < b[i] + 1)
				{
					b[j] = b[i] + 1;
				}
			}
		}
		for (int i = 0; i < n; i++)
		{
			if (b[0] < b[i])
			{
				b[0] = b[i];
			}
		}
		System.out.print(b[0]);
		System.out.print("\n");
		return 0;
	}



}

