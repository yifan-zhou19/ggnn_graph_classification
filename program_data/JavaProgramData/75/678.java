package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] count = new int[1000];
		int[] x = new int[10000];
		int[] y = new int[10000];
		int a;
		int b;
		int i = 0;
		int q = 0;
		int k;
		int m;
		int p;
		int max;
		char ch;
		do
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			x[i] = a;
			i++;
			ch = System.in.read();
		}while (ch == ',');
		do
		{
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[q] = b;
			q++;
			ch = System.in.read();
		}while (ch == ',');
		for (m = 0; m < i; m++)
		{
			for (k = x[m]; k < y[m]; k++)
			{
				count[k]++;
			}
		}
		max = 0;
		for (p = 0; p < 1000; p++)
		{
			if (count[p] > max)
			{
				max = count[p];
			}
		}
		System.out.print(i);
		System.out.print(' ');
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

