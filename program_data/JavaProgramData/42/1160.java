package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //???????????
		int[] a = new int[100000];
		int k;
		int i;
		int p = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			if (a[i] != k)
			{
				a[p++] = a[i];
			}
		}

		for (i = 0; i < p - 1; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		if (p > 0)
		{
			System.out.print(a[p - 1]);
			System.out.print("\n");
		}

		return 0;
	}

}

