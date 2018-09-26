package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int[] sz = new int[1000];
		int a = 0;
		int tmp;
		int j;
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
		for (j = 1;j < n;j++)
		{
		 for (i = 0;i < n;i++)
		 {
			if (sz[i] + sz[i + 1] == k)
			{
				a++;
			}
			tmp = sz[i + 1];
			sz[i + 1] = sz[i];
			sz[i] = tmp;

		 }
		}
		if (a != 0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}




	  return 0;
	}

}

