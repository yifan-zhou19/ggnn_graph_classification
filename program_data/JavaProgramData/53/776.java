package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int cal;
		cal = 1;
		int pd = 0;
		int[] sz = new int[300];
		int[] xsz = new int[300];
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
					sz[i] = Integer.parseInt(tempVar2);
				}
		}
		xsz[0] = sz[0];
		for (j = 1;j < n;j++)
		{
			pd = 0;
			for (i = 0;i < j;i++)
			{
				if (sz[i] == sz[j])
				{
				pd = 1;
				}
			}
			if (pd == 0)
			{
			xsz[cal] = sz[j];
				cal++;
			}
		}
		for (i = 0;i < cal - 1;i++)
		{
		System.out.printf("%d,", xsz[i]);
		}
		System.out.printf("%d", xsz[cal - 1]);
		return 0;
	}
}

