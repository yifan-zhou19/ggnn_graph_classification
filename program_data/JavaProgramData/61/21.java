package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] sz1 = new int[20];
		int[] sz2 = new int[20];
		int i;
		int n;
		int j;
		int b;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sz1[0] = sz1[1] = 1;
		for (i = 2;i < 20;i++)
		{
			sz1[i] = sz1[i - 1] + sz1[i - 2];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			sz2[i] = sz1[b - 1];

		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%d\n",(sz2[i]));
		}

	}

}

