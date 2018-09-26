package <missing>;

public class GlobalMembers
{
	/**
	* @file 2.cpp
	* @author ??
	* @date 2010?12?29
	* @description
	* ??????:????
	*/
	public static void solve()
	{
		int i;
		int j;
		for (i = 0;i < length - 1;i++)
		{
			if (a.charAt(i) == m && flag[i] == 0)
			{
				for (j = 1;j < length - i;j++)
				{
					if (flag[i + j] == 1) //?????????
					{
						continue;
					}
					else
					{
						if (a.charAt(i + j) == m)
						{
							break;
						}
						else
						{
							flag[i] = 1;
							flag[i + j] = 1;
							b[sum][0] = i;
							b[sum][1] = i + j;
							sum++;
							break;
						}
					}
				}
			}
		}
		if (flag[0] == 0)
		{
			solve(); //??
		}
	}
	public static void paixu()
	{
		int i;
		int j;
		int temp;
		for (j = 0;j < length / 2 - 1;j++)
		{
			for (i = 0;i < length / 2 - j - 1;i++)
			{
				if (b[i][1] > b[i + 1][1])
				{
					temp = b[i + 1][1];
					b[i + 1][1] = b[i][1];
					b[i][1] = temp;
					temp = b[i + 1][0];
					b[i + 1][0] = b[i][0];
					b[i][0] = temp;
				}
			}
		} //?????
		for (i = 0;i < length / 2;i++)
		{
			System.out.print(b[i][0]);
			System.out.print(" ");
			System.out.print(b[i][1]);
			System.out.print("\n");
		}
	}
	public static String a = new String(new char[1000]);
	public static char m;
	public static int length;
	public static int[] flag = new int[1000];
	public static int[][] b = new int[500][2];
	public static int sum = 0;
	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		length = a.length();
		m = a.charAt(0); //??????
		solve();
		paixu();
		return 0;
	}

}

