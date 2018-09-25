package <missing>;

public class GlobalMembers
{
	public static int j;
	public static int discharge(int x,int y)
	{
		int a = 1;
		for (int i = y;i <= (Math.sqrt((double)x));i++)
		{
			if (x % i == 0)
			{
				a = a + discharge(x / i, i);
			}
		}
		return a;
	}
	public static int Main()
	{
		int n;
		int x;
		int[] r = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < n;j++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			r[j] = discharge(x, 2);
		}
		for (j = 0;j < n - 1;j++)
		{
			System.out.print(r[j]);
			System.out.print("\n");
		}
		System.out.print(r[n - 1]);
		return 0;
	}
}

