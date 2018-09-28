package <missing>;

public class GlobalMembers
{
	//****************************
	//**Title:?????        **
	//**Author:?? 1300012732  **
	//**Date?2013.10.30        **
	//**File?4.cpp             **
	//****************************
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		char ch;
		int i;
		for (i = 0; ;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			if (ch == 10)
			{
				break;
			}
		}
		int max = 0;
		for (i = 0; ;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (b[i] > max)
			{
				max = b[i];
			}
			ch = System.in.read();
			if (ch == 10)
			{
				break;
			}
		}
		System.out.print(i + 1);
		System.out.print(' ');
		int j;
		int k;
		int htime = 0;
		for (j = 0; j <= max; j++)
		{
			int cnt = 0;
			for (k = 0; k <= i; k++)
			{
				if (a[k] <= j != 0 && b[k] > j)
				{
					cnt++;
				}
			}
			if (cnt > htime)
			{
				htime = cnt;
			}
		}
		System.out.print(htime);
		System.out.print("\n");
		return 0;
	}

}

