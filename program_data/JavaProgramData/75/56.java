package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i = 0;
		int m;
		int k;
		int num;
		int max = 0;
		while (true)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		m = i;
		i = 0;
		while (true)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		for (k = 0; k < 1000; k++)
		{
			num = 0;
			for (i = 0; i < m ; i++)
			{
				if (k >= a[i] != 0 && k < b[i])
				{
					num++;
				}
			}
			if (num > max)
			{
				max = num;
			}
		}

		System.out.print(m);
		System.out.print(" ");
		System.out.print(max);

		return 0;
	}
}

