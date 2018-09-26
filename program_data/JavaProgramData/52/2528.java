package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] e = new int[100];
		int n;
		int m;
		int[] sz = new int[100];
		int[] k = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   (sz[i]) = Integer.parseInt(tempVar3);
		   }
		}
		for (i = 0;i < n;i++)
		{
		  e[i] = sz[i];
		  k[i] = sz[i];
		}
		 for (i = n - m;i < n;i++)
		 {

		  sz[i - n + m] = k[i];
		 }
		for (i = 0;i < m;i++)
		{
		   System.out.printf("%d ",sz[i]);
		}
		for (i = 0;i < n - m;i++)
		{

		  sz[m + i] = e[i];
		}
		for (i = m;i < n - 1;i++)
		{
		  System.out.printf("%d ",sz[i]);
		}
		 System.out.printf("%d",sz[n - 1]);
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  m = Integer.parseInt(tempVar4);
		  }
		 return 0;
	}
}

