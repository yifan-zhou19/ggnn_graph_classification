package <missing>;

public class GlobalMembers
{
	//********************
	//*??; ??????*
	//*??:???       *
	//*2012-12-19        *
	//********************
	public static int Main()
	{
		int n; //?????????
		int a;
		int i = 1;
		int j = 1;
		int[] m = new int[30];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			int[] m = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //???????????2??1
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 2;j <= a - 1;j++) //???????3????
			{
				m[j] = m[j - 1] + m[j - 2];
			}
			System.out.print(m[a - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

