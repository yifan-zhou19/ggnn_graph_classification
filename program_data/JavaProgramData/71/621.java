package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum;
		int[][] a = new int[200][3];
		int[] yue = new int[13];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		yue[1] = yue[3] = yue[5] = yue[7] = yue[8] = yue[10] = yue[12] = 31;
		yue[4] = yue[6] = yue[9] = yue[11] = 30;
		for (i = 0;i < n;i++)
		{
			sum = 0;
			yue[2] = 28;
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i][0] % 400 == 0 || a[i][0] % 100 != 0 && a[i][0] % 4 == 0)
			{
				yue[2] = 29;
			}
			for (j = a[i][1];j < a[i][2];j++)
			{
				sum += yue[j];
			}
			for (j = a[i][2];j < a[i][1];j++)
			{
				sum += yue[j];
			}
			if (sum % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

