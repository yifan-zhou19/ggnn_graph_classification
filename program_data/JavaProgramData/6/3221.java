package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int j;
		int sum;
		int[][] c = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;

			for (i = 0;i < a;i++)
			{
				for (j = 0;j < b;j++)
				{
					c[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int[] p = new int[100];
			p = c;
			for (i = 0;i < b;i++)
			{
				sum += *(p[0] + i);
			}
			for (j = 1;j < a - 1;j++)
			{
				sum += *(p[j]) + *(p[j] + b - 1);
			}
			for (i = 0;i < b;i++)
			{
				sum += *(p[a - 1] + i);
			}
			System.out.print(sum);
			System.out.print("\n");
			n--;
		}
		return 0;
	}

}

