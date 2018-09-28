package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1001];
		int n;
		int i = 0;
		int j;
		int max = 0;
		char ch;
		for (j = 0; j < 1001; j++)
		{
			c[j] = 0;
		}
		while (true)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(ch);
			i++;
			if (ch == '\n')
			{
				break;
			}
		}
		n = i;
		for (i = 0; i < n - 1; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
			b[n - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = a[i]; j < b[i]; j++)
			{
				c[j] = c[j] + 1;
			}
		}
		for (j = 0; j < 1001; j++)
		{
			if (c[j] > max)
			{
				max = c[j];
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

