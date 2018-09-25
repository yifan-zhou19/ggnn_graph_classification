package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int x;
	  int a;
	  int b;
	  int c;
	  char d = 'n';
	  a = 3;
	  b = 5;
	  c = 7;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  x = Integer.parseInt(tempVar);
	  }
	  if (x % 105 == 0)
	  {
		  System.out.printf("%d %d %d\n",a,b,c);
	  }
	  else
	  {
	  if (x % 15 == 0)
	  {
		  System.out.printf("%d %d\n",a,b);
	  }
	  if (x % 21 == 0)
	  {
		  System.out.printf("%d %d\n",a,c);
	  }
	  if (x % 35 == 0)
	  {
		  System.out.printf("%d %d\n",b,c);
	  }
	  if (x % 3 == 0 && x % 5 != 0 && x % 7 != 0)
	  {
		  System.out.printf("%d\n",a);
	  }
	  if (x % 5 == 0 && x % 3 != 0 && x % 7 != 0)
	  {
		  System.out.printf("%d\n",b);
	  }
	  if (x % 7 == 0 && x % 5 != 0 && x % 3 != 0)
	  {
		  System.out.printf("%d\n",c);
	  }
	  if (x % 3 != 0 && x % 7 != 0 && x % 5 != 0)
	  {
		  System.out.printf("%c\n",d);
	  }
	  }
	}
}

