package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int[] sz = new int[100];

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

	for (int i = n - 1;i > 0;i--)
	{
		System.out.printf("%d ",sz[i]);
	}
		System.out.printf("%d",sz[0]);

	return 0;
	}
}

