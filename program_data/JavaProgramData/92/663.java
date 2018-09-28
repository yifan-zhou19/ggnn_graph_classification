package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		int sub = 0;
		int[] sum = new int[1000];
		int tfast;
		int tslow;
		int wfast;
		int wslow;
		int[] t = new int[1000];
		int[] w = new int[1000];
		int k = 0;
	  while (scanf("%d", n) && (n != 0))
	  {
		  for (i = 0;i < n;i++)
		  {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  t[i] = Integer.parseInt(tempVar);
			  }
		  }
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  w[i] = Integer.parseInt(tempVar2);
			  }
		  }
		   for (i = 0;i < n - 1;i++)
		   {
			 for (j = i + 1;j < n;j++)
			 {
				if (t[i] < t[j])
				{
					s = t[j];
					t[j] = t[i];
					t[i] = s;
				}
			 }
		   }
		 for (i = 0;i < n - 1;i++)
		 {
			 for (j = i + 1;j < n;j++)
			 {
				if (w[i] < w[j])
				{
					s = w[j];
					w[j] = w[i];
					w[i] = s;
				}
			 }
		 }
		 tfast = 0;
		 tslow = n - 1;
		 wfast = 0;
		 wslow = n - 1;
		for (i = 0;i < n;i++)
		{
			if (t[tfast] == w[wfast])
			{
			   if (t[tslow] > w[wslow])
			   {
				   sub++;
				   tslow--;
				   wslow--;
			   }
			   else if (t[tslow] < w[wslow])
			   {
				   sub--;
				   tslow--;
				   wfast++;
			   }
			   else if (t[tslow] == w[wslow])
			   {
				   if (t[tslow] < w[wfast])
				   {
					   sub--;
					   tslow--;
					   wfast++;
				   }
				   else if (t[tslow] == w[wfast])
				   {
					   break;
				   }
			   }
			}
			else if (t[tfast] > w[wfast])
			{
						sub++;
						tfast++;
						wfast++;
			}
			else
			{
				sub--;
				tslow--;
				wfast++;
			}
		}
	   sum[k++] = sub * 200;
	   sub = 0;
	  }
	  for (i = 0;i < k;i++)
	  {
		  System.out.printf("%d\n",sum[i]);
	  }

	}
}

