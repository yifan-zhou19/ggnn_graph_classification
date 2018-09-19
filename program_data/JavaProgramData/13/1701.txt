package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[30000];
		int i;
		int j;
		int[] hash = new int[30000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			hash[i] = 1;
		}
		System.out.print(a[1]);
		for (i = 2; i <= n; i++)
		{

			for (j = 1; j < i ; j++)
			{
				if (a[i] == a[j])
				{
					hash[i] = hash[i] * 0;
				}
				else
				{
					hash[i] = hash[i];

				}
			}
		}
		for (i = 2; i <= n; i++)
		{
			if (hash[i] == 1)
			{
			System.out.print(" ");
			System.out.print(a[i]);
			}
		}
		int b;
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;

	}

}

