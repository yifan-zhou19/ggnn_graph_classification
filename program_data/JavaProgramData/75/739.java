package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][2];
		int sum = 0;
		int min = 100000000;
		int max = 0;
		char b;
		do
		{
			a[sum][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[sum][0] < min)
			{
				min = a[sum][0];
			}
			++sum;
			b = System.in.read();
		}while (b == ',');
		for (int i = 0;i < sum;i++)
		{
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i][1] > max)
			{
				max = a[i][1];
			}
			b = System.in.read();
		}
		System.out.print(sum);
		System.out.print(" ");
		int m = 0;
		for (int j = min;j <= max;j++)
		{
			int m1 = 0;
			for (int k = 0;k < sum;k++)
			{
				if (a[k][0] <= j != 0 && a[k][1]> j)
				{
					++m1;
				}
			}
			if (m1 > m)
			{
				m = m1;
			}
		}
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}

}

