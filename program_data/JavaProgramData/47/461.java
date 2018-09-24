package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int i;
	int e;
	int n;
	int[] sz = new int[100];
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


		System.out.printf("%d ",sz[n - 1]);
		for (i = n - 2;i >= 1;i--)
		{
			 System.out.printf("%d ",sz[i]);
		}
		System.out.printf("%d",sz[0]);


	return 0;
	}

}

