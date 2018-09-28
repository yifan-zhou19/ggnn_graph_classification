package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int[] sz = new int[1000];
		int index;
		for (index = 0;index < a;index++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[index] = Integer.parseInt(tempVar2);
		}
		}
		int d;
		int x;
		int inde;
		d = sz[0];
		x = sz[0];
		for (inde = 1;inde < a;inde++)
		{
		  if (sz[inde] > d)
		  {
			  x = d;
			  d = sz[inde];
		  }
		  else if (sz[inde] > x)
		  {
			  x = sz[inde];
		  }
		}
		System.out.printf("%d\n",d);
		System.out.printf("%d\n",x);
		return 0;
	}
}

