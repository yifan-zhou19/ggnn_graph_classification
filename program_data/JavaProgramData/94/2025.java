package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] w = new int[100];
	int t = 0;
	for (int i = 0;i < n;i++)
	{
		int c;
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (c % 2 != 0)
		{
			w[t] = c;
			t++;
		}
	}
	sort(w[0], w[t]);
	System.out.print(w[0]);
	for (int j = 1;j < t;j++)
	{
		System.out.print(',');
		System.out.print(w[j]);
	}
	return 0;
	}

}

