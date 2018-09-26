package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[2][1001];
	public static int Main()
	{
		int[] flag = new int[1001];
		int i;
		int j;
		int max;
		int l;
		char m;
		for (i = 0; ; i++)
		{
			a[0][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = System.in.read();
			if (m != ',')
			{
				break;
			}
		}
		for (i = 0; ; i++)
		{
			a[1][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = System.in.read();
			if (m != ',')
			{
				break;
			}
		}
		l = i;
		for (i = 1; i < 1001; i++)
		{
			for (j = 0; j <= l; j++)
			{
				if ((a[0][j] <= i) && (i < a[1][j]))
				{
					flag[i]++;
				}
			}
		}
		max = flag[1];
		for (i = 2; i < 1001; i++)
		{
			if (max < flag[i])
			{
				max = flag[i];
			}
		}
		System.out.print(l + 1);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}

}

