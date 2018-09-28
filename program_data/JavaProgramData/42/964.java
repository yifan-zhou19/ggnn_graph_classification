package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		int[] a = new int[100000 + 10];
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			if (a[i] == c)
			{
				for (j = i; j < n; j++)
				{
					a[j] = a[j + 1];
				}
				n--;
				i--;
			}
		}
		int first = 1;
		for (i = 0; i < n; i++)
		{
			if (first != 0)
			{
				System.out.print(a[i]);
				first = 0;
			}
			else
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}
		System.out.print("\n");
		return 0;

	}
}

