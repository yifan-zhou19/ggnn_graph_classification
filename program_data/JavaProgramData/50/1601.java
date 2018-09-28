package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int w;
		int date = 12;
		int pd;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		int[] yf = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (w == 7)
		{
			System.out.print("1\n");
		}
		for (i = 0;i < 11;i++)
		{
			date += yf[i];
			pd = date % 7;
			if (w + pd <= 7)
			{
				if (w + pd == 5)
				{
					System.out.printf("%d\n",i + 2);
				}
			}
			else
			{
				d = w + pd - 7;
				if (d == 5)
				{
					System.out.printf("%d\n",i + 2);
				}
			}
		}


		return 0;
	}

}

