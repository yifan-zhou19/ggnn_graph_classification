package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[100];
		int[] zs = new int[100];
		int i;
		int k = 0;
		int m;
		int a;
		char[][] id = new char[100][10];
		char[][] di = new char[100][10];
		String zfc = new String(new char[10]);
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
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
		   if (sz[i] >= 60)
		   {
			zs[k] = sz[i];
			di[k] = id[i];
			k++;
		   }
		}
		 for (m = 0;m < k - 1;m++)
		 {
			  for (i = 0;i < k - 1 - m;i++)
			  {
				 if (zs[i] < zs[i + 1])
				 {
					 a = zs[i];
					 zs[i] = zs[i + 1];
					 zs[i + 1] = a;
					 zfc = di[i];
					 di[i] = di[i + 1];
					 di[i + 1] = zfc;
				 }
			  }
		 }
		for (i = 0;i < n;i++)
		{
			if (sz[i] < 60)
			{
				di[k] = id[i];
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",di[i]);
		}
		return 0;
	}
}

