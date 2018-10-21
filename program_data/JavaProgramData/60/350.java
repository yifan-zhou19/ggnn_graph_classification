package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
	 int i;
	 int t = 0;
	 if (x == 1)
	 {
	  return 1;
	 }
	 else if (x == 2)
	 {
	  return 0;
	 }
	 else
	 {
	  for (i = 2;i <= Math.sqrt(x);i++)
	  {
	   if (x % i == 0)
	   {
		t = 1;
		break;
	   }
	  }
	  if (t == 0)
	  {
	   return 0;
	  }
	  else
	  {
	   return 1;
	  }
	 }
	}
	public static int Main()
	{
	 int n;
	 int i;
	 int t = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 5;i <= n;i = i + 2)
	 {
	  if (f(i) == 0 && f(i - 2) == 0)
	  {
	   System.out.printf("%d %d\n",i - 2,i);
	   t++;
	  }
	 }
	 if (t == 0)
	 {
	  System.out.print("empty");
	 }
	 System.in.read();
	 System.in.read();
	 return 0;
	}

}

