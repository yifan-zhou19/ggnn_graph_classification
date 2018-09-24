package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int i;
		int b;
		int n;
		i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = n - 1;
		for (i = 0;i < n;i++)
		{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   sz[i] = Integer.parseInt(tempVar2);
			   }
		}
		for (b = n - 1;b > 0;b--)
		{
			System.out.printf("%d ",sz[b]);
		}
			b = 0;
			System.out.printf("%d",sz[b]);


		return 0;
	}

}

