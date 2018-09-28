package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int k;
		int[] gy = new int[100];
		int[] dy = new int[100];
		k = 0;
		m = 0;
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
				gy[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				dy[i] = Integer.parseInt(tempVar3);
			}
			if (gy[i] >= 90 && gy[i] <= 140 && dy[i] >= 60 && dy[i] <= 90)
			{
				k++;
				if (k > m)
				{
					m = k;
				}
			}
			else
			{
					m = m;
					k = 0;
			}
		}
		System.out.printf("%d",m);
		return 0;
	}
}

