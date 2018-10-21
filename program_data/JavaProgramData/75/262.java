package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1100];
		int[] y = new int[1100];
		int i;
		int n = 0;
		int max = 0;
		int min = 1000;
		int j;
		int most = 0;
		int p;
		char b;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[n] = Integer.parseInt(tempVar);
			}
			b = System.in.read();
			n++;
		} while (b == ',');
		n = 0;
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[n] = Integer.parseInt(tempVar2);
			}
			b = System.in.read();
			n++;
		} while (b == ',');
		System.out.printf("%d ",n);
		for (i = 0;i < n;i++)
		{
			if (x[i] < min)
			{
				min = x[i];
			}
			if (y[i] > max)
			{
				max = y[i];
			}
		}

		for (i = min;i < max;i++)
		{
			p = 0;
			for (j = 0;j < n;j++)
			{
				if (x[j] <= i != 0 && y[j]> i)
				{
					p++;
				}
			}
			if (p > most)
			{
				most = p;
			}
		}
		System.out.printf("%d\n",most);


	}

}

