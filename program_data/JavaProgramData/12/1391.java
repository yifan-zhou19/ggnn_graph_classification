package <missing>;

public class GlobalMembers
{
	//****************************
	//**Title:??              **
	//**Author:?? 1300012732  **
	//**Date?2013.10.30        **
	//**File?1.cpp             **
	//****************************
	public static int Main()
	{
		int[] a = new int[15];
		int n;
		int i;
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a[0] != -1)
		{
			for (i = 1; ; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					n = i;
					break;
				}
			}
			int cnt = 0;
			int j;
			for (i = 0; i <= n - 2; i++)
			{
				for (j = i + 1; j <= n - 1; j++)
				{
					if (a[i] - 2 * a[j] == 0 || a[j] - 2 * a[i] == 0)
					{
						cnt++;
					}
				}
			}
			System.out.print(cnt);
			System.out.print("\n");
			for (i = 0; i <= 14; i++)
			{
				a[i] = 0;
			}
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}

}

