package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[1001];
		int[] b = new int[1001];
		for (i = 1; ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			char ch = System.in.read();
			if (ch != ',')
			{
				break;
			}
		}
		for (i = 1; ; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			char ch = System.in.read();
			if (ch != ',')
			{
				break;
			}
		}
		int t = i;
		System.out.print(t);
		System.out.print(" ");
		int[] c = new int[1001];
		int max = 0;
		for (int i = 0; i < 1000; i++)
		{
			for (int j = 1; j <= t; j++)
			{
				if (i >= a[j] != 0 && i < b[j])
				{
					c[i]++;
				}
			}
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

