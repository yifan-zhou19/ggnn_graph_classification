package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[1000];
		int k;
		int x;
		int i;
		int s;
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

		for (x = 0;x < n;x++)
		{
			for (i = 0;i < n;i++)
			{
				s = sz[x] + sz[i];
				if (s == k)
				{
					System.out.print("yes");
				break;
				}
			}
			if (s == k)
			{
				break;
			}
		}
		if (s != k)
		{
			System.out.print("no");
		}


		return 0;
	}

}

