package <missing>;

public class GlobalMembers
{
	/*
	 * ???:1104-4.cpp
	 * ?????
	 * ????: 2011-11-4
	 * ??????????????????
	 */
	public static int Main()
	{
		int sy; //????????????
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int l1 = 0;
		int l2 = 0;
		int l;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //??????????
		int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //??????????
		int i; //??????
		sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < sy;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				l1 += 366;
			}
			else
			{
				l1 += 365;
			}
		} //??????????
		for (i = 1;i < sm;i++)
		{
			if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
			{
				l1 += b[i];
			}
			else
			{
				l1 += a[i]; //??????????
			}
		}
		l1 += sd; //?????????


		for (i = 1;i < ey;i++)
		{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					l2 += 366;
				}
				else
				{
					l2 += 365; //??????????
				}
		}

			for (i = 1;i < em;i++)
			{
				if ((ey % 4 == 0 && ey % 100 != 0) || (ey % 400 == 0))
				{
					l2 += b[i];
				}
				else
				{
					l2 += a[i]; //??????????
				}
			}
			l2 += ed; //?????????




			l = l2 - l1; //????????
			System.out.print(l);
			return 0; //????


	}

}

