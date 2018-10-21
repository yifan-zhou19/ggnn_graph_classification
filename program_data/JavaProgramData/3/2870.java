package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int k;
		int h;
		int isTrue;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int[] sz = new int[n];
		m = 0,isTrue = 0;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			sz[n - 1] = Integer.parseInt(tempVar4);
		}
		while ((isTrue) == 0 && m < n)
		{
			   for (i = 0;i < n;i++)
			   {
		   if (m == i)
		   {
			   continue;
		   }
		   if (sz[i] + sz[m] == k)
		   {
			   isTrue++;
			   break;
		   }
			   }
		   m = m++;
		}
		 if (isTrue != 0)
		 {
			 System.out.print("yes");
		 }
			  else
			  {
			  System.out.print("no");
			  }
			  return 0;
	}



}

