package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int[] r = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int i;
		int j = 0;
		int k;
		int l;
		int m;
		int n;
		int s;
		int t;
		int[][] a = new int[12][2];
		int[] b = new int[12];
		int w;
		for (i = 0;i < 12;i++)
		{
			b[i] = 0;
		}
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 12;i++)
		{
				a[i][0] = 0;
		a[i][1] = i + 1;
		}


		for (i = 1;i < 12;i++)
		{
			a[i][0] = a[i - 1][0] + r[i];
		}
		for (i = 0;i < 12;i++)
		{
			if (a[i][0] % 7 == 7 - w)
			{
				b[j] = a[i][1],j++;
			}
		}
		if (b[0] != 0)
		{
			System.out.print(b[0]);
		}
		for (i = 1;b[i] != 0;i++)
		{
			System.out.print("\n");
			System.out.print(b[i]);
		}
	}


}

