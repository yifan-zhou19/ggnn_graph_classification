package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i = 1;
		int j = 1;
		int k;
		int t;
		int count;
		int max = 0;
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (System.in.read() == ',')
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		}
		b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (System.in.read() == ',')
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j++;
		}
		System.out.print(j);
		System.out.print(" ");
		for (t = 0; t < 1000; t++)
		{
			count = 0;
			for (k = 0; k < j; k++)
			{
				if (a[k] <= t != 0 && t < b[k])
				{
					count++;
				}
			}
			if (count > max)
			{
				max = count;
			}
		}
		System.out.print(max);
		return 0;
	}
}

