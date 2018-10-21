package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int shou;
		int shu;
		int h;
		int max;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		max = 0;
		h = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shou = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shu = Integer.parseInt(tempVar3);
			}
			if (shou >= 90 && shou <= 140 && shu >= 60 && shu <= 90)
			{
				h++;
			}
			else
			{
				if (max < h)
				{
					max = h;
				}
				h = 0;
			}
		}
	if (max < h)
	{
					max = h;
	}
		System.out.printf("%d\n",max);
		return 0;
	}

}

