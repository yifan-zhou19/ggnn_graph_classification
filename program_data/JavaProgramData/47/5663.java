package <missing>;

public class GlobalMembers
{
	public static int[] data = new int[1000];
	public static int n = 0;
	public static int m = 0;

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			data[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1; i <= n / 2; i++)
		{
			int j = data[i];
			data[i] = data[n - i + 1];
			data[n - i + 1] = j;
		}
		System.out.print(data[1]);
		for (int i = 2; i <= n; i++)
		{
			System.out.print(' ');
			System.out.print(data[i]);
		}
	}
}

