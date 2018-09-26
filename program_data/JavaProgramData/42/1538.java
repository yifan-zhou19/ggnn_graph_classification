package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int d;
		int k;
		int max = 0;
		int[] f = new int[100001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			f[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (f[i] == k)
			{
				for (j = i + 1; j < n ; j++)
				{
					f[j - 1] = f[j];
				}
				i--;
				n--;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.print(f[i]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(f[i]);
			}
		}

	return 0;
	}

}

