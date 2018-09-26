package <missing>;

public class GlobalMembers
{
	/*
	 * file    competition 1_4
	 * author  ??
	 * date    2010-10-22
	 * description
	           ?????
	*/



	public static int Main()
	{
		int n;
		int i;
		int y;
		int m1;
		int m2;
		int t;
		int j;
		int m;
		int[] a = new int[12];
		a[1] = 31;
		a[3] = 31;
		a[4] = 30;
		a[5] = 31;
		a[6] = 30;
		a[7] = 31;
		a[8] = 31;
		a[9] = 30;
		a[10] = 31;
		a[11] = 30;
		a[12] = 31;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 if (y % 4 != 0)
			 {
				 t = 0;
			 }
			 else
			 {
				  if (y % 100 == 0 && y % 400 != 0)
				  {
					  t = 0;
				  }
				else
				{
					t = 1;
				}
			 }
			if (t == 0)
			{
				a[2] = 28;
			}
			else
			{
				a[2] = 29;
			}
			if (m1 > m2)
			{
				m = m1;
				m1 = m2;
				m2 = m;
			}
			m = 0;
			for (j = m1; j < m2; j++)
			{
				m = m + a[j];
			}
			if (m % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

