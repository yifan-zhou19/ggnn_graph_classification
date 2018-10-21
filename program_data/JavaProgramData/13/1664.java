package <missing>;

public class GlobalMembers
{
	//***********************
	//**????????*****
	//**???1300012728*****
	//**2013.10.20***********
	//***********************
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[n]; // ???????n???
		num[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(num[0]);
		for (int i = 1; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0; j < i; j++)
			{
				if (num[j] == num[i]) // ??????????
				{
				num[i] = 0;
				}
			}
			if (num[i] != 0) // ?????????????????
			{
			System.out.print(' ');
			System.out.print(num[i]);
			}
		}
		return 0;
	}
}

