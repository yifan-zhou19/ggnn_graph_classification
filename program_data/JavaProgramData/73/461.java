package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int[] maxI = new int[6];
		int[] JofmaxI = new int[6];
		int[] minJ = new int[6];
		int n = 0;
		int i;
		int j;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i][j] > maxI[i])
				{
					maxI[i] = a[i][j];
					JofmaxI[i] = j;
				}
			}
		}
		for (j = 1;j <= 5;j++)
		{
			minJ[j] = a[1][j];
			for (i = 2;i <= 5;i++)
			{
				if (a[i][j] < minJ[j])
				{
					minJ[j] = a[i][j];
				}
			}
		}
		for (i = 1;i <= 5;i++)
		{
			if (maxI[i] == minJ[JofmaxI[i]])
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(JofmaxI[i]);
				System.out.print(" ");
				System.out.print(maxI[i]);
				System.out.print("\n");
				n++;
			}
		}
		if (n == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

