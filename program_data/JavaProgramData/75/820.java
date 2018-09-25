package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n = 0;
		int[] x = new int[1000];
		int[] y = new int[1000];
		int xmin;
		int ymax;
		char c;
		int[] a = new int[1000];
		int max = 1;
		int man = 0;

		for (i = 0;i < 1000;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 cin.get(c);
		 n++;
		if (c == '\n')
		{
			break;
		}
		}

		for (i = 0;i < 1000;i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 cin.get(c);
		if (c == '\n')
		{
			break;
		}
		}

		xmin = x[0];
		ymax = y[0];
		for (i = 0;x[i] != 0;i++)
		{
		 if (xmin >= x[i])
		 {
			 xmin = x[i];
		 }
		 if (ymax <= y[i])
		 {
			 ymax = y[i];
		 }
		}
		for (i = xmin;i <= ymax;i++)
		{
			for (j = 0;j < n;j++)
			{
			  if ((x[j] <= i != 0 && i < y[j]) || (x[j] == i))
			  {
				  a[i]++;
			  }
			}
		}
		for (i = 0;i < n;i++)
		{
			man++;
		}

		for (i = xmin;i <= ymax;i++)
		{
			if (max <= a[i])
			{
				max = a[i];
			}
		}
		System.out.print(man);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
	return 0;
	}
}

