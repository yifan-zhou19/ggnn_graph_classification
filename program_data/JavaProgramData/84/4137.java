package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] number = new int[120];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int maxpos;

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				number[i] = Integer.parseInt(tempVar2);
			}
		}
		int max = -100000;
		int sndmax = -100000;
		for (i = 0;i < n;i++)
		{
			if (number[i] > max)
			{
				max = number[i];
				maxpos = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i == maxpos)
			{
				continue;
			}
			if (number[i] > sndmax)
			{
				sndmax = number[i];
			}
		}
		System.out.printf("%d\n%d\n",max,sndmax);
		return 0;
	}

}

