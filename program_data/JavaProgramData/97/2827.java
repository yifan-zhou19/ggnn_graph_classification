package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int n1;
	  int n2;
	  int n3;
	  int n4;
	  int n5;
	  int n6;
	  int b;
	  int c;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  n1 = a / 100;
	  b = (a % 100) / 10;
		if (b >= 5)
		{
		   n2 = 1;
		   n3 = (b - 5) / 2;
		   n4 = (b - 5) % 2;
		}
		else
		{
		   n2 = 0;
		   n3 = b / 2;
		   n4 = b % 2;
		}
		c = a % 10;
		n5 = c / 5;
		n6 = c % 5;
	  System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",n1,n2,n3,n4,n5,n6);
	  return 0;
	}
}

