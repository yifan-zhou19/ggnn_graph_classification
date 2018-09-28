package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int[] qs = new int[100];
	   int[] zz = new int[100];
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
		  (qs[i]) = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  (zz[i]) = Integer.parseInt(tempVar3);
	  }
	  }
	   int e;
	   for (int k = 1;k <= n;k++)
	   {
		for (i = 0;i < n - k;i++)
		{
		  if (qs[i] > qs[i + 1])
		  {
		   e = qs[i + 1];
		   qs[i + 1] = qs[i];
		   qs[i] = e;
		  }
		}
	   }
	 for (int k = 1;k <= n;k++)
	 {
		for (i = 0;i < n - k;i++)
		{
		  if (zz[i] > zz[i + 1])
		  {
		   e = zz[i + 1];
		   zz[i + 1] = zz[i];
		   zz[i] = e;
		  }
		}
	 }

		 for (double k = qs[0] + 0.1;k < zz[n - 1];k++)
		 {
			for (i = 0;i < n;i++)
			{
			if (k >= qs[i] != 0 && k <= zz[i])
			{
				break;
			}
			}
			if (i == n)
			{
			   System.out.print("no");
			   return 0;
			}
		 }
	System.out.printf("%d %d",qs[0],zz[n - 1]);
	return 0;
	}


}

