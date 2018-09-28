package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int l;
		int[] a = new int[32];
		for (i = 0; i < 32; i++)
		{
			a[i] = 0;
		}
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[31] = 1;
		if (N == 0)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else
		{
			for (i = 1; i <= N; i++)
			{
				j = 0;
				while (a[j] == 0)
				{
					j++;
				}
				l = 32 - j;
				for (j = 31; j >= 32 - l; j--)
				{
					a[j] *= 2;
				}
				for (j = 31; j >= 32 - l; j--)
				{
					if (a[j] >= 10)
					{
						a[j - 1] += a[j] / 10;
						a[j] = a[j] % 10;
					}
				}
			}
			i = 0;
			while (a[i] == 0)
			{
				i++;
			}
			for (; i < 32; i++)
			{
				System.out.print(a[i]);
			}
			return 0;
		}
	}
}

