package <missing>;

public class GlobalMembers
{
	public static int win(int x, int[] w, int[] p)
	{
		  int i;
		  int topw = 0;
		  int topp = 0;
		  int downw = x - 1;
		  int downp = x - 1;
		  int j;
		  int convert;
		  int converts;
		  int win = 0;
		  int same = 0;
		  int fail = 0;
			for (i = 0;i < x;i++)
			{
			   for (j = 0;j < x - i - 1;j++)
			   {
					if (w[j] < w[j + 1])
					{
					   convert = w[j];
					   w[j] = w[j + 1];
					   w[j + 1] = convert;
					}

				   if (p[j] < p[j + 1])
				   {
					   converts = p[j];
					   p[j] = p[j + 1];
					   p[j + 1] = converts;
				   }
			   }
			}
		 /* for (i=0;i<x;i++)
		  printf ("%d %d\n",w[i],p[i]);*/
			  for (i = 0;i < x;i++)
			  {
				  if (w[downw] > p[downp])
				  {
					  win++;
					  downw--;
					  downp--;
				  }
				  else
				  {
					 if (w[downw] < p[downp])
					 {
						   fail++;
						   downw--;
						   topp++;
					 }
					  else
					  {
						if (w[topw] > p[topp])
						{
							win++;
							topw++;
							topp++;
						}
						else
						{
						if (w[downw] == p[topp])
						{
						break;
						}
						else
						{
						 fail++;
						 topp++;
						 downw--;
						}
						}
					  }
				  }
			  }
			  /* printf ("%d %d\n",win,fail);*/
			   return (200 * (win - fail));
	}

	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int k;
	  int get;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  while (true)
	  {
		   if (n == 0)
		   {
		   break;
		   }
		   else
		   {
				int[] a = new int[n];
				int[] b = new int[n];
				for (i = 0;i < n;i++)
				{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				}
				for (i = 0;i < n;i++)
				{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
				}
			get = win(n, a, b);
			System.out.printf("%d\n",get);
		   }
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
	  }
		 System.in.read();
		 System.in.read();
	}






}

