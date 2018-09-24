package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int i;
		int j;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[20000]; // ????
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(t);
		m = 1; //m??????????
		a[0] = t; //??????????
		for (i = 2; i <= n; i++)
		{
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0; j < m; j++)
			{
				if (a[j] == t) // ????????
				{
					break;
				}
			}
			if (j >= m) // ????????????
			{
				System.out.print(' ');
				System.out.print(t);
				a[m] = t;
				m++;
			}
		}
		return 0;
	}

}

