package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] z = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int j = 1;j < n;j++)
		{
			for (int x = 0;x < j;x++)
			{
				if (z[x] == z[j])
				{
					z[j] = 0;
				}
			}
		}
			 System.out.printf("%d",z[0]);
		for (int t = 1;t < n;t++)
		{
			if (z[t] != 0)
			{
				System.out.printf(",%d",z[t]);
			}
		}
		return 0;
	}



}

