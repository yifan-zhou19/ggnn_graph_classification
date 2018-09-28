package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int shrink;
		int diastole;
		int normal = 0;
		int max = 0;
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
				shrink = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				diastole = Integer.parseInt(tempVar3);
			}
			if (shrink >= 90 && shrink <= 140 && diastole >= 60 && diastole <= 90)
			{
				if (i == n - 1)
				{
					normal++;
					if (normal > max)
					{
					max = normal;
					}
				}
				else
				{
					normal++;
				}
			}
			else
			{
				if (normal > max)
				{
					max = normal;
				}
				normal = 0;
			}
		}
		System.out.printf("%d\n",max);
	}
}

