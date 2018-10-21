package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = {0, 0, 0};
		int yinshu;
		int sum = 0;
		char[] b = {'3', '5', '7'};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n % 3 == 0)
		{
			a[0] = 1; //??n????3
		}
		if (n % 5 == 0)
		{
			a[1] = 1; //??n????5
		}
		if (n % 7 == 0)
		{
			a[2] = 1; //??n????7
		}
		yinshu = a[0] + a[1] + a[2];
		if (yinshu == 0)
		{
			System.out.print('n');
		}
		else
		{
			for (int i = 0;i < 3;i++)
			{
				if ((a[i] != 0) && (sum == yinshu - 1))
				{
									   System.out.print(b[i]);
									   break;
				} //??????????? ?????
				if ((a[i] != 0) && (sum < yinshu - 1))
				{
									   sum++;
									   System.out.print(b[i]);
									   System.out.print(' ');
				} //??????????????
			}
		}
		return 0;
	}
}

