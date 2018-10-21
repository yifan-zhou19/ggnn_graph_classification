package <missing>;

public class GlobalMembers
{
	public static int min(int m,int n)
	{
		if (m < n)
		{
			return m;
		}
		else
		{
			return n;
		}
	}
	public static int Main()
	{
		int x;
		int y;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		int k;
		int p;
		int m;
		int n;
		int x0;
		int y0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x0 = x;
		y0 = y;
		for (i = 0;x >= 1;i++)
		{
			a[i] = x;
			x = x / 2;
		}
		m = i; //m??????????????a[m-1];
		for (i = 0;y >= 1;i++)
		{
			b[i] = y;
			y = y / 2;
		}
		n = i;
		int flag = 0;
		for (i = 0;i < min(m, n);i++)
		{
			if (a[m - 1 - i] != b[n - 1 - i])
			{
				flag = a[m - i];
				break;
			}
		}
		if (flag != 0)
		{
			System.out.print(flag);
		}
		else
		{
			System.out.print(min(x0, y0));
		}
		return 0;
	}

}

