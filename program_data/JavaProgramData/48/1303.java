package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????? 1300012733 **
	//*???2013?11?29?
	//********************************
	public static int[][] arr = new int[11][11];
	public static int[][] brr = new int[11][11];
	public static void proliferate(int day)
	{
		if (day == 0)
		{
			return;
		}
		//?arr???brr?????????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(brr, arr, (Integer.SIZE / Byte.SIZE));
		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1; j <= 9; j++)
			{
				//???
				arr[i][j] = 2 * brr[i][j] + brr[i - 1][j] + brr[i + 1][j] + brr[i][j - 1] + brr[i][j + 1] + brr[i - 1][j - 1] + brr[i + 1][j + 1] + brr[i + 1][j - 1] + brr[i - 1][j + 1];
			}
		}
		day--;
		proliferate(day);
	}

	public static int Main()
	{
		arr[5][5] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int day;
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		proliferate(day);
		//????
		for (int i = 1; i <= 9; i++)
		{
			System.out.print(arr[i][1]);
			for (int j = 2; j <= 9; j++)
			{
				System.out.print(' ');
				System.out.print(arr[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

