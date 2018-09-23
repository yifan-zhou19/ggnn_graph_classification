package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int c;
		int b = 1;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[20001];
		for (int i = 1; i <= N; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int m = 2; m <= N; m++)
		{
			for (c = 1;c <= b; c++)
			{
				if (a[m] == a[c])
				{
					break;
				}
			}
			if (c == b + 1)
			{
				b++;
				a[b] = a[m];
			}
		}
		System.out.print(a[1]);
		for (int d = 2; d <= b; d++)
		{
			System.out.print(" ");
			System.out.print(a[d]);
		}
		return 0;
	}
}

