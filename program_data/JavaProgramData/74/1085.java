package <missing>;

public class GlobalMembers
{
	public static int ss(int p)
	{
	   int x;
	   if (p == 2)
	   {
		   return 1;
	   }
	   else
	   {
		 for (x = 2;x < p;x++)
		 {
		 if (p % x == 0)
		 {
			 break;
		 }
		 }
		 if (x >= p)
		 {
			 return 1;
		 }
		 else
		 {
			 return 0;
		 }
	   }
	}


	public static int huiwen(int p,int q)
	{
	  if (p == 0)
	  {
		  return q;
	  }
	  else
	  {
		  huiwen(p / 10, q * 10 + p % 10);
	  }

	}




	public static void Main()
	{
	   int m;
	   int n;
	   int coun = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   int i;
	   int ci;
	   int temp;
	   for (i = m;i <= n;i++)
	   {
		   ci = 0;
		   temp = huiwen(i, ci);
		  if (ss(i) == 1 && (temp == i))
		  {
			  coun++;
		  if (coun == 1)
		  {
			  System.out.printf("%d",i);
		  }
		  if (coun > 1)
		  {
			  System.out.printf(",%d",i);
		  }
		  }

	   }
	  if (coun == 0)
	  {
		  System.out.print("no\n");
	  }
	}
}

