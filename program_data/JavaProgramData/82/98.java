package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] arr = new int[100][2];
		int i;
		int j = 0;
		int[] h = new int[100];
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			arr[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			arr[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (arr[i][0] <= 140 && arr[i][0] >= 90 && arr[i][1] <= 90 && arr[i][1] >= 60)
			{
				h[j] = h[j] + 1;
			}
			else
			{
				j++;
			}
		}
		m = h[0];
		for (i = 1;i < 100;i++)
		{
			if (h[i] > m)
			{
				m = h[i];
			}
		}
		System.out.print(m);
		return 0;
	}
}

