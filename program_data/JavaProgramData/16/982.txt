package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int a;
	  int b;
	  int c;
	  int d;
	  int e;
	  int f;
	  int g;
	  int h;
	  int i;
	  int j;
	  int k;
	  int l;
	  int m;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  if (a >= 0 && a <= 9)
	  {
		  System.out.printf("%d",a);
	  }
	  else if (a >= 10 && a <= 99)
	  {
		  b = a % 10,c = a / 10;
		  System.out.print(b);
		  System.out.print(c);
	  }
	  else if (a >= 100 && a <= 999)
	  {
		  d = a % 10,e = a / 10,f = e % 10,g = e / 10;
	  System.out.printf("%d%d%d",d,f,g);
	  }
	  else if (a >= 1000 && a <= 9999)
	  {
		  h = a / 10,i = h / 10,j = i / 10,k = i % 10,l = h % 10,m = a % 10;
	  System.out.printf("%d%d%d%d",m,l,k,j);
	  }
	}
}

