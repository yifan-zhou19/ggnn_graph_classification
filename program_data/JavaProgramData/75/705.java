package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] p = new int[1000];
		int n;
		int i;
		int j;
		x[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 1;
		while (System.in.read() != '\n')
		{
		  x[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		n = i;
		for (i = 0; i < n; i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			for (j = x[i]; j < y[i]; j++)
			{
			  p[j]++;
			}
		}
		i = 0;
		for (j = 1; j < 1000; j++)
		{
		  if (p[j] > p[i])
		  {
			i = j;
		  }
		}
		System.out.print(n);
		System.out.print(' ');
		System.out.print(p[i]);
		return (0);
	}
}

