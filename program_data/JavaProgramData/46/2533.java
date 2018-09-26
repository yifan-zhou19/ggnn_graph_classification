package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] a = new int[101][101];
		int round;
		int count;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= m; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = 1;
		j = 1;
		round = 0;
		count = 0; //??????
		while (count < n * m) //????????
		{
			while (j <= m - round)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				count++;
				j++;
			}
			if (count >= n * m)
			{
				break;
			}
			j--;
			i++; //????
			while (i <= n - round)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				count++;
				i++;
			}
			if (count >= n * m)
			{
				break;
			}
			i--;
			j--; //????
			while (j >= round + 1)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				count++;
				j--;
			}
			if (count >= n * m)
			{
				break;
			}
			j++;
			i--; //????
			while (i >= round + 2)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				count++;
				i--;
			}
			if (count >= n * m)
			{
				break;
			}
			i++;
			j++; //????
			round++; //???????
		}
		return 0; //main???????0
	}
}

