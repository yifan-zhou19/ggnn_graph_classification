package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		if (a == b)
		{
			System.out.printf("%d\n",a);
		}
		else if (a == 1 || b == 1)
		{
			System.out.print("1\n");
		}
		else
		{
		int f;
		int i = 0;
		int j = 0;
		int n;
		int m;
		int t = 0;
		int[] w = new int[500];
		int[] v = new int[500];
		f = a;
		//if(f==0){w[0]=a;}
		//else{
			   w[0] = f;
			   //}
		while (f != 0)
		{
		  f = f / 2;
		  i++;
		  w[i] = f;
		}
	   //printf("%d\n",i);
		f = b;
		 //if(f==0){v[0]=b;}
		//else{
			   v[0] = f;
			   //}
		while (f != 0)
		{
		  f = f / 2;
		  j++;
		  v[j] = f;
		}
	   // printf("%d\n",j);
		if (i < j)
		{
		  for (n = 0;n < i;n++)
		  {
		   for (m = 0;m < j;m++)
		   {
			  if (v[m] == w[n])
			  {
				  System.out.printf("%d\n",w[n]);
				  t++;
				  break;
			  }
		   }
		   if (t > 0)
		   {
			   break;
		   }
		  }
		}
		else
		{
		   for (n = 0;n < j;n++)
		   {
		   for (m = 0;m < i;m++)
		   {
			  if (w[m] == v[n])
			  {
				  System.out.printf("%d\n",v[n]);
				  t++;
				  break;
			  }
		   }
		   if (t > 0)
		   {
			   break;
		   }
		   }
		}
		}
	   System.in.read();
	System.in.read();
	System.in.read();
	}

}

