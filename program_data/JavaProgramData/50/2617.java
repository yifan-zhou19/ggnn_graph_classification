package <missing>;

public class GlobalMembers
{
	public static int day(int w,int m)
	{
		int n = 0;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int i;
		if (m > 1)
		{
			for (i = 0;i < m - 1;i++)
			{
				n += a[i];
			}
		}
		n += 12;
		if ((w + (n % 7)) % 7 == 5)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int w;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (m = 1;m <= 12;m++)
		{
			if (day(w, m) != 0)
			{
				System.out.printf("%d\n",m);
			}
		}
	}
}

