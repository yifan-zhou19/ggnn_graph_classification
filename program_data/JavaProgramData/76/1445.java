package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] qj = new int[50001];
		int[] qd = new int[50001];
		int[] zd = new int[50001];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				qd[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				zd[i] = Integer.parseInt(tempVar3);
			}
		}
	   int max;
	   int min;
	   int m;
	   int e;
	  max = 1;
	  for (l = 0;l < n;l++)
	  {
	   for (i = 1;i <= n - l;i++)
	   {
		   if (qd[i] < qd[max])
		   {
		   max = i;
		   }
	   }
		   if (max != n - l)
		   {
			   m = qd[max];
			   qd[max] = qd[n - l];
			   qd[n - l] = m;
			   e = zd[max];
			   zd[max] = zd[n - l];
			   zd[n - l] = e;
		   }
		   else
		   {
			   max = 1;
		   }

	  }
	  int flag;
	  int p;
	  for (i = n;i > 1;i--)
	  {
		  if (zd[i] >= qd[i - 1])
		  {
			  flag = 1;
		  }
		  else
		  {
			  flag = 0;
			  break;
		  }
		  if (zd[i] > zd[i - 1])
		  {
			  p = zd[i - 1];
			  zd[i - 1] = zd[i];
			  zd[i] = p;
		  }
	  }
	   if (flag == 1)
	   {
		   System.out.printf("%d",qd[n]);
		   System.out.printf(" %d",zd[1]);
	   }
	   if (flag == 0)
	   {
		   System.out.print("no");
	   }
	   return 0;
	}




}

