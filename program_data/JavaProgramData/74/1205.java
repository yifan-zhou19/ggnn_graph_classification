package <missing>;

public class GlobalMembers
{
	public static int f(int m)
	{
		int d = 0;
		while (m != 0)
		{
		d = d * 10 + m % 10;
		m = m / 10;
		}
		return d;
	}
	public static int g(int n)
	{
		int i;
		int m = 0;
		for (i = 2;i < n;i++)
		{
		  if (n % i == 0)
		  {
		  break;
		  }
		}
		if (i == n)
		{
		m = 1;
		}
		return m;
	}
	public static int Main()
	{
		  int a;
		  int b;
		  int i;
		  int count = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  b = Integer.parseInt(tempVar2);
		  }
		  for (i = a;i <= b;i++)
		  {
		   if (f(i) == i && g(i) == 1)
		   {
			   count++;
			 if (count == 1)
			 {
			 System.out.printf("%d",i);
			 }
			 else
			 {
			 System.out.printf(",%d",i);
			 }
		   }
		  }
		  if (count == 0)
		  {
		  System.out.print("no");
		  }
		  System.in.read();
		  System.in.read();
		  return 0;
	}





}

