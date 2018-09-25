package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int y;
		int ans;
		int[] b = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	for (i = 1;i <= 100;i++)
	{
		b[i] = 0;
	}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
	if (b[x] == 0)
	{
	  if (i == 1)
	  {
		  System.out.printf("%d",x);
	  }
	  else
	  {
		  System.out.printf(" %d",x);
	  }
	}
	b[x] = 1;
		}

	}
}

