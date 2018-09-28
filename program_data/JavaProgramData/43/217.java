package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int a;
	 int b;
	 int c;
	 int d;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 for (b = 3;b <= a / 2;b += 2)
	 {
	  for (c = 2;c <= Math.sqrt(b);c++)
	  {
	   if (b % c == 0)
	   {
		   break;
	   }
	  }
	  if (c > Math.sqrt(b))
	  {
	   d = a - b;
	  }
	  else
	  {
	   continue;
	  }
	  for (c = 2;c <= Math.sqrt(d);c++)
	  {
	   if (d % c == 0)
	   {
		   break;
	   }
	  }
	  if (c > Math.sqrt(d))
	  {
	   System.out.printf("%d %d\n",b,d);
	  }
	 }
	}
}

