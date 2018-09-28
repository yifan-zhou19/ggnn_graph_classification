package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100000];
		int i;
		int j;
		int k;
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = n - 1; i >= 0; i--)
		{
			if (a[i] != k)
			{
				j = i;
				break;
			}
		}
		for (i = 0; i <= n - 1; i++)
		{
			if (a[i] != k)
			{
				if (i != j)
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

