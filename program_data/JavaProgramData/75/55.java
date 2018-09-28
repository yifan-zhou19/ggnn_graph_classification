package <missing>;

public class GlobalMembers
{
	//*************************************************
	//***????????***
	//***??????***
	//***???2012.11.10***
	//*************************************************
	public static int Main()
	{
		int i;
		int j;
		int k;
		int p;
		int max = 0;
		int[] x = new int[1000];
		int[] y = new int[1000];
		char a;
		i = 0;
		x[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			a = System.in.read();
			if (a == '\n')
			{
				break;
			}
			x[++i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		i = 0;
		y[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			a = System.in.read();
			if (a == '\n')
			{
				break;
			}
			y[++i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (k = 0; k < 1000; k++)
		{
			p = 0;
			for (j = 0; j <= i; j++)
			{
				if (x[j] <= k != 0 && y[j] > k)
				{
					p++;
				}
			}
			if (p > max)
			{
				max = p;
			}
		}
		System.out.print(i + 1);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

