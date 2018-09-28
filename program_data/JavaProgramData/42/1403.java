package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int k;
		int count = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1 - count; i++)
		{
			if (a[i] == k)
			{
				count++;
				for (j = i; j <= n - 1 - count; j++)
				{
					a[j] = a[j + 1];
				}
				i--;
			}
		}
		System.out.print(a[0]);
		for (i = 1; i <= n - 1 - count; i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}

		return 0;
	}
}

