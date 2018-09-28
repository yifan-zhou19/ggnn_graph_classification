package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		int m;
		int n;
		int a;
		int b;
		int c;
		int d = 0;
		int i;
		int j;
		int e;
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
	 for (i = m;i <= n;i++)
	 {
		 for (j = 2;j < i;j++)
		 {
		   if (i % j == 0)
		   {
			   break;
		   }
		 }
	  if (j == i)
	  {
		  a = i;
		  c = 0;
	   while (a != 0)
	   {
			b = a % 10;
			a = a / 10;
			c = 10 * c + b;
	   }
	   if (c == i)
	   {
		   d++;
	   }
	  }

	 }
	  if (d == 0)
	  {
		  System.out.print("no\n");
	  }
	  else
	  {
		e = 1;
	  for (i = m;i <= n;i++)
	  {
		 for (j = 2;j < i;j++)
		 {
		   if (i % j == 0)
		   {
			   break;
		   }
		 }
	  if (j == i)
	  {
		  a = i;
		  c = 0;
	   while (a != 0)
	   {
			b = a % 10;
			a = a / 10;
			c = 10 * c + b;
	   }

	   if (c == i && e < d)
	   {
		   System.out.printf("%d,",i);
		   e++;
	   }
	   else if (c == i && e == d)
	   {
		   System.out.printf("%d",i);
	   }
	  }
	  }
	  }
	 }


}

