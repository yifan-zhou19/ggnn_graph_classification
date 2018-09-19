package <missing>;

public class GlobalMembers
{
	/*
	*@file 2.cpp
	*@author ???
	*@date 2010-11-03
	*@describe
	?????????????????????????
	*/
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int n;
		int count;
		while (true)
		{
			count = 0;
			i = 0;
			//?????0???
			while (true)
			{
				a[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i - 1] == 0 || a[0] == -1)
				{
					break;
				}
			}
			n = i - 1;
			//??????-1?????
			if (a[0] == -1)
			{
				break;
			}
			//?????????????????count++
			for (i = 0 ; i < n - 1 ; i++)
			{
				for (j = i + 1 ; j < n; j++)
				{
					if (a[i] * 2 == a[j] || a[j] * 2 == a[i])
					{
						count++;
					}
				}
			}
			//??????????
			System.out.print(count);
			System.out.print("\n");
		}
		return 0;
	}

}

