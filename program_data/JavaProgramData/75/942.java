package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[10000];
		int i = 0;
		int[] y = new int[10000];
		int m;
		int n;
		int[] w = new int[10000];
		int t;
		int j;
		char c;
		String z = new String(new char[13]);
		x[0] = -1;
		y[0] = -1;
		do
		{
			i++;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
			if (x[i] < x[i - 1])
			{
				t = x[i];
				x[i] = x[i - 1];
				x[i - 1] = t;
			}
			c = System.in.read();
		}while (c == ',');
		m = i;
		for (i = m - 1;i >= 1;i--)
		{
			if (x[i] > x[i + 1])
			{
				t = x[i];
				x[i] = x[i + 1];
				x[i + 1] = t;
			}
		}
	 //   for(i=1;i<=4;i++)printf("%d",x[i]);

		i = 0;
		do
		{
			i++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[i] = Integer.parseInt(tempVar2);
			}
			if (y[i] < y[i - 1])
			{
				t = y[i];
				y[i] = y[i - 1];
				y[i - 1] = t;
			}
			c = System.in.read();
		}while (c == ','); //for(i=1;i<=4;i++)printf("%d",y[i]);
		n = i;
		w[x[1]] = 0;
		for (i = x[1];i <= y[n];i++)
		{
			w[i + 1] = w[i];
							   for (j = 1;j <= n;j++)
							   {
								   if (i == x[j])
								   {
									   w[i + 1]++;
								   }
								   if (i == y[j])
								   {
									   w[i + 1]--;
								   }
							   }
							  // printf("%d\n",w[i+1]);
		}
		for (i = x[1];i <= y[n];i++)
		{
							   if (w[i + 1] < w[i])
							   {
								   t = w[i + 1];
								   w[i + 1] = w[i];
								   w[i] = t;
							   }
		}
		System.out.printf("%d %d",n,w[y[n] + 1]);




	  //  scanf("%s",z);

		//scanf("%s %d",a,&k);
	}

}

