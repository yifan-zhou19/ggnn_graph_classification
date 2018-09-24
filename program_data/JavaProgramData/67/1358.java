package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] arr = new int[100][2];
		int i;
		int a;
		int b;
		double x;
		double y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = b * 100.0 / a;
		for (i = 0;i < n - 1;i++)
		{
			arr[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			arr[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = arr[i][1] * 100.0 / arr[i][0];
			if (y - x > 5)
			{
				System.out.print("better");
				System.out.print('\n');
			}
			else if (x - y > 5)
			{
				System.out.print("worse");
				System.out.print('\n');
			}
			else
			{
				System.out.print("same");
				System.out.print('\n');
			}
		}
		return 0;
	}
}

