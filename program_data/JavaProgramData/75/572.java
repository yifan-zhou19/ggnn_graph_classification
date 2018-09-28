package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????   **
	//*?????? 1300012713 **
	//*???2013.11.01  **
	//********************************
	public static int Main()
	{
		int[][] a = new int[1000][2]; //??????????a????????b???num?????max
		int[] b = new int[1010];
		int num = 1;
		int max = 0;
		char ch; //??????
		for (num = 1; ; num++) //??
		{
			a[num - 1][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			if (ch == '\n')
			{
				break; //???????
			}
		}
		for (int i = 1; i <= num; i++)
		{
			a[i - 1][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			for (int j = a[i - 1][0]; j < a[i - 1][1];j++)
			{
				b[j - 1] = b[j - 1] + 1; //????????????
			}
		}
		System.out.print(num);
		System.out.print(" ");
		for (int k = 1; k <= 1010; k++) //????????
		{
			if (b[k - 1] > max)
			{
				max = b[k - 1];
			}
		}
		System.out.print(max);
		return 0;
	}




}

