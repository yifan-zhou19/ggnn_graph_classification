package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] N = new int[60];
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < n;j++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
			System.out.print(60);
			System.out.print("\n");
			}
			else
			{
			for (i = 0;i < m;i++)
			{
			N[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			i = m - 1;
			while (N[i] + 3 * i > 60)
			{
			i--;
			}
			if (N[i] + 3 * (i + 1) > 60)
			{
			sum = N[i];
			}
			else
			{
			sum = 60 - 3 * (i + 1);
			}
			System.out.print(sum);
			System.out.print("\n");
			}
		}
		return 0;
	}

}

