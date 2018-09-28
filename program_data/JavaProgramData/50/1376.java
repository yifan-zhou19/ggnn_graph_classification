package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int m;
		int e = 0;
		int k;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (m = 1;m <= 12;m++)
		{
			k = (e+13) % 7;
			if ((k + w - 1 == 5) || (k + w - 8 == 5))
			{
				System.out.printf("%d\n",m);
			}
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
			{
				e = e+31;
			}
			else if (m == 2)
			{
				e = e+28;
			}
			else
			{
				e = e+30;
			}
		}
		return 0;
	}
}

