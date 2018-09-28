package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		i = 0;
		while (i < n)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;

		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;

		t = 0;
		while (i < n)
		{
			if (a[i] != k)
			{
				i++;
			}
			else
			{
				t = i;

				while (t < (n - 1))
				{
					a[t] = a[t + 1];
					t++;

				}
				n--;
			}
		}
		i = 0;
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);
		System.out.print("\n");
		return 0;
	}
}

