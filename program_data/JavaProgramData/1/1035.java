package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y) //???????????????y?????????x????????
	{
		int i;
		int sum = 0;
		for (i = x; i <= Math.sqrt(y); i++)
		{
			if (y % i == 0)
			{
				sum += f(i, y / i) + 1;
			}
		} //??????
			return sum;
	}

	public static int Main()
	{
	int n;
	int x;
	int i;
	int[] b = new int[100];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[i] = x;
	}
	for (i = 1;i <= n;i++)
	{
		System.out.print(f(2, b[i]) + 1);
		System.out.print("\n");
	} //???????

	return 0;

	}
}

