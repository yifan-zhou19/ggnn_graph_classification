package <missing>;

public class GlobalMembers
{
	public static int t;
	public static void calc(int a,int d)
	{
	 int i;
	 if (a == 1)
	 {
		 t++;
	 }
	   else
	   {
		if (a >= d)
		{
		  for (i = d;i <= a;i++)
		  {
		if (a % i == 0)
		{
		  calc(a / i, i);
		}
		  }
		}
	   }
	}
	public static void Main()
	{
	 int n;
	 int i;
	 int a;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= n;i++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = Integer.parseInt(tempVar2);
	   }
	   t = 0;
	   calc(a, 2);
	   System.out.printf("%d\n",t);
	 }
	}
}

