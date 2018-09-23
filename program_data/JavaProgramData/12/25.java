package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   int i;
	   int j;
	   int[] k = new int[16];
	   int a;
	   int p;
	   int b;
	   int c;
	   int q;
	   for (i = 1;i < 1000;i++)
	   {
		   p = 0;
		   q = 0;
		   for (j = 0;j < 16;j++)
		   {
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   a = Integer.parseInt(tempVar);
			   }
			 if (a == -1)
			 {
				 break;
			 }
			 else if (a != -1)
			 {
			   if (a == 0)
			   {
				   break;
			   }
			   else
			   {
				   k[j] = a;
				   p++;
			   }
			 }
		   }
		  if (a == -1)
		  {
			  break;
		  }
		  for (b = 0;b < p;b++)
		  {
			   for (c = 0;c < p;c++)
			   {
				   if (k[b] - 2 * k[c] == 0)
				   {
				   q++;
				   }
			   }
		  }
		  System.out.printf("%d\n",q);
	   }
	}

}

