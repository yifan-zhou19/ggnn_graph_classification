package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] y = new int[200]; //???????1???2
		int[] m1 = new int[200];
		int[] m2 = new int[200];
		for (int i = 0;i < n;i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0;j < n;j++)
		{
			if (y[j] % 4 == 0 && y[j] % 100 != 0 || y[j] % 400 == 0) //????
			{
				int[] a = {31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366}; //????????????????
				if (m1[j] == 1) //???????
				{
					if (a[m2[j] - 2] % 7 == 0) //???????????????
					{
						System.out.print("YES");
						System.out.print("\n");
					}
					else
					{
						System.out.print("NO");
						System.out.print("\n");
					}
				}
				else if (m2[j] == 1) //???????
				{
					if (a[m1[j] - 2] % 7 == 0) //???????????????
					{
						System.out.print("YES");
						System.out.print("\n");
					}
					else
					{
						System.out.print("NO");
						System.out.print("\n");
					}
				}
				else
				{
					if (Math.abs(a[m1[j] - 2] - a[m2[j] - 2]) % 7 == 0) //???-2?????????
					{
						System.out.print("YES");
						System.out.print("\n");
					}
					else
					{
						System.out.print("NO");
						System.out.print("\n");
					}
				}
			}
			else
			{
				int[] b = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365}; //????????????????
				if (m1[j] == 1) //???????
				{
					if (b[m2[j] - 2] % 7 == 0) //???????????????
					{
						System.out.print("YES");
						System.out.print("\n");
					}
					else
					{
						System.out.print("NO");
						System.out.print("\n");
					}
				}
				else if (m2[j] == 1) //???????
				{
					if (b[m1[j] - 2] % 7 == 0) //???????????????
					{
						System.out.print("YES");
						System.out.print("\n");
					}
					else
					{
						System.out.print("NO");
						System.out.print("\n");
					}
				}
				else
				{
					if (Math.abs(b[m1[j] - 2] - b[m2[j] - 2]) % 7 == 0) //???-2?????????
					{
						System.out.print("YES");
						System.out.print("\n");
					}
					else
					{
						System.out.print("NO");
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

