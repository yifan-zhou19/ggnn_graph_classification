package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] shousuo = new int[101];
		int[] shuzhang = new int[101];
		int count;
		int Max;
		int[] a = new int[101];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shousuo[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				shuzhang[i] = Integer.parseInt(tempVar3);
			}
			if (shousuo[i] >= 90 && shousuo[i] <= 140 && 60 <= shuzhang[i] != 0 && 90 >= shuzhang[i])
			{
				a[i + 1] = 1;
			}
			else
			{
				a[i + 1] = 0;
			}
		}
		a[0] = 0;
		Max = 0;
		count = 0;
		for (i = 1;i < n + 1;i++)
		{
			if (a[i - 1] == 0 && a[i] == 1)
			{
				count = 1;
			}
			else if (a[i - 1] == 1 && a[i] == 1)
			{
				count = count + 1;
			}
				if (Max < count)
				{
					Max = count;
				}

		}
		System.out.printf("%d",Max);
		return 0;
	}




}

