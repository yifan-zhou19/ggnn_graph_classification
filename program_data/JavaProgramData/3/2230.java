package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1100];
		int n;
		int k;
		int i;
		int j;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i != j)
				{
					x = sz[i] + sz[j];
				}
				 if (x == k)
				 {
					 break;
				 }
			}
			if (x == k)
			{
				break;
			}
		}

		   if (x == k)
		   {
			   System.out.print("yes\n");
		   }

		if (x != k)
		{
			System.out.print("no\n");
		}
		return 0;

	}
}

