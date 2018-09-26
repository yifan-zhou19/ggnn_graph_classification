package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int bmax;
		int max;
		int[] b = new int[10000];
		int[] count = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i == 0 && j == 0)
			{
				break;
			}
			b[j]++;
			count[i]++;
		}
		bmax = b[0];
		max = 0;
		for (int k = 1;k < n;k++)
		{
			if (b[k] > bmax)
			{
				bmax = b[k];
				max = k;
			}
		}
		if (count[max] == 0)
		{
			System.out.print(max);
			System.out.print("\n");
		}
		else
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

