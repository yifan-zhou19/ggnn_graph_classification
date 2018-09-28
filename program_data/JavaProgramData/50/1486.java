package <missing>;

public class GlobalMembers
{
	public static int yue(int x)
	{
		int d;
		if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12)
		{
			d = 31;
		}
		else if (x == 2)
		{
			d = 28;
		}
		else if (x == 0)
		{
			d = 0;
		}
		else if (x == 4 || x == 6 || x == 9 || x == 11)
		{
			d = 30;
		}
		return d;
	}
	public static int Main()
	{
		int w;
		int i;
		int k = 13;
		int m = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			k += yue(i - 1);
	//		printf("%d\n",yue(i));
			if (w + (k % 7) == 6 || w + (k % 7) == 13)
			{
				System.out.printf("%d\n",i);
			}
		}


		return 0;
	}




}

