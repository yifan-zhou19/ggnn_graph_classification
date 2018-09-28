package <missing>;

public class GlobalMembers
{
	public static int feibo(int a)
	{
		if (a == 1)
		{
			return 1;
		}
		if (a == 2)
		{
			return 1;
		}
		if (a != 1 && a != 2)
		{
			return feibo(a - 1) + feibo(a - 2);
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int a;
		int[] number = new int[100];
		number[1] = 1;
		number[2] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(feibo(a));
			System.out.print("\n");
		}
		return 0;
	}
}

