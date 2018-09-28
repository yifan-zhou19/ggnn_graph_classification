package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[1000];
		int k;
		int s;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		s = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (((sz[i] + sz[j]) == k) && (i != j))
				{
					s = s + 1;
				}
			}
		}
	   if (s > 0)
	   {
			System.out.print("yes\n");
	   }
			if (s == 0)
			{
			System.out.print("no\n");
			}
		return 0;
	}






}

