package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] s = new int[1000];
		int i = 0;
		int j;
		int k;
		int earliest;
		int latest = 0;
		int max = 0;
		char c;
		while ((x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			i++;
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
		}
		for (j = 0; j < i; j++)
		{
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
		}
		earliest = x[0];
		for (j = 0; j < i; j++)
		{
			if (earliest > x[j])
			{
				earliest = x[j];
			}
			if (latest < y[j])
			{
				latest = y[j];
			}
		}
		for (j = earliest; j <= latest; j++)
		{
			for (k = 0; k <= i; k++)
			{
				if (x[k] <= j != 0 && y[k] > j)
				{
					s[j]++;
				}
			}
		}
		for (j = earliest; j <= latest; j++)
		{
			if (max < s[j])
			{
				max = s[j];
			}
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

