package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int[] x = new int[1001];
		int[] y = new int[1001];
		int sum;
		int max = 0;
		char c;
		do
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			i++;
		}while (c == ',');
		do
		{
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			j++;
		}while (c == ',');
		System.out.print(i);
		System.out.print(" ");
		n = i;
		for (i = 0 ; i < n ; i++)
		{
			sum = 0;
			for (j = 0 ; j < n ; j++)
			{
				if ((x[i] >= x[j]) && (x[i] < y[j]))
				{
					sum = sum + 1;
				}
				else
				{
				continue;
				}
			}
			if (sum > max)
			{
				max = sum;
			}
		}
		System.out.print(max);
		return 0;
	}
}

