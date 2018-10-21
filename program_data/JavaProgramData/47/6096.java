package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0; j < n / 2; j++)
		{
			s = a[j];
			a[j] = a[n - 1 - j];
			a[n - 1 - j] = s;
		}
		for (int h = 0; h < n; h++)
		{
			if (h != n - 1)
			{
				System.out.print(a[h]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(a[h]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

