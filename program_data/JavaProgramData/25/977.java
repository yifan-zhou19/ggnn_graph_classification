package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int[] a = new int[100];
		a[99] = 1;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < N; i++)
		{
			for (j = 99; j >= 0; j--)
			{
				a[j] = a[j] * 2;
			}
			for (j = 99; j >= 0; j--)
			{
				if (a[j] >= 10)
				{
					a[j - 1] = a[j - 1] + 1;
					a[j] = a[j] % 10;
				}
			}
		}
		int b = 0;
		for (i = 0; i < 100; i++)
		{
			if (!(a[i] == 0 && b == 0))
			{
				b++;
				System.out.print(a[i]);
			}
		}
		System.out.print("\n");
	}
}

