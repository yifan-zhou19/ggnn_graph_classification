package <missing>;

public class GlobalMembers
{
	public static int cal(int a) //??????
	{
		int res = 2;
		if (res != 1 && a != 1)
		{
			if (a % 2 == 0)
			{
				res = a / 2;
				System.out.print(a);
				System.out.print("/2=");
				System.out.print(res);
				System.out.print("\n");
			}
			else
			{
				res = a * 3 + 1;
				System.out.print(a);
				System.out.print("*3+1=");
				System.out.print(res);
				System.out.print("\n");
			}
			if (res != 1) //?????????
			{
				cal(res);
			}
			else
			{
				System.out.print("End");
			}
		}
		if (a == 1)
		{
			System.out.print("End");
		}
		return 0;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cal(n);
		return 0;
	}

}

