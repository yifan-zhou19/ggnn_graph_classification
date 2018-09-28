package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] cun = new int[100];
		int[] fang = new int[100];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				cun[i] = Integer.parseInt(tempVar2);
			}
			fang[i] = cun[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			cun[i] = fang[n - 1 - i];
			System.out.printf("%d ",cun[i]);
		}
		cun[n - 1] = fang[0];
		System.out.printf("%d",cun[n - 1]);
		return 0;
	}
}

