package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static int people(int[] x, int[] y)
	{
		int i;
		int j;
		int[] count = new int[1000];
		int max = 0;
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i >= x[j] != 0 && i < y[j])
				{
					count[i]++;
				}
			}

			if (count[i] > max)
			{
				max = count[i];
			}
		}
		return max;
	}




	public static int Main()
	{
		int i = 1;
		int[] x = new int[1000];
		int[] y = new int[1000];
		x[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = 1;
		while (System.in.read() != '\n')
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[n] = Integer.parseInt(tempVar);
			}
			n++;
		}
		y[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (System.in.read() != '\n')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		System.out.print(n);
		System.out.print(' ');
		System.out.print(people(x, y));
		return 0;
	}


}

