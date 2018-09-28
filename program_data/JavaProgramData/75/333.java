package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][2];
		int i = 0;
		int j;
		int sum;
		int max = 0;
		int[] b = new int[1001];
		do
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		}while (System.in.read() == ',');
		sum = i;
		i = 0;
		do
		{
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		}while (System.in.read() == ',');
		for (i = 0; i < sum; i++)
		{
			for (j = a[i][0]; j < a[i][1]; j++)
			{
				b[j]++;
			}
		}
		for (i = 1; i <= 1000; i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		System.out.print(sum);
		System.out.print(' ');
		System.out.print(max);
		return 0;
	}
}

