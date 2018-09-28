package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] test = new int[1000000];
		int num;
		int i;
		int j;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] f = {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int cur;
		for (i = 3; i < 21; i++)
		{
			f[i] = f[i - 1] + f[i - 2];
		}
		for (i = 0 ; i < num ; i++)
		{
			cur = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f[cur]);
			System.out.print("\n");
			;
		}
		return 0;
	}
}

