package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w0;
		int m;
		int d;
		int[] dmax = new int[13];
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w0 = Integer.parseInt(tempVar);
		}
		w = w0;
		for (m = 1;m <= 12;m++)
		{
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
			{
				dmax[m] = 31;
			}
			if (m == 4 || m == 6 || m == 9 || m == 11)
			{
				dmax[m] = 30;
			}
			if (m == 2)
			{
				dmax[m] = 28;
			}
		}
		m = 1;
		for (d = 1;d <= dmax[m];)
		{
			if (m > 12)
			{
				break;
			}
			if (d == dmax[m])
			{
				d = 1;
				m++;
			}
			else
			{
				d++;
			}
			if (w == 7)
			{
				w = 1;
			}
			else
			{
				w++;
			}
			if (d == 13 && w == 5)
			{
				System.out.printf("%d\n",m);
			}
		}
		return 0;
	}
}

