package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[300];
		int n;
		int i;
		int j;
		int l;
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
	   System.out.printf("%d",sz[0]);
	   for (j = 1;j < n;j++)
	   {
		  int f = 0;
		  for (l = 0;l < j;l++)
		  {
			if (sz[j] == sz[l])
			{
				f = 1;
			}
		  }
			if (f == 0)
			{
				System.out.printf(",%d",sz[j]);
			}
	   }
			return 0;
	}
}

