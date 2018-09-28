package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int s = 0;
		int x;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[N];
		int[] b = new int[N];
		for (int i = 0;i < N;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < N;i++)
		{
			if (a[i] % 2 != 0)
			{
				s = s + 1;
				b[s] = a[i];
			}


		}
		for (int i = 1;i < s;i++)
		{
			for (int j = 1;j <= s - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					x = b[j];
					b[j] = b[j + 1];
					b[j + 1] = x;
				}
			}
		}
		for (int i = 1;i <= s;i++)
		{
			if (i - 1 != 0)
			{
				System.out.print(",");
			}
			System.out.print(b[i]);
		}

		return 0;
	}

}

