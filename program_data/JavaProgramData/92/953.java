package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 1;
		int[] tianji = new int[1002];
		int[] qiwang = new int[1002];
		while (n != 0)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			break;
		}
		for (int i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   tianji[i] = Integer.parseInt(tempVar2);
		   }
		}
		for (int i = 0;i < n;i++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   qiwang[i] = Integer.parseInt(tempVar3);
		   }
		}
		for (int i = 0;i < n - 1;i++) //?????
		{
		  for (int k = n - 2;k >= i;k--)
		  {
			  if (tianji[k] > tianji[k + 1])
			  {
				   int m = tianji[k];
				   tianji[k] = tianji[k + 1];
				   tianji[k + 1] = m;
			  }
		  }
		}
		 for (int i = 0;i < n - 1;i++) //?????
		 {
		  for (int k = n - 2;k >= i;k--)
		  {
			  if (qiwang[k] > qiwang[k + 1])
			  {
				   int m = qiwang[k];
				   qiwang[k] = qiwang[k + 1];
				   qiwang[k + 1] = m;
			  }
		  }
		 }
		int win = 0; //????????
		int ping = 0;
		int[] t = new int[1002]; //????????
		int[] q = new int[1002];
		for (int i = 0;i < n;i++)
		{
			t[i] = 1;
			q[i] = 1;
		}
		for (int i = 0;i < n;i++) //?tianji?????qiwang??????????
		{
			for (int j = n - 1;j >= 0;j--)
			{
				 if (q[j] == 0)
				 {
					 continue;
				 }
				 if (tianji[i] > qiwang[j])
				 {
					 win++;
					 t[i] = 0;
					 q[j] = 0;
					 break;
				 }
			}
		}
		 int i;
		 int j;
		 for (i = 0;i < n;i++)
		 {
			 if (t[i] == 0)
			 {
				 continue;
			 }
			 for (j = 0;j < n;j++)
			 {
				  if (q[j] == 1)
				  {
					if (tianji[i] == qiwang[j])
					{
					  ping++;
					  t[i] = 0;
					  q[j] = 0;
					  break;
					}
				  }
			 }
		 }
		int sum = win * 200 - (n - win - ping) * 200;
		System.out.printf("%d\n",sum);

		}
		return 0;
	}

}

