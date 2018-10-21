package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		int i;
		int j;
		int sub = 0;
		int sum = 0;
		int tfast;
		int tslow;
		int wfast;
		int wslow;
		int[] t = new int[1000];
		int[] w = new int[1000];
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
				for (j = 0;j < n - 1 - i;j++)
				{
				if (t[j] < t[j + 1])
				{
					s = t[j];
					t[j] = t[j + 1];
					t[j + 1] = s;
				}
				}
			}
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - 1 - i;j++)
				{
				if (w[j] < w[j + 1])
				{
					s = w[j];
					w[j] = w[j + 1];
					w[j + 1] = s;
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
	   sum = sub * 200;
	   System.out.printf("%d\n",sum);
	   sub = 0;
	   sum = 0;
	  }
	}

}

