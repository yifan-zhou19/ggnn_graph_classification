package <missing>;

public class GlobalMembers
{
	//**************************
	//*????????        **
	//*?????? 1300012863 **
	//*???2013.11.1        **
	//**************************
	public static int Main()
	{
		int[] x = new int[1005]; //???????x??????y?????
		int[] y = new int[1005];
		int[] c = new int[1005];
		int[] d = new int[1005];
		char ch;
		int i;
		int p;
		int n;
		int a;
		for (i = 1; ;i++) //?????????
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			c[i] = x[i];
			if (ch != ',')
			{
				break;
			}
		}
		for (a = 1; ;a++) //?????????
		{
			y[a] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			d[a] = y[a];
			if (ch != ',')
			{
				break;
			}
		}
			for (int m = 1;m <= i - 1;m++) //???????????????
			{
				if (x[m] < x[m + 1])
				{
					p = x[m];
					x[m] = x[m + 1];
					x[m + 1] = p;
				}
			}
			for (int m = 1;m <= i - 1;m++) //???????????????
			{
				if (y[m] > y[m + 1])
				{
					p = y[m];
					y[m] = y[m + 1];
					y[m + 1] = p;
				}
			}
			for (int m = 1;m <= i - 2;m++) //????????????????
			{
				if (y[m] > y[m + 1])
				{
					p = y[m];
					y[m] = y[m + 1];
					y[m + 1] = p;
				}
			}
		int[] h = new int[1005];
		for (int k = x[i];k <= y[i - 1];k++) //?????????????,???????h?
		{
			n = 0;
			for (int p = 1;p <= i;p++)
			{
				if ((c[p] <= k) && (k < d[p]))
				{
					n = n + 1;
				}
			}
			h[k] = n;
		}
		for (int j = x[i];j <= (y[i - 1] - 1);j++) //???????????h????
		{
				if (h[j] > h[j + 1])
				{
					p = h[j];
					h[j] = h[j + 1];
					h[j + 1] = p;
				}
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(h[y[i - 1]]);
		return 0;
	}
}

