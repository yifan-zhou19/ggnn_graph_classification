package <missing>;

public class GlobalMembers
{
	public static int f(int i)
	{
	 if (i == 1)
	 {
	 return 1;
	 }
	 if (i == 2)
	 {
	 return 2;
	 }
	 return f(i - 1) + f(i - 2);
	}
	public static int Main()
	{
	 int n;
	 int k;
	 int i;
	 double sum = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 while (n-- != 0)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  for (i = 1;i <= k;i++)
	  {
	  sum += ((double)(f(i + 1))) / ((double)(f(i)));
	  }
	 System.out.printf("%.3f\n",sum);
	sum = 0;
	 }
	}
}

