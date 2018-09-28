package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int k;
	   int i;
	   int m;
	   int[] zzd = new int[1001];
	   int[] hzy = new int[1001];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < n;i++)
	   {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				zzd[i] = Integer.parseInt(tempVar3);
			}
	   }
			  for (i = 0;i < n;i++)
			  {
			  hzy[i] = zzd[i];
			  }
			  for (m = 0;m < n;m++)
			  {
				  for (i = 0;i < n;i++)
				  {
					   if (zzd[m] + hzy[i] == k)
					   {
								System.out.print("yes");
								break;
					   }
				  }
								if (m == n - 1)
								{
								   System.out.print("no");
								   break;
								}
								  if (zzd[m] + hzy[i] == k)
								  {
													   break;
								  }
			  }
		  return 0;
	}
}

