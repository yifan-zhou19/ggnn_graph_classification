package <missing>;

public class GlobalMembers
{
	   public static int Main()
	   {
		int[] bianhao = new int[300];
		int[] tuichu = new int[300];
		int i;
		int j;
		int k;
		int p;
		int m;
		int n;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		bianhao[0] = n;
		tuichu[0] = m;
		i = 1;
		while (n != 0 || m != 0)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  n = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  m = Integer.parseInt(tempVar4);
		  }
		  bianhao[i] = n;
		  tuichu[i] = m;
		  i++;
		}
		for (j = 0;j < i - 1;j++)
		{
		  int[] yuanxulie = new int[300];
		  int[] xinxulie = new int[300];
		  for (k = 0;k < bianhao[j];k++)
		  {
		  yuanxulie[k] = k + 1;
		  }
		  x = bianhao[j];
		  for (k = 0;k < bianhao[j] - 1;k++)
		  {
			 p = tuichu[j] % x;
			 for (y = 0;y < x - 1;y++)
			 {
			   if (y < x - p)
			   {
				   xinxulie[y] = yuanxulie[p + y];
			   }
			   if (y > x - p - 1)
			   {
				   xinxulie[y] = yuanxulie[y + p - x];
			   }
			 }
			 for (y = 0;y < x - 1;y++)
			 {
			 yuanxulie[y] = xinxulie[y];
			 }
			 x = x - 1;
		  }
		  System.out.printf("%d\n",yuanxulie[0]);
		}
		 return 0;
	   }
}

