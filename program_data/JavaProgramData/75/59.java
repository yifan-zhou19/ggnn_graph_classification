package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[][] b = new int[1000][2];
		char c = '\0';
		int i = 0;
		int max = 0;
		int time = 0;
		while (c != '\n')
		{
			b[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			i++;
		}
		i = 0;
		c = '\0';
		while (c != '\n')
		{
			b[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			i++;
		}
		for (int j = 0;j < i;j++)
		{
			for (int t = b[j][0];t < b[j][1];t++)
			{
				a[t]++;
			}
		}
		for (int j = 0;j < 1000;j++)
		{
			if (a[j] > max)
			{
				max = a[j];
			}
		}
		System.out.printf("%d %d\n",i,max);
		return 0;
	}
}

