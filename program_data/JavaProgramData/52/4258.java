package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??n??????????m??????
		int m;
		int[] num = new int[101];
		int t;
		int i;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (k = 1;k <= m;k++) //?????????
		{
			t = num[n]; //??????????????????????
			for (i = n;i >= 2;i--)
			{
				num[i] = num[i - 1];
			}
			num[1] = t; //???????????????????????
		}
		for (i = 1;i <= n;i++)
		{
			if (i == 1)
			{
				System.out.print(num[i]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(num[i]);
			}
		} //????????
		System.out.print("\n");
		return 0;
	}
}

