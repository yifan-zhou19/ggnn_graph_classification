package <missing>;

public class GlobalMembers
{
	  public static void Main()
	  {
		  int a;
		  int b;
		  int c;
		  int i;
		  int s;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 for (b = 3;b <= a / 2;b = b + 2)
		 {
			 c = a - b;
		   s = 0;
		   for (i = 3;i <= b / 2;i = i + 2)
		   {
			   if (b % i == 0)
			   {
			   s = 1;
			   break;
			   }
		   }
		   if (s == 1)
		   {
			   continue;
		   }
		   else
		   {
			   for (i = 3;i <= c / 2;i = i + 2)
			   {
			   if (c % i == 0)
			   {
			   s = 1;
			   break;
			   }
			   }
		   }
		   if (s == 0)
		   {
			   System.out.printf("%d %d\n", b,c);
		   }
		 }
	  }
}

