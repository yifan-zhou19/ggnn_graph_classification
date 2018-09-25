package <missing>;

public class GlobalMembers
{
	public static int f(int a,int b)
	{
	 if (a == 0)
	 {
	   return (b);
	 }
	 else
	 {
		return f(a / 10, b * 10 + a % 10);
	 }
	}
	public static void Main()
	{
	 int m;
	 int n;
	 int i;
	 int j;
	 int t = 0;
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
		if (i == f(i, 0) && i > 2)
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
			if (t == 0)
			{
			  System.out.printf("%d",i);
			  t = 1;
			}
			else
			{
			  System.out.printf(",%d",i);
			}
		  }
		}
	 }
	if (t == 0)
	{
	  System.out.print("no\n");
	}
	}
}

