package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[400];
		int[] sub = new int[400];
		int n;
		int count = 0;
		int bar = 0;
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
					sz[i] = Integer.parseInt(tempVar2);
				}
		}
		for (int j = 0;j < n;j++)
		{
				for (int a = 0;a < count;a++)
				{
						if (sz[j] == sub[a])
						{
								 bar = 1;
						}
				}
				if (bar == 0)
				{
						   if (j == 0)
						   {
									System.out.printf("%d",sz[j]);
									sub[count] = sz[j];
									count++;
						   }
						   else
						   {
									System.out.printf(",%d",sz[j]);
									sub[count] = sz[j];
									count++;
						   }
				}
				bar = 0;
		}
		return 0;
	}

}

