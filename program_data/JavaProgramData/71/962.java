package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int y;
		int j;
		int mf;
		int ms;
		int d = 0;
		int[] yue = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			d = 0;
			yue[1] = 28;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				mf = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				ms = Integer.parseInt(tempVar4);
			}
			if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
			{
				yue[1] = 29;
			}
			if (mf > ms)
			{
				for (j = ms - 1;j < mf - 1;j++)
				{
					d += yue[j];

				}

			}
			else if (mf < ms)
			{
				for (j = mf - 1;j < ms - 1;j++)
				{
					d += yue[j];

				}

			}
			if (d % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}

		}
	}


}

