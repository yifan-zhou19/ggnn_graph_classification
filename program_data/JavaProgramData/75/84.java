package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max = 0;
		int n = 0;
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] s = new int[1000];
		int i = 0;
		int j;
		char c;
		while ((x[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			cin.get(c);
			n++;
			if (c != ',')
			{
				break;
			}
		}
		y[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i < n; i++)
		{
			c = ConsoleInput.readToWhiteSpace(true).charAt(0);
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			for (j = x[i]; j < y[i]; j++)
			{
				s[j]++;
			}
		}
		for (i = 0; i < 1000; i++)
		{
			if (max < s[i])
			{
				max = s[i];
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

