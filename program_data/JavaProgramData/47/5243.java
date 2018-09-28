package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[100];
		if ((n > 1) && (n < 100))
		{
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  (sz[i]) = Integer.parseInt(tempVar2);
			  }
		  }
		  for (m = n - 1;m >= 0;m--)
		  {
			  if (m > 0)
			  {
				  System.out.printf("%d ",sz[m]);
			  }
			  else
			  {
				  System.out.printf("%d",sz[m]);
			  }
		  }
		}
		return 0;
	}


}

