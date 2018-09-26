package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int t;
		  int p;
		  int f;
		  int k;
		  int q;
		  int c;
		  int add;
		int[] str = new int[300];
	  for (;;)
	  {
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
		if (n == 0 && m == 0)
		{
		break;
		}
		 //printf("%d %d\n",n,m);
		 for (i = 0;i < n;i++)
		 {
		 str[i] = 1;
		 }

		 i = -1;


		 for (t = 1;t < n;t++)
		 {

			  add = m;
			 // printf("%d",add);
				  k = 0;
			 for (p = i + 1;;p++)
			 {

				  // printf("%d\n",p);

			   k = k + 1;
			  // printf("%d\n",k);
			   if (p >= n)
			   {
						p = p - n;
				   // printf("%d\n",p);
			   }
			   if (str[p] == 0)
			   {
							add = add + 1;
			   //printf("%d\n",add);
			   }
			   if (k >= add)
			   {
			   break;
			   }

			 }
		   //printf("%d\n",add); 
		   i = i + add;

		   if (i > n - 1)
		   {
		   i = i % n;
		   }
		   str[i] = 0;
		 }
		   for (f = 0;f <= n - 1;f++)
		   {
			 if (str[f] == 1)
			 {
			 System.out.printf("%d\n",f + 1);
			 }
		   }
	  }


	}

}

