package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int d;
	   int x;
	   int i;
	   int j;
	   int[] sz = new int[100];
	   int[] k = new int[100];
	   int q;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  d = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  x = Integer.parseInt(tempVar3);
		  }
		  if ((d >= 90) && (d <= 140) && (x >= 60) && (x <= 90))
		  {
			sz[i] = 1;
		  }
		  else
		  {
			  sz[i] = 0;
		  }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (sz[i] == 1)
		   {
				k[i] = 1;
		   for (j = i + 1;j < n;j++)
		   {
			   if (sz[j] == 1)
			   {
				k[i]++;
			   }
			   else
			   {
				   break;
			   }
		   }
		   }
	else
	{
		k[i] = 0;
	}
	   }
	   q = k[0];
	   for (i = 1;i < n;i++)
	   {
		   if (k[i] > q)
		   {
			   q = k[i];
		   }
	   }
		   System.out.printf("%d",q);
		return 0;
	}

}

