package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int ss;
		int sz;
		int i;
		int max = 0;
		int lj = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ss = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz = Integer.parseInt(tempVar3);
			}
			if (ss <= 140 && ss >= 90 && sz >= 60 && sz <= 90)
			{
				lj++;
			}
			else
			{
				if (lj > max)
				{
					max = lj;
				}
				lj = 0;
			}
		}
		if (lj > max)
		{
			max = lj;
		}
		System.out.printf("%d",max);
		return 0;
	}
}

