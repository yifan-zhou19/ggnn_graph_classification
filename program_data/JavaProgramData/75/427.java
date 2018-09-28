package <missing>;

public class GlobalMembers
{
	/*	???:???
		???:1000012896 leo
		????:2010.12.1
		????:??????????
		*/
	public static int Main()
	{
		int[] atime = new int[10000];
		int[] ltime = new int[10000];
		int min = 1000;
		int max = 0;
		int count = 0;
		int per;
		int maxp = 0;
		int i;
		int j;
		for (i = 1; ;i++)
		{
			atime[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (atime[i] < min)
			{
				min = atime[i];
			}
				if (System.in.read() == '\n')
				{
				break;
				}
		}
		for (i = 1; ;i++)
		{
			ltime[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (ltime[i] > max)
			{
				max = ltime[i];
			}
				if (System.in.read() == '\n')
				{
				break;
				}
		}
		count = i;
		for (j = min; j <= max - 1; j++)
		{
			per = 0;
			for (i = 1; i <= count; i++)
			{
				if (atime[i] <= j != 0 && ltime[i] > j)
				{
					per++;
				}
			}
			if (per > maxp)
			{
				maxp = per;
			}
		}
		System.out.print(count);
		System.out.print(' ');
		System.out.print(maxp);
		return 0;
	}



}

