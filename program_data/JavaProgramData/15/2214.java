package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 0;
		int[][] a = new int[500][500];
		int[] sum = new int[500];
		int l;
		int s;
		int h;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (a[i][j] == 0)
				{
					sum[i]++;
				}
			}

			if (sum[i] > 2 && flag == 0)
			{
				l = i;
				flag = 1;
			}
			else if (sum[i] > 2 && flag == 1)
			{
				l = i - l - 1;
				h = sum[i] - 2;
			}
		}
		s = h * l;
		if (flag == 1)
		{
			System.out.printf("%d\n",s);
		}

		else
		{
			System.out.print("0\n");
		}
		return 0;
	}
















}

