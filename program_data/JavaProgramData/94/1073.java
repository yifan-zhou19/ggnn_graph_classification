package <missing>;

public class GlobalMembers
{
	/*
	 *???: 1.cpp
	 *??????
	 *????: 2012-11-05
	 *??: ???????N????500???????????????????????????
	 */


	public static int Main()
	{
		int N = 0;
		int num = 0;
		int counter = 0;
		int temp = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[N + 1];
		for (int i = 1; i <= N; i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num % 2 != 0)
			{
				counter++;
				a[counter] = num;
			} //?????????
		}
		for (int i = 1; i <= counter; i++)
		{
			for (int j = 1; j <= counter - i; j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				} //????
			}
		}
		for (int i = 1; i <= counter; i++)
		{
			if (i == 1)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(",");
				System.out.print(a[i]);
			}
		} //????
		return 0;
	}
}

