package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 1;
		l = 1;
		while (n-- != 0)
		{
			for (int i = 0; i < l; i++)
			{
				a[i] *= 2;
			}
			for (int i = 0; i < l; i++)
			{
				if (a[i] > 9)
				{
					a[i + 1]++;
					a[i] -= 10;
				}
			}
			if (a[l] != 0)
			{
				l++;
			}
		}
		for (int i = l - 1; i >= 0; i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");

		return 0;
	}

}

