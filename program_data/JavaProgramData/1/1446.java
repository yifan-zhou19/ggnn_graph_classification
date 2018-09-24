package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static int Main()
	{
		void yinshu(int,int); //????????????????????????
		int i;
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			sum = 0;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			yinshu(a, 2);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

	public static void yinshu(int a,int x)
	{
		if (a != 1)
		{
		for (int i = x;i <= a;i++) //?x?????
		{
			if (a % i == 0) //????
			{
				yinshu(a / i, i); //?a/i??????????????i???
			}
		}
		}
		if (a == 1) //????????????
		{
			sum++;
		}
	}
}

