package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n;
		int m = 0;
		int[] x = new int[1000];
		int[] y = new int[1000];
		int j;
		int[] s = new int[1000];
		char c;
		for (;;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(c);
			if (c != ',')
			{
				break;
			}
		}
		n = i + 1;
		for (j = 0 ; j < n ; j++)
		{
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(c);
		}
		for (i = 0 ; i < n ; i++)
		{
			for (j = x[i]; j < y[i] ; j++)
			{
				s[j]++;
			}
		}
		for (i = 0 ; i < 1000 ; i++)
		{
			if (s[i] > m)
			{
				m = s[i];
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(m);
		return 0;
	}
}

