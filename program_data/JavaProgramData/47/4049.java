package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[100];
		int i;
		for (i = 0;i < n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  sz[i] = Integer.parseInt(tempVar2);
		  }
		}
		for (i = 0;i < n - 1;i++)
		{
		  int e;
		  if (i < n / 2)
		  {
			e = sz[i];
			sz[i] = sz[n - i - 1];
			sz[n - i - 1] = e;
		  }
		  System.out.printf("%d ",sz[i]);
		}
	System.out.printf("%d",sz[n - 1]);
	return 0;
	}

}

