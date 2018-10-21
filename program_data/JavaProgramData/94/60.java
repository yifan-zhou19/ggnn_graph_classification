package <missing>;

public class GlobalMembers
{
	/**
	* @file 8.cpp
	* @author ???
	* @date 2010?11?7
	* @description
	* ?????????????
	*/
	public static int Main()
	{
		int N;
		int num;
		int[] a = new int[500];
		int i;
		int j = 0;
		int flag = 1;
		int k;
		int temp;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < N; i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num % 2 != 0)
			{
				a[j++] = num;
			}
		}
		for (i = 0; i < j; i++)
		{
			for (k = 0; k < j - 1 - i; k++)
			{
				if (a[k] > a[k + 1])
				{
					temp = a[k];
					a[k] = a[k + 1];
					a[k + 1] = temp;
				}
			}
		}
		for (i = 0; i < j; i++)
		{
			System.out.print(a[i]);
			flag = 0;
			if (flag == 0 && i != j - 1)
			{
				System.out.print(",");
			}
		}
		return 0;
	}


}

