package <missing>;

public class GlobalMembers
{
	public static int[] x = new int[100];
	public static int[] y = new int[100];

	public static int meet(int a, int b)
	{
		int i = 1;
		int j = 1;
		int roadmeet = 1;
		x[0] = a;
		y[0] = b;
		for (;a != 1;a = a / 2)
		{
			x[i++] = a / 2;
		}
		for (;b != 1;b = b / 2)
		{
			y[j++] = b / 2;
		}
		for (;i >= 0,j >= 0;i--,j--)
		{
			if (x[i] == y[j])
			{
				roadmeet = x[i];
			}
		}
		return roadmeet;
	}

	public static int Main()
	{
		int X;
		int Y;
		X = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(meet(X, Y));
		return 0;
	}
}

