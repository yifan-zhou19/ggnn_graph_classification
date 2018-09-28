package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] z = new int[500];
		int j;
		int i;
		int w;
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
				z[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = j + 1;i < n;i++)
			{
				if (z[j] > z[i])
				{
					w = z[i];
					z[i] = z[j];
					z[j] = w;
				}
			}
		}
		w = 0;
		for (i = 0;i < n;i++)
		{
			if (z[i] % 2 != 0)
			{
				if (w == 0)
				{
				System.out.printf("%d",z[i]);
				}
				else
				{
					System.out.printf(",%d",z[i]);
				}
			}
			w++;
		}

		return 0;
	}

}

