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
		  return (f(a / 10, b * 10 + a % 10));
	  }
	}
	public static int g(int a)
	{
		int i;
		int j;
		int t = 1;
	 j = Math.sqrt(a);
	 for (i = 2;i <= j;i++)
	 {
		 if (a % i == 0)
		 {
			 t = 0;
		 }
	 }
		 return (t);
	}
	public static void Main()
	{
		int x;
		int y;
		int i;
		int t = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  x = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  y = Integer.parseInt(tempVar2);
	  }
	  for (i = x;i <= y; + i++)
	  {
		  if (f(i, 0) == i && g(i) != 0)
		  {
		  if (t == 0)
		  {
			  System.out.printf("%d",i);
		  }
	  else
	  {
		  System.out.printf(",%d",i);
	  }
	  t = t + 1;
		  }
	  }
	  if (t == 0)
	  {
		  System.out.print("no");
	  }
	}


}

