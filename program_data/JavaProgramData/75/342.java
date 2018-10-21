package <missing>;

public class GlobalMembers
{
	// ?????.cpp : Defines the entry point for the console application.
	//



	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		char a;
		int sum = 0;
		int len = 0;
		int[] n = new int[1001];
		int i = 0;
		int t = 0;
		int max = 0;

		for (i = 1;;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = System.in.read();

			if (a == '\n')
			{
				break;
			}
		}

		for (i = 1;;i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = System.in.read();

			if (a == '\n')
			{
				break;
			}

		}
		sum = i;


		for (t = 1;t <= 1000;t++)
		{
			for (i = 0;i <= sum;i++)
			{
				if (t >= x[i] != 0 && t < y[i])
				{
					n[t]++;
				}
			}
		}

		max = 1;

		for (t = 1;t <= 1000;t++)
		{
			if (n[t] > n[max])
			{
				max = t;
			}
		}

		System.out.print(sum);
		System.out.print(" ");
		System.out.print(n[max]);

		return 0;
	}


}

