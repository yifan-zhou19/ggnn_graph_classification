package <missing>;

public class GlobalMembers
{
	public static int Main()
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
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
			{
				if ((w + 12) % 7 == 5)
				{
					System.out.printf("%d\n",m);
				}
				w = (w + 31) % 7;
			}
			if (m == 4 || m == 6 || m == 9 || m == 11)
			{
				if ((w + 12) % 7 == 5)
				{
					System.out.printf("%d\n",m);
				}
				w = (w + 30) % 7;
			}
			if (m == 2)
			{
				if ((w + 12) % 7 == 5)
				{
					System.out.printf("%d\n",m);
				}
				w = (w + 28) % 7;
			}
		}
		return 0;
	}
}

