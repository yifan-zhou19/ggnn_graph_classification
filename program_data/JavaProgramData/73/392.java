package <missing>;

public class GlobalMembers
{
	/**
	* @file 1.cpp
	* @author ???
	* @date 2011-10-26
	* @description
	* ??????:????
	*/
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int k;
		int l;
		int hang;
		int lie;
		int ct = 0;
		int ctl;
		int ad;
		for (i = 1; i <= 5; i++)
		{
			for (j = 1; j <= 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (hang = 1; hang <= 5; hang++)
		{
			ad = a[hang][1];
			l = 1;
			ctl = 0;
			for (lie = 1; lie <= 5; lie++)
			{
				if (a[hang][lie] > ad)
				{
					ad = a[hang][lie];
					l = lie;
				}
			}
			for (k = 1; k <= 5; k++)
			{
				if (ad < a[k][l])
				{
					ctl++;
				}
			}
			if (ctl == 4)
			{
				System.out.print(hang);
				System.out.print(' ');
				System.out.print(l);
				System.out.print(' ');
				System.out.print(a[hang][l]);
				ct++;
			}
		}
		if (ct == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

