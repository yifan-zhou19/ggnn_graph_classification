package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char a;
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] hour = new int[1000];
		int peo = 0;
		int temp;

		for (int i = 0; i < 1000; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(a);
			peo++;
			if (a == '\n')
			{
				break;
			}
		}
		for (int j = 0; j <= peo; j++)
		{
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(a);
			if (a == '\n')
			{
				break;
			}
		}
		for (int k = 0; k < peo; k++)
		{
			for (int p = x[k]; p < y[k]; p++)
			{
				hour[p]++;
			}
		}
		for (int m = 0; m < 1000; m++)
		{

			if (hour[m] > hour[m + 1])
			{
				temp = hour[m + 1];
				hour[m + 1] = hour[m];
				hour[m] = temp;
			}
		}

		System.out.print(peo);
		System.out.print(' ');
		System.out.print(hour[999]);

		return 0;
	}

}

