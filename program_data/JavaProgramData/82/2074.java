package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] sou = new int[max];
		int[] su = new int[max];
		int a = 0;
		int[] h = new int[max];
		int m;
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
				(sou[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(su[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
		if ((sou[i] >= 90) && (sou[i] <= 140) && (su[i] >= 60) && (su[i] <= 90))
		{
			a++;
			h[i] = a;
		}
		else
		{
			h[i] = 0;
			a = 0;
		}
		}
		m = h[0];
		for (i = 0;i < n;i++)
		{
			if (m < h[i])
			{
				m = h[i];
			}
		}
		System.out.printf("%d",m);
		return 0;
	}

}

