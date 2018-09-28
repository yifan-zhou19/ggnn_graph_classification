package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 1;
		int j = 1;
		int max = -1000;
		int x;
		char w = ',';
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		for (int k = 0;k < 1000;k++)
		{
			c[k] = 0;
		}
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (scanf(",%d", x) > 0)
		{
			a[i] = x;
			n++;
			i++;
		}
		b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (scanf(",%d", x) > 0)
		{
			b[j] = x;
			j++;
		}
		for (int k = 0;k < i;k++)
		{
			for (int p = a[k];p < b[k];p++)
			{
				c[p]++;
			}
		}
		for (int k = 1;k < 1000;k++)
		{
			if (max < c[k])
			{
			max = c[k];
			}
		}
		if (n == 0)
		{
				 System.out.print("1 1");
		}
		else
		{
			System.out.print(n + 1);
			System.out.print(' ');
			System.out.print(max);
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

