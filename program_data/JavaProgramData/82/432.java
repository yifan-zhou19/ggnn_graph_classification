package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int xue;
		int shu;
		int i;
		int[] h = new int[500];
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		h[0] = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xue = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				shu = Integer.parseInt(tempVar3);
			}
			if (xue >= 90 && xue <= 140 && shu >= 60 && shu <= 90)
			{
				h[i] = h[i - 1] + 1;
			}
			else
			{
				h[i] = 0;
			}
		}
		e = h[0];
		for (i = 1;i <= n;i++)
		{
			if (e < h[i])
			{
				e = h[i];
			}
		}
		System.out.printf("%d",e);
		return 0;
	}
}

