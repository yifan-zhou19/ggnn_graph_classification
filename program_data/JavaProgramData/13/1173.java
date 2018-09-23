package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20010];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0; j < i; j++)
			{
				if (a[i] == a[j])
				{
					i--;
					n--;
				}
			}
		}
		for (int k = 0; k < n - 1; k++)
		{
			System.out.print(a[k]);
			System.out.print(" ");
		}
		System.out.print(a [n - 1]);
		System.out.print("\n");

		return 0;
	}

}

