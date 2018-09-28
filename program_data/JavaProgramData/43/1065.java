package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	 int a;
	 int b;
	 int i1;
	 int i2;
	 int i3;
	 int flag;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 b = a / 2;
	 for (i1 = 3;i1 <= b;i1 = i1 + 2)
	 {
	  m = i1;
	  n = a - i1;
	  flag = 0;
	  for (i2 = 2;i2 < m;i2++)
	  {
	   if (m % i2 == 0)
	   {
		   flag = flag + 1;
		   break;
	   }
	  }
	  for (i3 = 2;i3 < n;i3++)
	  {
	   if (n % i3 == 0)
	   {
		   flag = flag + 1;
		   break;
	   }
	  }
	  if (flag == 0)
	  {
		  System.out.printf("%d %d\n",m,n);
	  }
	 }
	 return 0;
	}



}

