package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y = 0;
		int m1 = 0;
		int m2 = 0;
		int n = 0;
		int i = 0;
		int j = 0;
		int[] a = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //??0???????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= n;j++)
		{
			int s = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) //?????????
		{
		a[2] = 29;
		}
		else
		{
			a[2] = 28;
		}
		if (m1 < m2)
		{
		for (i = m1;i < m2;i++)
		{
		s += a[i];
		}
		}
		if (m1 > m2)
		{
		for (i = m2;i < m1;i++)
		{
		s += a[i];
		}

		}
		if (s % 7 == 0)
		{
			System.out.print("YES");
			System.out.print("\n");
		}
		if (s % 7 != 0)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		}
		//int sss;cin>>sss;
		return 0;
	}




}

