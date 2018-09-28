package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		int[] x = new int[1001];
		int[] y = new int[1001];
		int[] count = new int[1001];
		for (int t = 0;t < 1001;t++)
		{
			count[t] = 0;
		}
		char a;
		while (true)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() != ',')
			{
				break;
			}
			i++;
		}
		for (j = 0;j < i;j++)
		{
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j <= i;j++)
		{
			for (int k = x[j];k < y[j];k++)
			{
				count[k]++;
			}
		}
			int max = 0;
		for (j = 0;j < 1001;j++)
		{
			if (count[j] > max)
			{
				max = count[j];
			}
		}
		 System.out.print(i + 1);
		 System.out.print(" ");
		 System.out.print(max);
		 System.out.print("\n");
		 return 0;
	}
}

