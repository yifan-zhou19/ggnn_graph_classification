package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[N];
		int i = 0;
		int j = 0;
		int k = 0;
		int t = 0;

		for (int i = 0; i < N; i++)
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (k % 2 == 1)
			{
				a[j] = k;
				j++;
			}
		}

		for (int i = 0; i < j; i++)
		{
			for (int k = i + 1; k < j; k++)
			{
				if (a[i] > a[k])
				{
					t = a[i];
					a[i] = a[k];
					a[k] = t;
				}
			}
		}

		System.out.print(a[0]);
		for (int i = 1; i < j; i++)
		{
			System.out.print(",");
			System.out.print(a[i]);
		}

		return 0;
	}
}

