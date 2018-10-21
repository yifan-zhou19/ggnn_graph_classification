package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] h = new int[100];
		int[] l = new int[100];
		int[] hour = new int[101];
		int i;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				l[i] = Integer.parseInt(tempVar3);
			}
			if (h[i] >= 90 && h[i] <= 140 && l[i] >= 60 && l[i] <= 90)
			{
				hour[i] = hour[i - 1] + 1;
			}
			if (hour[i] >= max)
			{
				max = hour[i];
			}
		}
		System.out.printf("%d",max);
		return 0;
	}




}

